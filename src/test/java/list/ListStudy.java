package list;

import dalist.SimpleArrayList;
import dalist.SimpleLinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;

public class ListStudy {
    @Test
    public void arrayList() {
        ArrayList<String> values = new ArrayList<>();
        values.add("first");
        values.add("second");

        assertThat(values.add("third")).isTrue(); // 세 번째 값을 추가한다.
        assertThat(values.size()).isEqualTo(3); // list의 크기를 구한다.
        assertThat(values.get(0)).isEqualTo("first"); // 첫 번째 값을 찾는다.
        assertThat(values.contains("first")).isTrue(); // "first" 값이 포함되어 있는지를 확인한다.
        assertThat(values.remove(0)).isEqualTo("first"); // 첫 번째 값을 삭제한다.
        assertThat(values.size()).isEqualTo(2); // 값이 삭제 됐는지 확인한다.

        // TODO values에 담긴 모든 값을 출력한다.
    }

    @Test
    public void myArrayList(){
        SimpleArrayList<String> values = new SimpleArrayList<>();
        values.add("first");
        values.add("second");

        assertThat(values.add("third")).isTrue(); // 세 번째 값을 추가한다.
        assertThat(values.size()).isEqualTo(3); // list의 크기를 구한다.
        assertThat(values.get(0)).isEqualTo("first"); // 첫 번째 값을 찾는다.
        assertThat(values.contains("first")).isTrue(); // "first" 값이 포함되어 있는지를 확인한다.
        assertThat(values.remove(0)).isEqualTo("first"); // 첫 번째 값을 삭제한다.
        assertThat(values.size()).isEqualTo(2); // 값이 삭제 됐는지 확인한다.
        assertThat(values.get(0)).isEqualTo("second");//["s","t"]
        assertThat(values.get(1)).isEqualTo("third");//["s","t"]
        assertThat(values.remove(1)).isEqualTo("third"); //["s"]
        assertThat(values.remove(0)).isEqualTo("second"); //[]
        assertThat(values.add("four")).isTrue();//[]
        assertThat(values.get(0)).isEqualTo("four");
        values.add(0, "five");
        assertThat(values.get(0)).isEqualTo("five");
        assertThat(values.get(1)).isEqualTo("four");
        assertThat(values.contains("five")).isTrue();
        assertThat(values.isEmpty()).isFalse();
        assertThat(values.indexOf("five")).isEqualTo(0);
        assertThat(values.remove("five")).isTrue();
        assertThat(values.get(0)).isEqualTo("four");
        assertThat(values.set(0, "five")).isEqualTo("four");
        assertThat(values.get(0)).isEqualTo("five");
        values.clear();
        assertThat(values.size()).isEqualTo(0);
    }

    @Test
    void linkedListTest(){
        SimpleArrayList<String> values = new SimpleArrayList<>();
        values.add("first");
        values.add("second");

        assertThat(values.add("third")).isTrue(); // 세 번째 값을 추가한다.
        assertThat(values.size()).isEqualTo(3); // list의 크기를 구한다.
        assertThat(values.get(0)).isEqualTo("first"); // 첫 번째 값을 찾는다.
        assertThat(values.contains("first")).isTrue(); // "first" 값이 포함되어 있는지를 확인한다.
        assertThat(values.remove(0)).isEqualTo("first"); // 첫 번째 값을 삭제한다.
        assertThat(values.size()).isEqualTo(2); // 값이 삭제 됐는지 확인한다.
        assertThat(values.get(0)).isEqualTo("second");//["s","t"]
        assertThat(values.get(1)).isEqualTo("third");//["s","t"]
        assertThat(values.remove(1)).isEqualTo("third"); //["s"]
        assertThat(values.remove(0)).isEqualTo("second"); //[]
        assertThat(values.add("four")).isTrue();//[]
        assertThat(values.get(0)).isEqualTo("four");
        values.add(0, "five");
        assertThat(values.get(0)).isEqualTo("five");
        assertThat(values.get(1)).isEqualTo("four");
        assertThat(values.contains("five")).isTrue();
        assertThat(values.isEmpty()).isFalse();
        assertThat(values.indexOf("five")).isEqualTo(0);
        assertThat(values.remove("five")).isTrue();
        assertThat(values.get(0)).isEqualTo("four");
        assertThat(values.set(0, "five")).isEqualTo("four");
        assertThat(values.get(0)).isEqualTo("five");
        values.clear();
        assertThat(values.size()).isEqualTo(0);

    }
}