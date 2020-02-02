package blake3

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.collection.Size
import primitives.UInt32
import spire.math.UShort

case class Hasher(
  chunkState: ChunkState,
  key: Vector[UInt32] Refined Size[W.`8`.T],
  cvStack: Vector[Vector[UInt32]] Refined Size[W.`54`.T],
  cvStackLen: UShort,
  flags: UInt32
)

object Hasher {
  def apply(
    chunkState: ChunkState,
    key: Vector[UInt32],
    cvStack: Vector[Vector[UInt32]],
    cvStackLen: UShort,
    flags: UInt32
  ): Hasher = Hasher(chunkState, key, cvStack, cvStackLen, flags)
}
