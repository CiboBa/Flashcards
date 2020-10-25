import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence /* extends/*/ implements CharSequence {

    private byte[] bytes;

    AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes.clone();
    }

    @Override
    public int length() {
        return Array.getLength(bytes);
    }

    @Override
    public char charAt(int index) {
        return Array.getChar(bytes, index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        CharSequence charSequence = new AsciiCharSequence(bytes.clone());
        return charSequence.subSequence(start, end);
    }

    @Override
    public String toString() {
        return new String(bytes, StandardCharsets.UTF_8);
    }
}