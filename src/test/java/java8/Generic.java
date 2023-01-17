package java8;

public class Generic {
    public static void main(String[] args) {
        Base<String> type1 = new Base<>("Hello there");
        System.out.println(type1);
        String  s = type1.getValue();

        Base<Integer> type2 = new Base<>(300);
        System.out.println(type2);
        Integer integer = type2.getValue();

        Base<Double> type3 = new Base<>(34.78);
        System.out.println(type3);
        Double double1 = type3.getValue();

        Base<Float> type4 = new Base<>(644534.57453453F);
        System.out.println(type4);
        Float float1 = type4.getValue();
    }
}

class Base<T>{
    private T value;

    public Base (T value){
        this.value = value;
    }

    public String toString(){
        return "[(" + value + ")]";
    }

    public T getValue(){
        return value;
    }
}