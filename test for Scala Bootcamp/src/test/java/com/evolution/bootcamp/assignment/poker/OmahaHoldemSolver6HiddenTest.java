
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver6HiddenTest {


  @Test
  public void test_omaha_holdem_1500_3d4h6c6hQs_2d4dJhAh_Qd2hKs3c_8h6d5dQc_8d3s9dQh_7d7hTh5h_AsAdJs7s() {
    assertEquals(
      "2d4dJhAh 8d3s9dQh Qd2hKs3c AsAdJs7s 7d7hTh5h 8h6d5dQc",
      Solver.process("omaha-holdem 3d4h6c6hQs 2d4dJhAh Qd2hKs3c 8h6d5dQc 8d3s9dQh 7d7hTh5h AsAdJs7s"));
  }

  @Test
  public void test_omaha_holdem_1501_5c8sKsQsTc_9s7d7hKc_8h5s4h2s_Ah2dTd6h_AsTsQhQc_Kh5d6cJc_Ad7s3c3s_Jh9cQd8c() {
    assertEquals(
      "Ah2dTd6h 9s7d7hKc Kh5d6cJc Jh9cQd8c 8h5s4h2s Ad7s3c3s AsTsQhQc",
      Solver.process("omaha-holdem 5c8sKsQsTc 9s7d7hKc 8h5s4h2s Ah2dTd6h AsTsQhQc Kh5d6cJc Ad7s3c3s Jh9cQd8c"));
  }

  @Test
  public void test_omaha_holdem_1502_3c3d5c6d7c_Jd4hAc9c_Js2h5dTc_KhQh8d2d_6s9s7sAd_5hAsJc9d() {
    assertEquals(
      "KhQh8d2d Js2h5dTc 5hAsJc9d 6s9s7sAd Jd4hAc9c",
      Solver.process("omaha-holdem 3c3d5c6d7c Jd4hAc9c Js2h5dTc KhQh8d2d 6s9s7sAd 5hAsJc9d"));
  }

  @Test
  public void test_omaha_holdem_1503_6h8d9sJsTc_5hJc3d6c_2s4hJhKh() {
    assertEquals(
      "2s4hJhKh 5hJc3d6c",
      Solver.process("omaha-holdem 6h8d9sJsTc 5hJc3d6c 2s4hJhKh"));
  }

  @Test
  public void test_omaha_holdem_1504_4s5s8d8hAd_AhJc2dKd_2cTd9s4h_5dJs7hKh_Jd6hQd7c_3s8c3h5c_6d8s5h6c() {
    assertEquals(
      "2cTd9s4h 5dJs7hKh AhJc2dKd Jd6hQd7c 3s8c3h5c=6d8s5h6c",
      Solver.process("omaha-holdem 4s5s8d8hAd AhJc2dKd 2cTd9s4h 5dJs7hKh Jd6hQd7c 3s8c3h5c 6d8s5h6c"));
  }

  @Test
  public void test_omaha_holdem_1505_2h9cJcJhTd_3d4d3h8h_6h9s6dQc_7dQh5h7s_9h8d5dKc_2s4sJs6s_Jd3cAc2c_AsKdAd8c_Ts2d9dKs_3s7h6cKh() {
    assertEquals(
      "3s7h6cKh 3d4d3h8h 7dQh5h7s 6h9s6dQc 9h8d5dKc Ts2d9dKs AsKdAd8c 2s4sJs6s=Jd3cAc2c",
      Solver.process("omaha-holdem 2h9cJcJhTd 3d4d3h8h 6h9s6dQc 7dQh5h7s 9h8d5dKc 2s4sJs6s Jd3cAc2c AsKdAd8c Ts2d9dKs 3s7h6cKh"));
  }

  @Test
  public void test_omaha_holdem_1506_3s5c5s8hAc_6d6s4sJh_7d2c8c8s_Ad7hKcJc_QhAh3c2d_Js5d4c7s_Tc9s5h2h_4hKdQd6h() {
    assertEquals(
      "4hKdQd6h 6d6s4sJh QhAh3c2d Ad7hKcJc Tc9s5h2h Js5d4c7s 7d2c8c8s",
      Solver.process("omaha-holdem 3s5c5s8hAc 6d6s4sJh 7d2c8c8s Ad7hKcJc QhAh3c2d Js5d4c7s Tc9s5h2h 4hKdQd6h"));
  }

  @Test
  public void test_omaha_holdem_1507_AcJhQcTcTh_Js4sKd8h_5h9dKh7s_6s3sAs9s_8d7hQs3h() {
    assertEquals(
      "8d7hQs3h 6s3sAs9s 5h9dKh7s Js4sKd8h",
      Solver.process("omaha-holdem AcJhQcTcTh Js4sKd8h 5h9dKh7s 6s3sAs9s 8d7hQs3h"));
  }

  @Test
  public void test_omaha_holdem_1508_2c2dQcQhTh_As3hKd6h_4sAc3s5d_2sQsJs7d_9dAh9s7c() {
    assertEquals(
      "4sAc3s5d As3hKd6h 9dAh9s7c 2sQsJs7d",
      Solver.process("omaha-holdem 2c2dQcQhTh As3hKd6h 4sAc3s5d 2sQsJs7d 9dAh9s7c"));
  }

  @Test
  public void test_omaha_holdem_1509_8d9hAhQhTh_7d3sJcAd_7hAsTsTd() {
    assertEquals(
      "7hAsTsTd 7d3sJcAd",
      Solver.process("omaha-holdem 8d9hAhQhTh 7d3sJcAd 7hAsTsTd"));
  }

  @Test
  public void test_omaha_holdem_1510_3s4s8hQdTc_Kh7sQc4d_Ac2h2cJd_5dAsTh5h_6h9s3d8s_JhAh4hTs_Qs8d4c2d_9c6s7d6d() {
    assertEquals(
      "Ac2h2cJd 9c6s7d6d 5dAsTh5h 6h9s3d8s JhAh4hTs Kh7sQc4d Qs8d4c2d",
      Solver.process("omaha-holdem 3s4s8hQdTc Kh7sQc4d Ac2h2cJd 5dAsTh5h 6h9s3d8s JhAh4hTs Qs8d4c2d 9c6s7d6d"));
  }

  @Test
  public void test_omaha_holdem_1511_3d4c7cKhTh_5c6s8sQh_Ks3c4h2d_4s7d9d2h_9hQcTc3s_8dKc7h8h() {
    assertEquals(
      "4s7d9d2h 9hQcTc3s Ks3c4h2d 8dKc7h8h 5c6s8sQh",
      Solver.process("omaha-holdem 3d4c7cKhTh 5c6s8sQh Ks3c4h2d 4s7d9d2h 9hQcTc3s 8dKc7h8h"));
  }

  @Test
  public void test_omaha_holdem_1512_6d8c8sKdKs_9h3s8dAh_4dJcJs5c_5s4sJh5h_Ad5d3d7c_Qc4c2hTc_9d6cQsTh_Qh9cJd6h_2c4hTs3h() {
    assertEquals(
      "2c4hTs3h Qc4c2hTc Ad5d3d7c 5s4sJh5h 9d6cQsTh=Qh9cJd6h 4dJcJs5c 9h3s8dAh",
      Solver.process("omaha-holdem 6d8c8sKdKs 9h3s8dAh 4dJcJs5c 5s4sJh5h Ad5d3d7c Qc4c2hTc 9d6cQsTh Qh9cJd6h 2c4hTs3h"));
  }

  @Test
  public void test_omaha_holdem_1513_4sAhQdQhTc_TsKd5cQc_9h2h9c7s_8hAs5d4d_4c9s6sJc() {
    assertEquals(
      "4c9s6sJc 9h2h9c7s 8hAs5d4d TsKd5cQc",
      Solver.process("omaha-holdem 4sAhQdQhTc TsKd5cQc 9h2h9c7s 8hAs5d4d 4c9s6sJc"));
  }

  @Test
  public void test_omaha_holdem_1514_3h3s6d8h9h_3cKh9s6c_QcThQdKs_4d6h7dQh_2sJc4c5s_7h9d6s8s_4sKd3dJd_Jh5h9cTd() {
    assertEquals(
      "2sJc4c5s 7h9d6s8s QcThQdKs 4sKd3dJd Jh5h9cTd 4d6h7dQh 3cKh9s6c",
      Solver.process("omaha-holdem 3h3s6d8h9h 3cKh9s6c QcThQdKs 4d6h7dQh 2sJc4c5s 7h9d6s8s 4sKd3dJd Jh5h9cTd"));
  }

  @Test
  public void test_omaha_holdem_1515_2c3s9dAcKh_AsQcTc9s_5h7h3cJh_QdThTd9c_2h8dQh2s_2dJc8c4h() {
    assertEquals(
      "2dJc8c4h 5h7h3cJh QdThTd9c AsQcTc9s 2h8dQh2s",
      Solver.process("omaha-holdem 2c3s9dAcKh AsQcTc9s 5h7h3cJh QdThTd9c 2h8dQh2s 2dJc8c4h"));
  }

  @Test
  public void test_omaha_holdem_1516_2c4h6c8dQd_6d4s6sQc_7h8s6hJd_Ac8h5d2h_3c4cKs5c_5hJsKd7s_Jh3hJcTd_9s3sAhQs() {
    assertEquals(
      "Jh3hJcTd 9s3sAhQs Ac8h5d2h 7h8s6hJd 6d4s6sQc 3c4cKs5c 5hJsKd7s",
      Solver.process("omaha-holdem 2c4h6c8dQd 6d4s6sQc 7h8s6hJd Ac8h5d2h 3c4cKs5c 5hJsKd7s Jh3hJcTd 9s3sAhQs"));
  }

  @Test
  public void test_omaha_holdem_1517_2c2h8cJcTs_4hQdJd6h_3h5h9d4c_5sQcAs7c_Kh7s7d3c_4s8sTc5d_6d6c8h9h_KcTh2s6s() {
    assertEquals(
      "3h5h9d4c Kh7s7d3c 6d6c8h9h 4s8sTc5d 4hQdJd6h 5sQcAs7c KcTh2s6s",
      Solver.process("omaha-holdem 2c2h8cJcTs 4hQdJd6h 3h5h9d4c 5sQcAs7c Kh7s7d3c 4s8sTc5d 6d6c8h9h KcTh2s6s"));
  }

  @Test
  public void test_omaha_holdem_1518_2c9cAhAsKh_Jh3dQsKd_6s9sJsKs_3sThTcKc_4d3c4h7h_9d6dAc5s_9hQh5d7s() {
    assertEquals(
      "4d3c4h7h 9hQh5d7s 3sThTcKc 6s9sJsKs Jh3dQsKd 9d6dAc5s",
      Solver.process("omaha-holdem 2c9cAhAsKh Jh3dQsKd 6s9sJsKs 3sThTcKc 4d3c4h7h 9d6dAc5s 9hQh5d7s"));
  }

  @Test
  public void test_omaha_holdem_1519_4c4h9c9sTs_8h6h8s2h_Ah5h7dJc_4s2d5s7s_KcAd2sTd_Ks2c3h9h_6c8cKd3d() {
    assertEquals(
      "6c8cKd3d Ah5h7dJc 8h6h8s2h KcAd2sTd 4s2d5s7s Ks2c3h9h",
      Solver.process("omaha-holdem 4c4h9c9sTs 8h6h8s2h Ah5h7dJc 4s2d5s7s KcAd2sTd Ks2c3h9h 6c8cKd3d"));
  }

  @Test
  public void test_omaha_holdem_1520_2c6sAcKhKs_8hJd3c5d_JsJc7h9c_8sKc7s6d_3h6h2sAd_4sTc5cQd_TsAs7cTd_5hAhKd2d() {
    assertEquals(
      "8hJd3c5d 4sTc5cQd JsJc7h9c 3h6h2sAd TsAs7cTd 8sKc7s6d 5hAhKd2d",
      Solver.process("omaha-holdem 2c6sAcKhKs 8hJd3c5d JsJc7h9c 8sKc7s6d 3h6h2sAd 4sTc5cQd TsAs7cTd 5hAhKd2d"));
  }

  @Test
  public void test_omaha_holdem_1521_3s6d8dJcQh_4d6s7h4c_AsQd4h2d_Kh7dAcKc() {
    assertEquals(
      "4d6s7h4c AsQd4h2d Kh7dAcKc",
      Solver.process("omaha-holdem 3s6d8dJcQh 4d6s7h4c AsQd4h2d Kh7dAcKc"));
  }

  @Test
  public void test_omaha_holdem_1522_2s3c7sJdQh_2hAd6hQc_7d9h6s8h() {
    assertEquals(
      "7d9h6s8h 2hAd6hQc",
      Solver.process("omaha-holdem 2s3c7sJdQh 2hAd6hQc 7d9h6s8h"));
  }

  @Test
  public void test_omaha_holdem_1523_3s5h5s8dQd_4s8h9d7h_6s4c7sJd_Ad8sKh6h() {
    assertEquals(
      "6s4c7sJd 4s8h9d7h Ad8sKh6h",
      Solver.process("omaha-holdem 3s5h5s8dQd 4s8h9d7h 6s4c7sJd Ad8sKh6h"));
  }

  @Test
  public void test_omaha_holdem_1524_4c6c6d8hAd_2s3d5s8c_Td7hTh2d_3s9cTsTc_4s3cKhQc_4h7s6h4d_Ah5d2h3h_9hJc7c8s_5hJs9d8d_AsKsQh6s() {
    assertEquals(
      "4s3cKhQc 2s3d5s8c 5hJs9d8d=9hJc7c8s 3s9cTsTc=Td7hTh2d Ah5d2h3h 4h7s6h4d AsKsQh6s",
      Solver.process("omaha-holdem 4c6c6d8hAd 2s3d5s8c Td7hTh2d 3s9cTsTc 4s3cKhQc 4h7s6h4d Ah5d2h3h 9hJc7c8s 5hJs9d8d AsKsQh6s"));
  }

  @Test
  public void test_omaha_holdem_1525_5h9sAsJhTd_QdJc8s8h_4hAd6h3s_Ks6s7d2c() {
    assertEquals(
      "Ks6s7d2c 4hAd6h3s QdJc8s8h",
      Solver.process("omaha-holdem 5h9sAsJhTd QdJc8s8h 4hAd6h3s Ks6s7d2c"));
  }

  @Test
  public void test_omaha_holdem_1526_2c4h8sJcTh_JdJs7c8h_9h9c7d3c_Qd2s6sJh_5hAsTs8c_5d4dAdAc_4s6hAhKs() {
    assertEquals(
      "4s6hAhKs 5d4dAdAc 5hAsTs8c Qd2s6sJh JdJs7c8h 9h9c7d3c",
      Solver.process("omaha-holdem 2c4h8sJcTh JdJs7c8h 9h9c7d3c Qd2s6sJh 5hAsTs8c 5d4dAdAc 4s6hAhKs"));
  }

  @Test
  public void test_omaha_holdem_1527_3c3d5d6dTh_4cKcAd5s_4dJd8s5h_QsAs8h9h_Td9c5c2d_8c7s3hQh_KsAc7hKd_TcAh7c6c() {
    assertEquals(
      "QsAs8h9h 4cKcAd5s TcAh7c6c KsAc7hKd 8c7s3hQh Td9c5c2d 4dJd8s5h",
      Solver.process("omaha-holdem 3c3d5d6dTh 4cKcAd5s 4dJd8s5h QsAs8h9h Td9c5c2d 8c7s3hQh KsAc7hKd TcAh7c6c"));
  }

  @Test
  public void test_omaha_holdem_1528_AdJcJsQcTd_Jh2sTsTh_6d3d8c7s() {
    assertEquals(
      "6d3d8c7s Jh2sTsTh",
      Solver.process("omaha-holdem AdJcJsQcTd Jh2sTsTh 6d3d8c7s"));
  }

  @Test
  public void test_omaha_holdem_1529_6s8d9hJsKd_As9c6c7h_4c9d7cAd_3sAcJc3h_2dJh8s4d() {
    assertEquals(
      "4c9d7cAd 3sAcJc3h As9c6c7h 2dJh8s4d",
      Solver.process("omaha-holdem 6s8d9hJsKd As9c6c7h 4c9d7cAd 3sAcJc3h 2dJh8s4d"));
  }

  @Test
  public void test_omaha_holdem_1530_5s6d7s9cTh_7d4dKcAc_2s9h4h9d_3dQsTsAd_8hJh6hTc_3cJd8dKd_Ks2c5d9s_4c6s4sJc_JsQd3hTd() {
    assertEquals(
      "4c6s4sJc 7d4dKcAc JsQd3hTd 3dQsTsAd Ks2c5d9s 2s9h4h9d 3cJd8dKd=8hJh6hTc",
      Solver.process("omaha-holdem 5s6d7s9cTh 7d4dKcAc 2s9h4h9d 3dQsTsAd 8hJh6hTc 3cJd8dKd Ks2c5d9s 4c6s4sJc JsQd3hTd"));
  }

  @Test
  public void test_omaha_holdem_1531_4d8dJsKdTd_Ad3sQc2h_5cJh2c9s() {
    assertEquals(
      "5cJh2c9s Ad3sQc2h",
      Solver.process("omaha-holdem 4d8dJsKdTd Ad3sQc2h 5cJh2c9s"));
  }

  @Test
  public void test_omaha_holdem_1532_6s9c9dAdTc_5dQh7hQd_6h4cJdKd_KhJc7d8s() {
    assertEquals(
      "6h4cJdKd 5dQh7hQd KhJc7d8s",
      Solver.process("omaha-holdem 6s9c9dAdTc 5dQh7hQd 6h4cJdKd KhJc7d8s"));
  }

  @Test
  public void test_omaha_holdem_1533_5s8cJsQsTd_JcQh3d5h_Ts4d3h2c_6dQc5c6h_AdAh7cAs() {
    assertEquals(
      "Ts4d3h2c AdAh7cAs 6dQc5c6h JcQh3d5h",
      Solver.process("omaha-holdem 5s8cJsQsTd JcQh3d5h Ts4d3h2c 6dQc5c6h AdAh7cAs"));
  }

  @Test
  public void test_omaha_holdem_1534_3h6h7dJsQd_Ac7sKd5h_Qh8dJc9d_4d2c5d7c_3c9hKs3d_2s6cTd4s_5s2hKc8c_6s7h4c8s_Ts2dTc8h_AsJh9cKh() {
    assertEquals(
      "5s2hKc8c 2s6cTd4s Ac7sKd5h Ts2dTc8h AsJh9cKh 6s7h4c8s Qh8dJc9d 3c9hKs3d 4d2c5d7c",
      Solver.process("omaha-holdem 3h6h7dJsQd Ac7sKd5h Qh8dJc9d 4d2c5d7c 3c9hKs3d 2s6cTd4s 5s2hKc8c 6s7h4c8s Ts2dTc8h AsJh9cKh"));
  }

  @Test
  public void test_omaha_holdem_1535_4d5cAcKdKh_Js8s3cQh_7s3hJhTh_9cTsTdAs() {
    assertEquals(
      "7s3hJhTh Js8s3cQh 9cTsTdAs",
      Solver.process("omaha-holdem 4d5cAcKdKh Js8s3cQh 7s3hJhTh 9cTsTdAs"));
  }

  @Test
  public void test_omaha_holdem_1536_2c7h8dAhJd_ThKd6c4s_3d6dJhJs_9c9hKh5h_QdKs3h4d_AdQs5s4h() {
    assertEquals(
      "ThKd6c4s QdKs3h4d 9c9hKh5h AdQs5s4h 3d6dJhJs",
      Solver.process("omaha-holdem 2c7h8dAhJd ThKd6c4s 3d6dJhJs 9c9hKh5h QdKs3h4d AdQs5s4h"));
  }

  @Test
  public void test_omaha_holdem_1537_2d4dAcQsTd_9cJh4sKc_Ad5c3h3d_2h7hTh8h_7sTs5hQc_5s3s9d6d_Qh9h4hKs_6cJs5d8s_3cTc6sJd_8c9sQdKd() {
    assertEquals(
      "6cJs5d8s 3cTc6sJd 2h7hTh8h Qh9h4hKs 7sTs5hQc 9cJh4sKc 5s3s9d6d 8c9sQdKd Ad5c3h3d",
      Solver.process("omaha-holdem 2d4dAcQsTd 9cJh4sKc Ad5c3h3d 2h7hTh8h 7sTs5hQc 5s3s9d6d Qh9h4hKs 6cJs5d8s 3cTc6sJd 8c9sQdKd"));
  }

  @Test
  public void test_omaha_holdem_1538_3s5sAsKdQd_3h7s6hTc_4sJs2h4h_6dTh2d2s_Kc6s5c3d() {
    assertEquals(
      "6dTh2d2s 3h7s6hTc Kc6s5c3d 4sJs2h4h",
      Solver.process("omaha-holdem 3s5sAsKdQd 3h7s6hTc 4sJs2h4h 6dTh2d2s Kc6s5c3d"));
  }

  @Test
  public void test_omaha_holdem_1539_8c9h9sJhTd_2s2hJdJc_6dAd5d7h() {
    assertEquals(
      "6dAd5d7h 2s2hJdJc",
      Solver.process("omaha-holdem 8c9h9sJhTd 2s2hJdJc 6dAd5d7h"));
  }

  @Test
  public void test_omaha_holdem_1540_3c3h4d5h6h_AhAcQc2c_6cJdKs4h_9d7dQh7s_9hTd6s8s_Kh7hJs2s() {
    assertEquals(
      "9hTd6s8s 6cJdKs4h 9d7dQh7s AhAcQc2c Kh7hJs2s",
      Solver.process("omaha-holdem 3c3h4d5h6h AhAcQc2c 6cJdKs4h 9d7dQh7s 9hTd6s8s Kh7hJs2s"));
  }

  @Test
  public void test_omaha_holdem_1541_5c5h6dAcAh_7h6sKc7c_Jc4c2dAs_Ks2hJdAd_Ts8c5s9c_8d2cJh4s_QhThTc9d() {
    assertEquals(
      "8d2cJh4s 7h6sKc7c QhThTc9d Ts8c5s9c Jc4c2dAs Ks2hJdAd",
      Solver.process("omaha-holdem 5c5h6dAcAh 7h6sKc7c Jc4c2dAs Ks2hJdAd Ts8c5s9c 8d2cJh4s QhThTc9d"));
  }

  @Test
  public void test_omaha_holdem_1542_4h6h8c8sAh_QcKd3cJs_9d2s9s8d_Kc7h2d5h_3s8h5dQh_3d7c7s2c_2hTh9cTs_JdQdKh4s() {
    assertEquals(
      "QcKd3cJs JdQdKh4s 3d7c7s2c 9d2s9s8d Kc7h2d5h 2hTh9cTs 3s8h5dQh",
      Solver.process("omaha-holdem 4h6h8c8sAh QcKd3cJs 9d2s9s8d Kc7h2d5h 3s8h5dQh 3d7c7s2c 2hTh9cTs JdQdKh4s"));
  }

  @Test
  public void test_omaha_holdem_1543_4h5c6dAdQs_As2h3d4c_8h2d3cQc_3s6hQh9s() {
    assertEquals(
      "3s6hQh9s 8h2d3cQc=As2h3d4c",
      Solver.process("omaha-holdem 4h5c6dAdQs As2h3d4c 8h2d3cQc 3s6hQh9s"));
  }

  @Test
  public void test_omaha_holdem_1544_2h3c5sQsTd_Jd2d3d2c_6dJh8cTc_5c3h5hQc_9c6sAc7h_Kc6h4h9d_QdJs7c9h() {
    assertEquals(
      "9c6sAc7h 6dJh8cTc QdJs7c9h Jd2d3d2c 5c3h5hQc Kc6h4h9d",
      Solver.process("omaha-holdem 2h3c5sQsTd Jd2d3d2c 6dJh8cTc 5c3h5hQc 9c6sAc7h Kc6h4h9d QdJs7c9h"));
  }

  @Test
  public void test_omaha_holdem_1545_4c4sAhKhQd_3s2dTs2c_9d8s2sTd_2h7d9h5d_5hJs7s6h_9sKsQs5c_Qh4d3dQc_KdKc8hTh_4h9c6c7c_As8c3h8d() {
    assertEquals(
      "2h7d9h5d 9d8s2sTd 5hJs7s6h 3s2dTs2c 9sKsQs5c As8c3h8d 4h9c6c7c Qh4d3dQc KdKc8hTh",
      Solver.process("omaha-holdem 4c4sAhKhQd 3s2dTs2c 9d8s2sTd 2h7d9h5d 5hJs7s6h 9sKsQs5c Qh4d3dQc KdKc8hTh 4h9c6c7c As8c3h8d"));
  }

  @Test
  public void test_omaha_holdem_1546_2d2s3c8dKs_QcAd7d7c_6dJcTsJd_5s4c4h6c_Tc5c4s9h() {
    assertEquals(
      "Tc5c4s9h 5s4c4h6c QcAd7d7c 6dJcTsJd",
      Solver.process("omaha-holdem 2d2s3c8dKs QcAd7d7c 6dJcTsJd 5s4c4h6c Tc5c4s9h"));
  }

  @Test
  public void test_omaha_holdem_1547_5c6s8hQhTh_6cQsKh2d_7sAhAs3d() {
    assertEquals(
      "7sAhAs3d 6cQsKh2d",
      Solver.process("omaha-holdem 5c6s8hQhTh 6cQsKh2d 7sAhAs3d"));
  }

  @Test
  public void test_omaha_holdem_1548_3c8hAcJhKh_Ks4d6d9h_2dAsQdKc_6s8s5sTh_Js8c2c7d() {
    assertEquals(
      "6s8s5sTh Ks4d6d9h Js8c2c7d 2dAsQdKc",
      Solver.process("omaha-holdem 3c8hAcJhKh Ks4d6d9h 2dAsQdKc 6s8s5sTh Js8c2c7d"));
  }

  @Test
  public void test_omaha_holdem_1549_3d5d5h7d7s_AhQc4d2d_TcAs4s7c_3c8sKhJs_Ts9dQh6d_2cAc6c3h_KdJcJhTh_8dKsKc7h() {
    assertEquals(
      "3c8sKhJs 2cAc6c3h KdJcJhTh 8dKsKc7h TcAs4s7c AhQc4d2d Ts9dQh6d",
      Solver.process("omaha-holdem 3d5d5h7d7s AhQc4d2d TcAs4s7c 3c8sKhJs Ts9dQh6d 2cAc6c3h KdJcJhTh 8dKsKc7h"));
  }

  @Test
  public void test_omaha_holdem_1550_3d3s5cAhJh_Ac8s2hTd_9cJc7hTh_9d8c3cTc_Qc6s3h4h_9h4s8dKc_5sJs2d7c_KhKd2cAs_7d5hJdQd() {
    assertEquals(
      "9h4s8dKc 9cJc7hTh 5sJs2d7c=7d5hJdQd Ac8s2hTd KhKd2cAs 9d8c3cTc Qc6s3h4h",
      Solver.process("omaha-holdem 3d3s5cAhJh Ac8s2hTd 9cJc7hTh 9d8c3cTc Qc6s3h4h 9h4s8dKc 5sJs2d7c KhKd2cAs 7d5hJdQd"));
  }

  @Test
  public void test_omaha_holdem_1551_5c5d5h8dQd_2c6c4d7s_5s6sTd7d_KdAs9h9d() {
    assertEquals(
      "2c6c4d7s KdAs9h9d 5s6sTd7d",
      Solver.process("omaha-holdem 5c5d5h8dQd 2c6c4d7s 5s6sTd7d KdAs9h9d"));
  }

  @Test
  public void test_omaha_holdem_1552_5h7sKhQsTh_JcQcAc2c_9s3d2d7c_2h6sTcKs_5d9c4c4s_6d3sTd4d_5c2s4h6h_As3h8sAd_9h9dAh8c() {
    assertEquals(
      "5d9c4c4s 9s3d2d7c 6d3sTd4d As3h8sAd 2h6sTcKs JcQcAc2c 5c2s4h6h 9h9dAh8c",
      Solver.process("omaha-holdem 5h7sKhQsTh JcQcAc2c 9s3d2d7c 2h6sTcKs 5d9c4c4s 6d3sTd4d 5c2s4h6h As3h8sAd 9h9dAh8c"));
  }

  @Test
  public void test_omaha_holdem_1553_3s5dAcKcTd_3dJs8d9d_9c7c4c2c_9hQcKsQs_Jh8c6sKd() {
    assertEquals(
      "3dJs8d9d Jh8c6sKd 9hQcKsQs 9c7c4c2c",
      Solver.process("omaha-holdem 3s5dAcKcTd 3dJs8d9d 9c7c4c2c 9hQcKsQs Jh8c6sKd"));
  }

  @Test
  public void test_omaha_holdem_1554_2c2h5h7cTc_4d6hKcKd_7dQhJs3d_8hJd3s2s_AcAh7sKh_9d3cQs5c_9s2d5d4h() {
    assertEquals(
      "7dQhJs3d 4d6hKcKd AcAh7sKh 8hJd3s2s 9d3cQs5c 9s2d5d4h",
      Solver.process("omaha-holdem 2c2h5h7cTc 4d6hKcKd 7dQhJs3d 8hJd3s2s AcAh7sKh 9d3cQs5c 9s2d5d4h"));
  }

  @Test
  public void test_omaha_holdem_1555_2d5d5s6cAc_3dKcTc4h_5hQdQcKh_Th2h7h9d_5cTsJs8d_Ad2cTd4d() {
    assertEquals(
      "Th2h7h9d Ad2cTd4d 5cTsJs8d 5hQdQcKh 3dKcTc4h",
      Solver.process("omaha-holdem 2d5d5s6cAc 3dKcTc4h 5hQdQcKh Th2h7h9d 5cTsJs8d Ad2cTd4d"));
  }

  @Test
  public void test_omaha_holdem_1556_2d3sJcJhKd_2h5hTd3c_4h4sAs8h_5d6dTs4d_6hJdAhQc_Kc7h4c6c() {
    assertEquals(
      "5d6dTs4d 2h5hTd3c 4h4sAs8h Kc7h4c6c 6hJdAhQc",
      Solver.process("omaha-holdem 2d3sJcJhKd 2h5hTd3c 4h4sAs8h 5d6dTs4d 6hJdAhQc Kc7h4c6c"));
  }

  @Test
  public void test_omaha_holdem_1557_2d3h5hJcKc_ThKd5c8d_3s8h6d6h_7hKsAcTd() {
    assertEquals(
      "3s8h6d6h 7hKsAcTd ThKd5c8d",
      Solver.process("omaha-holdem 2d3h5hJcKc ThKd5c8d 3s8h6d6h 7hKsAcTd"));
  }

  @Test
  public void test_omaha_holdem_1558_4c5s8d8h8s_5h6d4sQd_JcQc9sTd_AdJd3s7h_5cQsAsKh() {
    assertEquals(
      "5h6d4sQd JcQc9sTd AdJd3s7h 5cQsAsKh",
      Solver.process("omaha-holdem 4c5s8d8h8s 5h6d4sQd JcQc9sTd AdJd3s7h 5cQsAsKh"));
  }

  @Test
  public void test_omaha_holdem_1559_3s9cQdQsTs_5c3c4dKs_5d2h9sAd_6d4h3d7d_KhThQh7h_6h4cKc4s() {
    assertEquals(
      "6d4h3d7d 5c3c4dKs 6h4cKc4s 5d2h9sAd KhThQh7h",
      Solver.process("omaha-holdem 3s9cQdQsTs 5c3c4dKs 5d2h9sAd 6d4h3d7d KhThQh7h 6h4cKc4s"));
  }

  @Test
  public void test_omaha_holdem_1560_3c3s6dJcQc_6s5c7c2h_Ah5dTd6h_7d2dKsTc_QhTsQs8h_9dJdKh7s_As9sAcTh_Ad8d3dJs() {
    assertEquals(
      "7d2dKsTc Ah5dTd6h 9dJdKh7s As9sAcTh 6s5c7c2h Ad8d3dJs QhTsQs8h",
      Solver.process("omaha-holdem 3c3s6dJcQc 6s5c7c2h Ah5dTd6h 7d2dKsTc QhTsQs8h 9dJdKh7s As9sAcTh Ad8d3dJs"));
  }

  @Test
  public void test_omaha_holdem_1561_3c3d5h9sKh_QdJd8s7h_Th9c3s2h() {
    assertEquals(
      "QdJd8s7h Th9c3s2h",
      Solver.process("omaha-holdem 3c3d5h9sKh QdJd8s7h Th9c3s2h"));
  }

  @Test
  public void test_omaha_holdem_1562_3s5c8c9c9d_8h6h2c6s_Jh3c7cKd_2s4cKcAd_9s7hQhJs_5dTsQc5h_4dKsTd5s() {
    assertEquals(
      "4dKsTd5s 8h6h2c6s 9s7hQhJs Jh3c7cKd 2s4cKcAd 5dTsQc5h",
      Solver.process("omaha-holdem 3s5c8c9c9d 8h6h2c6s Jh3c7cKd 2s4cKcAd 9s7hQhJs 5dTsQc5h 4dKsTd5s"));
  }

  @Test
  public void test_omaha_holdem_1563_4d5s7d8c8h_6s9sKh7c_TcJd9d4h_3d6c7h2c_2h9hJhTh_TsQd5h5d_QcQh2dQs_3sKc4c8s() {
    assertEquals(
      "2h9hJhTh TcJd9d4h QcQh2dQs 3d6c7h2c 6s9sKh7c TsQd5h5d 3sKc4c8s",
      Solver.process("omaha-holdem 4d5s7d8c8h 6s9sKh7c TcJd9d4h 3d6c7h2c 2h9hJhTh TsQd5h5d QcQh2dQs 3sKc4c8s"));
  }

  @Test
  public void test_omaha_holdem_1564_4s8cJcKcQh_3dAc8d6h_As3hKhTd_2d5c8sTs_2c9cTh4d_4cQc3s5s() {
    assertEquals(
      "2d5c8sTs 3dAc8d6h As3hKhTd 2c9cTh4d 4cQc3s5s",
      Solver.process("omaha-holdem 4s8cJcKcQh 3dAc8d6h As3hKhTd 2d5c8sTs 2c9cTh4d 4cQc3s5s"));
  }

  @Test
  public void test_omaha_holdem_1565_5s8sJsQsTd_7dAc2c4s_Qd4d2h7c() {
    assertEquals(
      "7dAc2c4s Qd4d2h7c",
      Solver.process("omaha-holdem 5s8sJsQsTd 7dAc2c4s Qd4d2h7c"));
  }

  @Test
  public void test_omaha_holdem_1566_AdJcKdKsQh_7c4hTd2c_Kh9s4cAh_8s9d4s6h_4dJsTcJd_3d3hQd6d_Th8c3s8d_2d6cJh9c() {
    assertEquals(
      "8s9d4s6h 7c4hTd2c Th8c3s8d 2d6cJh9c 3d3hQd6d 4dJsTcJd Kh9s4cAh",
      Solver.process("omaha-holdem AdJcKdKsQh 7c4hTd2c Kh9s4cAh 8s9d4s6h 4dJsTcJd 3d3hQd6d Th8c3s8d 2d6cJh9c"));
  }

  @Test
  public void test_omaha_holdem_1567_3h4s5cJcQd_9d2d4d9c_5sAdTcKh_8cKc8dQs() {
    assertEquals(
      "5sAdTcKh 9d2d4d9c 8cKc8dQs",
      Solver.process("omaha-holdem 3h4s5cJcQd 9d2d4d9c 5sAdTcKh 8cKc8dQs"));
  }

  @Test
  public void test_omaha_holdem_1568_6d7s9c9hTh_8h4hQcQh_AdJh8sQd_6s7c9d5s() {
    assertEquals(
      "8h4hQcQh AdJh8sQd 6s7c9d5s",
      Solver.process("omaha-holdem 6d7s9c9hTh 8h4hQcQh AdJh8sQd 6s7c9d5s"));
  }

  @Test
  public void test_omaha_holdem_1569_3d3s4cAdJc_Jh6c3hKh_8s5sQh8c_4s5d4h6d_KsTs6hAh_AcQc5cTh_7s5h7d2c_8dJdJs6s_9d9sTd2s() {
    assertEquals(
      "8s5sQh8c 9d9sTd2s AcQc5cTh KsTs6hAh 7s5h7d2c Jh6c3hKh 4s5d4h6d 8dJdJs6s",
      Solver.process("omaha-holdem 3d3s4cAdJc Jh6c3hKh 8s5sQh8c 4s5d4h6d KsTs6hAh AcQc5cTh 7s5h7d2c 8dJdJs6s 9d9sTd2s"));
  }

  @Test
  public void test_omaha_holdem_1570_3c5d7hJhTh_6dQh4hAc_As3hKsTs_4dKh8h8s_6c6h7dTc_2s3dAhJs_5s3s9hQd() {
    assertEquals(
      "5s3s9hQd As3hKsTs 6c6h7dTc 2s3dAhJs 6dQh4hAc 4dKh8h8s",
      Solver.process("omaha-holdem 3c5d7hJhTh 6dQh4hAc As3hKsTs 4dKh8h8s 6c6h7dTc 2s3dAhJs 5s3s9hQd"));
  }

  @Test
  public void test_omaha_holdem_1571_3c8sAcQcTd_4c7h3h9s_KcJdJc6h_2c7dKd5s() {
    assertEquals(
      "2c7dKd5s 4c7h3h9s KcJdJc6h",
      Solver.process("omaha-holdem 3c8sAcQcTd 4c7h3h9s KcJdJc6h 2c7dKd5s"));
  }

  @Test
  public void test_omaha_holdem_1572_5s7h9hJhTd_3d9s9d5h_2c5cJd5d_4d8h8s7s_4hAd4cKd_6s6d7cTs_2h2s3c6h_3sQhQsJc_AsJsQc7d() {
    assertEquals(
      "4hAd4cKd 3sQhQsJc 6s6d7cTs AsJsQc7d 2c5cJd5d 3d9s9d5h 4d8h8s7s 2h2s3c6h",
      Solver.process("omaha-holdem 5s7h9hJhTd 3d9s9d5h 2c5cJd5d 4d8h8s7s 4hAd4cKd 6s6d7cTs 2h2s3c6h 3sQhQsJc AsJsQc7d"));
  }

  @Test
  public void test_omaha_holdem_1573_6d8d8hJsKs_TcThKhAs_AcQs5cQh_6h8s5d2c() {
    assertEquals(
      "AcQs5cQh TcThKhAs 6h8s5d2c",
      Solver.process("omaha-holdem 6d8d8hJsKs TcThKhAs AcQs5cQh 6h8s5d2c"));
  }

  @Test
  public void test_omaha_holdem_1574_7hJdKdQdTd_3c3sTcQc_Ah2s2dJc_Kc9sJh3d_5d2c5sQh_8d6hAs3h() {
    assertEquals(
      "8d6hAs3h 5d2c5sQh 3c3sTcQc Kc9sJh3d Ah2s2dJc",
      Solver.process("omaha-holdem 7hJdKdQdTd 3c3sTcQc Ah2s2dJc Kc9sJh3d 5d2c5sQh 8d6hAs3h"));
  }

  @Test
  public void test_omaha_holdem_1575_2h9dAsJdQs_9c8h6hQh_3hTsAhAc_Qc6c4s4d_8c6s9h8s_5dTd2c3s_7sKc4cJh() {
    assertEquals(
      "5dTd2c3s 8c6s9h8s 7sKc4cJh Qc6c4s4d 9c8h6hQh 3hTsAhAc",
      Solver.process("omaha-holdem 2h9dAsJdQs 9c8h6hQh 3hTsAhAc Qc6c4s4d 8c6s9h8s 5dTd2c3s 7sKc4cJh"));
  }

  @Test
  public void test_omaha_holdem_1576_3h6cJdQhTh_6dAc5d4s_8h3cTs4h_3s7d2h2c_5sAsKh9c_5c4d3dTd_9h7hJsJc_Jh7cAdQc_8cTc5h4c() {
    assertEquals(
      "3s7d2h2c 6dAc5d4s 8cTc5h4c 5c4d3dTd Jh7cAdQc 5sAsKh9c 8h3cTs4h 9h7hJsJc",
      Solver.process("omaha-holdem 3h6cJdQhTh 6dAc5d4s 8h3cTs4h 3s7d2h2c 5sAsKh9c 5c4d3dTd 9h7hJsJc Jh7cAdQc 8cTc5h4c"));
  }

  @Test
  public void test_omaha_holdem_1577_2c5h9h9sAc_JdKc7h6c_6h8hQhQc_TdAdJc3d_Qs9c7d4c_Th3c8d3h_4dKsJs5d_8s9dQd5s_TsKh3sTc_Jh6d7s5c() {
    assertEquals(
      "JdKc7h6c Th3c8d3h Jh6d7s5c 4dKsJs5d TsKh3sTc 6h8hQhQc TdAdJc3d Qs9c7d4c 8s9dQd5s",
      Solver.process("omaha-holdem 2c5h9h9sAc JdKc7h6c 6h8hQhQc TdAdJc3d Qs9c7d4c Th3c8d3h 4dKsJs5d 8s9dQd5s TsKh3sTc Jh6d7s5c"));
  }

  @Test
  public void test_omaha_holdem_1578_2d8dJcJhTd_Jd9cKsQs_Kd8c3s4c_7s5cQh5s_7hQc5h8h_6sQd2c9h_AhJs2s3d_2h6c6h7d() {
    assertEquals(
      "7s5cQh5s 2h6c6h7d 7hQc5h8h Kd8c3s4c 6sQd2c9h=Jd9cKsQs AhJs2s3d",
      Solver.process("omaha-holdem 2d8dJcJhTd Jd9cKsQs Kd8c3s4c 7s5cQh5s 7hQc5h8h 6sQd2c9h AhJs2s3d 2h6c6h7d"));
  }

  @Test
  public void test_omaha_holdem_1579_2h3c5h6c8h_7dAc3h7h_4hTc9c2c_2sTsAs4d_8s6d5dQc_9dKc7sTh() {
    assertEquals(
      "8s6d5dQc 2sTsAs4d=4hTc9c2c 9dKc7sTh 7dAc3h7h",
      Solver.process("omaha-holdem 2h3c5h6c8h 7dAc3h7h 4hTc9c2c 2sTsAs4d 8s6d5dQc 9dKc7sTh"));
  }

  @Test
  public void test_omaha_holdem_1580_3d7c8sKhKs_JsTsThTd_4c6hJc2d_9h5sQhQs() {
    assertEquals(
      "4c6hJc2d JsTsThTd 9h5sQhQs",
      Solver.process("omaha-holdem 3d7c8sKhKs JsTsThTd 4c6hJc2d 9h5sQhQs"));
  }

  @Test
  public void test_omaha_holdem_1581_4s7d8cKhQc_4c9d9hQh_3s5h9sQs_5cQdJh2s_AsKc2cTc_7sAh5dKd() {
    assertEquals(
      "3s5h9sQs 5cQdJh2s AsKc2cTc 4c9d9hQh 7sAh5dKd",
      Solver.process("omaha-holdem 4s7d8cKhQc 4c9d9hQh 3s5h9sQs 5cQdJh2s AsKc2cTc 7sAh5dKd"));
  }

  @Test
  public void test_omaha_holdem_1582_4d4s6c7sKc_7dTh4h8s_Qh7h9cQc_6h4cQsQd_5c6d5h5s() {
    assertEquals(
      "5c6d5h5s Qh7h9cQc 6h4cQsQd 7dTh4h8s",
      Solver.process("omaha-holdem 4d4s6c7sKc 7dTh4h8s Qh7h9cQc 6h4cQsQd 5c6d5h5s"));
  }

  @Test
  public void test_omaha_holdem_1583_3h5h6dAsQc_6h5c5sAd_7sThQh7h_6s7c2sTs_Qd4c8s3c_6cJd4d2d() {
    assertEquals(
      "6s7c2sTs 7sThQh7h Qd4c8s3c 6h5c5sAd 6cJd4d2d",
      Solver.process("omaha-holdem 3h5h6dAsQc 6h5c5sAd 7sThQh7h 6s7c2sTs Qd4c8s3c 6cJd4d2d"));
  }

  @Test
  public void test_omaha_holdem_1584_6d6s7d8sTd_Qc8d7sKs_Ad8c6c4d_Ah7c9s2c_3d3c3hJh_9hTh5cJc_Kd5dKhKc_9d2hAs4h_3sQs2d2s() {
    assertEquals(
      "9d2hAs4h 3sQs2d2s 3d3c3hJh Qc8d7sKs Ah7c9s2c 9hTh5cJc Kd5dKhKc Ad8c6c4d",
      Solver.process("omaha-holdem 6d6s7d8sTd Qc8d7sKs Ad8c6c4d Ah7c9s2c 3d3c3hJh 9hTh5cJc Kd5dKhKc 9d2hAs4h 3sQs2d2s"));
  }

  @Test
  public void test_omaha_holdem_1585_5s6cJcKcQc_2h5c6dAh_5h2s4cJh_4h2c5dAs_3cKdThTc_2d6s8h7c_Js4s8sAd() {
    assertEquals(
      "4h2c5dAs 2d6s8h7c Js4s8sAd 2h5c6dAh 5h2s4cJh 3cKdThTc",
      Solver.process("omaha-holdem 5s6cJcKcQc 2h5c6dAh 5h2s4cJh 4h2c5dAs 3cKdThTc 2d6s8h7c Js4s8sAd"));
  }

  @Test
  public void test_omaha_holdem_1586_6c8s9cJdQd_5hJcTh3c_4dQcAs9h_2dTs2h2c_Jh7hAd4h_7c4sKh7d() {
    assertEquals(
      "2dTs2h2c 7c4sKh7d Jh7hAd4h 4dQcAs9h 5hJcTh3c",
      Solver.process("omaha-holdem 6c8s9cJdQd 5hJcTh3c 4dQcAs9h 2dTs2h2c Jh7hAd4h 7c4sKh7d"));
  }

  @Test
  public void test_omaha_holdem_1587_3d7dAhJdQd_2h4d9d5c_6d6sTh8c_8d2cQc3c_4sKdKh7s() {
    assertEquals(
      "6d6sTh8c 4sKdKh7s 8d2cQc3c 2h4d9d5c",
      Solver.process("omaha-holdem 3d7dAhJdQd 2h4d9d5c 6d6sTh8c 8d2cQc3c 4sKdKh7s"));
  }

  @Test
  public void test_omaha_holdem_1588_6d9hJdQcQd_4d8h7c8s_5s6s8dJs_2d9c3dJh_6c5c4h7d_KhQs2s8c_Ac3c5dKc_7sKsKd3s_3h2c6h2h() {
    assertEquals(
      "Ac3c5dKc 3h2c6h2h 6c5c4h7d 4d8h7c8s 5s6s8dJs 7sKsKd3s KhQs2s8c 2d9c3dJh",
      Solver.process("omaha-holdem 6d9hJdQcQd 4d8h7c8s 5s6s8dJs 2d9c3dJh 6c5c4h7d KhQs2s8c Ac3c5dKc 7sKsKd3s 3h2c6h2h"));
  }

  @Test
  public void test_omaha_holdem_1589_4c6h7c9cJc_5hJh6c2d_8sJs7s8d_Ts5d2c2s_Qd6d9h2h_Jd9sAsQh_3c4s6sAh_8hQs9dTc() {
    assertEquals(
      "Ts5d2c2s 3c4s6sAh Qd6d9h2h 5hJh6c2d 8sJs7s8d Jd9sAsQh 8hQs9dTc",
      Solver.process("omaha-holdem 4c6h7c9cJc 5hJh6c2d 8sJs7s8d Ts5d2c2s Qd6d9h2h Jd9sAsQh 3c4s6sAh 8hQs9dTc"));
  }

  @Test
  public void test_omaha_holdem_1590_7h7s8sKdQc_6sKs2dTs_2cJs6hAs_5dQs4cTd_Kc3s3d6c_Tc9h4d2h_4s8hKhJc_Qd5s2s3h() {
    assertEquals(
      "Tc9h4d2h 2cJs6hAs Qd5s2s3h 5dQs4cTd Kc3s3d6c 6sKs2dTs 4s8hKhJc",
      Solver.process("omaha-holdem 7h7s8sKdQc 6sKs2dTs 2cJs6hAs 5dQs4cTd Kc3s3d6c Tc9h4d2h 4s8hKhJc Qd5s2s3h"));
  }

  @Test
  public void test_omaha_holdem_1591_2s8d8hAhKs_3h5hQc5c_7c4sAd9c_Qh9s7sJh() {
    assertEquals(
      "Qh9s7sJh 3h5hQc5c 7c4sAd9c",
      Solver.process("omaha-holdem 2s8d8hAhKs 3h5hQc5c 7c4sAd9c Qh9s7sJh"));
  }

  @Test
  public void test_omaha_holdem_1592_3c5cJhJsQd_Qh9d6dAs_Kc2sAdQc_9s7h5h6c_TsQs5s3s_JdTdKhKd_Ac8c4c7c() {
    assertEquals(
      "Ac8c4c7c 9s7h5h6c TsQs5s3s Kc2sAdQc=Qh9d6dAs JdTdKhKd",
      Solver.process("omaha-holdem 3c5cJhJsQd Qh9d6dAs Kc2sAdQc 9s7h5h6c TsQs5s3s JdTdKhKd Ac8c4c7c"));
  }

  @Test
  public void test_omaha_holdem_1593_4c8h9sJsTc_AdKd2cQh_Jh5s7sAs_5hQs5c2d_7d3cTh2s_8d6sKh6h_9h3dQdJd_4h6d6c3h_5d2h9cKs() {
    assertEquals(
      "5hQs5c2d 4h6d6c3h 8d6sKh6h 5d2h9cKs 7d3cTh2s=Jh5s7sAs 9h3dQdJd AdKd2cQh",
      Solver.process("omaha-holdem 4c8h9sJsTc AdKd2cQh Jh5s7sAs 5hQs5c2d 7d3cTh2s 8d6sKh6h 9h3dQdJd 4h6d6c3h 5d2h9cKs"));
  }

  @Test
  public void test_omaha_holdem_1594_2s3c3d8hTs_KsQhKc6c_5c3hJsJh_9c2h4s7s_6s7d6d8d_3s8sJd4d_4cTh6h9s_Qd2dQsQc_Kd5d8cAh() {
    assertEquals(
      "9c2h4s7s 6s7d6d8d Kd5d8cAh 4cTh6h9s Qd2dQsQc KsQhKc6c 5c3hJsJh 3s8sJd4d",
      Solver.process("omaha-holdem 2s3c3d8hTs KsQhKc6c 5c3hJsJh 9c2h4s7s 6s7d6d8d 3s8sJd4d 4cTh6h9s Qd2dQsQc Kd5d8cAh"));
  }

  @Test
  public void test_omaha_holdem_1595_3c3h9hAsJd_Qs3d5sQc_8c2s2cJs_2h8h9s4h_7hAh8d7c_Ad3s5c6s_Ac4c6cJc_QhJh5h9c_9d2d8sTs() {
    assertEquals(
      "2h8h9s4h 9d2d8sTs 8c2s2cJs QhJh5h9c 7hAh8d7c Ac4c6cJc Qs3d5sQc Ad3s5c6s",
      Solver.process("omaha-holdem 3c3h9hAsJd Qs3d5sQc 8c2s2cJs 2h8h9s4h 7hAh8d7c Ad3s5c6s Ac4c6cJc QhJh5h9c 9d2d8sTs"));
  }

  @Test
  public void test_omaha_holdem_1596_7c8cAsQdTd_9c3dTh7d_Kd8dAd5d_9s3h6s7s_Kh6cAcQh_Js9d6h5s_4c2hKc4s_4hJh5h2s() {
    assertEquals(
      "4hJh5h2s 4c2hKc4s 9c3dTh7d Kd8dAd5d Kh6cAcQh 9s3h6s7s Js9d6h5s",
      Solver.process("omaha-holdem 7c8cAsQdTd 9c3dTh7d Kd8dAd5d 9s3h6s7s Kh6cAcQh Js9d6h5s 4c2hKc4s 4hJh5h2s"));
  }

  @Test
  public void test_omaha_holdem_1597_3h5d8h9hQh_AdTc2s5s_3s2d9dAc_7hKhJh4d_Ks3dJdAs_Qc9s7sKc() {
    assertEquals(
      "Ks3dJdAs AdTc2s5s 3s2d9dAc Qc9s7sKc 7hKhJh4d",
      Solver.process("omaha-holdem 3h5d8h9hQh AdTc2s5s 3s2d9dAc 7hKhJh4d Ks3dJdAs Qc9s7sKc"));
  }

  @Test
  public void test_omaha_holdem_1598_2d2h9sAdQd_2s3hKc2c_TcKh8h7h_Kd5cKsJc_QsTd6s8d_Js3s4h5d_9hAcQh3d_9dQc6h8c_7sTs4d6d_3c4cAs8s() {
    assertEquals(
      "Js3s4h5d TcKh8h7h 9dQc6h8c Kd5cKsJc 3c4cAs8s 9hAcQh3d 7sTs4d6d QsTd6s8d 2s3hKc2c",
      Solver.process("omaha-holdem 2d2h9sAdQd 2s3hKc2c TcKh8h7h Kd5cKsJc QsTd6s8d Js3s4h5d 9hAcQh3d 9dQc6h8c 7sTs4d6d 3c4cAs8s"));
  }

  @Test
  public void test_omaha_holdem_1599_2s5sAsJsKd_2d7hKh7c_Ah9h2hJd_5h8d4s7d() {
    assertEquals(
      "5h8d4s7d 2d7hKh7c Ah9h2hJd",
      Solver.process("omaha-holdem 2s5sAsJsKd 2d7hKh7c Ah9h2hJd 5h8d4s7d"));
  }

  @Test
  public void test_omaha_holdem_1600_4d4h9dJsTs_6d3cKdKc_4s3sAs7s_Ks7hJdQd_5cQs8dAh_5d2cAd2s_8c6h3h8s_TdQc6cKh() {
    assertEquals(
      "5d2cAd2s 8c6h3h8s 6d3cKdKc 4s3sAs7s 5cQs8dAh Ks7hJdQd=TdQc6cKh",
      Solver.process("omaha-holdem 4d4h9dJsTs 6d3cKdKc 4s3sAs7s Ks7hJdQd 5cQs8dAh 5d2cAd2s 8c6h3h8s TdQc6cKh"));
  }

  @Test
  public void test_omaha_holdem_1601_2s7c7dKcKd_Ah9c7hJc_9d5s2d6s_6d2hKs4h() {
    assertEquals(
      "9d5s2d6s Ah9c7hJc 6d2hKs4h",
      Solver.process("omaha-holdem 2s7c7dKcKd Ah9c7hJc 9d5s2d6s 6d2hKs4h"));
  }

  @Test
  public void test_omaha_holdem_1602_2c5h6c8s9d_Th9cAc3d_4dQdKh2s_KcQhJcKd_8d2dQs9h_Ah7c3h8c_4sKs6dTc_6hAd3sQc_6s7hJsTs_5s5c8hJd() {
    assertEquals(
      "4dQdKh2s 4sKs6dTc 6hAd3sQc Th9cAc3d KcQhJcKd 8d2dQs9h 5s5c8hJd Ah7c3h8c 6s7hJsTs",
      Solver.process("omaha-holdem 2c5h6c8s9d Th9cAc3d 4dQdKh2s KcQhJcKd 8d2dQs9h Ah7c3h8c 4sKs6dTc 6hAd3sQc 6s7hJsTs 5s5c8hJd"));
  }

  @Test
  public void test_omaha_holdem_1603_4c5d6cJsTh_7dAd9h3d_7cQs3hKh_8c4d8h4h_KsJdKcAc_Tc7h2dQc_4s5cQdTs() {
    assertEquals(
      "Tc7h2dQc KsJdKcAc 4s5cQdTs 8c4d8h4h 7cQs3hKh=7dAd9h3d",
      Solver.process("omaha-holdem 4c5d6cJsTh 7dAd9h3d 7cQs3hKh 8c4d8h4h KsJdKcAc Tc7h2dQc 4s5cQdTs"));
  }

  @Test
  public void test_omaha_holdem_1604_2s3sAdJcKh_5c8d7cQh_8cQs3h7s_3c2h2d4h_7d7hJhAc() {
    assertEquals(
      "5c8d7cQh 8cQs3h7s 7d7hJhAc 3c2h2d4h",
      Solver.process("omaha-holdem 2s3sAdJcKh 5c8d7cQh 8cQs3h7s 3c2h2d4h 7d7hJhAc"));
  }

  @Test
  public void test_omaha_holdem_1605_3c6c7d9hTd_8dTs5d3d_7s2dAh4c_4hJs8c6d() {
    assertEquals(
      "7s2dAh4c 8dTs5d3d 4hJs8c6d",
      Solver.process("omaha-holdem 3c6c7d9hTd 8dTs5d3d 7s2dAh4c 4hJs8c6d"));
  }

  @Test
  public void test_omaha_holdem_1606_4s5cAhQdTd_9cKs6c3h_9s3sKh8d_6s9h3dJc_Ts8c5d8h_2hTh9d7h() {
    assertEquals(
      "6s9h3dJc 9cKs6c3h=9s3sKh8d 2hTh9d7h Ts8c5d8h",
      Solver.process("omaha-holdem 4s5cAhQdTd 9cKs6c3h 9s3sKh8d 6s9h3dJc Ts8c5d8h 2hTh9d7h"));
  }

  @Test
  public void test_omaha_holdem_1607_5d5h7hJsTs_7sQc9c4s_JdTh4d6h() {
    assertEquals(
      "7sQc9c4s JdTh4d6h",
      Solver.process("omaha-holdem 5d5h7hJsTs 7sQc9c4s JdTh4d6h"));
  }

  @Test
  public void test_omaha_holdem_1608_4d6s7sAsKh_Ts2cKd6h_Js8d8cQh() {
    assertEquals(
      "Js8d8cQh Ts2cKd6h",
      Solver.process("omaha-holdem 4d6s7sAsKh Ts2cKd6h Js8d8cQh"));
  }

  @Test
  public void test_omaha_holdem_1609_3c3d9sJcJh_5cAhTc8h_KcQd3hKd_AcAsQs6h_ThTd5sAd_4d9dQc9h() {
    assertEquals(
      "5cAhTc8h ThTd5sAd AcAsQs6h KcQd3hKd 4d9dQc9h",
      Solver.process("omaha-holdem 3c3d9sJcJh 5cAhTc8h KcQd3hKd AcAsQs6h ThTd5sAd 4d9dQc9h"));
  }

  @Test
  public void test_omaha_holdem_1610_3d6hAsKdQh_Qc4c6sJc_8dQs7sJd_2c5c3sKc_5sAc9d9h() {
    assertEquals(
      "8dQs7sJd 5sAc9d9h Qc4c6sJc 2c5c3sKc",
      Solver.process("omaha-holdem 3d6hAsKdQh Qc4c6sJc 8dQs7sJd 2c5c3sKc 5sAc9d9h"));
  }

  @Test
  public void test_omaha_holdem_1611_2s6cJdQcTc_Qs4dJsKd_8c7hAs4h_6h7sAcJh_2d7c4cQd_8sKc8d6s() {
    assertEquals(
      "8c7hAs4h 8sKc8d6s 6h7sAcJh Qs4dJsKd 2d7c4cQd",
      Solver.process("omaha-holdem 2s6cJdQcTc Qs4dJsKd 8c7hAs4h 6h7sAcJh 2d7c4cQd 8sKc8d6s"));
  }

  @Test
  public void test_omaha_holdem_1612_5c6d8dQhTc_5d3c7c4c_6c9c6hTd_7d8s4h8c_4sQs4d3h_2d2cQcAd_Jh3sJsJd_KsKd2sQd_6sAs2h9s_Ah7hJc9h() {
    assertEquals(
      "6sAs2h9s Jh3sJsJd 4sQs4d3h 2d2cQcAd KsKd2sQd 6c9c6hTd 5d3c7c4c=7d8s4h8c Ah7hJc9h",
      Solver.process("omaha-holdem 5c6d8dQhTc 5d3c7c4c 6c9c6hTd 7d8s4h8c 4sQs4d3h 2d2cQcAd Jh3sJsJd KsKd2sQd 6sAs2h9s Ah7hJc9h"));
  }

  @Test
  public void test_omaha_holdem_1613_3d6h8d9cTh_Kd8sQc8c_Ad9d4hKs_6c6d2c9h_As5hQsJh_7cAhJs4c() {
    assertEquals(
      "Ad9d4hKs 6c6d2c9h Kd8sQc8c 7cAhJs4c As5hQsJh",
      Solver.process("omaha-holdem 3d6h8d9cTh Kd8sQc8c Ad9d4hKs 6c6d2c9h As5hQsJh 7cAhJs4c"));
  }

  @Test
  public void test_omaha_holdem_1614_2d4s9hAcTd_Tc5hKh6c_8hJhQs6d_2h7c8sQd_AhKd5s3h_Th5c3cJd_3dQh4d3s() {
    assertEquals(
      "8hJhQs6d 2h7c8sQd 3dQh4d3s Tc5hKh6c AhKd5s3h=Th5c3cJd",
      Solver.process("omaha-holdem 2d4s9hAcTd Tc5hKh6c 8hJhQs6d 2h7c8sQd AhKd5s3h Th5c3cJd 3dQh4d3s"));
  }

  @Test
  public void test_omaha_holdem_1615_4d9hAdKhTs_5s4cTcAs_7hQsQd5h_7d6h3h8c_8dJhJs7c() {
    assertEquals(
      "7d6h3h8c 8dJhJs7c 7hQsQd5h 5s4cTcAs",
      Solver.process("omaha-holdem 4d9hAdKhTs 5s4cTcAs 7hQsQd5h 7d6h3h8c 8dJhJs7c"));
  }

  @Test
  public void test_omaha_holdem_1616_3s4s9cKsQc_7hAd4cAs_JhTcTd5s_6dQh5hQs_5c7d2dAh_4d7c5d7s_9d9sJd2h_8d9h3dAc_4h6h8s6s() {
    assertEquals(
      "5c7d2dAh 4d7c5d7s 7hAd4cAs 8d9h3dAc 9d9sJd2h 6dQh5hQs JhTcTd5s 4h6h8s6s",
      Solver.process("omaha-holdem 3s4s9cKsQc 7hAd4cAs JhTcTd5s 6dQh5hQs 5c7d2dAh 4d7c5d7s 9d9sJd2h 8d9h3dAc 4h6h8s6s"));
  }

  @Test
  public void test_omaha_holdem_1617_3h6h8sAdJh_Ts3s7hAc_7dJd4h4d_6dTd8dKh_KcQsKd6c_7c8cAh9h_2c4s3dQc() {
    assertEquals(
      "2c4s3dQc 7dJd4h4d KcQsKd6c 6dTd8dKh Ts3s7hAc 7c8cAh9h",
      Solver.process("omaha-holdem 3h6h8sAdJh Ts3s7hAc 7dJd4h4d 6dTd8dKh KcQsKd6c 7c8cAh9h 2c4s3dQc"));
  }

  @Test
  public void test_omaha_holdem_1618_2d3h4h7c7d_3cTd2sTs_Qc5h2hJd_Jc4dKc9h_5s8hQh6h_Ks8s4c6s_QsAc6d4s() {
    assertEquals(
      "Qc5h2hJd Jc4dKc9h=Ks8s4c6s QsAc6d4s 3cTd2sTs 5s8hQh6h",
      Solver.process("omaha-holdem 2d3h4h7c7d 3cTd2sTs Qc5h2hJd Jc4dKc9h 5s8hQh6h Ks8s4c6s QsAc6d4s"));
  }

  @Test
  public void test_omaha_holdem_1619_5s6s7d7sJs_2c2hQh9c_6cTc6dAc_Ts9hJd6h() {
    assertEquals(
      "2c2hQh9c Ts9hJd6h 6cTc6dAc",
      Solver.process("omaha-holdem 5s6s7d7sJs 2c2hQh9c 6cTc6dAc Ts9hJd6h"));
  }

  @Test
  public void test_omaha_holdem_1620_4d5c5hJcKd_Th3h5dJh_8h7hAd7s_2hAcKs7c_AhAs4h9d() {
    assertEquals(
      "8h7hAd7s 2hAcKs7c AhAs4h9d Th3h5dJh",
      Solver.process("omaha-holdem 4d5c5hJcKd Th3h5dJh 8h7hAd7s 2hAcKs7c AhAs4h9d"));
  }

  @Test
  public void test_omaha_holdem_1621_8sAhJcQhQs_2dKs3h2h_2c3s6c8c_Js2sJd9s_KdQdJhTs_4h5h7d4c_KhTc7c6s_ThAs5d6h_4d4s3c7h_9cAc5cQc() {
    assertEquals(
      "2dKs3h2h 4d4s3c7h=4h5h7d4c 2c3s6c8c ThAs5d6h KhTc7c6s Js2sJd9s KdQdJhTs 9cAc5cQc",
      Solver.process("omaha-holdem 8sAhJcQhQs 2dKs3h2h 2c3s6c8c Js2sJd9s KdQdJhTs 4h5h7d4c KhTc7c6s ThAs5d6h 4d4s3c7h 9cAc5cQc"));
  }

  @Test
  public void test_omaha_holdem_1622_3s5s6d8cTc_4d6sTd6h_3c5c4h2c_7dTsAd6c_9h5dJh8d_4s5h7hKd_2sQd8s4c_Jd7c8hJs_KcThKh7s_KsJcQsAc() {
    assertEquals(
      "KsJcQsAc Jd7c8hJs KcThKh7s 9h5dJh8d 7dTsAd6c 4d6sTd6h 2sQd8s4c=3c5c4h2c 4s5h7hKd",
      Solver.process("omaha-holdem 3s5s6d8cTc 4d6sTd6h 3c5c4h2c 7dTsAd6c 9h5dJh8d 4s5h7hKd 2sQd8s4c Jd7c8hJs KcThKh7s KsJcQsAc"));
  }

  @Test
  public void test_omaha_holdem_1623_2d4h9hAdJs_4dKh8c5c_KsTsAcTh_4s9c5dQc() {
    assertEquals(
      "4dKh8c5c KsTsAcTh 4s9c5dQc",
      Solver.process("omaha-holdem 2d4h9hAdJs 4dKh8c5c KsTsAcTh 4s9c5dQc"));
  }

  @Test
  public void test_omaha_holdem_1624_5s6h9dJhJs_KcKd6s7c_2hAd8sKs() {
    assertEquals(
      "2hAd8sKs KcKd6s7c",
      Solver.process("omaha-holdem 5s6h9dJhJs KcKd6s7c 2hAd8sKs"));
  }

  @Test
  public void test_omaha_holdem_1625_3h6s9d9sJc_5d4d9h8s_8cQc8dQh_2h7sTc3c_2c8h7cKd_AcKcQsTh() {
    assertEquals(
      "2c8h7cKd AcKcQsTh 2h7sTc3c 8cQc8dQh 5d4d9h8s",
      Solver.process("omaha-holdem 3h6s9d9sJc 5d4d9h8s 8cQc8dQh 2h7sTc3c 2c8h7cKd AcKcQsTh"));
  }

  @Test
  public void test_omaha_holdem_1626_3h4s5s6d8d_9sAs2cAh_TsQh7cKc_8c8h2hTh_3dQd4c5h_Kd9hKhQc_6cTcAd7h_7s9d5c7d_6sTdKs3c_3s2dJdAc() {
    assertEquals(
      "TsQh7cKc Kd9hKhQc 3dQd4c5h 6sTdKs3c 8c8h2hTh 9sAs2cAh 3s2dJdAc 6cTcAd7h 7s9d5c7d",
      Solver.process("omaha-holdem 3h4s5s6d8d 9sAs2cAh TsQh7cKc 8c8h2hTh 3dQd4c5h Kd9hKhQc 6cTcAd7h 7s9d5c7d 6sTdKs3c 3s2dJdAc"));
  }

  @Test
  public void test_omaha_holdem_1627_3s4d6c6d8s_2c7cAs5d_4h5c9h8d_2hJcJh9c_Ks9d7hJs_5h8h9sJd_Ah8c6hTd_Tc3dTh5s_Qd2dQcTs() {
    assertEquals(
      "Ks9d7hJs 4h5c9h8d 5h8h9sJd Tc3dTh5s 2hJcJh9c Qd2dQcTs 2c7cAs5d Ah8c6hTd",
      Solver.process("omaha-holdem 3s4d6c6d8s 2c7cAs5d 4h5c9h8d 2hJcJh9c Ks9d7hJs 5h8h9sJd Ah8c6hTd Tc3dTh5s Qd2dQcTs"));
  }

  @Test
  public void test_omaha_holdem_1628_2h5h8cJdTs_7d3h5d4h_3cAhAdTc_Jh2dQh8d_5c9cKcKd_6s9d7s3d_Ac8h3s7h_Js2cTh7c() {
    assertEquals(
      "7d3h5d4h Ac8h3s7h 5c9cKcKd 3cAhAdTc Jh2dQh8d Js2cTh7c 6s9d7s3d",
      Solver.process("omaha-holdem 2h5h8cJdTs 7d3h5d4h 3cAhAdTc Jh2dQh8d 5c9cKcKd 6s9d7s3d Ac8h3s7h Js2cTh7c"));
  }

  @Test
  public void test_omaha_holdem_1629_2c2h7cQdQh_Tc9hKc5c_6c6d8c6s_7sJc5h2s_AdTd9c4s_AhKd2d4h_9d4cAc8s_6h3dQs7d_Ks3s8dJh_7hAs3cJd() {
    assertEquals(
      "Tc9hKc5c Ks3s8dJh 9d4cAc8s AdTd9c4s 6c6d8c6s 7hAs3cJd AhKd2d4h 7sJc5h2s 6h3dQs7d",
      Solver.process("omaha-holdem 2c2h7cQdQh Tc9hKc5c 6c6d8c6s 7sJc5h2s AdTd9c4s AhKd2d4h 9d4cAc8s 6h3dQs7d Ks3s8dJh 7hAs3cJd"));
  }

  @Test
  public void test_omaha_holdem_1630_2h2s5c5hTs_AdJsAc8s_Qd9d6sQh_3sTdThKh_KsQcTc5d_7sAs4s8c() {
    assertEquals(
      "7sAs4s8c Qd9d6sQh AdJsAc8s KsQcTc5d 3sTdThKh",
      Solver.process("omaha-holdem 2h2s5c5hTs AdJsAc8s Qd9d6sQh 3sTdThKh KsQcTc5d 7sAs4s8c"));
  }

  @Test
  public void test_omaha_holdem_1631_2s3s4c4s6d_8s6c9c7d_6s4hQcAh() {
    assertEquals(
      "8s6c9c7d 6s4hQcAh",
      Solver.process("omaha-holdem 2s3s4c4s6d 8s6c9c7d 6s4hQcAh"));
  }

  @Test
  public void test_omaha_holdem_1632_3s8s9d9hQc_Kh6sJcAc_KcJs4sKs_5hQh8hAh() {
    assertEquals(
      "Kh6sJcAc 5hQh8hAh KcJs4sKs",
      Solver.process("omaha-holdem 3s8s9d9hQc Kh6sJcAc KcJs4sKs 5hQh8hAh"));
  }

  @Test
  public void test_omaha_holdem_1633_5s7h8dKhQs_2sTs6sJc_4sQh3d2h_AcQdJdKc_5c4hTd9c_Qc2d8cKd_7dAs9d7c_5d5hAd2c_6d9h9s4c() {
    assertEquals(
      "2sTs6sJc 5c4hTd9c 4sQh3d2h AcQdJdKc=Qc2d8cKd 5d5hAd2c 7dAs9d7c 6d9h9s4c",
      Solver.process("omaha-holdem 5s7h8dKhQs 2sTs6sJc 4sQh3d2h AcQdJdKc 5c4hTd9c Qc2d8cKd 7dAs9d7c 5d5hAd2c 6d9h9s4c"));
  }

  @Test
  public void test_omaha_holdem_1634_4s5c6s8c8d_2c6c5d7c_3sAdAcJs() {
    assertEquals(
      "3sAdAcJs 2c6c5d7c",
      Solver.process("omaha-holdem 4s5c6s8c8d 2c6c5d7c 3sAdAcJs"));
  }

  @Test
  public void test_omaha_holdem_1635_3s6s7h7sTh_Qh2hJdJh_Kc2dQd6d_8s8cAs5c_7c6cKs5s_5hTd4dJc_4cAcAdKh_3d9c9d2c() {
    assertEquals(
      "Kc2dQd6d 3d9c9d2c Qh2hJdJh 4cAcAdKh 5hTd4dJc 8s8cAs5c 7c6cKs5s",
      Solver.process("omaha-holdem 3s6s7h7sTh Qh2hJdJh Kc2dQd6d 8s8cAs5c 7c6cKs5s 5hTd4dJc 4cAcAdKh 3d9c9d2c"));
  }

  @Test
  public void test_omaha_holdem_1636_2c4s6hJsTs_Jd8cKh3c_Qc6s2s7d_Jc3s6cJh_4h8h9d9s_KsQs5s9c() {
    assertEquals(
      "4h8h9d9s Jd8cKh3c Jc3s6cJh Qc6s2s7d KsQs5s9c",
      Solver.process("omaha-holdem 2c4s6hJsTs Jd8cKh3c Qc6s2s7d Jc3s6cJh 4h8h9d9s KsQs5s9c"));
  }

  @Test
  public void test_omaha_holdem_1637_3s6s9hKcTs_3dJh4h9d_7h6c8cKd_Jd5cTh2c_6h2hKh8h_Ks3h5d6d_4cQc7sQs() {
    assertEquals(
      "Jd5cTh2c 3dJh4h9d 6h2hKh8h=Ks3h5d6d 7h6c8cKd 4cQc7sQs",
      Solver.process("omaha-holdem 3s6s9hKcTs 3dJh4h9d 7h6c8cKd Jd5cTh2c 6h2hKh8h Ks3h5d6d 4cQc7sQs"));
  }

  @Test
  public void test_omaha_holdem_1638_5s7sAcKhTc_JhKdTd4c_8cQs4h6h_Th8sJc5d_3h6dQc6c_Jd2h3d9h() {
    assertEquals(
      "Jd2h3d9h 8cQs4h6h 3h6dQc6c Th8sJc5d JhKdTd4c",
      Solver.process("omaha-holdem 5s7sAcKhTc JhKdTd4c 8cQs4h6h Th8sJc5d 3h6dQc6c Jd2h3d9h"));
  }

  @Test
  public void test_omaha_holdem_1639_4s7h8sQhTh_Ad3h5dQs_2c7d5c9d_5hTc6c9h_Ts2h6dJc_4h3dJdAs() {
    assertEquals(
      "4h3dJdAs 2c7d5c9d Ts2h6dJc Ad3h5dQs 5hTc6c9h",
      Solver.process("omaha-holdem 4s7h8sQhTh Ad3h5dQs 2c7d5c9d 5hTc6c9h Ts2h6dJc 4h3dJdAs"));
  }

  @Test
  public void test_omaha_holdem_1640_2c2s5hAsJc_3hKsJh9s_6d3c3sQd_Td6s9d5d_Kc8hAdQh() {
    assertEquals(
      "6d3c3sQd Td6s9d5d 3hKsJh9s Kc8hAdQh",
      Solver.process("omaha-holdem 2c2s5hAsJc 3hKsJh9s 6d3c3sQd Td6s9d5d Kc8hAdQh"));
  }

  @Test
  public void test_omaha_holdem_1641_3s7dAcAdKh_3c8d2d8s_7cJc9dTc() {
    assertEquals(
      "7cJc9dTc 3c8d2d8s",
      Solver.process("omaha-holdem 3s7dAcAdKh 3c8d2d8s 7cJc9dTc"));
  }

  @Test
  public void test_omaha_holdem_1642_3c3h5h7s9c_5s9d6sKs_Qh5d4cQd_4sAdJh9h_4h2hTc9s_8dJc7h8h_2sTd5c8s() {
    assertEquals(
      "2sTd5c8s 8dJc7h8h 4h2hTc9s 4sAdJh9h 5s9d6sKs Qh5d4cQd",
      Solver.process("omaha-holdem 3c3h5h7s9c 5s9d6sKs Qh5d4cQd 4sAdJh9h 4h2hTc9s 8dJc7h8h 2sTd5c8s"));
  }

  @Test
  public void test_omaha_holdem_1643_2c5c5hAsJd_Qd4h8hAc_Th3dKh9c_6h4s5d9s_Js7cTs3c_6cKc6sJc_3sTd9d2s_7h7sQhQs() {
    assertEquals(
      "Th3dKh9c 3sTd9d2s Js7cTs3c 6cKc6sJc 7h7sQhQs Qd4h8hAc 6h4s5d9s",
      Solver.process("omaha-holdem 2c5c5hAsJd Qd4h8hAc Th3dKh9c 6h4s5d9s Js7cTs3c 6cKc6sJc 3sTd9d2s 7h7sQhQs"));
  }

  @Test
  public void test_omaha_holdem_1644_5c6c8c8s9c_5s4cJdTd_2h9sJs7s_9hJc4d6s_As5dQcTs() {
    assertEquals(
      "5s4cJdTd As5dQcTs 9hJc4d6s 2h9sJs7s",
      Solver.process("omaha-holdem 5c6c8c8s9c 5s4cJdTd 2h9sJs7s 9hJc4d6s As5dQcTs"));
  }

  @Test
  public void test_omaha_holdem_1645_7c7h9cAdTc_TdJh2s6s_3s6c4h4d_8hJd3h9s_Kc5hJsQh_5c7sAs9h() {
    assertEquals(
      "Kc5hJsQh 3s6c4h4d TdJh2s6s 8hJd3h9s 5c7sAs9h",
      Solver.process("omaha-holdem 7c7h9cAdTc TdJh2s6s 3s6c4h4d 8hJd3h9s Kc5hJsQh 5c7sAs9h"));
  }

  @Test
  public void test_omaha_holdem_1646_3h4d6d9c9s_Kc2h8dAs_8s9d2cJs_AdKs8hTh_5s4c5hAc_Jc2s5c6c_5dTc8cTs_TdJd3sKh_6hJhQd9h_Qc7dQsQh() {
    assertEquals(
      "AdKs8hTh=Kc2h8dAs TdJd3sKh 5s4c5hAc 5dTc8cTs Qc7dQsQh 8s9d2cJs Jc2s5c6c 6hJhQd9h",
      Solver.process("omaha-holdem 3h4d6d9c9s Kc2h8dAs 8s9d2cJs AdKs8hTh 5s4c5hAc Jc2s5c6c 5dTc8cTs TdJd3sKh 6hJhQd9h Qc7dQsQh"));
  }

  @Test
  public void test_omaha_holdem_1647_2d5hJdJsKc_Jh4s6s2s_3cQsAc6c_8sQh3d7c_9c6hTdTs_4h2hKh8d_5d4d2c5s() {
    assertEquals(
      "8sQh3d7c 3cQsAc6c 9c6hTdTs 4h2hKh8d 5d4d2c5s Jh4s6s2s",
      Solver.process("omaha-holdem 2d5hJdJsKc Jh4s6s2s 3cQsAc6c 8sQh3d7c 9c6hTdTs 4h2hKh8d 5d4d2c5s"));
  }

  @Test
  public void test_omaha_holdem_1648_5c5d7sJsKc_6c7hQsAc_9c9h9sTd_JhKh6s3s_8dQd4h3h_TsKd3d5s_9d2sQhTc_2dTh8cKs_AsAd7c8h_Qc7dAh5h() {
    assertEquals(
      "8dQd4h3h 9d2sQhTc 6c7hQsAc 9c9h9sTd 2dTh8cKs JhKh6s3s AsAd7c8h Qc7dAh5h TsKd3d5s",
      Solver.process("omaha-holdem 5c5d7sJsKc 6c7hQsAc 9c9h9sTd JhKh6s3s 8dQd4h3h TsKd3d5s 9d2sQhTc 2dTh8cKs AsAd7c8h Qc7dAh5h"));
  }

  @Test
  public void test_omaha_holdem_1649_2d5h7h9cAd_3cKh3s5c_Qh5dQdJc() {
    assertEquals(
      "3cKh3s5c Qh5dQdJc",
      Solver.process("omaha-holdem 2d5h7h9cAd 3cKh3s5c Qh5dQdJc"));
  }

  @Test
  public void test_omaha_holdem_1650_2c4h7d7s9d_KdKs8s8c_7c6c5cJc_AhTs9c2d_AcJd2hTc_5d8h9sTd_5sQsJh6h() {
    assertEquals(
      "5sQsJh6h AcJd2hTc 5d8h9sTd AhTs9c2d KdKs8s8c 7c6c5cJc",
      Solver.process("omaha-holdem 2c4h7d7s9d KdKs8s8c 7c6c5cJc AhTs9c2d AcJd2hTc 5d8h9sTd 5sQsJh6h"));
  }

  @Test
  public void test_omaha_holdem_1651_5d5hJsKcTd_8cTh4h8s_Ks4c9dQs_4d2hAc5c_6c8dQc7h_Kh2d9c7c_9hKdAd6s_4sQhAh2c() {
    assertEquals(
      "6c8dQc7h 8cTh4h8s Kh2d9c7c 9hKdAd6s 4d2hAc5c Ks4c9dQs 4sQhAh2c",
      Solver.process("omaha-holdem 5d5hJsKcTd 8cTh4h8s Ks4c9dQs 4d2hAc5c 6c8dQc7h Kh2d9c7c 9hKdAd6s 4sQhAh2c"));
  }

  @Test
  public void test_omaha_holdem_1652_2d3d8cQsTd_6d6c2h2c_8h9c4c2s_9s4dKsTh_JsJd8dQd_3h4h9dKc_5h7hTsQh_Ad5sJc9h() {
    assertEquals(
      "3h4h9dKc 9s4dKsTh 8h9c4c2s 5h7hTsQh 6d6c2h2c Ad5sJc9h JsJd8dQd",
      Solver.process("omaha-holdem 2d3d8cQsTd 6d6c2h2c 8h9c4c2s 9s4dKsTh JsJd8dQd 3h4h9dKc 5h7hTsQh Ad5sJc9h"));
  }

  @Test
  public void test_omaha_holdem_1653_3s4h7cAdTd_5sKhJh2c_Tc6sQsKs_5hKd8s4s_5c7d4c8d_2d8c9s6d_QdJsJcQh() {
    assertEquals(
      "2d8c9s6d 5hKd8s4s Tc6sQsKs QdJsJcQh 5c7d4c8d 5sKhJh2c",
      Solver.process("omaha-holdem 3s4h7cAdTd 5sKhJh2c Tc6sQsKs 5hKd8s4s 5c7d4c8d 2d8c9s6d QdJsJcQh"));
  }

  @Test
  public void test_omaha_holdem_1654_2c6d7h7sAs_7cKd4d3s_2hTcQsJd() {
    assertEquals(
      "2hTcQsJd 7cKd4d3s",
      Solver.process("omaha-holdem 2c6d7h7sAs 7cKd4d3s 2hTcQsJd"));
  }

  @Test
  public void test_omaha_holdem_1655_4c6c7sKdKh_8cJd5dQd_JsQh3sTc_Qs9d8s2c_JhAsAc7h_Th9hAdTs_3d4h6hQc_6s5cTd8h() {
    assertEquals(
      "Qs9d8s2c JsQh3sTc 3d4h6hQc Th9hAdTs JhAsAc7h 6s5cTd8h=8cJd5dQd",
      Solver.process("omaha-holdem 4c6c7sKdKh 8cJd5dQd JsQh3sTc Qs9d8s2c JhAsAc7h Th9hAdTs 3d4h6hQc 6s5cTd8h"));
  }

  @Test
  public void test_omaha_holdem_1656_2s9c9hQdTs_Ah5d8cKs_KhJhJs9d() {
    assertEquals(
      "Ah5d8cKs KhJhJs9d",
      Solver.process("omaha-holdem 2s9c9hQdTs Ah5d8cKs KhJhJs9d"));
  }

  @Test
  public void test_omaha_holdem_1657_3h7d9cKsTs_5hQd6h8s_KhJdQs8c_8h5dTh2d() {
    assertEquals(
      "8h5dTh2d 5hQd6h8s KhJdQs8c",
      Solver.process("omaha-holdem 3h7d9cKsTs 5hQd6h8s KhJdQs8c 8h5dTh2d"));
  }

  @Test
  public void test_omaha_holdem_1658_2h6s8dAcTd_Qh9h4cKd_8c7cQsAh_7sJcQc7d_5sTsThJd_Qd9dKs9s_6c3d4hKc_2s6d6h5c_Js4s4d5h() {
    assertEquals(
      "Qh9h4cKd Js4s4d5h 6c3d4hKc 7sJcQc7d Qd9dKs9s 8c7cQsAh 2s6d6h5c 5sTsThJd",
      Solver.process("omaha-holdem 2h6s8dAcTd Qh9h4cKd 8c7cQsAh 7sJcQc7d 5sTsThJd Qd9dKs9s 6c3d4hKc 2s6d6h5c Js4s4d5h"));
  }

  @Test
  public void test_omaha_holdem_1659_3d4d4s7hQh_Qs9d7cJs_6s7s6d5h_3h6h9hKc_5s8cJh9s_8h2dKs4c_4hAcQcAh() {
    assertEquals(
      "5s8cJh9s 3h6h9hKc Qs9d7cJs 8h2dKs4c 6s7s6d5h 4hAcQcAh",
      Solver.process("omaha-holdem 3d4d4s7hQh Qs9d7cJs 6s7s6d5h 3h6h9hKc 5s8cJh9s 8h2dKs4c 4hAcQcAh"));
  }

  @Test
  public void test_omaha_holdem_1660_2d5d5s6dAh_6cJd5c2s_Qd3h7h8c_9sAdAc8s_3cKh5h9d_9cTh2c4d_9hAsJs8h_Qh7s4cQs_3sKcTdTs() {
    assertEquals(
      "Qd3h7h8c 9cTh2c4d 3sKcTdTs Qh7s4cQs 9hAsJs8h 3cKh5h9d 6cJd5c2s 9sAdAc8s",
      Solver.process("omaha-holdem 2d5d5s6dAh 6cJd5c2s Qd3h7h8c 9sAdAc8s 3cKh5h9d 9cTh2c4d 9hAsJs8h Qh7s4cQs 3sKcTdTs"));
  }

  @Test
  public void test_omaha_holdem_1661_4d7sKdQcTh_JhJd6dKc_9h9c5h5c_3c8s5d8h_Jc3dKh7h_4cAsQh6s() {
    assertEquals(
      "3c8s5d8h 9h9c5h5c JhJd6dKc 4cAsQh6s Jc3dKh7h",
      Solver.process("omaha-holdem 4d7sKdQcTh JhJd6dKc 9h9c5h5c 3c8s5d8h Jc3dKh7h 4cAsQh6s"));
  }

  @Test
  public void test_omaha_holdem_1662_3d3s7c9c9d_AcKc6hAd_6sQd9h6c_8d6d8cAh_5c2sKdJc_2h2dJsTc_Qc8sTdQs_4hJhJdAs_5h9s5sKh_4c3cTh2c() {
    assertEquals(
      "5c2sKdJc 2h2dJsTc 8d6d8cAh 4hJhJdAs Qc8sTdQs AcKc6hAd 4c3cTh2c 6sQd9h6c 5h9s5sKh",
      Solver.process("omaha-holdem 3d3s7c9c9d AcKc6hAd 6sQd9h6c 8d6d8cAh 5c2sKdJc 2h2dJsTc Qc8sTdQs 4hJhJdAs 5h9s5sKh 4c3cTh2c"));
  }

  @Test
  public void test_omaha_holdem_1663_4d5c6h6sKs_Kc9sAd2d_9dAcJs5d_Jd7h4s5s_AhQhTs8d_9c4hTd7c_Qc6d4c9h_8cKhKd3d_8hTc3s2h() {
    assertEquals(
      "AhQhTs8d 9c4hTd7c Jd7h4s5s 9dAcJs5d Kc9sAd2d 8hTc3s2h Qc6d4c9h 8cKhKd3d",
      Solver.process("omaha-holdem 4d5c6h6sKs Kc9sAd2d 9dAcJs5d Jd7h4s5s AhQhTs8d 9c4hTd7c Qc6d4c9h 8cKhKd3d 8hTc3s2h"));
  }

  @Test
  public void test_omaha_holdem_1664_2h3d8d9h9s_3s4cQhQc_Qs3hTs7s_4hJcTh7c() {
    assertEquals(
      "4hJcTh7c Qs3hTs7s 3s4cQhQc",
      Solver.process("omaha-holdem 2h3d8d9h9s 3s4cQhQc Qs3hTs7s 4hJcTh7c"));
  }

  @Test
  public void test_omaha_holdem_1665_3c4c7hAhJc_AdQc9hKh_JsKd8h6c_4d8dTh5c() {
    assertEquals(
      "4d8dTh5c JsKd8h6c AdQc9hKh",
      Solver.process("omaha-holdem 3c4c7hAhJc AdQc9hKh JsKd8h6c 4d8dTh5c"));
  }

  @Test
  public void test_omaha_holdem_1666_2c3s4d5hQd_3d7dTh8s_9d5cTs5d_KdKc3hTd_QcJhAs8d_Ad4s3c7c_Kh4c9hQs_6sAc7sAh_Qh8cKs5s_2s7hTc9c() {
    assertEquals(
      "2s7hTc9c 3d7dTh8s QcJhAs8d KdKc3hTd Kh4c9hQs Qh8cKs5s 9d5cTs5d Ad4s3c7c 6sAc7sAh",
      Solver.process("omaha-holdem 2c3s4d5hQd 3d7dTh8s 9d5cTs5d KdKc3hTd QcJhAs8d Ad4s3c7c Kh4c9hQs 6sAc7sAh Qh8cKs5s 2s7hTc9c"));
  }

  @Test
  public void test_omaha_holdem_1667_7d8s9dKsTs_6s5s9hAs_8h3s5cJc_KhQdTd6c() {
    assertEquals(
      "KhQdTd6c 8h3s5cJc 6s5s9hAs",
      Solver.process("omaha-holdem 7d8s9dKsTs 6s5s9hAs 8h3s5cJc KhQdTd6c"));
  }

  @Test
  public void test_omaha_holdem_1668_4d9c9dJcTc_3s7d8cQh_3dKhAs2s_KsQc9hJd_7h7s5hJs_Qs8hAdTs_2c5sThKc_7c6c9s3c() {
    assertEquals(
      "3dKhAs2s 7h7s5hJs 3s7d8cQh=Qs8hAdTs 7c6c9s3c 2c5sThKc KsQc9hJd",
      Solver.process("omaha-holdem 4d9c9dJcTc 3s7d8cQh 3dKhAs2s KsQc9hJd 7h7s5hJs Qs8hAdTs 2c5sThKc 7c6c9s3c"));
  }

  @Test
  public void test_omaha_holdem_1669_3h4d4h8cTd_JdJh3d6h_8s8hQhQs_9h7h2c5s_7s8dAdKs_Js4c6dQd_2s6s2h3s_Th5c4sAs() {
    assertEquals(
      "9h7h2c5s 2s6s2h3s 7s8dAdKs JdJh3d6h Js4c6dQd Th5c4sAs 8s8hQhQs",
      Solver.process("omaha-holdem 3h4d4h8cTd JdJh3d6h 8s8hQhQs 9h7h2c5s 7s8dAdKs Js4c6dQd 2s6s2h3s Th5c4sAs"));
  }

  @Test
  public void test_omaha_holdem_1670_2c9sAsJcJd_2sJs3sJh_KhTs9hKs_5hTh7sAd() {
    assertEquals(
      "KhTs9hKs 5hTh7sAd 2sJs3sJh",
      Solver.process("omaha-holdem 2c9sAsJcJd 2sJs3sJh KhTs9hKs 5hTh7sAd"));
  }

  @Test
  public void test_omaha_holdem_1671_2d6hJcKhKs_4s9s3hQd_3cTh2h8c_7d3d4hTc() {
    assertEquals(
      "7d3d4hTc 4s9s3hQd 3cTh2h8c",
      Solver.process("omaha-holdem 2d6hJcKhKs 4s9s3hQd 3cTh2h8c 7d3d4hTc"));
  }

  @Test
  public void test_omaha_holdem_1672_5s7c9sKcTd_9c9d7s2d_8d2c3s4s_9h2hQd8h() {
    assertEquals(
      "8d2c3s4s 9h2hQd8h 9c9d7s2d",
      Solver.process("omaha-holdem 5s7c9sKcTd 9c9d7s2d 8d2c3s4s 9h2hQd8h"));
  }

  @Test
  public void test_omaha_holdem_1673_2c4d5cKhQh_8c3hKs7c_4c2d2h8d() {
    assertEquals(
      "8c3hKs7c 4c2d2h8d",
      Solver.process("omaha-holdem 2c4d5cKhQh 8c3hKs7c 4c2d2h8d"));
  }

  @Test
  public void test_omaha_holdem_1674_3d4h8hAhTc_As7d9s4s_Qh5c6h2c_JcJhJsTd() {
    assertEquals(
      "JcJhJsTd As7d9s4s Qh5c6h2c",
      Solver.process("omaha-holdem 3d4h8hAhTc As7d9s4s Qh5c6h2c JcJhJsTd"));
  }

  @Test
  public void test_omaha_holdem_1675_7d7s8d9cQc_Ad6c2dTd_Jh5s7cQs_AcQh5c7h() {
    assertEquals(
      "Ad6c2dTd AcQh5c7h=Jh5s7cQs",
      Solver.process("omaha-holdem 7d7s8d9cQc Ad6c2dTd Jh5s7cQs AcQh5c7h"));
  }

  @Test
  public void test_omaha_holdem_1676_3c7c7sJsTs_5sTh2c5d_KdKc4h9c() {
    assertEquals(
      "5sTh2c5d KdKc4h9c",
      Solver.process("omaha-holdem 3c7c7sJsTs 5sTh2c5d KdKc4h9c"));
  }

  @Test
  public void test_omaha_holdem_1677_3h6s9dAsJd_7s6c5sAd_Js2dTs9c_6h3d4s2s_Tc8dTd2h_QsQhJcKd_Th6dQc4c_Ac8c8sKs() {
    assertEquals(
      "Th6dQc4c Tc8dTd2h QsQhJcKd Ac8c8sKs 6h3d4s2s Js2dTs9c 7s6c5sAd",
      Solver.process("omaha-holdem 3h6s9dAsJd 7s6c5sAd Js2dTs9c 6h3d4s2s Tc8dTd2h QsQhJcKd Th6dQc4c Ac8c8sKs"));
  }

  @Test
  public void test_omaha_holdem_1678_3c8sAcKsTd_JdTh2dQs_6s5cAh7d() {
    assertEquals(
      "6s5cAh7d JdTh2dQs",
      Solver.process("omaha-holdem 3c8sAcKsTd JdTh2dQs 6s5cAh7d"));
  }

  @Test
  public void test_omaha_holdem_1679_2d3c6c6sQd_7c3dJh4d_2c5sTs5c_JdThTdAh_5d9d4c9s_JsJc9h3s_QsAc6d5h_AdAs2h3h() {
    assertEquals(
      "7c3dJh4d 2c5sTs5c JdThTdAh JsJc9h3s AdAs2h3h 5d9d4c9s QsAc6d5h",
      Solver.process("omaha-holdem 2d3c6c6sQd 7c3dJh4d 2c5sTs5c JdThTdAh 5d9d4c9s JsJc9h3s QsAc6d5h AdAs2h3h"));
  }

  @Test
  public void test_omaha_holdem_1680_7h8d9dJdJs_2d3h5sTc_Td4h6c3c_KhTs3d4d_7sKcTh5h_2c7dQc6s_8h5cKs4s_8cJc6h9h() {
    assertEquals(
      "2d3h5sTc 2c7dQc6s 8h5cKs4s Td4h6c3c 7sKcTh5h KhTs3d4d 8cJc6h9h",
      Solver.process("omaha-holdem 7h8d9dJdJs 2d3h5sTc Td4h6c3c KhTs3d4d 7sKcTh5h 2c7dQc6s 8h5cKs4s 8cJc6h9h"));
  }

  @Test
  public void test_omaha_holdem_1681_2c3s5d6c8c_3d3hTh4h_TcKc9s7s_Ks2sTs3c_9d6sJh9h_Qh4s4d6h_2h6d5hAc_JcKh5cAs_5sTd8d7c() {
    assertEquals(
      "9d6sJh9h Ks2sTs3c 2h6d5hAc 5sTd8d7c 3d3hTh4h=Qh4s4d6h JcKh5cAs TcKc9s7s",
      Solver.process("omaha-holdem 2c3s5d6c8c 3d3hTh4h TcKc9s7s Ks2sTs3c 9d6sJh9h Qh4s4d6h 2h6d5hAc JcKh5cAs 5sTd8d7c"));
  }

  @Test
  public void test_omaha_holdem_1682_2c2d3cAsQh_Jc4c7sJh_3s8dTs8s() {
    assertEquals(
      "3s8dTs8s Jc4c7sJh",
      Solver.process("omaha-holdem 2c2d3cAsQh Jc4c7sJh 3s8dTs8s"));
  }

  @Test
  public void test_omaha_holdem_1683_3c3d7c8dTh_2s8cTc3s_3hTsKd7h() {
    assertEquals(
      "2s8cTc3s=3hTsKd7h",
      Solver.process("omaha-holdem 3c3d7c8dTh 2s8cTc3s 3hTsKd7h"));
  }

  @Test
  public void test_omaha_holdem_1684_2c5d9cAhQh_7c3h2sQs_9s8hKcKd_5cAs8dAc_8c4hJsJc_6s3sKh4d_2h8s9hTh_Ks9dTc4c_Jh2d4s3d() {
    assertEquals(
      "Ks9dTc4c 8c4hJsJc 9s8hKcKd 2h8s9hTh 7c3h2sQs 5cAs8dAc 6s3sKh4d=Jh2d4s3d",
      Solver.process("omaha-holdem 2c5d9cAhQh 7c3h2sQs 9s8hKcKd 5cAs8dAc 8c4hJsJc 6s3sKh4d 2h8s9hTh Ks9dTc4c Jh2d4s3d"));
  }

  @Test
  public void test_omaha_holdem_1685_2d5c6h8sJd_8h9s7h3c_Kc4h4c2s_6dJcKsAs_Qd7sJhJs() {
    assertEquals(
      "Kc4h4c2s 6dJcKsAs Qd7sJhJs 8h9s7h3c",
      Solver.process("omaha-holdem 2d5c6h8sJd 8h9s7h3c Kc4h4c2s 6dJcKsAs Qd7sJhJs"));
  }

  @Test
  public void test_omaha_holdem_1686_3h4d5s6cKh_9sAc6s9h_2hAdKd5h_2dQc9dJh_AhKcQhJs_KsAs5d2c_6hTh8h8d_3s4sTcQd_7c3cTs9c_4c2s8c4h() {
    assertEquals(
      "2dQc9dJh 6hTh8h8d 9sAc6s9h AhKcQhJs 3s4sTcQd 2hAdKd5h=4c2s8c4h=KsAs5d2c 7c3cTs9c",
      Solver.process("omaha-holdem 3h4d5s6cKh 9sAc6s9h 2hAdKd5h 2dQc9dJh AhKcQhJs KsAs5d2c 6hTh8h8d 3s4sTcQd 7c3cTs9c 4c2s8c4h"));
  }

  @Test
  public void test_omaha_holdem_1687_2d5d5s7d9h_7c5cKs9s_ThQcJdKh_6sAd7h2c_6c5hAhQd_2sJhTs8s_7s3hQsKd_TdAc3sJc_Kc4h9c4c() {
    assertEquals(
      "ThQcJdKh TdAc3sJc 2sJhTs8s 7s3hQsKd 6sAd7h2c Kc4h9c4c 6c5hAhQd 7c5cKs9s",
      Solver.process("omaha-holdem 2d5d5s7d9h 7c5cKs9s ThQcJdKh 6sAd7h2c 6c5hAhQd 2sJhTs8s 7s3hQsKd TdAc3sJc Kc4h9c4c"));
  }

  @Test
  public void test_omaha_holdem_1688_3c4d6s7dQh_2s3hAc5s_4h6c5dQd_8d5c2cJh_2dThTdQc_9c7h2h4c_8hQs6hAs_6dKcKh9s_Jd4s5hAd() {
    assertEquals(
      "2dThTdQc 6dKcKh9s 9c7h2h4c 8hQs6hAs 2s3hAc5s=4h6c5dQd=Jd4s5hAd 8d5c2cJh",
      Solver.process("omaha-holdem 3c4d6s7dQh 2s3hAc5s 4h6c5dQd 8d5c2cJh 2dThTdQc 9c7h2h4c 8hQs6hAs 6dKcKh9s Jd4s5hAd"));
  }

  @Test
  public void test_omaha_holdem_1689_5c5sJcJdQs_5hJh9c8d_9s4c3d9h() {
    assertEquals(
      "9s4c3d9h 5hJh9c8d",
      Solver.process("omaha-holdem 5c5sJcJdQs 5hJh9c8d 9s4c3d9h"));
  }

  @Test
  public void test_omaha_holdem_1690_8hAsJcKdQh_9s7s6h5h_2sAhAc2c() {
    assertEquals(
      "9s7s6h5h 2sAhAc2c",
      Solver.process("omaha-holdem 8hAsJcKdQh 9s7s6h5h 2sAhAc2c"));
  }

  @Test
  public void test_omaha_holdem_1691_6d9dQdQsTc_5h4h3cJs_Kh6sJh8s_5s2dKs5c() {
    assertEquals(
      "5h4h3cJs 5s2dKs5c Kh6sJh8s",
      Solver.process("omaha-holdem 6d9dQdQsTc 5h4h3cJs Kh6sJh8s 5s2dKs5c"));
  }

  @Test
  public void test_omaha_holdem_1692_5c7c9dAsKc_2sTh4d3d_Qd6h2hTc_6s7s5s6c_Qs8d5h8h_9cJd2c4c_Qc6d2dAc() {
    assertEquals(
      "2sTh4d3d Qd6h2hTc Qs8d5h8h 6s7s5s6c 9cJd2c4c Qc6d2dAc",
      Solver.process("omaha-holdem 5c7c9dAsKc 2sTh4d3d Qd6h2hTc 6s7s5s6c Qs8d5h8h 9cJd2c4c Qc6d2dAc"));
  }

  @Test
  public void test_omaha_holdem_1693_4d6sAdJsKc_2cQc8s5s_6cTsAhAc_5c2h7c5h_3s6d8h4h_Kd4c7d3c_8cJdQhTc_Ks9d9hQd_7sTh9c7h_9s5dKh2s() {
    assertEquals(
      "2cQc8s5s 5c2h7c5h 7sTh9c7h 9s5dKh2s Ks9d9hQd 3s6d8h4h Kd4c7d3c 6cTsAhAc 8cJdQhTc",
      Solver.process("omaha-holdem 4d6sAdJsKc 2cQc8s5s 6cTsAhAc 5c2h7c5h 3s6d8h4h Kd4c7d3c 8cJdQhTc Ks9d9hQd 7sTh9c7h 9s5dKh2s"));
  }

  @Test
  public void test_omaha_holdem_1694_8c9dAcQdTd_6s9c7hAs_JcTh5c3d_4s5d3sAh() {
    assertEquals(
      "4s5d3sAh 6s9c7hAs JcTh5c3d",
      Solver.process("omaha-holdem 8c9dAcQdTd 6s9c7hAs JcTh5c3d 4s5d3sAh"));
  }

  @Test
  public void test_omaha_holdem_1695_3d4d6sJhTh_5dKh9cJc_2c8d5s4h_Ad9sQsAs_3hQh2sAc_7sKs9hAh_TdKd8hTc_5h7h2d9d() {
    assertEquals(
      "7sKs9hAh 3hQh2sAc 5dKh9cJc Ad9sQsAs TdKd8hTc 2c8d5s4h 5h7h2d9d",
      Solver.process("omaha-holdem 3d4d6sJhTh 5dKh9cJc 2c8d5s4h Ad9sQsAs 3hQh2sAc 7sKs9hAh TdKd8hTc 5h7h2d9d"));
  }

  @Test
  public void test_omaha_holdem_1696_3h7hAsKdKs_Th5cTc4h_5dTs5hAd_6d2d5s2s_8s8dQsJs_QdQcJd9d_8c9cQh7s() {
    assertEquals(
      "6d2d5s2s 8c9cQh7s 8s8dQsJs Th5cTc4h QdQcJd9d 5dTs5hAd",
      Solver.process("omaha-holdem 3h7hAsKdKs Th5cTc4h 5dTs5hAd 6d2d5s2s 8s8dQsJs QdQcJd9d 8c9cQh7s"));
  }

  @Test
  public void test_omaha_holdem_1697_3s6cAdJhQd_5s3h5cJc_2h8dQc2c_8s6h7dAc_9cJs4cQh_9d5hThKs_8h6d4h3c_As6sQs2d_TsKd9h4s_8c7cTdTc() {
    assertEquals(
      "8c7cTdTc 2h8dQc2c 8h6d4h3c 5s3h5cJc 9cJs4cQh 8s6h7dAc As6sQs2d 9d5hThKs=TsKd9h4s",
      Solver.process("omaha-holdem 3s6cAdJhQd 5s3h5cJc 2h8dQc2c 8s6h7dAc 9cJs4cQh 9d5hThKs 8h6d4h3c As6sQs2d TsKd9h4s 8c7cTdTc"));
  }

  @Test
  public void test_omaha_holdem_1698_4d5h7c8d9h_Jc4s7hQh_AsAcKs9c_Ah2c8s9d_TcQdQc3d_2h6c6sJs_3h8hKhTh() {
    assertEquals(
      "2h6c6sJs 3h8hKhTh TcQdQc3d AsAcKs9c Jc4s7hQh Ah2c8s9d",
      Solver.process("omaha-holdem 4d5h7c8d9h Jc4s7hQh AsAcKs9c Ah2c8s9d TcQdQc3d 2h6c6sJs 3h8hKhTh"));
  }

  @Test
  public void test_omaha_holdem_1699_3c3d4c6dAh_8c5s8sJc_Kd4s2c6c_Th6h9h3s_Ac7s9d5d_4hJh9cAs_Kc5h4dAd_8h2hQsQc_Tc2d9s3h() {
    assertEquals(
      "Kd4s2c6c 8c5s8sJc 8h2hQsQc 4hJh9cAs=Kc5h4dAd Tc2d9s3h Ac7s9d5d Th6h9h3s",
      Solver.process("omaha-holdem 3c3d4c6dAh 8c5s8sJc Kd4s2c6c Th6h9h3s Ac7s9d5d 4hJh9cAs Kc5h4dAd 8h2hQsQc Tc2d9s3h"));
  }

  @Test
  public void test_omaha_holdem_1700_4h5d5sAdQh_Jd3d6dJh_9c2s7c4c() {
    assertEquals(
      "9c2s7c4c Jd3d6dJh",
      Solver.process("omaha-holdem 4h5d5sAdQh Jd3d6dJh 9c2s7c4c"));
  }

  @Test
  public void test_omaha_holdem_1701_8d8hJdTdTs_5d7h4c7d_3hKd6s9s_6d5sQh7c_Tc4d9c9h_8cKsAd5c_4sJhAcQc_7sKc2sQs_Kh2hAh5h_Th3cQd4h() {
    assertEquals(
      "6d5sQh7c 3hKd6s9s 7sKc2sQs Kh2hAh5h 4sJhAcQc 8cKsAd5c Tc4d9c9h Th3cQd4h 5d7h4c7d",
      Solver.process("omaha-holdem 8d8hJdTdTs 5d7h4c7d 3hKd6s9s 6d5sQh7c Tc4d9c9h 8cKsAd5c 4sJhAcQc 7sKc2sQs Kh2hAh5h Th3cQd4h"));
  }

  @Test
  public void test_omaha_holdem_1702_2h2s3h4sQh_7cKs8dJs_5hQd9c3d_8cKh6sTs_6d3cThJh_9sTcKcAh() {
    assertEquals(
      "8cKh6sTs 7cKs8dJs 9sTcKcAh 5hQd9c3d 6d3cThJh",
      Solver.process("omaha-holdem 2h2s3h4sQh 7cKs8dJs 5hQd9c3d 8cKh6sTs 6d3cThJh 9sTcKcAh"));
  }

  @Test
  public void test_omaha_holdem_1703_3cKdKsTcTd_2h2sJd8h_6s3h8d4s_4d4h3s5h() {
    assertEquals(
      "2h2sJd8h 6s3h8d4s 4d4h3s5h",
      Solver.process("omaha-holdem 3cKdKsTcTd 2h2sJd8h 6s3h8d4s 4d4h3s5h"));
  }

  @Test
  public void test_omaha_holdem_1704_4s6d7sJcKs_6c5dKcTs_Ah6h3dQh_As3s8s4d_5c7hJh9s_8c7cKdJs_4cThTd9h() {
    assertEquals(
      "Ah6h3dQh 4cThTd9h 5c7hJh9s 6c5dKcTs 8c7cKdJs As3s8s4d",
      Solver.process("omaha-holdem 4s6d7sJcKs 6c5dKcTs Ah6h3dQh As3s8s4d 5c7hJh9s 8c7cKdJs 4cThTd9h"));
  }

  @Test
  public void test_omaha_holdem_1705_8h9dAdJcJd_Qs2hJs5d_9h3h5c3s() {
    assertEquals(
      "9h3h5c3s Qs2hJs5d",
      Solver.process("omaha-holdem 8h9dAdJcJd Qs2hJs5d 9h3h5c3s"));
  }

  @Test
  public void test_omaha_holdem_1706_3c6d6sKcKs_8s5s2hKh_As9hAc9s_4d3dQcAh_9d9cJc4s_Qs6hJd7s_7d5cQd2d_5hKdQh3h_6c2sJh7h_4cJs8c7c() {
    assertEquals(
      "4cJs8c7c 7d5cQd2d 4d3dQcAh 9d9cJc4s As9hAc9s 6c2sJh7h Qs6hJd7s 8s5s2hKh 5hKdQh3h",
      Solver.process("omaha-holdem 3c6d6sKcKs 8s5s2hKh As9hAc9s 4d3dQcAh 9d9cJc4s Qs6hJd7s 7d5cQd2d 5hKdQh3h 6c2sJh7h 4cJs8c7c"));
  }

  @Test
  public void test_omaha_holdem_1707_2d7d8d9dKh_4dAdKs9h_7sJc7cAh_ThQh5h8c_4s3sJs5s_9cJhJd3c_Kd6c5d5c_6s3d4c6h_3h8sAc2c() {
    assertEquals(
      "4s3sJs5s 6s3d4c6h ThQh5h8c 9cJhJd3c 3h8sAc2c 7sJc7cAh Kd6c5d5c 4dAdKs9h",
      Solver.process("omaha-holdem 2d7d8d9dKh 4dAdKs9h 7sJc7cAh ThQh5h8c 4s3sJs5s 9cJhJd3c Kd6c5d5c 6s3d4c6h 3h8sAc2c"));
  }

  @Test
  public void test_omaha_holdem_1708_4c4h9sKsQd_5c9d5s4d_3cJc5dJh_5hAhJsTh_6c8d7d7c_Ad2sTc8s_4s2cKc6d_8h9hKhAs_3d7sKdJd_2dTd6s6h() {
    assertEquals(
      "Ad2sTc8s 2dTd6s6h 6c8d7d7c 3cJc5dJh 3d7sKdJd 8h9hKhAs 5hAhJsTh 5c9d5s4d 4s2cKc6d",
      Solver.process("omaha-holdem 4c4h9sKsQd 5c9d5s4d 3cJc5dJh 5hAhJsTh 6c8d7d7c Ad2sTc8s 4s2cKc6d 8h9hKhAs 3d7sKdJd 2dTd6s6h"));
  }

  @Test
  public void test_omaha_holdem_1709_7d8hJdKsTd_Js9h2d5h_2c2s3d3s_TcQs2h4h_TsJcQcQh_8d4s9d6d_5cAsKd8c() {
    assertEquals(
      "2c2s3d3s TcQs2h4h TsJcQcQh 5cAsKd8c Js9h2d5h 8d4s9d6d",
      Solver.process("omaha-holdem 7d8hJdKsTd Js9h2d5h 2c2s3d3s TcQs2h4h TsJcQcQh 8d4s9d6d 5cAsKd8c"));
  }

  @Test
  public void test_omaha_holdem_1710_4h6s7hAhJh_AsQd6cTs_2s4c3s6h_KsQs9hJd_7cKh8h9d_5h3hAc7s() {
    assertEquals(
      "KsQs9hJd 2s4c3s6h AsQd6cTs 5h3hAc7s 7cKh8h9d",
      Solver.process("omaha-holdem 4h6s7hAhJh AsQd6cTs 2s4c3s6h KsQs9hJd 7cKh8h9d 5h3hAc7s"));
  }

  @Test
  public void test_omaha_holdem_1711_5s6hJdJsTh_9h8cQsKs_KdKh4dTc_9d3c6dQd_Ah3sAc7h_5hQc9s8d_Td4hQhAd_Ts3h5dAs_6c2d4c2h_2s7sJh4s() {
    assertEquals(
      "9h8cQsKs 5hQc9s8d 6c2d4c2h 9d3c6dQd Td4hQhAd=Ts3h5dAs KdKh4dTc Ah3sAc7h 2s7sJh4s",
      Solver.process("omaha-holdem 5s6hJdJsTh 9h8cQsKs KdKh4dTc 9d3c6dQd Ah3sAc7h 5hQc9s8d Td4hQhAd Ts3h5dAs 6c2d4c2h 2s7sJh4s"));
  }

  @Test
  public void test_omaha_holdem_1712_5s6h8s9cJs_3s2cKhAs_7s4h4sAd_8d2s7d2h_3hTh3dJc_4c8h9hKc_5h9d5c6c_QdQhAc7h() {
    assertEquals(
      "3hTh3dJc QdQhAc7h 4c8h9hKc 5h9d5c6c 8d2s7d2h 7s4h4sAd 3s2cKhAs",
      Solver.process("omaha-holdem 5s6h8s9cJs 3s2cKhAs 7s4h4sAd 8d2s7d2h 3hTh3dJc 4c8h9hKc 5h9d5c6c QdQhAc7h"));
  }

  @Test
  public void test_omaha_holdem_1713_2d4s5hAcQs_7c2sThKc_KsJhJc3h_3c9cAd3s_3d9s4d6d_7h8dTcQd_6hQhAs9d() {
    assertEquals(
      "7c2sThKc KsJhJc3h 7h8dTcQd 6hQhAs9d 3c9cAd3s 3d9s4d6d",
      Solver.process("omaha-holdem 2d4s5hAcQs 7c2sThKc KsJhJc3h 3c9cAd3s 3d9s4d6d 7h8dTcQd 6hQhAs9d"));
  }

  @Test
  public void test_omaha_holdem_1714_3s7d9dAcQd_3h4d3d2s_5s2c6c4c_Kd2d7c2h_4h5h6sKc_AhJcTd3c_Qh8hJd8d_TsJs8s7s_Kh6dTcAd() {
    assertEquals(
      "5s2c6c4c 4h5h6sKc TsJs8s7s AhJcTd3c 3h4d3d2s Qh8hJd8d Kd2d7c2h Kh6dTcAd",
      Solver.process("omaha-holdem 3s7d9dAcQd 3h4d3d2s 5s2c6c4c Kd2d7c2h 4h5h6sKc AhJcTd3c Qh8hJd8d TsJs8s7s Kh6dTcAd"));
  }

  @Test
  public void test_omaha_holdem_1715_2d2s5s8c9h_Tc4s7s3c_2hQdAs6s_3s6dKs4h_8sThQhJd_Ac6c9c3d_5c2cKh9s() {
    assertEquals(
      "Tc4s7s3c 3s6dKs4h 8sThQhJd Ac6c9c3d 2hQdAs6s 5c2cKh9s",
      Solver.process("omaha-holdem 2d2s5s8c9h Tc4s7s3c 2hQdAs6s 3s6dKs4h 8sThQhJd Ac6c9c3d 5c2cKh9s"));
  }

  @Test
  public void test_omaha_holdem_1716_2d2h6h8sQh_As7hTs9h_3h7s9sJd_7cKd3sTc_5dAd4h4d_7dJcQcQs() {
    assertEquals(
      "3h7s9sJd 7cKd3sTc 5dAd4h4d As7hTs9h 7dJcQcQs",
      Solver.process("omaha-holdem 2d2h6h8sQh As7hTs9h 3h7s9sJd 7cKd3sTc 5dAd4h4d 7dJcQcQs"));
  }

  @Test
  public void test_omaha_holdem_1717_4s7c8sAcKs_7hJdQh2d_5s3hAhTd_KdAdJh8c_9h2hKc5c_Qs9s4d4c() {
    assertEquals(
      "7hJdQh2d 9h2hKc5c 5s3hAhTd KdAdJh8c Qs9s4d4c",
      Solver.process("omaha-holdem 4s7c8sAcKs 7hJdQh2d 5s3hAhTd KdAdJh8c 9h2hKc5c Qs9s4d4c"));
  }

  @Test
  public void test_omaha_holdem_1718_3c5d6hAcKh_QdTdKd8d_QcQsJh4c_2c7h2d3d_7sJsTc2h_7d8h2s8s_ThTs4d6d_3s5c5s5h_9c6sAhAd_6cJc4hAs() {
    assertEquals(
      "7sJsTc2h 2c7h2d3d 7d8h2s8s ThTs4d6d QcQsJh4c QdTdKd8d 6cJc4hAs 3s5c5s5h 9c6sAhAd",
      Solver.process("omaha-holdem 3c5d6hAcKh QdTdKd8d QcQsJh4c 2c7h2d3d 7sJsTc2h 7d8h2s8s ThTs4d6d 3s5c5s5h 9c6sAhAd 6cJc4hAs"));
  }

  @Test
  public void test_omaha_holdem_1719_3h5s6d8hTd_Ac9d8d5c_3s7dAhQh_Qd6h2dKc() {
    assertEquals(
      "3s7dAhQh Qd6h2dKc Ac9d8d5c",
      Solver.process("omaha-holdem 3h5s6d8hTd Ac9d8d5c 3s7dAhQh Qd6h2dKc"));
  }

  @Test
  public void test_omaha_holdem_1720_6d7c9cQcQd_Ad5d4d9s_JcJsTcAh_KhKs8cAc_5h7dJd7s() {
    assertEquals(
      "Ad5d4d9s JcJsTcAh KhKs8cAc 5h7dJd7s",
      Solver.process("omaha-holdem 6d7c9cQcQd Ad5d4d9s JcJsTcAh KhKs8cAc 5h7dJd7s"));
  }

  @Test
  public void test_omaha_holdem_1721_2h3h4d5sKh_Tc6d9h4c_4hTd8d6c_Jh6h5hKd_Qs2d5d7h_As7c7sAd_9d2c4s8h_2s8cThKc_QhAc5cJs() {
    assertEquals(
      "As7c7sAd 9d2c4s8h Qs2d5d7h 2s8cThKc QhAc5cJs 4hTd8d6c=Tc6d9h4c Jh6h5hKd",
      Solver.process("omaha-holdem 2h3h4d5sKh Tc6d9h4c 4hTd8d6c Jh6h5hKd Qs2d5d7h As7c7sAd 9d2c4s8h 2s8cThKc QhAc5cJs"));
  }

  @Test
  public void test_omaha_holdem_1722_2h3d4d9hQd_5s6h3cAh_JdKc4c8d_Tc5d7d8c_5hQhAc3s_3h8h8sQc_9c5c7h4s_QsAd2sJh_7sKh6dKs_2dJcTd4h() {
    assertEquals(
      "7sKh6dKs 9c5c7h4s QsAd2sJh 3h8h8sQc 5hQhAc3s 5s6h3cAh Tc5d7d8c 2dJcTd4h JdKc4c8d",
      Solver.process("omaha-holdem 2h3d4d9hQd 5s6h3cAh JdKc4c8d Tc5d7d8c 5hQhAc3s 3h8h8sQc 9c5c7h4s QsAd2sJh 7sKh6dKs 2dJcTd4h"));
  }

  @Test
  public void test_omaha_holdem_1723_2c2s5c8dJd_Ah7h6sKd_3h3c5sQd_Kh9s2dQh_Qc8c7c3s_5hThKc4c() {
    assertEquals(
      "Ah7h6sKd 3h3c5sQd 5hThKc4c Qc8c7c3s Kh9s2dQh",
      Solver.process("omaha-holdem 2c2s5c8dJd Ah7h6sKd 3h3c5sQd Kh9s2dQh Qc8c7c3s 5hThKc4c"));
  }

  @Test
  public void test_omaha_holdem_1724_6d7dJcTcTd_Ah9hAcQd_4c2sJsAd_9c3sQs5h_2cTh5sQc() {
    assertEquals(
      "9c3sQs5h 4c2sJsAd Ah9hAcQd 2cTh5sQc",
      Solver.process("omaha-holdem 6d7dJcTcTd Ah9hAcQd 4c2sJsAd 9c3sQs5h 2cTh5sQc"));
  }

  @Test
  public void test_omaha_holdem_1725_4d6dAcJhQh_7s4sAsAh_8cQc5d7d_4c2dQd6h_Th6cTs8d_5s6sQs2s_Jc3c9c5c() {
    assertEquals(
      "Th6cTs8d Jc3c9c5c 8cQc5d7d 4c2dQd6h=5s6sQs2s 7s4sAsAh",
      Solver.process("omaha-holdem 4d6dAcJhQh 7s4sAsAh 8cQc5d7d 4c2dQd6h Th6cTs8d 5s6sQs2s Jc3c9c5c"));
  }

  @Test
  public void test_omaha_holdem_1726_6s7s8hTdTs_AcKcJc5c_7hJs3hJd_2hAh2sQd_5h9c2c3s_Qc8c9sKh_4c4s4dAd_8d3d6cAs() {
    assertEquals(
      "AcKcJc5c 2hAh2sQd 4c4s4dAd 8d3d6cAs 7hJs3hJd 5h9c2c3s Qc8c9sKh",
      Solver.process("omaha-holdem 6s7s8hTdTs AcKcJc5c 7hJs3hJd 2hAh2sQd 5h9c2c3s Qc8c9sKh 4c4s4dAd 8d3d6cAs"));
  }

  @Test
  public void test_omaha_holdem_1727_2h4d4h5dJc_Kh5cTd7d_Qd4sQs9h_Th8c2s6s_7cTsAs3c_AcJdTc5s_9s3s9dKs_Kd2c3h6c_Kc9c2d8d_7s6hJs8h() {
    assertEquals(
      "Th8c2s6s Kc9c2d8d Kh5cTd7d 9s3s9dKs 7s6hJs8h AcJdTc5s Qd4sQs9h 7cTsAs3c Kd2c3h6c",
      Solver.process("omaha-holdem 2h4d4h5dJc Kh5cTd7d Qd4sQs9h Th8c2s6s 7cTsAs3c AcJdTc5s 9s3s9dKs Kd2c3h6c Kc9c2d8d 7s6hJs8h"));
  }

  @Test
  public void test_omaha_holdem_1728_3dJdKcKhQd_5h4c8h6h_4hJcQcAs_QhTh7s8d_3c4d2cAc() {
    assertEquals(
      "5h4c8h6h 3c4d2cAc QhTh7s8d 4hJcQcAs",
      Solver.process("omaha-holdem 3dJdKcKhQd 5h4c8h6h 4hJcQcAs QhTh7s8d 3c4d2cAc"));
  }

  @Test
  public void test_omaha_holdem_1729_2c4s7d8hKh_5s3dTdJh_9d9h4c2d_3s5c8s4h_7hAd2h8d_Th7cJs6d_Ts3cKd6s() {
    assertEquals(
      "5s3dTdJh Th7cJs6d Ts3cKd6s 9d9h4c2d 3s5c8s4h 7hAd2h8d",
      Solver.process("omaha-holdem 2c4s7d8hKh 5s3dTdJh 9d9h4c2d 3s5c8s4h 7hAd2h8d Th7cJs6d Ts3cKd6s"));
  }

  @Test
  public void test_omaha_holdem_1730_4h6hAsJdQd_7d2hKs2s_5s8sKh3s_3c9hTh2d_Qh9d4cAd_AcAh5dTc_Jh8c4sQc() {
    assertEquals(
      "3c9hTh2d 5s8sKh3s 7d2hKs2s Jh8c4sQc Qh9d4cAd AcAh5dTc",
      Solver.process("omaha-holdem 4h6hAsJdQd 7d2hKs2s 5s8sKh3s 3c9hTh2d Qh9d4cAd AcAh5dTc Jh8c4sQc"));
  }

  @Test
  public void test_omaha_holdem_1731_3d3h4d6dAh_8h6hQc5d_8s8d7sAd_QsTsTcKs_7c4cAc7h_2hJc7d5c_3c5sJd4s() {
    assertEquals(
      "8h6hQc5d QsTsTcKs 7c4cAc7h 2hJc7d5c 8s8d7sAd 3c5sJd4s",
      Solver.process("omaha-holdem 3d3h4d6dAh 8h6hQc5d 8s8d7sAd QsTsTcKs 7c4cAc7h 2hJc7d5c 3c5sJd4s"));
  }

  @Test
  public void test_omaha_holdem_1732_6hAsJcKdTh_2c4s5hKh_8d8c8h6s_Td4c7sTc_3s3cJsKc() {
    assertEquals(
      "8d8c8h6s 2c4s5hKh 3s3cJsKc Td4c7sTc",
      Solver.process("omaha-holdem 6hAsJcKdTh 2c4s5hKh 8d8c8h6s Td4c7sTc 3s3cJsKc"));
  }

  @Test
  public void test_omaha_holdem_1733_4s7h8dAhKh_Tc5h2s9s_9c4cTs4h_3sTd6c5c_Qc9d9hJs() {
    assertEquals(
      "Tc5h2s9s Qc9d9hJs 9c4cTs4h 3sTd6c5c",
      Solver.process("omaha-holdem 4s7h8dAhKh Tc5h2s9s 9c4cTs4h 3sTd6c5c Qc9d9hJs"));
  }

  @Test
  public void test_omaha_holdem_1734_3c3h8s9c9h_8dAhQhTd_6sQc9dJs_4d5h8h6d_2d4hJdTc_4s5sThKc_7dJhKhQd_7hAd2c4c_Qs3s6c3d_Ts9s6h2s() {
    assertEquals(
      "2d4hJdTc 4s5sThKc 7dJhKhQd 7hAd2c4c 4d5h8h6d 8dAhQhTd Ts9s6h2s 6sQc9dJs Qs3s6c3d",
      Solver.process("omaha-holdem 3c3h8s9c9h 8dAhQhTd 6sQc9dJs 4d5h8h6d 2d4hJdTc 4s5sThKc 7dJhKhQd 7hAd2c4c Qs3s6c3d Ts9s6h2s"));
  }

  @Test
  public void test_omaha_holdem_1735_5c6c7cKcQs_Ts4h2sJs_3d8cQd6d() {
    assertEquals(
      "Ts4h2sJs 3d8cQd6d",
      Solver.process("omaha-holdem 5c6c7cKcQs Ts4h2sJs 3d8cQd6d"));
  }

  @Test
  public void test_omaha_holdem_1736_5h7h8d8hKs_6s2c2hTh_7d9s5d4s_4h7c6cQs_Tc8cQd3h_TsQhJc3c() {
    assertEquals(
      "TsQhJc3c 7d9s5d4s Tc8cQd3h 4h7c6cQs 6s2c2hTh",
      Solver.process("omaha-holdem 5h7h8d8hKs 6s2c2hTh 7d9s5d4s 4h7c6cQs Tc8cQd3h TsQhJc3c"));
  }

  @Test
  public void test_omaha_holdem_1737_4c6d7h8sKh_4dJs2d6c_4hKs7c3d_Th8dQd3s_TsAc9d3c_7sTc6sAd_9cAs5h5c_2sAhKdJh() {
    assertEquals(
      "Th8dQd3s 2sAhKdJh 4dJs2d6c 7sTc6sAd 4hKs7c3d 9cAs5h5c TsAc9d3c",
      Solver.process("omaha-holdem 4c6d7h8sKh 4dJs2d6c 4hKs7c3d Th8dQd3s TsAc9d3c 7sTc6sAd 9cAs5h5c 2sAhKdJh"));
  }

  @Test
  public void test_omaha_holdem_1738_3h5c7h7sTc_JsKs2dKh_7cQsThJd_6cAd9cQd_3cTd2c5s() {
    assertEquals(
      "6cAd9cQd 3cTd2c5s JsKs2dKh 7cQsThJd",
      Solver.process("omaha-holdem 3h5c7h7sTc JsKs2dKh 7cQsThJd 6cAd9cQd 3cTd2c5s"));
  }

  @Test
  public void test_omaha_holdem_1739_3c3h5cAcTh_Jh2c5hJs_9sJd2s9d() {
    assertEquals(
      "9sJd2s9d Jh2c5hJs",
      Solver.process("omaha-holdem 3c3h5cAcTh Jh2c5hJs 9sJd2s9d"));
  }

  @Test
  public void test_omaha_holdem_1740_2s4h6d7c7h_Kc5hTcKd_6s8c4cQh_QdQs2h6h_5sAc3cJs_Jh7s7d8s_3h2c5d3d() {
    assertEquals(
      "6s8c4cQh QdQs2h6h Kc5hTcKd 3h2c5d3d=5sAc3cJs Jh7s7d8s",
      Solver.process("omaha-holdem 2s4h6d7c7h Kc5hTcKd 6s8c4cQh QdQs2h6h 5sAc3cJs Jh7s7d8s 3h2c5d3d"));
  }

  @Test
  public void test_omaha_holdem_1741_3d3s5c9sKc_2d4c5hKd_4hAc7d7c_6s6h8sJh_3cAh4sKh_Qh4d3h5d_TdTsThJd_9c2c2h5s_8hJsQc2s() {
    assertEquals(
      "8hJsQc2s 6s6h8sJh 4hAc7d7c 9c2c2h5s TdTsThJd 2d4c5hKd Qh4d3h5d 3cAh4sKh",
      Solver.process("omaha-holdem 3d3s5c9sKc 2d4c5hKd 4hAc7d7c 6s6h8sJh 3cAh4sKh Qh4d3h5d TdTsThJd 9c2c2h5s 8hJsQc2s"));
  }

  @Test
  public void test_omaha_holdem_1742_4d7d9c9hKc_Jh2d2hTc_2s9sTsAd_5sAcTh3h_6d4cJcKh_QcTd8hQh_7h3c6c2c_JsQd3dQs_5c9d5h8s_7s5dJdAh() {
    assertEquals(
      "5sAcTh3h Jh2d2hTc 7h3c6c2c 7s5dJdAh JsQd3dQs=QcTd8hQh 6d4cJcKh 5c9d5h8s 2s9sTsAd",
      Solver.process("omaha-holdem 4d7d9c9hKc Jh2d2hTc 2s9sTsAd 5sAcTh3h 6d4cJcKh QcTd8hQh 7h3c6c2c JsQd3dQs 5c9d5h8s 7s5dJdAh"));
  }

  @Test
  public void test_omaha_holdem_1743_3s5s6cQcQd_Jh8h9s2h_AdKd7hQs_KsAh3hQh_5d2cTd3d_9c4h9dAc_4s7dTc7s_5h8d8c4d_KhJs9h4c_JdTh7cAs() {
    assertEquals(
      "Jh8h9s2h KhJs9h4c JdTh7cAs 5d2cTd3d 5h8d8c4d 9c4h9dAc AdKd7hQs 4s7dTc7s KsAh3hQh",
      Solver.process("omaha-holdem 3s5s6cQcQd Jh8h9s2h AdKd7hQs KsAh3hQh 5d2cTd3d 9c4h9dAc 4s7dTc7s 5h8d8c4d KhJs9h4c JdTh7cAs"));
  }

  @Test
  public void test_omaha_holdem_1744_4c5h9hKdTc_Ac8hJdAd_KcTh9d4s_As2s5c6c_4d7c3h8s_Ah7s2c8d_Td3dKs5s_9s6s5d2h_9c8c4hJs_7d7hQs6h() {
    assertEquals(
      "Ah7s2c8d 4d7c3h8s As2s5c6c 7d7hQs6h Ac8hJdAd 9c8c4hJs 9s6s5d2h KcTh9d4s=Td3dKs5s",
      Solver.process("omaha-holdem 4c5h9hKdTc Ac8hJdAd KcTh9d4s As2s5c6c 4d7c3h8s Ah7s2c8d Td3dKs5s 9s6s5d2h 9c8c4hJs 7d7hQs6h"));
  }

  @Test
  public void test_omaha_holdem_1745_3s8c9hAhQd_6s4s7s2s_Tc2cJs3c_9sTh5c4d_Kd2d5h3h_6cKs8sQs_5dJhQcQh() {
    assertEquals(
      "6s4s7s2s Kd2d5h3h 9sTh5c4d 6cKs8sQs 5dJhQcQh Tc2cJs3c",
      Solver.process("omaha-holdem 3s8c9hAhQd 6s4s7s2s Tc2cJs3c 9sTh5c4d Kd2d5h3h 6cKs8sQs 5dJhQcQh"));
  }

  @Test
  public void test_omaha_holdem_1746_2d5h8hQhQs_5cTd8d5s_As7cTc4d_7h6h4h9h() {
    assertEquals(
      "As7cTc4d 7h6h4h9h 5cTd8d5s",
      Solver.process("omaha-holdem 2d5h8hQhQs 5cTd8d5s As7cTc4d 7h6h4h9h"));
  }

  @Test
  public void test_omaha_holdem_1747_5d9c9sJhJs_5c3d7cAc_6cAh2s2h_3hJcAsKd_8dKsAdQd_8sThTc6h_5s2d7sKh() {
    assertEquals(
      "8dKsAdQd 6cAh2s2h 5s2d7sKh 5c3d7cAc 8sThTc6h 3hJcAsKd",
      Solver.process("omaha-holdem 5d9c9sJhJs 5c3d7cAc 6cAh2s2h 3hJcAsKd 8dKsAdQd 8sThTc6h 5s2d7sKh"));
  }

  @Test
  public void test_omaha_holdem_1748_8c8s9hKdQs_AsKc6sQh_4h5h7h2s_3c7d3d9d_AcQc8h5d_6dJdKs5c() {
    assertEquals(
      "4h5h7h2s 3c7d3d9d 6dJdKs5c AsKc6sQh AcQc8h5d",
      Solver.process("omaha-holdem 8c8s9hKdQs AsKc6sQh 4h5h7h2s 3c7d3d9d AcQc8h5d 6dJdKs5c"));
  }

  @Test
  public void test_omaha_holdem_1749_2d3h3s8dQh_5dAd9sKh_Th3d5s9d() {
    assertEquals(
      "5dAd9sKh Th3d5s9d",
      Solver.process("omaha-holdem 2d3h3s8dQh 5dAd9sKh Th3d5s9d"));
  }

}
