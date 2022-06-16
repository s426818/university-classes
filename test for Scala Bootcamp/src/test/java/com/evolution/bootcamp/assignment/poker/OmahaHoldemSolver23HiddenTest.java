
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver23HiddenTest {


  @Test
  public void test_omaha_holdem_5750_4h5h7cJsKd_QdQc8cTh_5sJdAd6s_8h6d5c3s_9cKhAh4c() {
    assertEquals(
      "QdQc8cTh 5sJdAd6s 9cKhAh4c 8h6d5c3s",
      Solver.process("omaha-holdem 4h5h7cJsKd QdQc8cTh 5sJdAd6s 8h6d5c3s 9cKhAh4c"));
  }

  @Test
  public void test_omaha_holdem_5751_2d6d6h7dAc_Qs9cTh4s_8sQh9d8h_JsJh9s7c_7h9h5dJc() {
    assertEquals(
      "Qs9cTh4s 7h9h5dJc 8sQh9d8h JsJh9s7c",
      Solver.process("omaha-holdem 2d6d6h7dAc Qs9cTh4s 8sQh9d8h JsJh9s7c 7h9h5dJc"));
  }

  @Test
  public void test_omaha_holdem_5752_8h9c9d9hKs_7sTsTh3h_Tc7c8c6h_JcAsAh6d_2d8s2hTd_Jd2s5cQs_7d5h2c8d() {
    assertEquals(
      "7d5h2c8d Tc7c8c6h Jd2s5cQs 2d8s2hTd 7sTsTh3h JcAsAh6d",
      Solver.process("omaha-holdem 8h9c9d9hKs 7sTsTh3h Tc7c8c6h JcAsAh6d 2d8s2hTd Jd2s5cQs 7d5h2c8d"));
  }

  @Test
  public void test_omaha_holdem_5753_2d5dAhKsQs_8s7c4s3c_9h9cJhTd() {
    assertEquals(
      "8s7c4s3c 9h9cJhTd",
      Solver.process("omaha-holdem 2d5dAhKsQs 8s7c4s3c 9h9cJhTd"));
  }

  @Test
  public void test_omaha_holdem_5754_2c6d6sAdKs_Jd7cQcAc_7sJc8hTd() {
    assertEquals(
      "7sJc8hTd Jd7cQcAc",
      Solver.process("omaha-holdem 2c6d6sAdKs Jd7cQcAc 7sJc8hTd"));
  }

  @Test
  public void test_omaha_holdem_5755_2d2s4s6h7c_Kd3hTh2h_7s6cJsAd_Qc9c4cKh_4dQhAh9h_Qs5h3dKs() {
    assertEquals(
      "Qc9c4cKh 4dQhAh9h 7s6cJsAd Kd3hTh2h Qs5h3dKs",
      Solver.process("omaha-holdem 2d2s4s6h7c Kd3hTh2h 7s6cJsAd Qc9c4cKh 4dQhAh9h Qs5h3dKs"));
  }

  @Test
  public void test_omaha_holdem_5756_3h4s8sKcKh_As5h5cQd_2c6c6h9d() {
    assertEquals(
      "As5h5cQd 2c6c6h9d",
      Solver.process("omaha-holdem 3h4s8sKcKh As5h5cQd 2c6c6h9d"));
  }

  @Test
  public void test_omaha_holdem_5757_3s5c8sKcTh_AdQsQd3c_8h4c9s8c_6hKd4d6s_Ts9cJd5s_3d7s4h3h_2d2sJsKs() {
    assertEquals(
      "AdQsQd3c 6hKd4d6s 2d2sJsKs Ts9cJd5s 3d7s4h3h 8h4c9s8c",
      Solver.process("omaha-holdem 3s5c8sKcTh AdQsQd3c 8h4c9s8c 6hKd4d6s Ts9cJd5s 3d7s4h3h 2d2sJsKs"));
  }

  @Test
  public void test_omaha_holdem_5758_2d3h4d9dAh_7h4h8hQh_Qd7c8sTh_5s6d6s2s_QsTsKhKc_Ks5cQc4s_7d5dTc6c_7s3cAc6h_Jc8cAs9h() {
    assertEquals(
      "Qd7c8sTh 7h4h8hQh QsTsKhKc 7s3cAc6h Jc8cAs9h Ks5cQc4s 5s6d6s2s 7d5dTc6c",
      Solver.process("omaha-holdem 2d3h4d9dAh 7h4h8hQh Qd7c8sTh 5s6d6s2s QsTsKhKc Ks5cQc4s 7d5dTc6c 7s3cAc6h Jc8cAs9h"));
  }

  @Test
  public void test_omaha_holdem_5759_2d4h6s9cAs_9d2s8d7h_5s4d3c8h_QhQcKs3h() {
    assertEquals(
      "QhQcKs3h 9d2s8d7h 5s4d3c8h",
      Solver.process("omaha-holdem 2d4h6s9cAs 9d2s8d7h 5s4d3c8h QhQcKs3h"));
  }

  @Test
  public void test_omaha_holdem_5760_3s7hAdKcKs_6dQc5h2c_3dTh6h8s_9d6c5s8d_Js5c7sKh_Ac4c3cQs_Jh8c9c5d_2hAs7c4h_6sJd3hTs_7d9hKd4s() {
    assertEquals(
      "9d6c5s8d Jh8c9c5d 6dQc5h2c 3dTh6h8s 6sJd3hTs 2hAs7c4h Ac4c3cQs 7d9hKd4s=Js5c7sKh",
      Solver.process("omaha-holdem 3s7hAdKcKs 6dQc5h2c 3dTh6h8s 9d6c5s8d Js5c7sKh Ac4c3cQs Jh8c9c5d 2hAs7c4h 6sJd3hTs 7d9hKd4s"));
  }

  @Test
  public void test_omaha_holdem_5761_2s4d5s6s7d_3h5c9d9h_Qc6d3d2h_QhJs4c9s_Qs9cAd7s_Th7c5dAs_8c3cKh4h() {
    assertEquals(
      "Th7c5dAs 3h5c9d9h=Qc6d3d2h 8c3cKh4h QhJs4c9s Qs9cAd7s",
      Solver.process("omaha-holdem 2s4d5s6s7d 3h5c9d9h Qc6d3d2h QhJs4c9s Qs9cAd7s Th7c5dAs 8c3cKh4h"));
  }

  @Test
  public void test_omaha_holdem_5762_2s5c6h7d9h_Jd8c3c3d_9s6s2h8h_Kc4hTc7h_Ah2c7s4d_8s3hTd6d() {
    assertEquals(
      "Jd8c3c3d Kc4hTc7h Ah2c7s4d 9s6s2h8h 8s3hTd6d",
      Solver.process("omaha-holdem 2s5c6h7d9h Jd8c3c3d 9s6s2h8h Kc4hTc7h Ah2c7s4d 8s3hTd6d"));
  }

  @Test
  public void test_omaha_holdem_5763_5d5s8cJdQs_8s5h9dKh_Kd3hJs4h_Jh3sKc6d_7dTs2d8h_7cAsAc2h_6s6cTdTc() {
    assertEquals(
      "7dTs2d8h 6s6cTdTc Jh3sKc6d=Kd3hJs4h 7cAsAc2h 8s5h9dKh",
      Solver.process("omaha-holdem 5d5s8cJdQs 8s5h9dKh Kd3hJs4h Jh3sKc6d 7dTs2d8h 7cAsAc2h 6s6cTdTc"));
  }

  @Test
  public void test_omaha_holdem_5764_2d8cAhKdQs_9s4dQcJh_2s9c7h7c() {
    assertEquals(
      "2s9c7h7c 9s4dQcJh",
      Solver.process("omaha-holdem 2d8cAhKdQs 9s4dQcJh 2s9c7h7c"));
  }

  @Test
  public void test_omaha_holdem_5765_3d5dJsQcQs_9h8d6dAh_Jd6s4sJc_ThTdAc7c_3h6h4h2s_9s3sKd5h_Kc8s9dTs_7h8h7dTc_8cKs3c6c() {
    assertEquals(
      "Kc8s9dTs 9h8d6dAh 3h6h4h2s 8cKs3c6c 9s3sKd5h 7h8h7dTc ThTdAc7c Jd6s4sJc",
      Solver.process("omaha-holdem 3d5dJsQcQs 9h8d6dAh Jd6s4sJc ThTdAc7c 3h6h4h2s 9s3sKd5h Kc8s9dTs 7h8h7dTc 8cKs3c6c"));
  }

  @Test
  public void test_omaha_holdem_5766_4c7sKdKhQh_Ad5s2h4s_5d7dTd9h_9sKsKcJd_Jc3d4h8h_Ts3cTc3s_Js6d9c8d_5c2c9d7h() {
    assertEquals(
      "Js6d9c8d Jc3d4h8h Ad5s2h4s 5c2c9d7h 5d7dTd9h Ts3cTc3s 9sKsKcJd",
      Solver.process("omaha-holdem 4c7sKdKhQh Ad5s2h4s 5d7dTd9h 9sKsKcJd Jc3d4h8h Ts3cTc3s Js6d9c8d 5c2c9d7h"));
  }

  @Test
  public void test_omaha_holdem_5767_6h7d7sAcJh_9d7cKhJd_6c9s5d2h_Kc8d9cKs_Tc9h6dKd_8cQhTh2d_Ah3dQdTd_AsQc8h3s() {
    assertEquals(
      "8cQhTh2d 6c9s5d2h Tc9h6dKd Kc8d9cKs Ah3dQdTd=AsQc8h3s 9d7cKhJd",
      Solver.process("omaha-holdem 6h7d7sAcJh 9d7cKhJd 6c9s5d2h Kc8d9cKs Tc9h6dKd 8cQhTh2d Ah3dQdTd AsQc8h3s"));
  }

  @Test
  public void test_omaha_holdem_5768_3h8dJdKcTc_7c6d2c7s_6sQc4h5s_6h2h4c5c_AcTh2dAs_JhAdJsKd() {
    assertEquals(
      "6h2h4c5c 6sQc4h5s 7c6d2c7s AcTh2dAs JhAdJsKd",
      Solver.process("omaha-holdem 3h8dJdKcTc 7c6d2c7s 6sQc4h5s 6h2h4c5c AcTh2dAs JhAdJsKd"));
  }

  @Test
  public void test_omaha_holdem_5769_3d8d8sJsQs_As4c8h6h_Kc4dTsTc_3c9h2hJd_Kd9d7d8c_AhJc5c6d_Td5s4s5d_6s2s3s3h() {
    assertEquals(
      "Kc4dTsTc 3c9h2hJd AhJc5c6d Kd9d7d8c As4c8h6h Td5s4s5d 6s2s3s3h",
      Solver.process("omaha-holdem 3d8d8sJsQs As4c8h6h Kc4dTsTc 3c9h2hJd Kd9d7d8c AhJc5c6d Td5s4s5d 6s2s3s3h"));
  }

  @Test
  public void test_omaha_holdem_5770_7d7s8dAcAd_QsTs2cKs_5h9s7h4h_5d8cTh3h_5s6h2sTc_KcAh2hJh_6d8s3dKd_TdQc9cAs() {
    assertEquals(
      "5s6h2sTc QsTs2cKs 5d8cTh3h 5h9s7h4h TdQc9cAs KcAh2hJh 6d8s3dKd",
      Solver.process("omaha-holdem 7d7s8dAcAd QsTs2cKs 5h9s7h4h 5d8cTh3h 5s6h2sTc KcAh2hJh 6d8s3dKd TdQc9cAs"));
  }

  @Test
  public void test_omaha_holdem_5771_2s5h6cKdTc_2c5s7sTd_8d9cAsAh_4h7hKcJc_4s6sJdAd_2d5cKh3h_Js8s9d4c() {
    assertEquals(
      "Js8s9d4c 4s6sJdAd 4h7hKcJc 8d9cAsAh 2c5s7sTd 2d5cKh3h",
      Solver.process("omaha-holdem 2s5h6cKdTc 2c5s7sTd 8d9cAsAh 4h7hKcJc 4s6sJdAd 2d5cKh3h Js8s9d4c"));
  }

  @Test
  public void test_omaha_holdem_5772_4c5d8hAsKc_7h2cKh9s_7c5c3c3d_Tc9cJd4d_4sKsJhTs_6c7sKdTd_Ac9d5sQs() {
    assertEquals(
      "Tc9cJd4d 7c5c3c3d 7h2cKh9s 4sKsJhTs Ac9d5sQs 6c7sKdTd",
      Solver.process("omaha-holdem 4c5d8hAsKc 7h2cKh9s 7c5c3c3d Tc9cJd4d 4sKsJhTs 6c7sKdTd Ac9d5sQs"));
  }

  @Test
  public void test_omaha_holdem_5773_5d7d8hAsTh_7s2cTsJc_6sQdAhTc_KdQc5sQh_2s6c4c4d_6h4h2h8d() {
    assertEquals(
      "KdQc5sQh 7s2cTsJc 6sQdAhTc 2s6c4c4d=6h4h2h8d",
      Solver.process("omaha-holdem 5d7d8hAsTh 7s2cTsJc 6sQdAhTc KdQc5sQh 2s6c4c4d 6h4h2h8d"));
  }

  @Test
  public void test_omaha_holdem_5774_2d6h7dJhQh_7c6c3dQs_KsJs6d4c_Qd8cKd3s_2s4hQcJd_8d4d7hAd() {
    assertEquals(
      "8d4d7hAd Qd8cKd3s KsJs6d4c 7c6c3dQs 2s4hQcJd",
      Solver.process("omaha-holdem 2d6h7dJhQh 7c6c3dQs KsJs6d4c Qd8cKd3s 2s4hQcJd 8d4d7hAd"));
  }

  @Test
  public void test_omaha_holdem_5775_4h8cAdKhKs_7s5d7cAh_9h7d2c3h_QhJs2s2h_AsTd8d3c_5sQc2d9c() {
    assertEquals(
      "9h7d2c3h 5sQc2d9c QhJs2s2h 7s5d7cAh AsTd8d3c",
      Solver.process("omaha-holdem 4h8cAdKhKs 7s5d7cAh 9h7d2c3h QhJs2s2h AsTd8d3c 5sQc2d9c"));
  }

  @Test
  public void test_omaha_holdem_5776_3s7hAdKdQd_Kc5d6s5s_8cAsAc4h_2c9cTcKh_2h8hKsJh_Js7c8dJc_6d3d7sQc_Qh5hTd4s() {
    assertEquals(
      "Js7c8dJc Qh5hTd4s Kc5d6s5s 2c9cTcKh 2h8hKsJh 8cAsAc4h 6d3d7sQc",
      Solver.process("omaha-holdem 3s7hAdKdQd Kc5d6s5s 8cAsAc4h 2c9cTcKh 2h8hKsJh Js7c8dJc 6d3d7sQc Qh5hTd4s"));
  }

  @Test
  public void test_omaha_holdem_5777_5c6h7s9sQc_3sKh4s4h_Th2d8dAs() {
    assertEquals(
      "3sKh4s4h Th2d8dAs",
      Solver.process("omaha-holdem 5c6h7s9sQc 3sKh4s4h Th2d8dAs"));
  }

  @Test
  public void test_omaha_holdem_5778_2c3h8h9hQd_3sQc4hAs_7c5sKh4s_5h4d6sJd_7d5c3d7s() {
    assertEquals(
      "5h4d6sJd 7c5sKh4s 7d5c3d7s 3sQc4hAs",
      Solver.process("omaha-holdem 2c3h8h9hQd 3sQc4hAs 7c5sKh4s 5h4d6sJd 7d5c3d7s"));
  }

  @Test
  public void test_omaha_holdem_5779_2d6d8cJcQc_6h9h5c2s_Kh9s2h6s_AdAc4hKd_3dTcJh7s_2c5d6cAh_9c7hQs8h_As4d8sQh_KsKc3c7c() {
    assertEquals(
      "3dTcJh7s AdAc4hKd 6h9h5c2s=Kh9s2h6s 9c7hQs8h=As4d8sQh 2c5d6cAh KsKc3c7c",
      Solver.process("omaha-holdem 2d6d8cJcQc 6h9h5c2s Kh9s2h6s AdAc4hKd 3dTcJh7s 2c5d6cAh 9c7hQs8h As4d8sQh KsKc3c7c"));
  }

  @Test
  public void test_omaha_holdem_5780_3c3h4sKdTc_Qc3sTdQs_Ts9c9sJc_2sThKs4d_Kc5c3d4c_9h5hJdQd() {
    assertEquals(
      "9h5hJdQd Ts9c9sJc 2sThKs4d Qc3sTdQs Kc5c3d4c",
      Solver.process("omaha-holdem 3c3h4sKdTc Qc3sTdQs Ts9c9sJc 2sThKs4d Kc5c3d4c 9h5hJdQd"));
  }

  @Test
  public void test_omaha_holdem_5781_2h4c8h9cQc_7h7dAc4s_5d6dAd8c_2s9hTd6s_JhJdKh9d_5h7cKc6h_3sTsJc2c_KsJsQh7s_Qd8d4h4d_8sKd2d5c() {
    assertEquals(
      "7h7dAc4s 5d6dAd8c JhJdKh9d KsJsQh7s 8sKd2d5c 2s9hTd6s Qd8d4h4d 3sTsJc2c 5h7cKc6h",
      Solver.process("omaha-holdem 2h4c8h9cQc 7h7dAc4s 5d6dAd8c 2s9hTd6s JhJdKh9d 5h7cKc6h 3sTsJc2c KsJsQh7s Qd8d4h4d 8sKd2d5c"));
  }

  @Test
  public void test_omaha_holdem_5782_3c3s4d4s6h_Ac7hAd4h_Ks6c3dQc_Kd2c4cQh_Qs2dKc7d_TdJc5h8d_AhKh7cJs_9h7sJh3h_As9dTcTh_5s5dQd5c() {
    assertEquals(
      "TdJc5h8d Qs2dKc7d AhKh7cJs 5s5dQd5c As9dTcTh 9h7sJh3h Kd2c4cQh Ac7hAd4h Ks6c3dQc",
      Solver.process("omaha-holdem 3c3s4d4s6h Ac7hAd4h Ks6c3dQc Kd2c4cQh Qs2dKc7d TdJc5h8d AhKh7cJs 9h7sJh3h As9dTcTh 5s5dQd5c"));
  }

  @Test
  public void test_omaha_holdem_5783_3h3s5h5s9s_Kd2d6sQh_8dAd4dJd() {
    assertEquals(
      "Kd2d6sQh 8dAd4dJd",
      Solver.process("omaha-holdem 3h3s5h5s9s Kd2d6sQh 8dAd4dJd"));
  }

  @Test
  public void test_omaha_holdem_5784_3c3d8c9cTd_4c4h8sKd_Ac4d2c7c_6h9sJs4s_AdTcKhJh() {
    assertEquals(
      "4c4h8sKd 6h9sJs4s AdTcKhJh Ac4d2c7c",
      Solver.process("omaha-holdem 3c3d8c9cTd 4c4h8sKd Ac4d2c7c 6h9sJs4s AdTcKhJh"));
  }

  @Test
  public void test_omaha_holdem_5785_2h4d6dAcTs_9cKd8hQh_KhAs8s4c_3sAh9d5s_Qs7hJsJh_Jc5h8d6h() {
    assertEquals(
      "9cKd8hQh Jc5h8d6h Qs7hJsJh KhAs8s4c 3sAh9d5s",
      Solver.process("omaha-holdem 2h4d6dAcTs 9cKd8hQh KhAs8s4c 3sAh9d5s Qs7hJsJh Jc5h8d6h"));
  }

  @Test
  public void test_omaha_holdem_5786_6h8s9c9hAh_9sJh8d9d_3d5sJcJd_7c7h5c7s_2h8c3sQd_7d2cQh5h() {
    assertEquals(
      "2h8c3sQd 3d5sJcJd 7c7h5c7s 7d2cQh5h 9sJh8d9d",
      Solver.process("omaha-holdem 6h8s9c9hAh 9sJh8d9d 3d5sJcJd 7c7h5c7s 2h8c3sQd 7d2cQh5h"));
  }

  @Test
  public void test_omaha_holdem_5787_3d4d8c9dJc_5s4cQh2c_9cThTd2h_7dKh7hTs_4hKc6d7s_QdKs5cAc_3sKdJh6h_6cAh3c8s_5h3hAdQs_9hJs8hAs() {
    assertEquals(
      "QdKs5cAc 5h3hAdQs 5s4cQh2c 4hKc6d7s 9cThTd2h 6cAh3c8s 3sKdJh6h 9hJs8hAs 7dKh7hTs",
      Solver.process("omaha-holdem 3d4d8c9dJc 5s4cQh2c 9cThTd2h 7dKh7hTs 4hKc6d7s QdKs5cAc 3sKdJh6h 6cAh3c8s 5h3hAdQs 9hJs8hAs"));
  }

  @Test
  public void test_omaha_holdem_5788_3s5c7sAhTc_6h9d5hJd_8s4d2d9s() {
    assertEquals(
      "6h9d5hJd 8s4d2d9s",
      Solver.process("omaha-holdem 3s5c7sAhTc 6h9d5hJd 8s4d2d9s"));
  }

  @Test
  public void test_omaha_holdem_5789_2h3d9sAhKh_2s5dKsKc_Qd6h6s4d_Jc5s8sQs_3s7h4hJs_7c4s3c5h_9dAs9hTh_7d9c4cQc() {
    assertEquals(
      "Jc5s8sQs Qd6h6s4d 7d9c4cQc 2s5dKsKc 7c4s3c5h 3s7h4hJs 9dAs9hTh",
      Solver.process("omaha-holdem 2h3d9sAhKh 2s5dKsKc Qd6h6s4d Jc5s8sQs 3s7h4hJs 7c4s3c5h 9dAs9hTh 7d9c4cQc"));
  }

  @Test
  public void test_omaha_holdem_5790_6s8sAdTcTs_3c9cJc9s_8h2h6c7s_9d5s7c8c_2c4c8dKd_KhJdTh6h() {
    assertEquals(
      "8h2h6c7s 2c4c8dKd 3c9cJc9s 9d5s7c8c KhJdTh6h",
      Solver.process("omaha-holdem 6s8sAdTcTs 3c9cJc9s 8h2h6c7s 9d5s7c8c 2c4c8dKd KhJdTh6h"));
  }

  @Test
  public void test_omaha_holdem_5791_4c4d6sAsTh_2sQc6d4s_Qd4hJs2d_Jh5h8d2c_AdTs3sKc_9h8h6c8s_Kd9cAc8c_QsTdJcJd_Ah3hTc5s() {
    assertEquals(
      "Jh5h8d2c 9h8h6c8s QsTdJcJd Kd9cAc8c AdTs3sKc=Ah3hTc5s Qd4hJs2d 2sQc6d4s",
      Solver.process("omaha-holdem 4c4d6sAsTh 2sQc6d4s Qd4hJs2d Jh5h8d2c AdTs3sKc 9h8h6c8s Kd9cAc8c QsTdJcJd Ah3hTc5s"));
  }

  @Test
  public void test_omaha_holdem_5792_2d5dAhQcTs_7h3d9cKc_JcJs2c4d_7c9s8c6h_JhAcThAd_7dQh3sKh_5h2h2s3c() {
    assertEquals(
      "7c9s8c6h 7h3d9cKc JcJs2c4d 7dQh3sKh 5h2h2s3c JhAcThAd",
      Solver.process("omaha-holdem 2d5dAhQcTs 7h3d9cKc JcJs2c4d 7c9s8c6h JhAcThAd 7dQh3sKh 5h2h2s3c"));
  }

  @Test
  public void test_omaha_holdem_5793_6c6s9sTdTh_QdKd5cKc_8c2c6dAh_7hAd4d4c_6h5hAc3s_Qc7s9c4s_TsKh2hTc_2d8d5d2s() {
    assertEquals(
      "2d8d5d2s 7hAd4d4c Qc7s9c4s QdKd5cKc 6h5hAc3s=8c2c6dAh TsKh2hTc",
      Solver.process("omaha-holdem 6c6s9sTdTh QdKd5cKc 8c2c6dAh 7hAd4d4c 6h5hAc3s Qc7s9c4s TsKh2hTc 2d8d5d2s"));
  }

  @Test
  public void test_omaha_holdem_5794_2s3h7c7sJd_4h9c8d3s_3cJcQcQd_ThAcJh7h_Js4d2c5d_Qh8c6h9s_AdTs6cKs_Tc5c9h8h_QsKdKh3d_5s6dKc2d() {
    assertEquals(
      "Tc5c9h8h Qh8c6h9s AdTs6cKs 5s6dKc2d 4h9c8d3s Js4d2c5d 3cJcQcQd QsKdKh3d ThAcJh7h",
      Solver.process("omaha-holdem 2s3h7c7sJd 4h9c8d3s 3cJcQcQd ThAcJh7h Js4d2c5d Qh8c6h9s AdTs6cKs Tc5c9h8h QsKdKh3d 5s6dKc2d"));
  }

  @Test
  public void test_omaha_holdem_5795_8d8sAcAhQc_8h9hJsQs_4d5c4cTc_9s5d7c4h_Jc2h7s2s_2c3c3sJh_KdQh8cAs_JdQd6cTd_7hTs5s9c_6dKsThAd() {
    assertEquals(
      "9s5d7c4h 7hTs5s9c Jc2h7s2s 2c3c3sJh 4d5c4cTc JdQd6cTd 6dKsThAd 8h9hJsQs KdQh8cAs",
      Solver.process("omaha-holdem 8d8sAcAhQc 8h9hJsQs 4d5c4cTc 9s5d7c4h Jc2h7s2s 2c3c3sJh KdQh8cAs JdQd6cTd 7hTs5s9c 6dKsThAd"));
  }

  @Test
  public void test_omaha_holdem_5796_6s8dAhKhTs_2s8h4h5c_7sTc7c6h() {
    assertEquals(
      "2s8h4h5c 7sTc7c6h",
      Solver.process("omaha-holdem 6s8dAhKhTs 2s8h4h5c 7sTc7c6h"));
  }

  @Test
  public void test_omaha_holdem_5797_4c5s6s8sJs_9s6d3dTd_5hTh2cAd_8h8d7h3c_7dKs4h6c_4sTcAs2s_7cQdKh2h_6hAc8cJh_Qc3h3s5d_Jc9cTsQs() {
    assertEquals(
      "7cQdKh2h Qc3h3s5d 5hTh2cAd 9s6d3dTd 6hAc8cJh 7dKs4h6c=8h8d7h3c Jc9cTsQs 4sTcAs2s",
      Solver.process("omaha-holdem 4c5s6s8sJs 9s6d3dTd 5hTh2cAd 8h8d7h3c 7dKs4h6c 4sTcAs2s 7cQdKh2h 6hAc8cJh Qc3h3s5d Jc9cTsQs"));
  }

  @Test
  public void test_omaha_holdem_5798_3d9sAcJcJd_9c2c4sQs_Ts8d4h6h_Tc4c3hKc_2sJs7d2h_Ks5h8hTd_7sAhKh6s_8c9dQhQc() {
    assertEquals(
      "Ts8d4h6h Ks5h8hTd Tc4c3hKc 9c2c4sQs 8c9dQhQc 7sAhKh6s 2sJs7d2h",
      Solver.process("omaha-holdem 3d9sAcJcJd 9c2c4sQs Ts8d4h6h Tc4c3hKc 2sJs7d2h Ks5h8hTd 7sAhKh6s 8c9dQhQc"));
  }

  @Test
  public void test_omaha_holdem_5799_2c8dJsKdKh_Ad9cJc7c_7s8c6cKs_6h9dTcQd_6d7dJh8h_Ah9hTs4c_Td3c5cQc_7hJd5d4d_Th3s4hAs() {
    assertEquals(
      "6h9dTcQd=Td3c5cQc Ah9hTs4c=Th3s4hAs 7hJd5d4d 6d7dJh8h Ad9cJc7c 7s8c6cKs",
      Solver.process("omaha-holdem 2c8dJsKdKh Ad9cJc7c 7s8c6cKs 6h9dTcQd 6d7dJh8h Ah9hTs4c Td3c5cQc 7hJd5d4d Th3s4hAs"));
  }

  @Test
  public void test_omaha_holdem_5800_2c3s5cJcQd_3d3h8hQh_6hKsAc6s_5sAhKd7s_8c6c9sKh_Ad2hAs8d_4hTs2s4s() {
    assertEquals(
      "4hTs2s4s 5sAhKd7s 6hKsAc6s Ad2hAs8d 3d3h8hQh 8c6c9sKh",
      Solver.process("omaha-holdem 2c3s5cJcQd 3d3h8hQh 6hKsAc6s 5sAhKd7s 8c6c9sKh Ad2hAs8d 4hTs2s4s"));
  }

  @Test
  public void test_omaha_holdem_5801_3c3d3sKcQd_5cTcKhQh_9s7d9d5h_AhTs7c2h_8c4dThAd() {
    assertEquals(
      "5cTcKhQh 8c4dThAd=AhTs7c2h 9s7d9d5h",
      Solver.process("omaha-holdem 3c3d3sKcQd 5cTcKhQh 9s7d9d5h AhTs7c2h 8c4dThAd"));
  }

  @Test
  public void test_omaha_holdem_5802_3s4hAdJhTd_8d4s9d8s_7d2sQh9c_Qs9sKc6c_7c3dAcJd_8hJs4c6s_9h5cJc3c() {
    assertEquals(
      "7d2sQh9c 8d4s9d8s 9h5cJc3c 8hJs4c6s 7c3dAcJd Qs9sKc6c",
      Solver.process("omaha-holdem 3s4hAdJhTd 8d4s9d8s 7d2sQh9c Qs9sKc6c 7c3dAcJd 8hJs4c6s 9h5cJc3c"));
  }

  @Test
  public void test_omaha_holdem_5803_2h3c4d6h7c_ThJhQsJd_Ac6c7s6s_QdKhAhAs_9s7hJs2c_Ts4h5hQh_Kc8h4cQc_Ad3d5s9d_Tc8s9h5d_2s7d3sJc() {
    assertEquals(
      "Kc8h4cQc ThJhQsJd QdKhAhAs 9s7hJs2c 2s7d3sJc Ac6c7s6s Ad3d5s9d=Ts4h5hQh Tc8s9h5d",
      Solver.process("omaha-holdem 2h3c4d6h7c ThJhQsJd Ac6c7s6s QdKhAhAs 9s7hJs2c Ts4h5hQh Kc8h4cQc Ad3d5s9d Tc8s9h5d 2s7d3sJc"));
  }

  @Test
  public void test_omaha_holdem_5804_6s8c8d9cTh_4h8s7s5h_7h5d4s9d_JdQcAc9h_5s3cKd4d_3dTsQdTc_7dTdKc5c_6hAh2s6c_7cKh9sQh_2h3h8h4c() {
    assertEquals(
      "5s3cKd4d 2h3h8h4c 4h8s7s5h=7cKh9sQh=7dTdKc5c=7h5d4s9d JdQcAc9h 6hAh2s6c 3dTsQdTc",
      Solver.process("omaha-holdem 6s8c8d9cTh 4h8s7s5h 7h5d4s9d JdQcAc9h 5s3cKd4d 3dTsQdTc 7dTdKc5c 6hAh2s6c 7cKh9sQh 2h3h8h4c"));
  }

  @Test
  public void test_omaha_holdem_5805_4c4s6s8s9c_3s8hQc6c_QhAs9d8d_Jc6dJdJs_9hKdTdKh_5dTs2d2s_3c7h2c9s_Ad5cThTc_Ac7d7sQd_5hJh3h6h() {
    assertEquals(
      "5hJh3h6h Ac7d7sQd 3s8hQc6c 3c7h2c9s QhAs9d8d Ad5cThTc Jc6dJdJs 9hKdTdKh 5dTs2d2s",
      Solver.process("omaha-holdem 4c4s6s8s9c 3s8hQc6c QhAs9d8d Jc6dJdJs 9hKdTdKh 5dTs2d2s 3c7h2c9s Ad5cThTc Ac7d7sQd 5hJh3h6h"));
  }

  @Test
  public void test_omaha_holdem_5806_3d3s8hThTs_9sJc4s3h_7hQh6s9c_7dQc5h2c_Ks2dAhQs_Ac2h7s5d_Kd9d8cKc_TdAdJh7c_Js3c4d2s() {
    assertEquals(
      "7dQc5h2c 7hQh6s9c Ac2h7s5d Ks2dAhQs Kd9d8cKc 9sJc4s3h=Js3c4d2s TdAdJh7c",
      Solver.process("omaha-holdem 3d3s8hThTs 9sJc4s3h 7hQh6s9c 7dQc5h2c Ks2dAhQs Ac2h7s5d Kd9d8cKc TdAdJh7c Js3c4d2s"));
  }

  @Test
  public void test_omaha_holdem_5807_2c3hJdKcKd_Qd6sKsQc_2h7c9h6h() {
    assertEquals(
      "2h7c9h6h Qd6sKsQc",
      Solver.process("omaha-holdem 2c3hJdKcKd Qd6sKsQc 2h7c9h6h"));
  }

  @Test
  public void test_omaha_holdem_5808_2d6d6sAsJs_5sKh7hQh_Th8dTc2h_Qc8sTs3d_QdKd8h9h_6h5h7c5c() {
    assertEquals(
      "5sKh7hQh=QdKd8h9h Th8dTc2h 6h5h7c5c Qc8sTs3d",
      Solver.process("omaha-holdem 2d6d6sAsJs 5sKh7hQh Th8dTc2h Qc8sTs3d QdKd8h9h 6h5h7c5c"));
  }

  @Test
  public void test_omaha_holdem_5809_3c5d7h8hKh_4cAs5s8c_7c6hJh5c_4sAdTsKc() {
    assertEquals(
      "4sAdTsKc 4cAs5s8c 7c6hJh5c",
      Solver.process("omaha-holdem 3c5d7h8hKh 4cAs5s8c 7c6hJh5c 4sAdTsKc"));
  }

  @Test
  public void test_omaha_holdem_5810_2s4c8dJsQh_5dTs9c4h_7h3s6dJd_Kc3c5sQc_2d7d7sTh_9dAs8sQs_Jc5hTcKs_Jh9s5c6c_4sKdQd6s() {
    assertEquals(
      "2d7d7sTh 7h3s6dJd Jh9s5c6c Jc5hTcKs Kc3c5sQc 4sKdQd6s 9dAs8sQs 5dTs9c4h",
      Solver.process("omaha-holdem 2s4c8dJsQh 5dTs9c4h 7h3s6dJd Kc3c5sQc 2d7d7sTh 9dAs8sQs Jc5hTcKs Jh9s5c6c 4sKdQd6s"));
  }

  @Test
  public void test_omaha_holdem_5811_2h8c9cAhTc_5h5dKsKc_JdQs5c9h_KhTdTsAd_6hQh7d8h_9s7s3c5s() {
    assertEquals(
      "9s7s3c5s 5h5dKsKc KhTdTsAd 6hQh7d8h JdQs5c9h",
      Solver.process("omaha-holdem 2h8c9cAhTc 5h5dKsKc JdQs5c9h KhTdTsAd 6hQh7d8h 9s7s3c5s"));
  }

  @Test
  public void test_omaha_holdem_5812_2s3s7dKhQc_2hAh5c6s_4c7c2cQs() {
    assertEquals(
      "2hAh5c6s 4c7c2cQs",
      Solver.process("omaha-holdem 2s3s7dKhQc 2hAh5c6s 4c7c2cQs"));
  }

  @Test
  public void test_omaha_holdem_5813_6d8d9cAhQs_5cKd9s2d_7s3sTcAc_3hJc5d3d_4s2s6h8h_6sTdTs4c_QcKc9dJs_8cAd8s4d_7hQdQh5h_Jd2h9hJh() {
    assertEquals(
      "3hJc5d3d 5cKd9s2d 6sTdTs4c Jd2h9hJh 4s2s6h8h QcKc9dJs 8cAd8s4d 7hQdQh5h 7s3sTcAc",
      Solver.process("omaha-holdem 6d8d9cAhQs 5cKd9s2d 7s3sTcAc 3hJc5d3d 4s2s6h8h 6sTdTs4c QcKc9dJs 8cAd8s4d 7hQdQh5h Jd2h9hJh"));
  }

  @Test
  public void test_omaha_holdem_5814_3c7h8cKsTh_9h9dAcKc_Ts5d6h7d_7s3hAhJd_JcJhJs7c_3dQs5c9s_8hAsAdQc() {
    assertEquals(
      "3dQs5c9s JcJhJs7c 9h9dAcKc 8hAsAdQc 7s3hAhJd Ts5d6h7d",
      Solver.process("omaha-holdem 3c7h8cKsTh 9h9dAcKc Ts5d6h7d 7s3hAhJd JcJhJs7c 3dQs5c9s 8hAsAdQc"));
  }

  @Test
  public void test_omaha_holdem_5815_3s4c7cAhAs_Jh6s8c3h_2h8h6dKs_4sKhJd9d_5cTcQd7h() {
    assertEquals(
      "2h8h6dKs Jh6s8c3h 4sKhJd9d 5cTcQd7h",
      Solver.process("omaha-holdem 3s4c7cAhAs Jh6s8c3h 2h8h6dKs 4sKhJd9d 5cTcQd7h"));
  }

  @Test
  public void test_omaha_holdem_5816_3c5cAdJsKh_9s9c8hJc_Td2sKs7d_8s4h3d6d_ThAc3sKd() {
    assertEquals(
      "8s4h3d6d 9s9c8hJc Td2sKs7d ThAc3sKd",
      Solver.process("omaha-holdem 3c5cAdJsKh 9s9c8hJc Td2sKs7d 8s4h3d6d ThAc3sKd"));
  }

  @Test
  public void test_omaha_holdem_5817_2c3d4s7d9c_8h2sAhTd_5s3sJs5d_2h5c7s3h() {
    assertEquals(
      "8h2sAhTd 5s3sJs5d 2h5c7s3h",
      Solver.process("omaha-holdem 2c3d4s7d9c 8h2sAhTd 5s3sJs5d 2h5c7s3h"));
  }

  @Test
  public void test_omaha_holdem_5818_2h7d8sAhTs_AcQdAs4h_5c3s5d4s_Jc9dKd9h_Ad2cKhTc_3dQc5sKs_6h3c6c7h_8cJs7c4c_Kc2dTh2s() {
    assertEquals(
      "3dQc5sKs 5c3s5d4s 6h3c6c7h 8cJs7c4c Ad2cKhTc Kc2dTh2s AcQdAs4h Jc9dKd9h",
      Solver.process("omaha-holdem 2h7d8sAhTs AcQdAs4h 5c3s5d4s Jc9dKd9h Ad2cKhTc 3dQc5sKs 6h3c6c7h 8cJs7c4c Kc2dTh2s"));
  }

  @Test
  public void test_omaha_holdem_5819_6s7cAdQcQd_8sJs6c8h_Kd3s7s5d_9dJhKsQs_Kh3h5h4h_Ah9hAc6h_9s5cJc4c_Qh6d2c8d_5s2s2hTc() {
    assertEquals(
      "9s5cJc4c Kh3h5h4h 5s2s2hTc Kd3s7s5d 8sJs6c8h 9dJhKsQs Qh6d2c8d Ah9hAc6h",
      Solver.process("omaha-holdem 6s7cAdQcQd 8sJs6c8h Kd3s7s5d 9dJhKsQs Kh3h5h4h Ah9hAc6h 9s5cJc4c Qh6d2c8d 5s2s2hTc"));
  }

  @Test
  public void test_omaha_holdem_5820_2c6d7hJcKh_Jh7d5d8s_KdAc6sJd_2s5c8hQc_3h8c9cAd_As4h9s3c_9dKcQh6h_Qs3sThTc_4c5h7s7c() {
    assertEquals(
      "3h8c9cAd=As4h9s3c 2s5c8hQc Qs3sThTc Jh7d5d8s 9dKcQh6h KdAc6sJd 4c5h7s7c",
      Solver.process("omaha-holdem 2c6d7hJcKh Jh7d5d8s KdAc6sJd 2s5c8hQc 3h8c9cAd As4h9s3c 9dKcQh6h Qs3sThTc 4c5h7s7c"));
  }

  @Test
  public void test_omaha_holdem_5821_3s4d8hAsKs_6h6cQd5s_3c4c7s5d_Kc4sKd4h_JsTs9d3h_AcTcAh7h() {
    assertEquals(
      "6h6cQd5s 3c4c7s5d Kc4sKd4h AcTcAh7h JsTs9d3h",
      Solver.process("omaha-holdem 3s4d8hAsKs 6h6cQd5s 3c4c7s5d Kc4sKd4h JsTs9d3h AcTcAh7h"));
  }

  @Test
  public void test_omaha_holdem_5822_4h5sQcQdTs_2cAdTc8d_9h4dQh6d_6cAs8h4s_Jd2s2hJh_7dJcJs5c_Kc3c2d6s_9d3sKs4c() {
    assertEquals(
      "Kc3c2d6s 9d3sKs4c 6cAs8h4s 2cAdTc8d 7dJcJs5c=Jd2s2hJh 9h4dQh6d",
      Solver.process("omaha-holdem 4h5sQcQdTs 2cAdTc8d 9h4dQh6d 6cAs8h4s Jd2s2hJh 7dJcJs5c Kc3c2d6s 9d3sKs4c"));
  }

  @Test
  public void test_omaha_holdem_5823_8c8sQcTdTs_Ac5h3hQh_8h3c4s5s_9hJd7s5c_7h4h6s6d() {
    assertEquals(
      "7h4h6s6d Ac5h3hQh 8h3c4s5s 9hJd7s5c",
      Solver.process("omaha-holdem 8c8sQcTdTs Ac5h3hQh 8h3c4s5s 9hJd7s5c 7h4h6s6d"));
  }

  @Test
  public void test_omaha_holdem_5824_3s5s6d7h8s_4s4hThAd_8h3c5c2c_9cAhQs4c_5h3h9hQc() {
    assertEquals(
      "9cAhQs4c 4s4hThAd 8h3c5c2c 5h3h9hQc",
      Solver.process("omaha-holdem 3s5s6d7h8s 4s4hThAd 8h3c5c2c 9cAhQs4c 5h3h9hQc"));
  }

  @Test
  public void test_omaha_holdem_5825_2h4s5d6d7s_4h8cJc4c_9hTh8dJs_Td6sQhQs_7hJdAd9d_9cTsKcAc_Kh3s4d6c_8s5cTc3h_Qc3cAhQd() {
    assertEquals(
      "9cTsKcAc 7hJdAd9d Td6sQhQs Qc3cAhQd Kh3s4d6c 4h8cJc4c=8s5cTc3h 9hTh8dJs",
      Solver.process("omaha-holdem 2h4s5d6d7s 4h8cJc4c 9hTh8dJs Td6sQhQs 7hJdAd9d 9cTsKcAc Kh3s4d6c 8s5cTc3h Qc3cAhQd"));
  }

  @Test
  public void test_omaha_holdem_5826_2s4h5s7hJs_Jc7dJd8h_6c5cTd4s_5d2hKsAh() {
    assertEquals(
      "5d2hKsAh 6c5cTd4s Jc7dJd8h",
      Solver.process("omaha-holdem 2s4h5s7hJs Jc7dJd8h 6c5cTd4s 5d2hKsAh"));
  }

  @Test
  public void test_omaha_holdem_5827_5c7d7s8cQc_5d4d8hAd_TsKs8s5h_4h2dQhKc_7cAc6hJh_2hJdTcJs_Td3h3sTh_2c9h9dJc_6c2s8dKd() {
    assertEquals(
      "6c2s8dKd=TsKs8s5h 5d4d8hAd Td3h3sTh 2hJdTcJs 4h2dQhKc 2c9h9dJc 7cAc6hJh",
      Solver.process("omaha-holdem 5c7d7s8cQc 5d4d8hAd TsKs8s5h 4h2dQhKc 7cAc6hJh 2hJdTcJs Td3h3sTh 2c9h9dJc 6c2s8dKd"));
  }

  @Test
  public void test_omaha_holdem_5828_4s6d8c9sQd_Ts8d2cKh_5h7h7sKc_6h8s6c5s_AhKs8h4c_9c3d3cAs_Tc5c9d4d_QcJdKdQs_4h9hAdTd() {
    assertEquals(
      "Ts8d2cKh 9c3d3cAs AhKs8h4c 4h9hAdTd=Tc5c9d4d 6h8s6c5s QcJdKdQs 5h7h7sKc",
      Solver.process("omaha-holdem 4s6d8c9sQd Ts8d2cKh 5h7h7sKc 6h8s6c5s AhKs8h4c 9c3d3cAs Tc5c9d4d QcJdKdQs 4h9hAdTd"));
  }

  @Test
  public void test_omaha_holdem_5829_4d6cAhAsQs_TcAcKhQc_ThQhJd2s_7d4s3sJs_Ks9d7s9c_Td8dKc7h() {
    assertEquals(
      "Td8dKc7h 7d4s3sJs Ks9d7s9c ThQhJd2s TcAcKhQc",
      Solver.process("omaha-holdem 4d6cAhAsQs TcAcKhQc ThQhJd2s 7d4s3sJs Ks9d7s9c Td8dKc7h"));
  }

  @Test
  public void test_omaha_holdem_5830_2c8sAhJdTd_3hKcTc7c_Ks7sJs4s_7dQc6cAs() {
    assertEquals(
      "3hKcTc7c Ks7sJs4s 7dQc6cAs",
      Solver.process("omaha-holdem 2c8sAhJdTd 3hKcTc7c Ks7sJs4s 7dQc6cAs"));
  }

  @Test
  public void test_omaha_holdem_5831_2s3h4s8s9d_7c5c2dTh_Qd5d3d7h_4c3c8dJc_KcAc6d8h() {
    assertEquals(
      "7c5c2dTh Qd5d3d7h KcAc6d8h 4c3c8dJc",
      Solver.process("omaha-holdem 2s3h4s8s9d 7c5c2dTh Qd5d3d7h 4c3c8dJc KcAc6d8h"));
  }

  @Test
  public void test_omaha_holdem_5832_4d4sJdKdQh_8sTcQc7s_As2dQs9h_4hTdAc6c_7d4c8h3h_2sJc7h3s_7c5sKhAd_9d8cKs6s_3c5c3d2c_Kc8d2h9s() {
    assertEquals(
      "3c5c3d2c 2sJc7h3s 8sTcQc7s As2dQs9h 9d8cKs6s=Kc8d2h9s 7c5sKhAd 7d4c8h3h 4hTdAc6c",
      Solver.process("omaha-holdem 4d4sJdKdQh 8sTcQc7s As2dQs9h 4hTdAc6c 7d4c8h3h 2sJc7h3s 7c5sKhAd 9d8cKs6s 3c5c3d2c Kc8d2h9s"));
  }

  @Test
  public void test_omaha_holdem_5833_9sAcKdKsTc_2s9cQc7c_Qh8h7d3c_3sAd6hTd_KcJd5h5d_9hTs2c3h_8d5s7h2d() {
    assertEquals(
      "8d5s7h2d Qh8h7d3c 2s9cQc7c 9hTs2c3h 3sAd6hTd KcJd5h5d",
      Solver.process("omaha-holdem 9sAcKdKsTc 2s9cQc7c Qh8h7d3c 3sAd6hTd KcJd5h5d 9hTs2c3h 8d5s7h2d"));
  }

  @Test
  public void test_omaha_holdem_5834_4c5c7h8hQd_JsAs2dKc_8c7cKs9h_7sJd4d5d_JcJh2h7d_4h2cTdTh_9dKh3dQc_Ac5s8dQs_TcAhQhKd_6sTs6hAd() {
    assertEquals(
      "JsAs2dKc 6sTs6hAd 4h2cTdTh JcJh2h7d 9dKh3dQc TcAhQhKd 7sJd4d5d 8c7cKs9h Ac5s8dQs",
      Solver.process("omaha-holdem 4c5c7h8hQd JsAs2dKc 8c7cKs9h 7sJd4d5d JcJh2h7d 4h2cTdTh 9dKh3dQc Ac5s8dQs TcAhQhKd 6sTs6hAd"));
  }

  @Test
  public void test_omaha_holdem_5835_2c5s7c9sAh_Tc5c4s3d_2s4dAs9d_4h9cJd8c_Qd7sQh4c_Ts8hJs8d() {
    assertEquals(
      "Ts8hJs8d 4h9cJd8c Qd7sQh4c 2s4dAs9d Tc5c4s3d",
      Solver.process("omaha-holdem 2c5s7c9sAh Tc5c4s3d 2s4dAs9d 4h9cJd8c Qd7sQh4c Ts8hJs8d"));
  }

  @Test
  public void test_omaha_holdem_5836_3d3h4s9hJs_4d2hQsTc_8s3s6hTs_3cKcTdJh_2dQcTh5s_6d4c5h4h() {
    assertEquals(
      "2dQcTh5s 4d2hQsTc 8s3s6hTs 3cKcTdJh 6d4c5h4h",
      Solver.process("omaha-holdem 3d3h4s9hJs 4d2hQsTc 8s3s6hTs 3cKcTdJh 2dQcTh5s 6d4c5h4h"));
  }

  @Test
  public void test_omaha_holdem_5837_5s7dJhKdTc_8dKs3h3c_6sAs5cJd_3s8s4dTh_5h7c9s8c_Qd3d2sJc_6d9cQsJs_Ac9h4h8h_TdKcQh7h() {
    assertEquals(
      "3s8s4dTh Qd3d2sJc 8dKs3h3c 6sAs5cJd TdKcQh7h 5h7c9s8c=Ac9h4h8h 6d9cQsJs",
      Solver.process("omaha-holdem 5s7dJhKdTc 8dKs3h3c 6sAs5cJd 3s8s4dTh 5h7c9s8c Qd3d2sJc 6d9cQsJs Ac9h4h8h TdKcQh7h"));
  }

  @Test
  public void test_omaha_holdem_5838_3c3h4s7sTc_Ad8hTs7c_Kc4h7d9s_6s8s8c5h_Jc3d4d8d_Qs2s5sTd_Kd6c9cQc_Th4c9h5d() {
    assertEquals(
      "Kd6c9cQc Kc4h7d9s Qs2s5sTd Th4c9h5d Ad8hTs7c 6s8s8c5h Jc3d4d8d",
      Solver.process("omaha-holdem 3c3h4s7sTc Ad8hTs7c Kc4h7d9s 6s8s8c5h Jc3d4d8d Qs2s5sTd Kd6c9cQc Th4c9h5d"));
  }

  @Test
  public void test_omaha_holdem_5839_2c4h6dAhTc_7dJc4sAs_9cKd8h8c() {
    assertEquals(
      "9cKd8h8c 7dJc4sAs",
      Solver.process("omaha-holdem 2c4h6dAhTc 7dJc4sAs 9cKd8h8c"));
  }

  @Test
  public void test_omaha_holdem_5840_3h7dJcJdQc_4h5hQd3d_Ah8d2s3c_AcQh6s6d_9dAdTh7c() {
    assertEquals(
      "Ah8d2s3c 9dAdTh7c 4h5hQd3d AcQh6s6d",
      Solver.process("omaha-holdem 3h7dJcJdQc 4h5hQd3d Ah8d2s3c AcQh6s6d 9dAdTh7c"));
  }

  @Test
  public void test_omaha_holdem_5841_4c6c7h9cTh_9h2s9dJh_JsAsTsKc_6hJcQc7d_4dQh7c3h_2c4hAcTc() {
    assertEquals(
      "JsAsTsKc 4dQh7c3h 9h2s9dJh 6hJcQc7d 2c4hAcTc",
      Solver.process("omaha-holdem 4c6c7h9cTh 9h2s9dJh JsAsTsKc 6hJcQc7d 4dQh7c3h 2c4hAcTc"));
  }

  @Test
  public void test_omaha_holdem_5842_2s5c9cAcAd_5d6h9d8c_Jc3cKhTh_4c4h6c4d_3h7hTd6d_KsQd7c2h_5h8sAs2d() {
    assertEquals(
      "3h7hTd6d KsQd7c2h 5d6h9d8c 4c4h6c4d Jc3cKhTh 5h8sAs2d",
      Solver.process("omaha-holdem 2s5c9cAcAd 5d6h9d8c Jc3cKhTh 4c4h6c4d 3h7hTd6d KsQd7c2h 5h8sAs2d"));
  }

  @Test
  public void test_omaha_holdem_5843_2c8c9hAdJd_Ah5cTc4h_7s3c7dKd_7h9c9d7c() {
    assertEquals(
      "7s3c7dKd Ah5cTc4h 7h9c9d7c",
      Solver.process("omaha-holdem 2c8c9hAdJd Ah5cTc4h 7s3c7dKd 7h9c9d7c"));
  }

  @Test
  public void test_omaha_holdem_5844_4c8d9dJhKs_4dQh3dKc_Ts4s2cQc_Js8h7hTh_5d6d5s2h_QsKd3c7d_AsJd5hTc_9h2dTd9c() {
    assertEquals(
      "5d6d5s2h AsJd5hTc QsKd3c7d 4dQh3dKc 9h2dTd9c Js8h7hTh Ts4s2cQc",
      Solver.process("omaha-holdem 4c8d9dJhKs 4dQh3dKc Ts4s2cQc Js8h7hTh 5d6d5s2h QsKd3c7d AsJd5hTc 9h2dTd9c"));
  }

  @Test
  public void test_omaha_holdem_5845_3h5s6s8sAs_8cJc5h7d_Ts3cJdQd_6hKh6d4h_4cQcJs7s() {
    assertEquals(
      "Ts3cJdQd 8cJc5h7d 6hKh6d4h 4cQcJs7s",
      Solver.process("omaha-holdem 3h5s6s8sAs 8cJc5h7d Ts3cJdQd 6hKh6d4h 4cQcJs7s"));
  }

  @Test
  public void test_omaha_holdem_5846_2c3c4hJdKh_3hQc5d8s_5s9cQdAs_Tc3dTdTh_2sKd4cAh_Ts7h7s3s() {
    assertEquals(
      "3hQc5d8s Ts7h7s3s Tc3dTdTh 2sKd4cAh 5s9cQdAs",
      Solver.process("omaha-holdem 2c3c4hJdKh 3hQc5d8s 5s9cQdAs Tc3dTdTh 2sKd4cAh Ts7h7s3s"));
  }

  @Test
  public void test_omaha_holdem_5847_2s3c4d7c7h_Qd6s8d5s_6c3d8hKc_8c4h2dTs() {
    assertEquals(
      "6c3d8hKc 8c4h2dTs Qd6s8d5s",
      Solver.process("omaha-holdem 2s3c4d7c7h Qd6s8d5s 6c3d8hKc 8c4h2dTs"));
  }

  @Test
  public void test_omaha_holdem_5848_2c3c5c9dTd_KhAhAdKd_8hJs5hQd_7sJd2h5s_Kc7hJc6d_Ac3d3s6h_2sQsTs9c() {
    assertEquals(
      "8hJs5hQd KhAhAdKd 7sJd2h5s 2sQsTs9c Ac3d3s6h Kc7hJc6d",
      Solver.process("omaha-holdem 2c3c5c9dTd KhAhAdKd 8hJs5hQd 7sJd2h5s Kc7hJc6d Ac3d3s6h 2sQsTs9c"));
  }

  @Test
  public void test_omaha_holdem_5849_8hAdAsQcQh_3hJdQsKh_Kc2d3dTs_9c4c3cTh_5cKs8sJs() {
    assertEquals(
      "9c4c3cTh Kc2d3dTs 5cKs8sJs 3hJdQsKh",
      Solver.process("omaha-holdem 8hAdAsQcQh 3hJdQsKh Kc2d3dTs 9c4c3cTh 5cKs8sJs"));
  }

  @Test
  public void test_omaha_holdem_5850_5s8d8s9hQs_3sJd7d6c_Qc9s7sAs_Qd8cJc6h_Th4h5c4s() {
    assertEquals(
      "Th4h5c4s 3sJd7d6c Qc9s7sAs Qd8cJc6h",
      Solver.process("omaha-holdem 5s8d8s9hQs 3sJd7d6c Qc9s7sAs Qd8cJc6h Th4h5c4s"));
  }

  @Test
  public void test_omaha_holdem_5851_4h8h8sAdJd_6c7sJhQd_JsAs2h8c_4c9c3h2c_4s9h6hQs_5h6s8d6d_3sThTdQc_3d7h5c5d() {
    assertEquals(
      "4c9c3h2c 4s9h6hQs 3d7h5c5d 3sThTdQc 6c7sJhQd 5h6s8d6d JsAs2h8c",
      Solver.process("omaha-holdem 4h8h8sAdJd 6c7sJhQd JsAs2h8c 4c9c3h2c 4s9h6hQs 5h6s8d6d 3sThTdQc 3d7h5c5d"));
  }

  @Test
  public void test_omaha_holdem_5852_2h5c8hKhTs_9c6s2d9h_7sQc7hAh_JhJsAs9d_Th6h9s4s_2s8sJdQh() {
    assertEquals(
      "9c6s2d9h JhJsAs9d 2s8sJdQh Th6h9s4s 7sQc7hAh",
      Solver.process("omaha-holdem 2h5c8hKhTs 9c6s2d9h 7sQc7hAh JhJsAs9d Th6h9s4s 2s8sJdQh"));
  }

  @Test
  public void test_omaha_holdem_5853_2h3h7c8sAs_Qh5s3cJh_6c2c9c2d_Kc4s2s6d_QsAc4h3d_Qd6sTs8c_6h5h9dAh_TdJcJdTc_7s9s9h4c_5c7h4d5d() {
    assertEquals(
      "Kc4s2s6d Qh5s3cJh Qd6sTs8c 7s9s9h4c TdJcJdTc 6h5h9dAh QsAc4h3d 6c2c9c2d 5c7h4d5d",
      Solver.process("omaha-holdem 2h3h7c8sAs Qh5s3cJh 6c2c9c2d Kc4s2s6d QsAc4h3d Qd6sTs8c 6h5h9dAh TdJcJdTc 7s9s9h4c 5c7h4d5d"));
  }

  @Test
  public void test_omaha_holdem_5854_3h4h6s7cQh_5s6dAs3s_9d9hJd2c() {
    assertEquals(
      "9d9hJd2c 5s6dAs3s",
      Solver.process("omaha-holdem 3h4h6s7cQh 5s6dAs3s 9d9hJd2c"));
  }

  @Test
  public void test_omaha_holdem_5855_5c6dKdKsTd_6s9sAdAc_5dKhQc3d_2s9h7d6h() {
    assertEquals(
      "2s9h7d6h 6s9sAdAc 5dKhQc3d",
      Solver.process("omaha-holdem 5c6dKdKsTd 6s9sAdAc 5dKhQc3d 2s9h7d6h"));
  }

  @Test
  public void test_omaha_holdem_5856_2h3d3h4h9d_8s2cAd4s_6c4d2s2d_7d8h4c6d_8c5dJsJd() {
    assertEquals(
      "7d8h4c6d 8s2cAd4s 8c5dJsJd 6c4d2s2d",
      Solver.process("omaha-holdem 2h3d3h4h9d 8s2cAd4s 6c4d2s2d 7d8h4c6d 8c5dJsJd"));
  }

  @Test
  public void test_omaha_holdem_5857_3h4dAhKcQs_7cAd9h8h_6cQc7s3s_AsTdKh6h_3c4h9s8c_Kd5d8dJs_7hJc7dTc_4s5s2dJh_3d9cQh6d_Th4c8sTs() {
    assertEquals(
      "Th4c8sTs Kd5d8dJs 7cAd9h8h 3c4h9s8c 3d9cQh6d=6cQc7s3s AsTdKh6h 4s5s2dJh 7hJc7dTc",
      Solver.process("omaha-holdem 3h4dAhKcQs 7cAd9h8h 6cQc7s3s AsTdKh6h 3c4h9s8c Kd5d8dJs 7hJc7dTc 4s5s2dJh 3d9cQh6d Th4c8sTs"));
  }

  @Test
  public void test_omaha_holdem_5858_3d6h9sJdTs_TdTc6sKh_2s3hKd4c_AhQs6c8h_3c4sQh4d_Js3s8c7c() {
    assertEquals(
      "2s3hKd4c 3c4sQh4d TdTc6sKh Js3s8c7c AhQs6c8h",
      Solver.process("omaha-holdem 3d6h9sJdTs TdTc6sKh 2s3hKd4c AhQs6c8h 3c4sQh4d Js3s8c7c"));
  }

  @Test
  public void test_omaha_holdem_5859_3c4d9hAcJc_Qs2d4hKc_7s7c5hAh_Qd9dKd8c_KsTd8sAs_Ts2h4s7d_JdAd5dQc_Jh6d6sKh_8d4cTc2c_3d9c2sQh() {
    assertEquals(
      "Ts2h4s7d Qs2d4hKc Qd9dKd8c Jh6d6sKh 7s7c5hAh KsTd8sAs 3d9c2sQh JdAd5dQc 8d4cTc2c",
      Solver.process("omaha-holdem 3c4d9hAcJc Qs2d4hKc 7s7c5hAh Qd9dKd8c KsTd8sAs Ts2h4s7d JdAd5dQc Jh6d6sKh 8d4cTc2c 3d9c2sQh"));
  }

  @Test
  public void test_omaha_holdem_5860_4c6c7h8cAh_Qh9sAdQc_Kc7c5sTh_JsKsAsJh_8s6h4s7d_2d3c8h8d_5c2c4h9d_Qs6sJcQd() {
    assertEquals(
      "Qs6sJcQd Qh9sAdQc JsKsAsJh 8s6h4s7d 2d3c8h8d 5c2c4h9d Kc7c5sTh",
      Solver.process("omaha-holdem 4c6c7h8cAh Qh9sAdQc Kc7c5sTh JsKsAsJh 8s6h4s7d 2d3c8h8d 5c2c4h9d Qs6sJcQd"));
  }

  @Test
  public void test_omaha_holdem_5861_3s4h6dAhJc_7s4d7dTh_9sTc8cJh_3d5h8h8d_4c5dJd6s_TdTsKdQc_6cAcKsQd_4s2d5s8s_Js9cAdQh_2s7h9hQs() {
    assertEquals(
      "2s7h9hQs 7s4d7dTh 3d5h8h8d TdTsKdQc 9sTc8cJh 4c5dJd6s 6cAcKsQd Js9cAdQh 4s2d5s8s",
      Solver.process("omaha-holdem 3s4h6dAhJc 7s4d7dTh 9sTc8cJh 3d5h8h8d 4c5dJd6s TdTsKdQc 6cAcKsQd 4s2d5s8s Js9cAdQh 2s7h9hQs"));
  }

  @Test
  public void test_omaha_holdem_5862_2h6c7c9dQd_6d4sKh4h_2dKsTs5c_Jh2c9sTc_8sAd4dQs_TdKd5h6s_7dThJcJs_KcAh9c4c_8dQhQcAs() {
    assertEquals(
      "2dKsTs5c 6d4sKh4h=TdKd5h6s KcAh9c4c 7dThJcJs 8sAd4dQs Jh2c9sTc 8dQhQcAs",
      Solver.process("omaha-holdem 2h6c7c9dQd 6d4sKh4h 2dKsTs5c Jh2c9sTc 8sAd4dQs TdKd5h6s 7dThJcJs KcAh9c4c 8dQhQcAs"));
  }

  @Test
  public void test_omaha_holdem_5863_4h5d6hKcKh_Qd8h9s7d_2s8s9h9c_Tc6cJc3c_TsQh8c4c_8d7h9dQs_KsQc5hKd_ThJh4d3d() {
    assertEquals(
      "TsQh8c4c Tc6cJc3c 2s8s9h9c 8d7h9dQs=Qd8h9s7d ThJh4d3d KsQc5hKd",
      Solver.process("omaha-holdem 4h5d6hKcKh Qd8h9s7d 2s8s9h9c Tc6cJc3c TsQh8c4c 8d7h9dQs KsQc5hKd ThJh4d3d"));
  }

  @Test
  public void test_omaha_holdem_5864_5s6c9hAdJd_3hQh4s7h_Ts9s6s7s_Td6dAsTc_2h9dKs2d_3s2c6hKh() {
    assertEquals(
      "3hQh4s7h 3s2c6hKh 2h9dKs2d Ts9s6s7s Td6dAsTc",
      Solver.process("omaha-holdem 5s6c9hAdJd 3hQh4s7h Ts9s6s7s Td6dAsTc 2h9dKs2d 3s2c6hKh"));
  }

  @Test
  public void test_omaha_holdem_5865_5c9hAsJhQd_5sAcKsKh_6c7h2s8d_QsJdKd4s() {
    assertEquals(
      "6c7h2s8d QsJdKd4s 5sAcKsKh",
      Solver.process("omaha-holdem 5c9hAsJhQd 5sAcKsKh 6c7h2s8d QsJdKd4s"));
  }

  @Test
  public void test_omaha_holdem_5866_2s3d3h6d9h_4dQc8s2c_AsTh8d4c_7dAhKh5c_5s7h3sJd_5dKdJhTd_Js7cQhAd_9d7s8cAc() {
    assertEquals(
      "5dKdJhTd AsTh8d4c Js7cQhAd 7dAhKh5c 4dQc8s2c 9d7s8cAc 5s7h3sJd",
      Solver.process("omaha-holdem 2s3d3h6d9h 4dQc8s2c AsTh8d4c 7dAhKh5c 5s7h3sJd 5dKdJhTd Js7cQhAd 9d7s8cAc"));
  }

  @Test
  public void test_omaha_holdem_5867_7h8cAhKsTs_4h7cJc2s_7d2h2c6s() {
    assertEquals(
      "7d2h2c6s 4h7cJc2s",
      Solver.process("omaha-holdem 7h8cAhKsTs 4h7cJc2s 7d2h2c6s"));
  }

  @Test
  public void test_omaha_holdem_5868_6s7c7sQdTs_3c5h8s7d_JcKs4c8d_KcAd6h7h_ThKh4d9d() {
    assertEquals(
      "JcKs4c8d ThKh4d9d 3c5h8s7d KcAd6h7h",
      Solver.process("omaha-holdem 6s7c7sQdTs 3c5h8s7d JcKs4c8d KcAd6h7h ThKh4d9d"));
  }

  @Test
  public void test_omaha_holdem_5869_3dQcQsTcTs_8c4cKd7h_6sJc9cAd_3s7dQhQd_8sTd2sTh_AcKc5dAs_JsKhAh4h_9h2c9d2h_5s4d6h7s_3c9s7cJh() {
    assertEquals(
      "5s4d6h7s 8c4cKd7h 6sJc9cAd JsKhAh4h 3c9s7cJh 9h2c9d2h AcKc5dAs 8sTd2sTh 3s7dQhQd",
      Solver.process("omaha-holdem 3dQcQsTcTs 8c4cKd7h 6sJc9cAd 3s7dQhQd 8sTd2sTh AcKc5dAs JsKhAh4h 9h2c9d2h 5s4d6h7s 3c9s7cJh"));
  }

  @Test
  public void test_omaha_holdem_5870_6c6h8sAsJh_2hKhQd2c_6sQh9c4d_Ad4sTh6d_9s2d3c5c_4cTc3sQc() {
    assertEquals(
      "9s2d3c5c 4cTc3sQc 2hKhQd2c 6sQh9c4d Ad4sTh6d",
      Solver.process("omaha-holdem 6c6h8sAsJh 2hKhQd2c 6sQh9c4d Ad4sTh6d 9s2d3c5c 4cTc3sQc"));
  }

  @Test
  public void test_omaha_holdem_5871_7cJsKhQsTc_6h4d2hQh_QdKd2d9h() {
    assertEquals(
      "6h4d2hQh QdKd2d9h",
      Solver.process("omaha-holdem 7cJsKhQsTc 6h4d2hQh QdKd2d9h"));
  }

  @Test
  public void test_omaha_holdem_5872_2c2d5s8hQh_Ts3sTdJd_KhAd6c2s() {
    assertEquals(
      "Ts3sTdJd KhAd6c2s",
      Solver.process("omaha-holdem 2c2d5s8hQh Ts3sTdJd KhAd6c2s"));
  }

  @Test
  public void test_omaha_holdem_5873_3d4c4s6cAh_6d7c7h3h_8c7dJh4d_3cTs4h7s_9h5h2d3s_TdAs9cQs_5sKhQd2h_Ac8h2c5c() {
    assertEquals(
      "6d7c7h3h TdAs9cQs 8c7dJh4d 5sKhQd2h=9h5h2d3s=Ac8h2c5c 3cTs4h7s",
      Solver.process("omaha-holdem 3d4c4s6cAh 6d7c7h3h 8c7dJh4d 3cTs4h7s 9h5h2d3s TdAs9cQs 5sKhQd2h Ac8h2c5c"));
  }

  @Test
  public void test_omaha_holdem_5874_2h3c9dJdTd_ThAcAh4d_7sQd7c6h_2dKc7d3d_6d2c6sKs_4sJcAd3s_QcJhKh4h_5dTc8cQh_8h6c3hQs() {
    assertEquals(
      "6d2c6sKs 7sQd7c6h ThAcAh4d 4sJcAd3s 5dTc8cQh=8h6c3hQs QcJhKh4h 2dKc7d3d",
      Solver.process("omaha-holdem 2h3c9dJdTd ThAcAh4d 7sQd7c6h 2dKc7d3d 6d2c6sKs 4sJcAd3s QcJhKh4h 5dTc8cQh 8h6c3hQs"));
  }

  @Test
  public void test_omaha_holdem_5875_2c3s5h9cAc_5s7c8sTs_9dJcJh8h_7dKs5d3c_AhQs7h6s_6h4h8cAs_6cKhKc2d_Kd3d3hTh_4c2sQdTc_2hJd8dQh() {
    assertEquals(
      "2hJd8dQh 5s7c8sTs 9dJcJh8h AhQs7h6s 7dKs5d3c Kd3d3hTh 6h4h8cAs 4c2sQdTc 6cKhKc2d",
      Solver.process("omaha-holdem 2c3s5h9cAc 5s7c8sTs 9dJcJh8h 7dKs5d3c AhQs7h6s 6h4h8cAs 6cKhKc2d Kd3d3hTh 4c2sQdTc 2hJd8dQh"));
  }

  @Test
  public void test_omaha_holdem_5876_5d6c7cQhTd_Ks4dAc4h_9h4c9d2d_5h2cAhQs_8h2sJc3s_TsAs5sJh_3h7d8c6h_KhKc9sQc() {
    assertEquals(
      "8h2sJc3s Ks4dAc4h 9h4c9d2d KhKc9sQc 3h7d8c6h TsAs5sJh 5h2cAhQs",
      Solver.process("omaha-holdem 5d6c7cQhTd Ks4dAc4h 9h4c9d2d 5h2cAhQs 8h2sJc3s TsAs5sJh 3h7d8c6h KhKc9sQc"));
  }

  @Test
  public void test_omaha_holdem_5877_5c8cAhAsKs_QhQs2s9c_7s7d8dAd_9h6c2d3h_TdJh7h8h_KhJd6s7c_5dJs2h5s() {
    assertEquals(
      "9h6c2d3h TdJh7h8h QhQs2s9c KhJd6s7c 5dJs2h5s 7s7d8dAd",
      Solver.process("omaha-holdem 5c8cAhAsKs QhQs2s9c 7s7d8dAd 9h6c2d3h TdJh7h8h KhJd6s7c 5dJs2h5s"));
  }

  @Test
  public void test_omaha_holdem_5878_6d7hJdJhQh_9dJs4s8h_2h4cTh9c_2dQsKdKh_9h7s6c2c_3h2sJcTd_6hQdAh5s_4d5cAdAc_As3c8d7d_8c9sKsTc() {
    assertEquals(
      "8c9sKsTc 9h7s6c2c As3c8d7d 2dQsKdKh 4d5cAdAc 9dJs4s8h 3h2sJcTd 2h4cTh9c 6hQdAh5s",
      Solver.process("omaha-holdem 6d7hJdJhQh 9dJs4s8h 2h4cTh9c 2dQsKdKh 9h7s6c2c 3h2sJcTd 6hQdAh5s 4d5cAdAc As3c8d7d 8c9sKsTc"));
  }

  @Test
  public void test_omaha_holdem_5879_6s7d8h9dKs_Kh9hJdTs_Qs4s7hKc_Tc6h5d8s_2dKd4h2c_6c7c2s8d_AdAs5sJs_3hAc9s9c_Jh3d5c3s_QhAh7s4d() {
    assertEquals(
      "Jh3d5c3s QhAh7s4d 2dKd4h2c AdAs5sJs 6c7c2s8d Qs4s7hKc 3hAc9s9c Tc6h5d8s Kh9hJdTs",
      Solver.process("omaha-holdem 6s7d8h9dKs Kh9hJdTs Qs4s7hKc Tc6h5d8s 2dKd4h2c 6c7c2s8d AdAs5sJs 3hAc9s9c Jh3d5c3s QhAh7s4d"));
  }

  @Test
  public void test_omaha_holdem_5880_3c5s8dAsTc_2c3hTh4c_3sKh6c9d_JdKs7d8h_6d9s8sKd_2s2h7hAc_Td7sQs7c_9c5cKc6h_4h5d6s9h_4s8cQd5h() {
    assertEquals(
      "3sKh6c9d 4h5d6s9h 9c5cKc6h 6d9s8sKd=JdKs7d8h Td7sQs7c 2s2h7hAc 4s8cQd5h 2c3hTh4c",
      Solver.process("omaha-holdem 3c5s8dAsTc 2c3hTh4c 3sKh6c9d JdKs7d8h 6d9s8sKd 2s2h7hAc Td7sQs7c 9c5cKc6h 4h5d6s9h 4s8cQd5h"));
  }

  @Test
  public void test_omaha_holdem_5881_2hAcAdAsJc_6h3c7hKh_2c7sJs3s_KcQcTc9s() {
    assertEquals(
      "2c7sJs3s 6h3c7hKh KcQcTc9s",
      Solver.process("omaha-holdem 2hAcAdAsJc 6h3c7hKh 2c7sJs3s KcQcTc9s"));
  }

  @Test
  public void test_omaha_holdem_5882_5c5d6s8sQd_9d3d2hTs_7sAc8c4h_2c4c8d3c_Ah6cQc7h_Kh5s9c9s_Tc7cKd4s_4dAsTh3s_TdJdJh6h_6dQsJs8h() {
    assertEquals(
      "9d3d2hTs 4dAsTh3s 2c4c8d3c TdJdJh6h Ah6cQc7h 6dQsJs8h Kh5s9c9s 7sAc8c4h=Tc7cKd4s",
      Solver.process("omaha-holdem 5c5d6s8sQd 9d3d2hTs 7sAc8c4h 2c4c8d3c Ah6cQc7h Kh5s9c9s Tc7cKd4s 4dAsTh3s TdJdJh6h 6dQsJs8h"));
  }

  @Test
  public void test_omaha_holdem_5883_2d3c4d5sTh_2h6dQhTc_9c8cKsQc_7hTsAd6h_As2cAc4h_9h7d5c4s() {
    assertEquals(
      "9c8cKsQc 9h7d5c4s As2cAc4h 2h6dQhTc 7hTsAd6h",
      Solver.process("omaha-holdem 2d3c4d5sTh 2h6dQhTc 9c8cKsQc 7hTsAd6h As2cAc4h 9h7d5c4s"));
  }

  @Test
  public void test_omaha_holdem_5884_3h5c8dJhTd_2c7d9sTh_9dKsTsJd_AsQc2s9c_Jc7sKh8c() {
    assertEquals(
      "Jc7sKh8c 9dKsTsJd 2c7d9sTh AsQc2s9c",
      Solver.process("omaha-holdem 3h5c8dJhTd 2c7d9sTh 9dKsTsJd AsQc2s9c Jc7sKh8c"));
  }

  @Test
  public void test_omaha_holdem_5885_3d9hAsJhJs_Qs8d7s3c_Jc3s2c4d_Kd9s2d5s_2hQc4sKh_AdQh6s4h_8c5d6dTd() {
    assertEquals(
      "8c5d6dTd 2hQc4sKh Qs8d7s3c Kd9s2d5s AdQh6s4h Jc3s2c4d",
      Solver.process("omaha-holdem 3d9hAsJhJs Qs8d7s3c Jc3s2c4d Kd9s2d5s 2hQc4sKh AdQh6s4h 8c5d6dTd"));
  }

  @Test
  public void test_omaha_holdem_5886_7h8hAdKsTd_3hQsJhKd_4sJd3d2c_7d7sKhAh_9hJs9s6s_Th9d8c5c_8sAc9c2s_6c3s4h6d_6h4cQdJc() {
    assertEquals(
      "4sJd3d2c 6c3s4h6d Th9d8c5c 8sAc9c2s 7d7sKhAh 9hJs9s6s 3hQsJhKd=6h4cQdJc",
      Solver.process("omaha-holdem 7h8hAdKsTd 3hQsJhKd 4sJd3d2c 7d7sKhAh 9hJs9s6s Th9d8c5c 8sAc9c2s 6c3s4h6d 6h4cQdJc"));
  }

  @Test
  public void test_omaha_holdem_5887_5c5h9dAcJh_2s5d3s2h_TdJdTcKh_4hAs6dJc_7d6c3d7s_9c3c9h4c_8sAh7h6s_8cKc4sKs_Qd7cKd2c() {
    assertEquals(
      "Qd7cKd2c 7d6c3d7s TdJdTcKh 8cKc4sKs 8sAh7h6s 4hAs6dJc 2s5d3s2h 9c3c9h4c",
      Solver.process("omaha-holdem 5c5h9dAcJh 2s5d3s2h TdJdTcKh 4hAs6dJc 7d6c3d7s 9c3c9h4c 8sAh7h6s 8cKc4sKs Qd7cKd2c"));
  }

  @Test
  public void test_omaha_holdem_5888_2s9hJsKhQs_Ah6d4hKc_4sKsTd7c() {
    assertEquals(
      "Ah6d4hKc 4sKsTd7c",
      Solver.process("omaha-holdem 2s9hJsKhQs Ah6d4hKc 4sKsTd7c"));
  }

  @Test
  public void test_omaha_holdem_5889_3s4d5cJsTd_3cJd2sKh_3dJh7hQs_AsAd5d6h_9h6sAhQc_7d8c2d6c() {
    assertEquals(
      "9h6sAhQc AsAd5d6h 3cJd2sKh=3dJh7hQs 7d8c2d6c",
      Solver.process("omaha-holdem 3s4d5cJsTd 3cJd2sKh 3dJh7hQs AsAd5d6h 9h6sAhQc 7d8c2d6c"));
  }

  @Test
  public void test_omaha_holdem_5890_2s3c6sQcTd_6hAc2c3h_7s5c8sTc_8h4c2d8d_7c9hAsQd_3d9sKhKs_Jc5dQs5s_KcTs6dKd() {
    assertEquals(
      "8h4c2d8d 7s5c8sTc Jc5dQs5s 7c9hAsQd 3d9sKhKs 6hAc2c3h KcTs6dKd",
      Solver.process("omaha-holdem 2s3c6sQcTd 6hAc2c3h 7s5c8sTc 8h4c2d8d 7c9hAsQd 3d9sKhKs Jc5dQs5s KcTs6dKd"));
  }

  @Test
  public void test_omaha_holdem_5891_3h4d5s9c9s_Td8dQs3c_6s2sQdAd_As3sJh9h_7cKs8h5h() {
    assertEquals(
      "Td8dQs3c 7cKs8h5h 6s2sQdAd As3sJh9h",
      Solver.process("omaha-holdem 3h4d5s9c9s Td8dQs3c 6s2sQdAd As3sJh9h 7cKs8h5h"));
  }

  @Test
  public void test_omaha_holdem_5892_2s3s5s6cJc_Td6hTs7s_Ad9sKc7c_KdAs3d2h_9dJd4dAh_4s9h9c8h() {
    assertEquals(
      "Ad9sKc7c 4s9h9c8h KdAs3d2h 9dJd4dAh Td6hTs7s",
      Solver.process("omaha-holdem 2s3s5s6cJc Td6hTs7s Ad9sKc7c KdAs3d2h 9dJd4dAh 4s9h9c8h"));
  }

  @Test
  public void test_omaha_holdem_5893_2s3c6sAcJc_9cTc3s5h_JsAhKdQh_7h8d2c9s_Kh7dJh4h() {
    assertEquals(
      "7h8d2c9s Kh7dJh4h JsAhKdQh 9cTc3s5h",
      Solver.process("omaha-holdem 2s3c6sAcJc 9cTc3s5h JsAhKdQh 7h8d2c9s Kh7dJh4h"));
  }

  @Test
  public void test_omaha_holdem_5894_5h6h8cJsQh_4h6cTc6s_2dAs7hTd_ThJdKd9h_8d4sQs4d_9d5c2s3h_Ac3s8s7s_Kc5sAd2c() {
    assertEquals(
      "2dAs7hTd 9d5c2s3h Kc5sAd2c Ac3s8s7s 8d4sQs4d 4h6cTc6s ThJdKd9h",
      Solver.process("omaha-holdem 5h6h8cJsQh 4h6cTc6s 2dAs7hTd ThJdKd9h 8d4sQs4d 9d5c2s3h Ac3s8s7s Kc5sAd2c"));
  }

  @Test
  public void test_omaha_holdem_5895_2d7d8sJcQc_3dTc9hKs_Kd7sTh5h_4s6h3s5s_3hAcJd2c_7h7c5cAs_8c6sQd4d_QhTs6c2s_8hAd9c9s_Jh3cJs4h() {
    assertEquals(
      "4s6h3s5s Kd7sTh5h 8hAd9c9s 3hAcJd2c QhTs6c2s 8c6sQd4d 7h7c5cAs Jh3cJs4h 3dTc9hKs",
      Solver.process("omaha-holdem 2d7d8sJcQc 3dTc9hKs Kd7sTh5h 4s6h3s5s 3hAcJd2c 7h7c5cAs 8c6sQd4d QhTs6c2s 8hAd9c9s Jh3cJs4h"));
  }

  @Test
  public void test_omaha_holdem_5896_2c2h3cKcTd_ThKsKd5s_7s7c5hQd_Tc6s8d4h_7h8hAh3h_4cJdTsJs_Jh9d3s9s_Qh3d8s9h_Qs9c2dAc_6c6dQc2s() {
    assertEquals(
      "Qh3d8s9h 7h8hAh3h 7s7c5hQd Jh9d3s9s Tc6s8d4h 4cJdTsJs 6c6dQc2s Qs9c2dAc ThKsKd5s",
      Solver.process("omaha-holdem 2c2h3cKcTd ThKsKd5s 7s7c5hQd Tc6s8d4h 7h8hAh3h 4cJdTsJs Jh9d3s9s Qh3d8s9h Qs9c2dAc 6c6dQc2s"));
  }

  @Test
  public void test_omaha_holdem_5897_2c3d8c9sKc_8dJhAdQh_7c2d4sKh_5hKd9c5c_8sTc6dTs_2sAcAh2h_7hAs9dJd() {
    assertEquals(
      "8dJhAdQh 7hAs9dJd 8sTc6dTs 7c2d4sKh 2sAcAh2h 5hKd9c5c",
      Solver.process("omaha-holdem 2c3d8c9sKc 8dJhAdQh 7c2d4sKh 5hKd9c5c 8sTc6dTs 2sAcAh2h 7hAs9dJd"));
  }

  @Test
  public void test_omaha_holdem_5898_2d7hJsKsTd_4h9d8h3d_5dAs2sQh_4s8d9cAc_9h6sKd3s_Kh6c3c5h_8cTs7cQc() {
    assertEquals(
      "Kh6c3c5h 9h6sKd3s 8cTs7cQc 4h9d8h3d=4s8d9cAc 5dAs2sQh",
      Solver.process("omaha-holdem 2d7hJsKsTd 4h9d8h3d 5dAs2sQh 4s8d9cAc 9h6sKd3s Kh6c3c5h 8cTs7cQc"));
  }

  @Test
  public void test_omaha_holdem_5899_4s5h7d8dKh_4h4c8s6c_Ad2dQs3d_KsTd3c7s_Jd5sTcKd_Jc8c8h9h_6h7h2c9d_Jh9s5d2s_3hTh6dAc_Ts3s6s2h() {
    assertEquals(
      "Ad2dQs3d Jh9s5d2s Jd5sTcKd KsTd3c7s Jc8c8h9h 3hTh6dAc=Ts3s6s2h 4h4c8s6c 6h7h2c9d",
      Solver.process("omaha-holdem 4s5h7d8dKh 4h4c8s6c Ad2dQs3d KsTd3c7s Jd5sTcKd Jc8c8h9h 6h7h2c9d Jh9s5d2s 3hTh6dAc Ts3s6s2h"));
  }

  @Test
  public void test_omaha_holdem_5900_5d7dJsKdQh_5hAcKcJd_9cAh6s5s_Th2hJh2s_8d5c2dAd() {
    assertEquals(
      "9cAh6s5s Th2hJh2s 5hAcKcJd 8d5c2dAd",
      Solver.process("omaha-holdem 5d7dJsKdQh 5hAcKcJd 9cAh6s5s Th2hJh2s 8d5c2dAd"));
  }

  @Test
  public void test_omaha_holdem_5901_3c3h9dAhQh_9h2sAc2h_5s5h6sJs_7s4d7d5d() {
    assertEquals(
      "5s5h6sJs 7s4d7d5d 9h2sAc2h",
      Solver.process("omaha-holdem 3c3h9dAhQh 9h2sAc2h 5s5h6sJs 7s4d7d5d"));
  }

  @Test
  public void test_omaha_holdem_5902_6c7d9cQcTc_6d2hQs8c_2d9s5cKh_TsKcAd3c_9h8d5h6h_4dJs7hAh_8h3s3dAc_9dJdQhTd() {
    assertEquals(
      "8h3s3dAc 4dJs7hAh 2d9s5cKh 9dJdQhTd 6d2hQs8c=9h8d5h6h TsKcAd3c",
      Solver.process("omaha-holdem 6c7d9cQcTc 6d2hQs8c 2d9s5cKh TsKcAd3c 9h8d5h6h 4dJs7hAh 8h3s3dAc 9dJdQhTd"));
  }

  @Test
  public void test_omaha_holdem_5903_6c8h9c9sJh_8s5hKsAd_Qs5d6d7c_As2h3cJc_7d4s6s2s_4hKcQd4d_7h8cQh6h_8d4cTsJs() {
    assertEquals(
      "4hKcQd4d 7d4s6s2s 7h8cQh6h 8s5hKsAd 8d4cTsJs As2h3cJc Qs5d6d7c",
      Solver.process("omaha-holdem 6c8h9c9sJh 8s5hKsAd Qs5d6d7c As2h3cJc 7d4s6s2s 4hKcQd4d 7h8cQh6h 8d4cTsJs"));
  }

  @Test
  public void test_omaha_holdem_5904_6d9dAsJsTs_3h9sQs6c_5d8d4sQc_3c5s3d2h_4hTh7d5h_3sKs9cAc_Tc2cAd7s_9hQdKc8h_Jc6h2dTd() {
    assertEquals(
      "3c5s3d2h 4hTh7d5h Jc6h2dTd Tc2cAd7s 5d8d4sQc 9hQdKc8h 3h9sQs6c 3sKs9cAc",
      Solver.process("omaha-holdem 6d9dAsJsTs 3h9sQs6c 5d8d4sQc 3c5s3d2h 4hTh7d5h 3sKs9cAc Tc2cAd7s 9hQdKc8h Jc6h2dTd"));
  }

  @Test
  public void test_omaha_holdem_5905_3c3s7s8sQc_Jh8c8hTd_5d6dQhTc_Jc6hKsTh() {
    assertEquals(
      "Jc6hKsTh 5d6dQhTc Jh8c8hTd",
      Solver.process("omaha-holdem 3c3s7s8sQc Jh8c8hTd 5d6dQhTc Jc6hKsTh"));
  }

  @Test
  public void test_omaha_holdem_5906_5c9dAcJhJs_9h8s2hTd_8dQhKhAs_6s3hJc3s_7c5dTsQc_Qd5s8h6d() {
    assertEquals(
      "7c5dTsQc=Qd5s8h6d 9h8s2hTd 8dQhKhAs 6s3hJc3s",
      Solver.process("omaha-holdem 5c9dAcJhJs 9h8s2hTd 8dQhKhAs 6s3hJc3s 7c5dTsQc Qd5s8h6d"));
  }

  @Test
  public void test_omaha_holdem_5907_2d7c8hQcQh_Jh5sKs7s_8s6d8cQd_9h4s6s5h_8dJc5d9c_Ts6cTcAs_7dQs2sAd_Th9dJdAh() {
    assertEquals(
      "9h4s6s5h Th9dJdAh Jh5sKs7s 8dJc5d9c Ts6cTcAs 7dQs2sAd 8s6d8cQd",
      Solver.process("omaha-holdem 2d7c8hQcQh Jh5sKs7s 8s6d8cQd 9h4s6s5h 8dJc5d9c Ts6cTcAs 7dQs2sAd Th9dJdAh"));
  }

  @Test
  public void test_omaha_holdem_5908_4c6c8hJhTs_JsTcJc3c_5cThAh9h() {
    assertEquals(
      "5cThAh9h JsTcJc3c",
      Solver.process("omaha-holdem 4c6c8hJhTs JsTcJc3c 5cThAh9h"));
  }

  @Test
  public void test_omaha_holdem_5909_2d4s7cAdQd_4cTd8hTs_6d5cJc6c_8d8cQc4d() {
    assertEquals(
      "6d5cJc6c 4cTd8hTs 8d8cQc4d",
      Solver.process("omaha-holdem 2d4s7cAdQd 4cTd8hTs 6d5cJc6c 8d8cQc4d"));
  }

  @Test
  public void test_omaha_holdem_5910_2s3s7d8cTc_KcAd6s2h_9sAsQd8s() {
    assertEquals(
      "KcAd6s2h 9sAsQd8s",
      Solver.process("omaha-holdem 2s3s7d8cTc KcAd6s2h 9sAsQd8s"));
  }

  @Test
  public void test_omaha_holdem_5911_2d6h7hKhTc_5h7cKdKs_2sAhJcQc_QdAc8hJs_5d2c4s8d_9d2hAd5s() {
    assertEquals(
      "QdAc8hJs 5d2c4s8d 2sAhJcQc=9d2hAd5s 5h7cKdKs",
      Solver.process("omaha-holdem 2d6h7hKhTc 5h7cKdKs 2sAhJcQc QdAc8hJs 5d2c4s8d 9d2hAd5s"));
  }

  @Test
  public void test_omaha_holdem_5912_3s4h4sAcTh_Jc4cQs8s_6c4d3d2h_7d8d8cTc_5d2cJdKc_2d7sJh2s_KhTd9c7c() {
    assertEquals(
      "2d7sJh2s 7d8d8cTc KhTd9c7c Jc4cQs8s 5d2cJdKc 6c4d3d2h",
      Solver.process("omaha-holdem 3s4h4sAcTh Jc4cQs8s 6c4d3d2h 7d8d8cTc 5d2cJdKc 2d7sJh2s KhTd9c7c"));
  }

  @Test
  public void test_omaha_holdem_5913_5s9cAcJsQh_6d2c3h7s_Ts8d8h5c_5dKh6cTh() {
    assertEquals(
      "6d2c3h7s Ts8d8h5c 5dKh6cTh",
      Solver.process("omaha-holdem 5s9cAcJsQh 6d2c3h7s Ts8d8h5c 5dKh6cTh"));
  }

  @Test
  public void test_omaha_holdem_5914_3h8d8s9cKh_3sAh2s5d_7d9dTc6h_2d7s4dQs() {
    assertEquals(
      "2d7s4dQs 3sAh2s5d 7d9dTc6h",
      Solver.process("omaha-holdem 3h8d8s9cKh 3sAh2s5d 7d9dTc6h 2d7s4dQs"));
  }

  @Test
  public void test_omaha_holdem_5915_2d4d8d9dKd_5s3cTdKh_8h5c6sQs_5d2cAdQc_9h2sTc7c_KsJhTs3h_7h8c3sAc_4s6h4c6d_As9s6cAh() {
    assertEquals(
      "8h5c6sQs 7h8c3sAc 5s3cTdKh KsJhTs3h As9s6cAh 9h2sTc7c 4s6h4c6d 5d2cAdQc",
      Solver.process("omaha-holdem 2d4d8d9dKd 5s3cTdKh 8h5c6sQs 5d2cAdQc 9h2sTc7c KsJhTs3h 7h8c3sAc 4s6h4c6d As9s6cAh"));
  }

  @Test
  public void test_omaha_holdem_5916_2h3h6s8cJc_4hTcAcAh_5c3d5dJs_7d9hKsTs() {
    assertEquals(
      "7d9hKsTs 4hTcAcAh 5c3d5dJs",
      Solver.process("omaha-holdem 2h3h6s8cJc 4hTcAcAh 5c3d5dJs 7d9hKsTs"));
  }

  @Test
  public void test_omaha_holdem_5917_7s8d8h8sAh_Td7cAc3d_4sAs3h3s_5c5dQdTh_5h9sQcTc_7hTs9h2h_9c2cKd6h_6d5sJdKh() {
    assertEquals(
      "7hTs9h2h 5h9sQcTc 9c2cKd6h 6d5sJdKh Td7cAc3d 4sAs3h3s 5c5dQdTh",
      Solver.process("omaha-holdem 7s8d8h8sAh Td7cAc3d 4sAs3h3s 5c5dQdTh 5h9sQcTc 7hTs9h2h 9c2cKd6h 6d5sJdKh"));
  }

  @Test
  public void test_omaha_holdem_5918_5s7s9c9d9s_8sKsAhKc_8d3h4sKh_Ad7c6s5c_7dTcAc4d_4cAsTsQd_6h3c9h6d_5dJdJcTh_2d2cKd3d() {
    assertEquals(
      "8d3h4sKh Ad7c6s5c 7dTcAc4d 4cAsTsQd 2d2cKd3d 5dJdJcTh 8sKsAhKc 6h3c9h6d",
      Solver.process("omaha-holdem 5s7s9c9d9s 8sKsAhKc 8d3h4sKh Ad7c6s5c 7dTcAc4d 4cAsTsQd 6h3c9h6d 5dJdJcTh 2d2cKd3d"));
  }

  @Test
  public void test_omaha_holdem_5919_2s7c9dKdKs_Qs2h6hAd_Ts6cQcQd_2c8s4c5c_Th9c9s8c_4sJh8h3h_7d3d3s9h_4hKcAhJc_Jd7hJs3c_5h7sTcAc() {
    assertEquals(
      "4sJh8h3h 2c8s4c5c Qs2h6hAd 5h7sTcAc 7d3d3s9h Jd7hJs3c Ts6cQcQd 4hKcAhJc Th9c9s8c",
      Solver.process("omaha-holdem 2s7c9dKdKs Qs2h6hAd Ts6cQcQd 2c8s4c5c Th9c9s8c 4sJh8h3h 7d3d3s9h 4hKcAhJc Jd7hJs3c 5h7sTcAc"));
  }

  @Test
  public void test_omaha_holdem_5920_5s6h9dAcQs_Qh9sKhTh_Jc3s8cKs_Tc3h8sQc_Kc5dAs9c() {
    assertEquals(
      "Jc3s8cKs Tc3h8sQc Qh9sKhTh Kc5dAs9c",
      Solver.process("omaha-holdem 5s6h9dAcQs Qh9sKhTh Jc3s8cKs Tc3h8sQc Kc5dAs9c"));
  }

  @Test
  public void test_omaha_holdem_5921_4s6hKcKdQc_2s3d3h8s_5sJd4hTc() {
    assertEquals(
      "2s3d3h8s 5sJd4hTc",
      Solver.process("omaha-holdem 4s6hKcKdQc 2s3d3h8s 5sJd4hTc"));
  }

  @Test
  public void test_omaha_holdem_5922_2s7s8c9cTs_Ad7dQh5d_Ks9hAhTd_2cAs5h8d_6sKd2d4d_TcAc4sQc_3d3cJhQd() {
    assertEquals(
      "6sKd2d4d Ad7dQh5d TcAc4sQc 2cAs5h8d Ks9hAhTd 3d3cJhQd",
      Solver.process("omaha-holdem 2s7s8c9cTs Ad7dQh5d Ks9hAhTd 2cAs5h8d 6sKd2d4d TcAc4sQc 3d3cJhQd"));
  }

  @Test
  public void test_omaha_holdem_5923_9c9d9sKdTd_4hAd7s4s_8h3cAhQs_8s7hAcQh_9h2d6h2c_4dAs5hJd_Js5s8dKs_3dTs7d2s_5cJhQcKh() {
    assertEquals(
      "Js5s8dKs 8h3cAhQs=8s7hAcQh 5cJhQcKh 3dTs7d2s 4dAs5hJd 4hAd7s4s 9h2d6h2c",
      Solver.process("omaha-holdem 9c9d9sKdTd 4hAd7s4s 8h3cAhQs 8s7hAcQh 9h2d6h2c 4dAs5hJd Js5s8dKs 3dTs7d2s 5cJhQcKh"));
  }

  @Test
  public void test_omaha_holdem_5924_5h7sAhJcKs_ThTcJh6h_5c6sTd7h_7cKdQsAs_4s4d3dKc_7d2h2d3c_2c6c9s9h_3hAd4c8c_Qd9dQh8h_8d3sJd6d() {
    assertEquals(
      "7d2h2d3c 2c6c9s9h 8d3sJd6d ThTcJh6h Qd9dQh8h 4s4d3dKc 3hAd4c8c 5c6sTd7h 7cKdQsAs",
      Solver.process("omaha-holdem 5h7sAhJcKs ThTcJh6h 5c6sTd7h 7cKdQsAs 4s4d3dKc 7d2h2d3c 2c6c9s9h 3hAd4c8c Qd9dQh8h 8d3sJd6d"));
  }

  @Test
  public void test_omaha_holdem_5925_5s8s9cJdJh_4cQc5dTd_2h8cKd9s_4s8d6s2s_4d7sQd9d_5c7h2d2c() {
    assertEquals(
      "5c7h2d2c 4s8d6s2s 4d7sQd9d 2h8cKd9s 4cQc5dTd",
      Solver.process("omaha-holdem 5s8s9cJdJh 4cQc5dTd 2h8cKd9s 4s8d6s2s 4d7sQd9d 5c7h2d2c"));
  }

  @Test
  public void test_omaha_holdem_5926_7h8hAdKcKs_Th5c8sQh_4h3s9s6h_KdAc7s5h_4s5s7d9h_As6dTs8c() {
    assertEquals(
      "4h3s9s6h 4s5s7d9h Th5c8sQh As6dTs8c KdAc7s5h",
      Solver.process("omaha-holdem 7h8hAdKcKs Th5c8sQh 4h3s9s6h KdAc7s5h 4s5s7d9h As6dTs8c"));
  }

  @Test
  public void test_omaha_holdem_5927_3d4h8hAcTh_2cKs8d4c_6c4d4s2s_2dJd9d5s_5hAdAh3s_9h7cJs7d() {
    assertEquals(
      "9h7cJs7d 2cKs8d4c 6c4d4s2s 2dJd9d5s 5hAdAh3s",
      Solver.process("omaha-holdem 3d4h8hAcTh 2cKs8d4c 6c4d4s2s 2dJd9d5s 5hAdAh3s 9h7cJs7d"));
  }

  @Test
  public void test_omaha_holdem_5928_3c5d6d9cQd_3hAsTs7d_7h5hJd2d_2c6c7sTh_TdKs5cKc() {
    assertEquals(
      "3hAsTs7d 2c6c7sTh TdKs5cKc 7h5hJd2d",
      Solver.process("omaha-holdem 3c5d6d9cQd 3hAsTs7d 7h5hJd2d 2c6c7sTh TdKs5cKc"));
  }

  @Test
  public void test_omaha_holdem_5929_3c4d5s6d8s_3d8hQsKd_JdJc4c9s_5h2sTc2h_AhAd9d4s_3s3h7dTh_6s7h7s2d_AcJhTs7c_Qd6hQcTd_Ks5c9cQh() {
    assertEquals(
      "AcJhTs7c Ks5c9cQh JdJc4c9s Qd6hQcTd AhAd9d4s 3d8hQsKd 5h2sTc2h 3s3h7dTh 6s7h7s2d",
      Solver.process("omaha-holdem 3c4d5s6d8s 3d8hQsKd JdJc4c9s 5h2sTc2h AhAd9d4s 3s3h7dTh 6s7h7s2d AcJhTs7c Qd6hQcTd Ks5c9cQh"));
  }

  @Test
  public void test_omaha_holdem_5930_2c2dJdKhTh_4c4h5s6c_9d8hAs9h_Tc5c7sQd() {
    assertEquals(
      "4c4h5s6c 9d8hAs9h Tc5c7sQd",
      Solver.process("omaha-holdem 2c2dJdKhTh 4c4h5s6c 9d8hAs9h Tc5c7sQd"));
  }

  @Test
  public void test_omaha_holdem_5931_2d3d5cAhTs_6h4c4h8h_9sKdAs2c() {
    assertEquals(
      "9sKdAs2c 6h4c4h8h",
      Solver.process("omaha-holdem 2d3d5cAhTs 6h4c4h8h 9sKdAs2c"));
  }

  @Test
  public void test_omaha_holdem_5932_6c8h9d9sQs_Th9cTc4s_Jd2s2c4h_3d8d3hKc_Ad2d2h7d_3sKh5hAh_TdJsQh6h_5c9hTs6d() {
    assertEquals(
      "3sKh5hAh Ad2d2h7d=Jd2s2c4h 3d8d3hKc Th9cTc4s TdJsQh6h 5c9hTs6d",
      Solver.process("omaha-holdem 6c8h9d9sQs Th9cTc4s Jd2s2c4h 3d8d3hKc Ad2d2h7d 3sKh5hAh TdJsQh6h 5c9hTs6d"));
  }

  @Test
  public void test_omaha_holdem_5933_2s9sJdKcQh_3d5d6s8h_2h5c4d7c_6h8d7h6c_JcAc4sQs() {
    assertEquals(
      "3d5d6s8h 2h5c4d7c 6h8d7h6c JcAc4sQs",
      Solver.process("omaha-holdem 2s9sJdKcQh 3d5d6s8h 2h5c4d7c 6h8d7h6c JcAc4sQs"));
  }

  @Test
  public void test_omaha_holdem_5934_6h8c9dAdTc_Jc2dKsKd_2s6s4d2c_As9cJh8s_QsAh5s3s() {
    assertEquals(
      "2s6s4d2c Jc2dKsKd QsAh5s3s As9cJh8s",
      Solver.process("omaha-holdem 6h8c9dAdTc Jc2dKsKd 2s6s4d2c As9cJh8s QsAh5s3s"));
  }

  @Test
  public void test_omaha_holdem_5935_3c4c8dAsQs_QdAh7dJc_Kc9h6d2h_JsJdQh6s_5sTc5hTd_6c7s7h7c_6h5dTs2s_KsJhTh3s_9sAdAc8s() {
    assertEquals(
      "Kc9h6d2h KsJhTh3s 6c7s7h7c 5sTc5hTd JsJdQh6s QdAh7dJc 9sAdAc8s 6h5dTs2s",
      Solver.process("omaha-holdem 3c4c8dAsQs QdAh7dJc Kc9h6d2h JsJdQh6s 5sTc5hTd 6c7s7h7c 6h5dTs2s KsJhTh3s 9sAdAc8s"));
  }

  @Test
  public void test_omaha_holdem_5936_2d2h4s9hQd_Ad3d8sJs_Ah8dQs9s_Kc8h5s9d_6s9c5d6h_4cAsTd7d_7h3hJd4d() {
    assertEquals(
      "Ad3d8sJs 7h3hJd4d 4cAsTd7d 6s9c5d6h Kc8h5s9d Ah8dQs9s",
      Solver.process("omaha-holdem 2d2h4s9hQd Ad3d8sJs Ah8dQs9s Kc8h5s9d 6s9c5d6h 4cAsTd7d 7h3hJd4d"));
  }

  @Test
  public void test_omaha_holdem_5937_2d9hAcAdJh_JdTcKdKc_9dAsJs3h_8s4d2h5h_7h5dTd6d_6s2c9c4h_Qc6c7s8c_4c3cAhTh_Kh9s6h7d() {
    assertEquals(
      "7h5dTd6d Qc6c7s8c 8s4d2h5h 6s2c9c4h Kh9s6h7d JdTcKdKc 4c3cAhTh 9dAsJs3h",
      Solver.process("omaha-holdem 2d9hAcAdJh JdTcKdKc 9dAsJs3h 8s4d2h5h 7h5dTd6d 6s2c9c4h Qc6c7s8c 4c3cAhTh Kh9s6h7d"));
  }

  @Test
  public void test_omaha_holdem_5938_6cAdJcJhJs_2h6d7hKs_8s4dAc4s_9h4cQcQs_7cKc9c8h_4h9s7s2c_KhQhJd5h() {
    assertEquals(
      "4h9s7s2c 2h6d7hKs 7cKc9c8h 8s4dAc4s 9h4cQcQs KhQhJd5h",
      Solver.process("omaha-holdem 6cAdJcJhJs 2h6d7hKs 8s4dAc4s 9h4cQcQs 7cKc9c8h 4h9s7s2c KhQhJd5h"));
  }

  @Test
  public void test_omaha_holdem_5939_2h2s6h7c9d_4d9cJcQs_Th9h8h3d_QhTs8d4c_2d3sTc5h_5s6d3c9s() {
    assertEquals(
      "4d9cJcQs 5s6d3c9s 2d3sTc5h QhTs8d4c=Th9h8h3d",
      Solver.process("omaha-holdem 2h2s6h7c9d 4d9cJcQs Th9h8h3d QhTs8d4c 2d3sTc5h 5s6d3c9s"));
  }

  @Test
  public void test_omaha_holdem_5940_4h7c8d8hAd_4cKc3cQh_3h5d6hAs_Ks6c3s7d() {
    assertEquals(
      "4cKc3cQh Ks6c3s7d 3h5d6hAs",
      Solver.process("omaha-holdem 4h7c8d8hAd 4cKc3cQh 3h5d6hAs Ks6c3s7d"));
  }

  @Test
  public void test_omaha_holdem_5941_7d7sAhAsJs_TcJc9c9h_2h6d3dAd_TdTsTh8h_5hJd7c7h_5d9dKdQc() {
    assertEquals(
      "5d9dKdQc TdTsTh8h TcJc9c9h 2h6d3dAd 5hJd7c7h",
      Solver.process("omaha-holdem 7d7sAhAsJs TcJc9c9h 2h6d3dAd TdTsTh8h 5hJd7c7h 5d9dKdQc"));
  }

  @Test
  public void test_omaha_holdem_5942_2h7sJdQdQs_6c6h3s2c_ThJc4sKd_5c8cTsTd_3h3cQhKc_8sKh9h5h_8d6d7cAs_9dAd2dQc() {
    assertEquals(
      "8sKh9h5h 6c6h3s2c 8d6d7cAs 5c8cTsTd ThJc4sKd 3h3cQhKc 9dAd2dQc",
      Solver.process("omaha-holdem 2h7sJdQdQs 6c6h3s2c ThJc4sKd 5c8cTsTd 3h3cQhKc 8sKh9h5h 8d6d7cAs 9dAd2dQc"));
  }

  @Test
  public void test_omaha_holdem_5943_5c6d8d9hTd_KdJd5d2s_Qc7hKsTh_Qs7sQh5s_3dKh6sAh_8hJc3s7c_JsTc5hKc_9d2h4s8c_Jh2d9sAs_9cQd4c3c() {
    assertEquals(
      "3dKh6sAh 9cQd4c3c Jh2d9sAs 9d2h4s8c JsTc5hKc Qs7sQh5s Qc7hKsTh 8hJc3s7c KdJd5d2s",
      Solver.process("omaha-holdem 5c6d8d9hTd KdJd5d2s Qc7hKsTh Qs7sQh5s 3dKh6sAh 8hJc3s7c JsTc5hKc 9d2h4s8c Jh2d9sAs 9cQd4c3c"));
  }

  @Test
  public void test_omaha_holdem_5944_8d9hAcJdJs_As9d8h6s_6cKs6h9s_7dJhQdAd_TdKhQh5c() {
    assertEquals(
      "6cKs6h9s As9d8h6s TdKhQh5c 7dJhQdAd",
      Solver.process("omaha-holdem 8d9hAcJdJs As9d8h6s 6cKs6h9s 7dJhQdAd TdKhQh5c"));
  }

  @Test
  public void test_omaha_holdem_5945_6c7dAdJdKh_9s2h2sQh_9hKcTsAs_Jc8h3c4s_TcQd3d6d_7h2dKs2c_6s4hTh4c_QsQcJh5c_5s4dTd9c_Ah7c7s6h() {
    assertEquals(
      "9s2h2sQh 6s4hTh4c Jc8h3c4s QsQcJh5c 7h2dKs2c 9hKcTsAs Ah7c7s6h 5s4dTd9c TcQd3d6d",
      Solver.process("omaha-holdem 6c7dAdJdKh 9s2h2sQh 9hKcTsAs Jc8h3c4s TcQd3d6d 7h2dKs2c 6s4hTh4c QsQcJh5c 5s4dTd9c Ah7c7s6h"));
  }

  @Test
  public void test_omaha_holdem_5946_3s5d6c8hKh_Js9s3dJh_Qs2h3c7c_Th9d5c4s() {
    assertEquals(
      "Qs2h3c7c Th9d5c4s Js9s3dJh",
      Solver.process("omaha-holdem 3s5d6c8hKh Js9s3dJh Qs2h3c7c Th9d5c4s"));
  }

  @Test
  public void test_omaha_holdem_5947_2h9d9hKdQs_8cTdQd4h_Js4c8hKh_Jc7h7s5c_2d2c5s8s_9c8dJh5d() {
    assertEquals(
      "Jc7h7s5c 8cTdQd4h Js4c8hKh 9c8dJh5d 2d2c5s8s",
      Solver.process("omaha-holdem 2h9d9hKdQs 8cTdQd4h Js4c8hKh Jc7h7s5c 2d2c5s8s 9c8dJh5d"));
  }

  @Test
  public void test_omaha_holdem_5948_2d7h8hKhTc_4c8s7c3s_JsQd2c5s_2hAc6s7d_9s4sQc2s_KcQhKs4h_6h3c4dJc_9h9cJh8c_Ad3hJdTh() {
    assertEquals(
      "6h3c4dJc 9s4sQc2s=JsQd2c5s 2hAc6s7d 4c8s7c3s Ad3hJdTh 9h9cJh8c KcQhKs4h",
      Solver.process("omaha-holdem 2d7h8hKhTc 4c8s7c3s JsQd2c5s 2hAc6s7d 9s4sQc2s KcQhKs4h 6h3c4dJc 9h9cJh8c Ad3hJdTh"));
  }

  @Test
  public void test_omaha_holdem_5949_3d5d7c9cQh_2sKh5h4s_Jh9dAh3h_Js2cAd6c_6sKs3c2d() {
    assertEquals(
      "Js2cAd6c 6sKs3c2d 2sKh5h4s Jh9dAh3h",
      Solver.process("omaha-holdem 3d5d7c9cQh 2sKh5h4s Jh9dAh3h Js2cAd6c 6sKs3c2d"));
  }

  @Test
  public void test_omaha_holdem_5950_3h5h8s9hKs_7cJsJd4s_2cTh3dAh_5sKd5c2d_8c4h9s8d_As5dAd2h_2sJhKh9c_6c7h4c6s_Qd3c8h7s() {
    assertEquals(
      "7cJsJd4s As5dAd2h Qd3c8h7s 5sKd5c2d 8c4h9s8d 6c7h4c6s 2sJhKh9c 2cTh3dAh",
      Solver.process("omaha-holdem 3h5h8s9hKs 7cJsJd4s 2cTh3dAh 5sKd5c2d 8c4h9s8d As5dAd2h 2sJhKh9c 6c7h4c6s Qd3c8h7s"));
  }

  @Test
  public void test_omaha_holdem_5951_2c4sJhQdTd_JsQc5cKd_Ad3h3s4h_Ac6d7s5h() {
    assertEquals(
      "Ac6d7s5h Ad3h3s4h JsQc5cKd",
      Solver.process("omaha-holdem 2c4sJhQdTd JsQc5cKd Ad3h3s4h Ac6d7s5h"));
  }

  @Test
  public void test_omaha_holdem_5952_5s6s8sJdQh_Kc5cAh8c_6h9h4d4s_JsQdJhTd_6dKdTh4h_Kh7sQsQc_Jc3h9d2s_2c4c6c5d_2hTc7h8h_8dAc3s7d() {
    assertEquals(
      "6h9h4d4s 6dKdTh4h 2hTc7h8h 8dAc3s7d Jc3h9d2s 2c4c6c5d Kc5cAh8c JsQdJhTd Kh7sQsQc",
      Solver.process("omaha-holdem 5s6s8sJdQh Kc5cAh8c 6h9h4d4s JsQdJhTd 6dKdTh4h Kh7sQsQc Jc3h9d2s 2c4c6c5d 2hTc7h8h 8dAc3s7d"));
  }

  @Test
  public void test_omaha_holdem_5953_3s4d5h6c7s_8dTs4cJh_9dKhJs6h_QhAdAhQd_6d5s6s3c() {
    assertEquals(
      "9dKhJs6h QhAdAhQd 6d5s6s3c 8dTs4cJh",
      Solver.process("omaha-holdem 3s4d5h6c7s 8dTs4cJh 9dKhJs6h QhAdAhQd 6d5s6s3c"));
  }

  @Test
  public void test_omaha_holdem_5954_5d5h7s9c9d_Qs8d7c3d_TcJd6s6d_5cTsTh8s_JcQh5sKs_7h7d2d2s_Kh4c6c2h() {
    assertEquals(
      "Kh4c6c2h TcJd6s6d Qs8d7c3d 5cTsTh8s JcQh5sKs 7h7d2d2s",
      Solver.process("omaha-holdem 5d5h7s9c9d Qs8d7c3d TcJd6s6d 5cTsTh8s JcQh5sKs 7h7d2d2s Kh4c6c2h"));
  }

  @Test
  public void test_omaha_holdem_5955_6d7c7s9hTc_Kc3hQhJh_9d9s8cKh_Qs5cJc2h_3cTs8dAd() {
    assertEquals(
      "Qs5cJc2h Kc3hQhJh 3cTs8dAd 9d9s8cKh",
      Solver.process("omaha-holdem 6d7c7s9hTc Kc3hQhJh 9d9s8cKh Qs5cJc2h 3cTs8dAd"));
  }

  @Test
  public void test_omaha_holdem_5956_5d5h7c9cJd_QsAs3dJh_5c9d4hQc_Td7sAdAc_8hTsKsQd_8s2d6h3s_Kc6d9s3h_Th6c2c5s_Js4d7hTc_3c6s4c7d() {
    assertEquals(
      "3c6s4c7d Kc6d9s3h QsAs3dJh Js4d7hTc Td7sAdAc Th6c2c5s 8s2d6h3s 8hTsKsQd 5c9d4hQc",
      Solver.process("omaha-holdem 5d5h7c9cJd QsAs3dJh 5c9d4hQc Td7sAdAc 8hTsKsQd 8s2d6h3s Kc6d9s3h Th6c2c5s Js4d7hTc 3c6s4c7d"));
  }

  @Test
  public void test_omaha_holdem_5957_6c9dKhQcTs_2hAh4dAc_5cKcQsKs_4h7hTc5d_6dJc7s5h_Qd4c7dKd_8d2sTh9s() {
    assertEquals(
      "6dJc7s5h 4h7hTc5d 2hAh4dAc 8d2sTh9s Qd4c7dKd 5cKcQsKs",
      Solver.process("omaha-holdem 6c9dKhQcTs 2hAh4dAc 5cKcQsKs 4h7hTc5d 6dJc7s5h Qd4c7dKd 8d2sTh9s"));
  }

  @Test
  public void test_omaha_holdem_5958_5d8sJhKdTs_JsKcJd4d_7s6c5c5h_4c5s7dAd_Qs8c9hJc_2d3cQh4h() {
    assertEquals(
      "2d3cQh4h 4c5s7dAd 7s6c5c5h JsKcJd4d Qs8c9hJc",
      Solver.process("omaha-holdem 5d8sJhKdTs JsKcJd4d 7s6c5c5h 4c5s7dAd Qs8c9hJc 2d3cQh4h"));
  }

  @Test
  public void test_omaha_holdem_5959_3h6s7h8s9c_3d8c7s2h_Jh4c9sQc_7d2sAd2d_Ac4dThQs_4hAhJs9d_7c3s5s8d_Kc6cQh6d_Td5h2c6h() {
    assertEquals(
      "Ac4dThQs 7d2sAd2d Jh4c9sQc 4hAhJs9d 3d8c7s2h Kc6cQh6d 7c3s5s8d Td5h2c6h",
      Solver.process("omaha-holdem 3h6s7h8s9c 3d8c7s2h Jh4c9sQc 7d2sAd2d Ac4dThQs 4hAhJs9d 7c3s5s8d Kc6cQh6d Td5h2c6h"));
  }

  @Test
  public void test_omaha_holdem_5960_4c5d8dJhQd_AsKcAcKs_9h8cTh8h_AhAd6d2c_QsQh3s4d_Jc9sTd5c_8sTs5h4s_3h2d4h5s() {
    assertEquals(
      "AsKcAcKs 3h2d4h5s 8sTs5h4s QsQh3s4d 9h8cTh8h=Jc9sTd5c AhAd6d2c",
      Solver.process("omaha-holdem 4c5d8dJhQd AsKcAcKs 9h8cTh8h AhAd6d2c QsQh3s4d Jc9sTd5c 8sTs5h4s 3h2d4h5s"));
  }

  @Test
  public void test_omaha_holdem_5961_7hKcKhQdQh_4d5d7cJh_6d9d3c8s() {
    assertEquals(
      "6d9d3c8s 4d5d7cJh",
      Solver.process("omaha-holdem 7hKcKhQdQh 4d5d7cJh 6d9d3c8s"));
  }

  @Test
  public void test_omaha_holdem_5962_5c6s7cAcJs_Qs4dKh3c_5h2h7d3d_Kc2sTdAh_6cThQh7s_8s2d8d8h_6h5s5d2c_Ts4cKdAs_Qd3h6dQc() {
    assertEquals(
      "8s2d8d8h Qd3h6dQc Kc2sTdAh=Ts4cKdAs 5h2h7d3d 6cThQh7s 6h5s5d2c Qs4dKh3c",
      Solver.process("omaha-holdem 5c6s7cAcJs Qs4dKh3c 5h2h7d3d Kc2sTdAh 6cThQh7s 8s2d8d8h 6h5s5d2c Ts4cKdAs Qd3h6dQc"));
  }

  @Test
  public void test_omaha_holdem_5963_7h9d9hJdJs_9sJc4d7s_5s5cAh8h_8d2c8s6c_3h6s2d4h_QhKdAs9c_4sQs8c6h_6dKsJh4c() {
    assertEquals(
      "3h6s2d4h 4sQs8c6h 5s5cAh8h 8d2c8s6c QhKdAs9c 6dKsJh4c 9sJc4d7s",
      Solver.process("omaha-holdem 7h9d9hJdJs 9sJc4d7s 5s5cAh8h 8d2c8s6c 3h6s2d4h QhKdAs9c 4sQs8c6h 6dKsJh4c"));
  }

  @Test
  public void test_omaha_holdem_5964_2h3d4d6hTs_7d4cTc8d_8c2s8hQh_8s4hTd9d_Ah7s6cKc_2d6dAsQs_9hAdKsKh_2cJh5sJc_9cQcJdAc_4s3s3cQd() {
    assertEquals(
      "9cQcJdAc Ah7s6cKc 8c2s8hQh 9hAdKsKh 2d6dAsQs 7d4cTc8d=8s4hTd9d 4s3s3cQd 2cJh5sJc",
      Solver.process("omaha-holdem 2h3d4d6hTs 7d4cTc8d 8c2s8hQh 8s4hTd9d Ah7s6cKc 2d6dAsQs 9hAdKsKh 2cJh5sJc 9cQcJdAc 4s3s3cQd"));
  }

  @Test
  public void test_omaha_holdem_5965_4c5h8c9cKc_6c8h5c6h_Jh3c2dAc_3sQhQcTh() {
    assertEquals(
      "3sQhQcTh 6c8h5c6h Jh3c2dAc",
      Solver.process("omaha-holdem 4c5h8c9cKc 6c8h5c6h Jh3c2dAc 3sQhQcTh"));
  }

  @Test
  public void test_omaha_holdem_5966_2d3d5cKhTd_9d7s4d3c_8c2hKd7d_2cJdTc6d_ThAh4h5d_6sKs9cJc_5h6h5s9h() {
    assertEquals(
      "6sKs9cJc 5h6h5s9h ThAh4h5d 9d7s4d3c 2cJdTc6d 8c2hKd7d",
      Solver.process("omaha-holdem 2d3d5cKhTd 9d7s4d3c 8c2hKd7d 2cJdTc6d ThAh4h5d 6sKs9cJc 5h6h5s9h"));
  }

  @Test
  public void test_omaha_holdem_5967_3h6d9sAhTc_Kh2c8h7d_Qh7hJhTd_Jd4hQd8d() {
    assertEquals(
      "Jd4hQd8d Qh7hJhTd Kh2c8h7d",
      Solver.process("omaha-holdem 3h6d9sAhTc Kh2c8h7d Qh7hJhTd Jd4hQd8d"));
  }

  @Test
  public void test_omaha_holdem_5968_3h6d7hAsKc_9d2h8s5d_TdKh4dQs_2c6cAd4s_4c8c9c3s_8hQdTh7c_2s4hTs6h_7s9h5s7d_JsAh2d3c_8dKs9s6s() {
    assertEquals(
      "9d2h8s5d 4c8c9c3s 2s4hTs6h 8hQdTh7c TdKh4dQs 8dKs9s6s JsAh2d3c 2c6cAd4s 7s9h5s7d",
      Solver.process("omaha-holdem 3h6d7hAsKc 9d2h8s5d TdKh4dQs 2c6cAd4s 4c8c9c3s 8hQdTh7c 2s4hTs6h 7s9h5s7d JsAh2d3c 8dKs9s6s"));
  }

  @Test
  public void test_omaha_holdem_5969_4c9h9sQdTh_6hAh7h2c_8dJs3cKd_Qc2s7dQs_TcKh9d2h_8sJcJh4d() {
    assertEquals(
      "6hAh7h2c 8sJcJh4d 8dJs3cKd TcKh9d2h Qc2s7dQs",
      Solver.process("omaha-holdem 4c9h9sQdTh 6hAh7h2c 8dJs3cKd Qc2s7dQs TcKh9d2h 8sJcJh4d"));
  }

  @Test
  public void test_omaha_holdem_5970_4s7sQdTcTh_7cJh5dJs_3s4c8sJd_Qc6c9hKh() {
    assertEquals(
      "3s4c8sJd 7cJh5dJs Qc6c9hKh",
      Solver.process("omaha-holdem 4s7sQdTcTh 7cJh5dJs 3s4c8sJd Qc6c9hKh"));
  }

  @Test
  public void test_omaha_holdem_5971_2c3c3h8cAc_Qs7d2d9h_2sJh5hTh_AsJs7c3d_9dKs3sTs_5s8h9cKc_4c7hQc8d_Tc6c5cJc_6h8s4sTd_Kd9s5d6s() {
    assertEquals(
      "Kd9s5d6s 2sJh5hTh Qs7d2d9h 6h8s4sTd 9dKs3sTs Tc6c5cJc 4c7hQc8d 5s8h9cKc AsJs7c3d",
      Solver.process("omaha-holdem 2c3c3h8cAc Qs7d2d9h 2sJh5hTh AsJs7c3d 9dKs3sTs 5s8h9cKc 4c7hQc8d Tc6c5cJc 6h8s4sTd Kd9s5d6s"));
  }

  @Test
  public void test_omaha_holdem_5972_2d3s6h8hAc_Ts7c6dQh_KsThKh4s() {
    assertEquals(
      "Ts7c6dQh KsThKh4s",
      Solver.process("omaha-holdem 2d3s6h8hAc Ts7c6dQh KsThKh4s"));
  }

  @Test
  public void test_omaha_holdem_5973_3c6c8dJdKh_Qh9c8cAc_4c9hTs2c_3sAs5c4h_4dQcTc6h_Ks5sJsQd_3h4s7cKd_Jc2d7hTd_2s3dAh8s_Ad6s5dQs() {
    assertEquals(
      "4c9hTs2c 3sAs5c4h 4dQcTc6h Ad6s5dQs Qh9c8cAc Jc2d7hTd 2s3dAh8s 3h4s7cKd Ks5sJsQd",
      Solver.process("omaha-holdem 3c6c8dJdKh Qh9c8cAc 4c9hTs2c 3sAs5c4h 4dQcTc6h Ks5sJsQd 3h4s7cKd Jc2d7hTd 2s3dAh8s Ad6s5dQs"));
  }

  @Test
  public void test_omaha_holdem_5974_2c2s3d6d8s_3h4dQcQd_Ks2dTc5s_8d5h9c8h_QsQhJsAc_Jh6hJcAs() {
    assertEquals(
      "Jh6hJcAs 3h4dQcQd=QsQhJsAc Ks2dTc5s 8d5h9c8h",
      Solver.process("omaha-holdem 2c2s3d6d8s 3h4dQcQd Ks2dTc5s 8d5h9c8h QsQhJsAc Jh6hJcAs"));
  }

  @Test
  public void test_omaha_holdem_5975_6d7h9hAcQh_Tc8s9s8d_2h8hAs2s_7s3dTdAd_9dQd4d7d_Kc4cKd5d_6s5s5h6c_QcJh5c3h_9cTs6h4h_7c2c8c4s() {
    assertEquals(
      "7c2c8c4s Kc4cKd5d 9dQd4d7d 7s3dTdAd 6s5s5h6c Tc8s9s8d 9cTs6h4h 2h8hAs2s QcJh5c3h",
      Solver.process("omaha-holdem 6d7h9hAcQh Tc8s9s8d 2h8hAs2s 7s3dTdAd 9dQd4d7d Kc4cKd5d 6s5s5h6c QcJh5c3h 9cTs6h4h 7c2c8c4s"));
  }

  @Test
  public void test_omaha_holdem_5976_5s6c7sJdJs_7c2s9d3h_QdKcQh4s() {
    assertEquals(
      "7c2s9d3h QdKcQh4s",
      Solver.process("omaha-holdem 5s6c7sJdJs 7c2s9d3h QdKcQh4s"));
  }

  @Test
  public void test_omaha_holdem_5977_3sAhJcKdKs_Ac9d7s8d_Th7h5h7d() {
    assertEquals(
      "Th7h5h7d Ac9d7s8d",
      Solver.process("omaha-holdem 3sAhJcKdKs Ac9d7s8d Th7h5h7d"));
  }

  @Test
  public void test_omaha_holdem_5978_2s4hKhQsTc_Kd6h4c9h_9s9dJd3d_Ac6d2h8d_QcJsQh5h_5cAsJh3h_5dKcTsKs_Ad3s4dJc() {
    assertEquals(
      "Ac6d2h8d Kd6h4c9h QcJsQh5h 5dKcTsKs 9s9dJd3d 5cAsJh3h=Ad3s4dJc",
      Solver.process("omaha-holdem 2s4hKhQsTc Kd6h4c9h 9s9dJd3d Ac6d2h8d QcJsQh5h 5cAsJh3h 5dKcTsKs Ad3s4dJc"));
  }

  @Test
  public void test_omaha_holdem_5979_2h3c9sJdJs_8c7hTh5h_2cTcJc6c_Qc6d4d2d_3dQhTs9c_Ad2sAs7d_Kc8dKsKh_3h4sQd4c() {
    assertEquals(
      "8c7hTh5h Qc6d4d2d 3h4sQd4c 3dQhTs9c Kc8dKsKh Ad2sAs7d 2cTcJc6c",
      Solver.process("omaha-holdem 2h3c9sJdJs 8c7hTh5h 2cTcJc6c Qc6d4d2d 3dQhTs9c Ad2sAs7d Kc8dKsKh 3h4sQd4c"));
  }

  @Test
  public void test_omaha_holdem_5980_3c3d4c4dJd_7d5s2sTc_QdTs8hJs() {
    assertEquals(
      "7d5s2sTc QdTs8hJs",
      Solver.process("omaha-holdem 3c3d4c4dJd 7d5s2sTc QdTs8hJs"));
  }

  @Test
  public void test_omaha_holdem_5981_5s8d9d9hAs_TdKs4d2d_JcTcQcAh_9s3cJh5h_3hJd4cAc() {
    assertEquals(
      "TdKs4d2d 3hJd4cAc JcTcQcAh 9s3cJh5h",
      Solver.process("omaha-holdem 5s8d9d9hAs TdKs4d2d JcTcQcAh 9s3cJh5h 3hJd4cAc"));
  }

  @Test
  public void test_omaha_holdem_5982_6h9h9sJsTs_JdKs3d5s_3sTc2cAs_TdKc2dAh_4h3h6dJc_3c4c4sKd_8c9c5hQd_Jh9d7dAc_8d5dTh6c_4dQs6s2s() {
    assertEquals(
      "3c4c4sKd 8d5dTh6c TdKc2dAh 4h3h6dJc 8c9c5hQd 4dQs6s2s JdKs3d5s 3sTc2cAs Jh9d7dAc",
      Solver.process("omaha-holdem 6h9h9sJsTs JdKs3d5s 3sTc2cAs TdKc2dAh 4h3h6dJc 3c4c4sKd 8c9c5hQd Jh9d7dAc 8d5dTh6c 4dQs6s2s"));
  }

  @Test
  public void test_omaha_holdem_5983_2d3s8dJdQd_7cKs6cAd_6dTsJc4d_7h4sQhQs_5d9d9c8h() {
    assertEquals(
      "7cKs6cAd 7h4sQhQs 6dTsJc4d 5d9d9c8h",
      Solver.process("omaha-holdem 2d3s8dJdQd 7cKs6cAd 6dTsJc4d 7h4sQhQs 5d9d9c8h"));
  }

  @Test
  public void test_omaha_holdem_5984_3c5s6hJsKd_6cJh9h9c_AhThJc7h_2c5h4h5d_KcQh3d8d_7cQcQd8h_3s2s8s4c_2hQsAdKh_Tc8cAc6s_As7sJdKs() {
    assertEquals(
      "Tc8cAc6s AhThJc7h 7cQcQd8h 2hQsAdKh 6cJh9h9c KcQh3d8d As7sJdKs 2c5h4h5d=3s2s8s4c",
      Solver.process("omaha-holdem 3c5s6hJsKd 6cJh9h9c AhThJc7h 2c5h4h5d KcQh3d8d 7cQcQd8h 3s2s8s4c 2hQsAdKh Tc8cAc6s As7sJdKs"));
  }

  @Test
  public void test_omaha_holdem_5985_4d6d7d7sQc_4cJh6h2c_AcTs4h5h_Ah9hAs8c_7h7cKdJd_Td5d5s3h_5c2sJcTc_KhJs9d6c_Qd8h3d2d_4s9c9sQh() {
    assertEquals(
      "5c2sJcTc AcTs4h5h 4cJh6h2c KhJs9d6c 4s9c9sQh Ah9hAs8c Td5d5s3h Qd8h3d2d 7h7cKdJd",
      Solver.process("omaha-holdem 4d6d7d7sQc 4cJh6h2c AcTs4h5h Ah9hAs8c 7h7cKdJd Td5d5s3h 5c2sJcTc KhJs9d6c Qd8h3d2d 4s9c9sQh"));
  }

  @Test
  public void test_omaha_holdem_5986_3c3d4c5c6s_6c9h2sQc_2c4sKd7c_2h3hQdAh_JcKs5h8d_7d8cJs2d_4dAcThJh() {
    assertEquals(
      "4dAcThJh JcKs5h8d 2h3hQdAh 7d8cJs2d 2c4sKd7c 6c9h2sQc",
      Solver.process("omaha-holdem 3c3d4c5c6s 6c9h2sQc 2c4sKd7c 2h3hQdAh JcKs5h8d 7d8cJs2d 4dAcThJh"));
  }

  @Test
  public void test_omaha_holdem_5987_2h8hJcKdQs_JhQc4h5h_9dTdQd7c_Ad6d3hTs_2sAsAc5d_8cKs5s8d_2d8s7d3s_4dJd6sQh() {
    assertEquals(
      "2sAsAc5d 2d8s7d3s 4dJd6sQh=JhQc4h5h 8cKs5s8d 9dTdQd7c Ad6d3hTs",
      Solver.process("omaha-holdem 2h8hJcKdQs JhQc4h5h 9dTdQd7c Ad6d3hTs 2sAsAc5d 8cKs5s8d 2d8s7d3s 4dJd6sQh"));
  }

  @Test
  public void test_omaha_holdem_5988_2c4c4s7sJh_9cQcTd6s_Qd3s7c6h() {
    assertEquals(
      "9cQcTd6s Qd3s7c6h",
      Solver.process("omaha-holdem 2c4c4s7sJh 9cQcTd6s Qd3s7c6h"));
  }

  @Test
  public void test_omaha_holdem_5989_3h6c8dAhTd_3sAdKh7d_3d2s5h9s_8h8c4hKd() {
    assertEquals(
      "3d2s5h9s 3sAdKh7d 8h8c4hKd",
      Solver.process("omaha-holdem 3h6c8dAhTd 3sAdKh7d 3d2s5h9s 8h8c4hKd"));
  }

  @Test
  public void test_omaha_holdem_5990_2hAdJhQsTh_Jc2dKsTc_7dTs3hQc_6h4d5s8d_2c2s8cTd_3c3d6cKc() {
    assertEquals(
      "6h4d5s8d 3c3d6cKc 7dTs3hQc 2c2s8cTd Jc2dKsTc",
      Solver.process("omaha-holdem 2hAdJhQsTh Jc2dKsTc 7dTs3hQc 6h4d5s8d 2c2s8cTd 3c3d6cKc"));
  }

  @Test
  public void test_omaha_holdem_5991_3h6hAsQcTc_AcKcAd4h_8s8c4c6c_QdQsJh2h_Jc9h9d9s_AhKs7cTs_4sJs3dJd_8h7d2c6s() {
    assertEquals(
      "8h7d2c6s 8s8c4c6c Jc9h9d9s 4sJs3dJd AhKs7cTs QdQsJh2h AcKcAd4h",
      Solver.process("omaha-holdem 3h6hAsQcTc AcKcAd4h 8s8c4c6c QdQsJh2h Jc9h9d9s AhKs7cTs 4sJs3dJd 8h7d2c6s"));
  }

  @Test
  public void test_omaha_holdem_5992_6c8h8sQhTd_5s2d2c3s_7s7cKd3d_KhAdJs7h_Jd9c2s4s() {
    assertEquals(
      "KhAdJs7h 5s2d2c3s 7s7cKd3d Jd9c2s4s",
      Solver.process("omaha-holdem 6c8h8sQhTd 5s2d2c3s 7s7cKd3d KhAdJs7h Jd9c2s4s"));
  }

  @Test
  public void test_omaha_holdem_5993_6h7d9cAhTc_6d9s7c7h_8h3d9dTd_Qc2cJdAc_3sQs6cAs_4d5d5h8c() {
    assertEquals(
      "Qc2cJdAc 3sQs6cAs 6d9s7c7h 4d5d5h8c 8h3d9dTd",
      Solver.process("omaha-holdem 6h7d9cAhTc 6d9s7c7h 8h3d9dTd Qc2cJdAc 3sQs6cAs 4d5d5h8c"));
  }

  @Test
  public void test_omaha_holdem_5994_4s5c7hJhJs_9s6s6c4h_Ts2hThKd() {
    assertEquals(
      "9s6s6c4h Ts2hThKd",
      Solver.process("omaha-holdem 4s5c7hJhJs 9s6s6c4h Ts2hThKd"));
  }

  @Test
  public void test_omaha_holdem_5995_3c3s4cQdQh_JcQsJsTs_4s7h4d6s_6d7d6c6h_8c5dTh7s() {
    assertEquals(
      "8c5dTh7s 6d7d6c6h JcQsJsTs 4s7h4d6s",
      Solver.process("omaha-holdem 3c3s4cQdQh JcQsJsTs 4s7h4d6s 6d7d6c6h 8c5dTh7s"));
  }

  @Test
  public void test_omaha_holdem_5996_3s6d9sAsQh_9d8sJd2d_3h3dQc2h_3cKh4d5s() {
    assertEquals(
      "3cKh4d5s 9d8sJd2d 3h3dQc2h",
      Solver.process("omaha-holdem 3s6d9sAsQh 9d8sJd2d 3h3dQc2h 3cKh4d5s"));
  }

  @Test
  public void test_omaha_holdem_5997_7h8sJcKcKh_4d8dQsTh_3s9cQd9h_QhAd5c9d_2d7s8c5h_4sTdJs5d_6s4cKdJh_Tc7cJdQc() {
    assertEquals(
      "QhAd5c9d 2d7s8c5h 4d8dQsTh 3s9cQd9h 4sTdJs5d Tc7cJdQc 6s4cKdJh",
      Solver.process("omaha-holdem 7h8sJcKcKh 4d8dQsTh 3s9cQd9h QhAd5c9d 2d7s8c5h 4sTdJs5d 6s4cKdJh Tc7cJdQc"));
  }

  @Test
  public void test_omaha_holdem_5998_2c5h6c7d8c_9sKcJs3c_4hQc3dQs_6dTdQd9d() {
    assertEquals(
      "4hQc3dQs 6dTdQd9d 9sKcJs3c",
      Solver.process("omaha-holdem 2c5h6c7d8c 9sKcJs3c 4hQc3dQs 6dTdQd9d"));
  }

  @Test
  public void test_omaha_holdem_5999_4s5s6c8cKd_8sJcJhTs_Kh4h7s9d_8h2d3d7d_Ah9hQdQc_Ac9c3s2s_4c6hQh5c() {
    assertEquals(
      "8sJcJhTs Ah9hQdQc 4c6hQh5c Ac9c3s2s 8h2d3d7d Kh4h7s9d",
      Solver.process("omaha-holdem 4s5s6c8cKd 8sJcJhTs Kh4h7s9d 8h2d3d7d Ah9hQdQc Ac9c3s2s 4c6hQh5c"));
  }

}
