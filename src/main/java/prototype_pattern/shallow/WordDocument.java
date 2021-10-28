package prototype_pattern.shallow;

import java.util.ArrayList;

public class WordDocument implements Cloneable{
    private String mText;
    private ArrayList<String> mImage = new ArrayList<>();

    public WordDocument() {
        //当原型模式进行对象拷贝的时候是不会执行构造函数的
        System.out.println("原型模式的拷贝的时候，不会执行构造函数。");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImage() {
        return mImage;
    }

    public void setImage(ArrayList<String> mImage) {
        this.mImage = mImage;
    }

    public void addImage(String imageName){
        this.mImage.add(imageName);
    }

    public void showDocument(){
        System.out.println(mText);
        for (String mImage:
             mImage) {
            System.out.println(mImage);
        }
    }
}
