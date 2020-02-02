package blake3

import eu.timepit.refined.collection.Size
import primitives.UInt32
import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import spire.math.{UInt, ULong}

case class OutputState(
  inputChain: Vector[UInt32] Refined Size[W.`8`.T],
  blockWords: Vector[UInt32] Refined Size[W.`32`.T],
  counter: ULong,
  blockLen: UInt,
  flags: UInt32
)
