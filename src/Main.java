public class Main {
    public static void main(String[] args) {
        System.out.println("Current month: " + Month.JUNE.getHungarianName());
        System.out.println(Month.AUGUST.isSpringMonth() ? "Augusztus tavaszi hónap" : "Augusztus NEM tavaszi hónap");

        for (Month month : Month.values()) {
            System.out.println(
                    month.getMonthNumber() + ". month: " +
                            month.getHungarianName());
        }
        System.out.println("Current season: " + Season.SUMMER);

        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}