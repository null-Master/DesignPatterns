package v1.decorator.io;

import java.io.*;

/**
 * Created by wangym on 2016/12/22.
 */
public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new UpperCaseInputStream(new BufferedInputStream(UpperCaseInputStream.class.getResourceAsStream("/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
//                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
