package lotto.domain

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
        require(numbers.all { it in 1..45 }) { "[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다." }
        require(numbers.distinct().size == 6) { "[ERROR] 로또 번호는 중복될 수 없습니다." }
    }

    constructor() : this(
        Randoms.pickUniqueNumbersInRange(1, 45, 6).sorted()
    )

    fun getNumbers(): List<Int> = numbers
}