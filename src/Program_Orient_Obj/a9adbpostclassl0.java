package Program_Orient_Obj;

//Nombre original "Post"
class Post1 {
    String user;
    String content;
    int favs;
    int retweets;

    Post1(String user, String content, int favs, int retweets){
        this.user = user;
        this.content = content;
        this.favs = favs;
        this.retweets = retweets;
    }
}
public class a9adbpostclassl0 {
    public static void main(String[] args) {
        Post1 post1 = new Post1("@realdonaltrump", "Make America Great Again #MAGA", 10000000, 2000000);
        Post1 post2 = new Post1("@realdonaltrump", "You are fake news", 325646, 5986587);
        Post1 post3 = new Post1("@realdonaltrump", "Global warming is a HOAX", 1000, 200);

        String format = "------------------------------------\n| %-32s |\n| %-32s |\n| <3 %-12d   & %-12d |\n------------------------------------\n";
        System.out.format(format, post1.user, post1.content, post1.retweets, post1.favs);
        System.out.format(format, post2.user, post2.content, post2.retweets, post2.favs);
        System.out.format(format, post3.user, post3.content, post3.retweets, post3.favs);
    }
}
