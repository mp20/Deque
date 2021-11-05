public class test {
    public static void main(String[] args) {
        System.out.println(mod(-1, 14));
        ArrayDeque<String> temp = new ArrayDeque<>();

        temp.addFirst("1");
        temp.addFirst("2");
        temp.addFirst("3");
        temp.addLast("5");
       // System.out.println(temp.getLast());





        }
        public static int mod ( int index, int modulo) {
            // DO NOT MODIFY THIS METHOD!
            if (modulo <= 0) {
                throw new IllegalArgumentException("The modulo must be positive");
            }
            int newIndex = index % modulo;
            return newIndex >= 0 ? newIndex : newIndex + modulo;
        }
    }

