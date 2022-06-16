import os
#os.environ['TF_CPP_MIN_LOG_LEVEL'] = '2'
import math
import tensorflow as tf
import numpy as np
np.random.seed(50)
tf.get_logger().setLevel('INFO')
tf.autograph.set_verbosity(0)

def init():
    print()
    x = tf.Variable(np.random.uniform(-10, 10), trainable = True)
    y  = tf.Variable(np.random.uniform(-10, 10), trainable = True)
    return x, y

def function(X, Y):
    return 3 * X ** 4 + 4 * X ** 3 - 12 * X ** 2 + 12 * Y ** 2 - 24 * Y

if __name__ == '__main__':
    print()
    x, y = init()

    optimizer = tf.keras.optimizers.SGD(learning_rate=0.01, momentum=0.01)
    for epoch in range(1000):
        optimizer.minimize(lambda: function(x, y), var_list=[x, y])
        print((function(x, y)).numpy(), x.numpy(), y.numpy(), end="\r")
    print(x.numpy(), y.numpy(), function(x, y).numpy())
    x, y = init()
