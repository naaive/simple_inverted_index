import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InvertedIndex {


    private final HashMap<String, List<Document>> idx = new HashMap<>();

    public void addDoc(Document document) {

        // 分词
        // 根据关键词去匹配

        String content = document.getContent();

        String[] tokens = tokenized(content);

        for (String token : tokens) {
            List<Document> documents = idx.computeIfAbsent(token, x -> new ArrayList<>());
            documents.add(document);
        }


    }

    private String[] tokenized(String content) {
        return content.split(" ");
    }

    //
    public List<Document> search(String kw) {

//      todo  tokenized(kw);
        return idx.get(kw);
    }
}
