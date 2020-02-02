package const

import primitives.UInt32
import scodec.bits._

object const {
  val OutLen = 32
  val keyLen = 32
  val BlockLen = 64
  val ChunkLen = 1024

  val IV = Vector(
    UInt32(hex"0x6A09E667"),
    UInt32(hex"0xBB67AE85"),
    UInt32(hex"0x3C6EF372"),
    UInt32(hex"0xA54FF53A"),
    UInt32(hex"0x510E527F"),
    UInt32(hex"0x9B05688C"),
    UInt32(hex"0x1F83D9AB"),
    UInt32(hex"0x5BE0CD19")
    )

  val MsgPermutation = Vector(2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8)
}
