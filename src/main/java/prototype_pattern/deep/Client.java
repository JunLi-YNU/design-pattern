package prototype_pattern.deep;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Deep 拷贝");
        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("原文本");
        wordDocument.addImage("原图片");
        System.out.println("原文档------------");
        wordDocument.showDocument();
        System.out.println("修改后文档-----------");
        WordDocument copeWordDocument = (WordDocument) wordDocument.clone();
        wordDocument.addImage("添加了图片");
        copeWordDocument.showDocument();
        System.out.println("修改后的原文档---------");
        wordDocument.showDocument();
    }
}
