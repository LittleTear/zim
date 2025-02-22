package org.bitlap.zim.application

import zio.stream

/**
 * 基础应用定义
 *
 * @author 梦境迷离
 * @since 2021/12/25
 * @version 1.0
 */
trait BaseApplication[T] {

  def findById(id: Long): stream.Stream[Throwable, T]

  def findAll(): stream.Stream[Throwable, T]

}
