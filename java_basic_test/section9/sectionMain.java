package java_basic_test.section9;

public class sectionMain {
    public static void main(String[] args) {
        Book book = new Book("java",10000,"han","12345");
        Movie movie = new Movie("인사이드 아웃2",150000,"외국인","누군지머름");
        Album album = new Album("앨범1",150000,"seo");


        book.print();
        movie.print();
        album.print();
        int sum = book.getPrice()+movie.getPrice()+album.getPrice();

        System.out.println("상품 가격의 합 : " + sum);
    }
}
