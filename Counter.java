class Count {
    int num = 10;

    void display() {
        System.out.println(num + 1);
    }
}

class Counter {
    public static void main(String[] args) {
        Count num1 = new Count();
        Count num2 = new Count();
        Count num3 = new Count();
        
        num1.display();
        num2.display();
        num3.display();
        // System.out.println(Count.num);
        String word = "WorD";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
    }
}