public class Task2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        try(counter) {
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getCounter());
        }

        counter.add();
        System.out.println(counter.getCounter());

    }



    public static class Counter implements AutoCloseable{

        private int counter = 0;

        private boolean open = true;

        public int getCounter() {
            return counter;
        }

        public void add() {
            if(open){
                counter += 1;
            }
            else {
                throw new RuntimeException("no");
            }
        }

        @Override
        public void close() {
            this.open = false;
        }
    }



}
