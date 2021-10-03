import java.util.List;

public class Main {

    public static void main(String[] args) {


        // 输入：text
        // 要实现功能： 搜索


        //ry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unch
        InvertedIndex index = new InvertedIndex();
        index.addDoc(new Document(1L, "hello world"));
        index.addDoc(new Document(2L, " Lorem Ipsum has been"));
        index.addDoc(new Document(3L, " It has survived been not only f"));
        index.addDoc(new Document(4L, "onic typesetting, rem"));


        List<Document> documents = index.search("been");

        System.out.println(documents);


    }
}
