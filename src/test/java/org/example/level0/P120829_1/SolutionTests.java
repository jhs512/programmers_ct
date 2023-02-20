package org.example.level0.P120829_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
