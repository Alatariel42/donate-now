/**
 * describes an item wanted
 */

public class Item implements Comparable () {

        private String name;
        private int priority;

        public Item (String name, int priority) {
            this.name = name;
            setPriority(priority);
        }

        public void setPriority( int priority ) {
            this.priority = priority
        }

        public String getName() {
            return this.name;
        }

        public int getPriority() {
            return this.priority;
        }

        public boolean equals( Object o ) {
            i = (Item)o;
            if(this.name.equals(i.getName()) && this.priority == i.getPriority()) {
                return true;
            }
            return false;
        }

        public int compareTo( Object o ) {
            i = (Item)o;
            if(this.priority == i.getPriority()) {
                return this.name.compareTo(i.getName());
            }
            if( this.priority > i.getPriority()){
                return 1;
            }
            return -1;
        }

}