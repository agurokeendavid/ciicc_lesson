//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrimitiveValues primitives = new PrimitiveValues();
        MessageBuilder messageBuilder = new MessageBuilder(primitives);
        messageBuilder.printMessage();
    }
}

// a class to hold primitive values except long and double
class PrimitiveValues {
    private byte b = 0;
    private short s = 2;
    private int i = 3110;
    private float f = 2.0f;
    private char c1 = 'H';
    private char c2 = 'w';
    private char c3 = 'r';
    private char c4 = 'd';
    private boolean bool = true;

    // Getter methods
    public byte getByte() { return b; }
    public short getShort() { return s; }
    public int getInt() { return i; }
    public float getFloat() { return f; }
    public char getChar1() { return c1; }
    public char getChar2() { return c2; }
    public char getChar3() { return c3; }
    public char getChar4() { return c4; }
    public boolean isBoolean() { return bool; }
}

class MessageBuilder {
    private PrimitiveValues values;

    public MessageBuilder(PrimitiveValues values) {
        this.values = values;
    }

    public String buildMessage() {
        return values.getChar1() + "" +
                values.getInt() + " " +
                values.getChar2() +
                values.getByte() +
                values.getChar3() +
                values.getShort() +
                values.getChar4() + " " +
                values.getFloat() + " " +
                values.isBoolean();
    }

    public void printMessage() {
        System.out.println(buildMessage());
    }
}