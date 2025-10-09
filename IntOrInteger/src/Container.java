public class Container {
    private Integer count = 0;

       public Container() {
       }

       public Integer getCount(){
           return count;
        }

    public void addCount(int value) {
            count = count + value;
            System.out.println(count);
    }




}
