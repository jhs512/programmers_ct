package org.example.level0.P120810_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    @DisplayName("20을 20으로 나눈 나머지는 1이 된다.")
    void t1() {
        assertThat(new Solution().solution(20, 20)).isEqualTo(0);
    }

    @Test
    @DisplayName("30을 20으로 나눈 나머지는 1이 된다.")
    void t2() {
        assertThat(new Solution().solution(30, 20)).isEqualTo(10);
    }

    @Test
    @DisplayName("10을 20으로 나눈 나머지는 0이 된다.")
    void t3() {
        assertThat(new Solution().solution(10, 20)).isEqualTo(10);
    }
}
