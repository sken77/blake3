import spire.math.UInt

object flags {

  val ChunkStart = UInt(1 << 0)
  val ChunkEnd = UInt(1 << 1)
  val Parent = UInt(1 << 2)
  val Root = UInt(1 << 3)
  val KeyedHash = UInt(1 << 4)
  val DeriveKeyContext = UInt(1 << 5)
  val DeriveKeyMaterial = UInt(1 << 6)
}
