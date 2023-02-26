package org.example.level0.P120903_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
    }
}
