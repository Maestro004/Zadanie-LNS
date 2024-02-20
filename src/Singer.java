public class Singer extends Person{
    private String nameSinger;
    private String designationSinger;

    public Singer(String name, String surName, String nameSinger, String designationSinger) {
        super(name, surName);
        this.nameSinger = nameSinger;
        this.designationSinger = designationSinger;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "nameSinger='" + nameSinger + '\'' +
                ", designationSinger='" + designationSinger + '\'' +
                '}';
    }
}
