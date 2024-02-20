/**БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.

ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ

КЫЛЫП  ТУЗОСУЗДОР.


АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.

АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА

МЕТОДТОРУ БАР СУРОТТОГУДОЙ.



КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.



МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,

КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.
 */
public class Main {
    public static void main(String[] args) {
        Person parent = new Person("Beknazar", "Joldoshbekov");
        System.out.println(parent);

        Dancer boy = new Dancer("Sultanali","Kaldarbek",25,"black");
        System.out.println(boy);

        Programmer girl = new Programmer("Bektur","Temibekov","Gagarin",2);
        System.out.println(girl);

        Singer singer = new Singer("Eldiyar","Avazbekov","Baxa","imia");
        System.out.println(singer);




    }
}