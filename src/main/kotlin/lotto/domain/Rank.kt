package lotto.domain

enum class Rank (val matchCount: Int, val prizeMoney: Int, val matchBonus: Boolean = false) {

    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000, true),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    NONE(0, 0);

    companion object {
        fun valueOfMatchCount(matchCount: Int, matchBonus: Boolean): Rank {
            return values().find {
                it.matchCount == matchCount && it.matchBonus == matchBonus
            } ?: values().find { it.matchCount == matchCount && !it.matchBonus } ?: NONE
        }
    }

}
