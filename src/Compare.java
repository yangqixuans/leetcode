import java.util.Arrays;

public class Compare {
    static class User implements Comparable<User>{
        private int id;
        private String name;

        public User() {
        }
        public User(int id, String name){
            this.id=id;
            this.name=name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(User o) {
            if (this.id<o.id){
                return 1;
            } else if (this.id>o.id) {
                return -1;
            }else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        User user1=new User(1,"s");
        User user2=new User(2,"a");
        User user3=new User(3,"v");
        User users[]={user1,user2,user3};
        Arrays.sort(users);
        Arrays.stream(users).forEach(System.out::println);


    }


}
