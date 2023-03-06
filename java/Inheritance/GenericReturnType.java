interface checkDatatype<T, V>{
    T getValue();
    V getValue1();
}

class DataType1 implements checkDatatype<Integer, String>{

    @Override
    public Integer getValue() {
        return 13;
    }

    @Override
    public String getValue1() {
        return "I am hell";
    }
}

class DataType2 implements checkDatatype<String, Integer>{

    @Override
    public String getValue() {
        return "My name is DY.";
    }

    @Override
    public Integer getValue1() {
        return 13;
    }
}

class GenericReturnType{
    public static void main(String[] args) {
        DataType1 dt1 = new DataType1();
        DataType2 dt2 = new DataType2();

        System.out.println(dt1.getValue());
        System.out.println(dt1.getValue1());
        System.out.println(dt2.getValue());
        System.out.println(dt2.getValue1());

    }
}