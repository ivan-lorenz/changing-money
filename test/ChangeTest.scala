import org.scalatest.FlatSpec

class ChangeTest extends FlatSpec {

  behavior of "Change"

  it should "compute change for 2" in {
    assert(Change.getChange(2) == 2)
  }

  it should "compute change for 28" in {
    assert(Change.getChange(28) == 6)
  }

}
