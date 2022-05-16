package kr.co.eis.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : AppleList
 * author     : ChoiGeonIl
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11    ChoiGeonIl     최초 생성
 */
//Apple color price(int) origin
public class AppleApp {
    @Data
    public static class Apple{
        private String color, origin;
        private int price;

        public Apple(Apple.Builder builder) {
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }
        @NoArgsConstructor public static class Builder{
            private String color, origin;
            private int price;
            public Builder color(String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            public Apple build(){ return new Apple(this);}
        }
        @Override public String toString(){
            return String.format("[사과 스펙] origin: %s, color: %s, price: %d",
                    origin, color, price);
        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(int i, Apple apple);
        void delete(int i);
        List<Apple> findAll();
        List<Apple> findByOrigin(String origin);
        List<Apple> findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();
    }

    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;
        public AppleServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Apple apple) {
            list.add(apple);
        }

        @Override
        public void update(int i,Apple apple) {
            list.set(i, apple);
        }

        @Override
        public void delete(int i) {
            list.remove(i);
        }

        @Override
        public List<Apple> findAll() {
            return list;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear();
        }
    }
    @Test
    void appleAppTest(){
        AppleService service = new AppleServiceImpl();
        System.out.println("### 1. save ###");
        Apple yd = new Apple.Builder()
                .origin("영동")
                .color("RED")
                .price(1000)
                .build();
        service.save(yd);
        Apple yd2 = new Apple.Builder()
                .origin("영동")
                .color("BLUE")
                .price(1500)
                .build();
        service.save(yd2);
        Apple pg = new Apple.Builder()
                .origin("풍기")
                .color("RED")
                .price(2000)
                .build();
        service.save(pg);

        System.out.println("### 2. countAll ###");
        System.out.println("총 사과 갯수: "+service.count()+"개");

        System.out.println("### 3. findAll ###");
        System.out.println(service.findAll());

        System.out.println("### 4. findByOrigin ###");
        System.out.println("원산지가 영동인 사과정보: "+service.findByOrigin("영동"));

        System.out.println("### 5. findById ###");
        System.out.println("첫 번째 사과정보: "+service.findById(0));

        System.out.println("### 6. update ###");
        service.update(0, new Apple.Builder()
                .origin("캘리포니아")
                .color("YELLOW")
                .price(20000)
                .build());
        System.out.println("수정된 첫 번째 사과정보:" +service.findById(0));

        System.out.println("### 7. delete ###");
        service.delete(0);
        System.out.println("삭제 후 카운트 확인: 총 "+service.count()+"개");

        System.out.println("### 8. clear ###");
        service.clear();
        System.out.println("clear 후 카운트 확인: 총 "+ service.count()+"개");

    }
}
