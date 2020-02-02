package primitives

import scodec.bits.ByteVector
import spire.math.UInt
import eu.timepit.refined.collection.Size
import eu.timepit.refined.W
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._

final case class UInt32(b: ByteVector Refined Size[W.`4`.T]) {
  def rotateRight(n: Int) = b.value.rotateRight(n)
  def rotateLeft(n: Int) = b.value.rotateLeft(n)
  def toUInt = UInt(b.value.toInt(false))
  def +(n: UInt32) = n.toUInt + toUInt
}

object UInt32 {
  def apply(n: ByteVector): UInt32 = UInt32(n)
}
