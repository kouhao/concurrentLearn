总结：线程的挂起和恢复实现的正确方法是：通过设置标志位，让线程在安全的位置挂起

方法：thread.suspend()  挂起线程
    thread.resume() 恢复线程