package org.example.level0.P120908_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("ppprrrogrammers", "pppp")).isEqualTo(2);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution("AbcAbcA", "AAA")).isEqualTo(2);
    }
}
