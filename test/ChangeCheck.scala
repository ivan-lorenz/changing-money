import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object ChangeCheck extends Properties("Change"){

  val genNonNegativesInts: Gen[Int] = Gen.choose(1, 1000)

  property("facials quantity are less than amount") =
    forAll(genNonNegativesInts){n  =>
      Change.getChange(n) <= n
    }

  property("increment amount in one facial value (10) should increment facials quantity by one") =
    forAll(genNonNegativesInts){n  =>
      Change.getChange(n+10) <= Change.getChange(n) + 1
    }

  property("increment amount in one facial value (5) should increment facials quantity by one") =
    forAll(genNonNegativesInts){n  =>
      Change.getChange(n+5) <= Change.getChange(n) + 1
    }

  property("increment amount in one facial value (1) should increment facials quantity by one") =
    forAll(genNonNegativesInts){n  =>
      Change.getChange(n+1) <= Change.getChange(n) + 1
    }


}
