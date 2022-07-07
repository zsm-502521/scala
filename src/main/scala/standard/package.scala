/**
 * @author 赵世敏
 * @date 2022/7/4
 * 1208676641@qq.com
 * @description
 */

import org.omg.CORBA.StringSeqHelper

import java.util.Random
//屏蔽类
import java.util.{ArrayList=>_,_}

package object standard {
  val commonValue = 100

  def commonMethod(): Unit = {
    println("commonMethod方法")
  }

}