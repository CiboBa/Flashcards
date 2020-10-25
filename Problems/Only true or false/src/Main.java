class Primitive {

    public static boolean toPrimitive(Boolean b) {
        boolean primitive;
        if (b != null) {
            primitive = b.booleanValue();
        } else {
            primitive = false;
        }
        return primitive;
    }
}