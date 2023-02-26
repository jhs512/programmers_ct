package org.example.level0.P120851_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }
}
