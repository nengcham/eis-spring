package kr.co.eis.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * packageName: kr.co.eis.common.dataStructure
 * fileName   : Box
 * author     : ChoiGeonIl
 * date       : 2022-05-12
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-12    ChoiGeonIl     최초 생성
 */
@Component @Data @Lazy
public class Vector<T> {
    private ArrayList<T> list;
    // save, update, delete, findAll, findById, count, existsById, clear
    // add, set, remove, list, x, get(i), size, x, clear

    public Vector(){this.list = new ArrayList<>();}

    public void add(T t){
        list.add(t);
    }
    public void set(int i, T t){
        list.set(i, t);
    }
    public void remove(int i){
        list.remove(i);
    }
    public ArrayList<T> findAll(){
        return list;
    }
    public T getI(int i){
        return list.get(i);
    }
    public int size(){
        return list.size();
    }
    public void clear(){
        list.clear();
    }
}
