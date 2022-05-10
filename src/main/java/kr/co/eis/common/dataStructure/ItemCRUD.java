package kr.co.eis.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : itemCRUD
 * author     : ChoiGeonIl
 * date       : 2022-05-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-10    ChoiGeonIl     최초 생성
 */
public class ItemCRUD {
    public static void main(String[] args) {}
    @Data @AllArgsConstructor class Item{
        private int id;
        private String name;
        private int price;
    }
    interface ItemService{}
    class ItemServiceImpl implements ItemService{}
}
