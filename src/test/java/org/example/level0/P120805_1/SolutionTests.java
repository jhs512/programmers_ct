package org.example.level0.P120805_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    @DisplayName("20을 20으로 나누면 몫은 1이 된다.")
    void t1() {
        assertThat(new Solution().solution(20, 20)).isEqualTo(1);
    }

    @Test
    @DisplayName("30을 20으로 나누면 몫은 1이 된다.")
    void t2() {
        assertThat(new Solution().solution(30, 20)).isEqualTo(1);
    }

    @Test
    @DisplayName("10을 20으로 나누면 몫은 0이 된다.")
    void t3() {
        assertThat(new Solution().solution(10, 20)).isEqualTo(0);
    }
}
