package blake3

import spire.math._
import primitives.UInt32
import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.collection.Size
import spire.math.{UInt, ULong}

case class ChunkState(
  chainingValue: Vector[UInt32] Refined Size[W.`8`.T],
  counter: ULong,
  block: Vector[UShort] Refined Size[W.`64`.T],
  blockLen: UShort,
  blocksCompressed: UShort,
  flags: UInt32
)

object ChunkState {
  def apply(
    chainingValue: Vector[UInt32] ,
    counter: ULong,
    block: Vector[UShort],
    blockLen: UShort,
    blocksCompressed: UShort,
    flags: UInt32
  ): ChunkState =
    ChunkState(
      chainingValue,
      counter,
      block,
      blockLen,
      blocksCompressed,
      flags
    )
}