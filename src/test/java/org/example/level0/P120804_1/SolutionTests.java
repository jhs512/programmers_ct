package org.example.level0.P120804_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    @DisplayName("10과 20을 곱하면 200이 된다.")
    void t1() {
        assertThat(new Solution().solution(10, 20)).isEqualTo(200);
    }

    @Test
    @DisplayName("20과 40을 곱하면 800이 된다.")
    void t2() {
        assertThat(new Solution().solution(20, 40)).isEqualTo(800);
    }

    @Test
    @DisplayName("60과 50을 곱하면 3000이 된다.")
    void t3() {
        assertThat(new Solution().solution(60, 50)).isEqualTo(3000);
    }

    @Test
    @DisplayName("60과 60을 곱하면 3600이 된다.")
    void t4() {
        assertThat(new Solution().solution(60, 60)).isEqualTo(3600);
    }
}
