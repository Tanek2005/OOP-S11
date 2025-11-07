public class MemoryExample {
    int id;

    MemoryExample(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() {
        System.out.println("Object with ID " + id + " is being garbage collected");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new MemoryExample(i);
        }
        System.gc(); 

        System.out.println("Objects created in Heap, local variables on Stack.");
    }
}

