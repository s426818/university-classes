
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver26HiddenTest {


  @Test
  public void test_omaha_holdem_6500_3h5c5s7dTc_JcAsTs6d_Ad6c3dAc_Qs2dTd5h_7s5d9h3s_JhKc8sKs() {
    assertEquals(
      "JcAsTs6d JhKc8sKs Ad6c3dAc 7s5d9h3s Qs2dTd5h",
      Solver.process("omaha-holdem 3h5c5s7dTc JcAsTs6d Ad6c3dAc Qs2dTd5h 7s5d9h3s JhKc8sKs"));
  }

  @Test
  public void test_omaha_holdem_6501_4s5c8cJcKs_5hTc2h8h_9c4d8s3c_7c4hTdKd_4cJs3s6d_7dAhQs9s_3h5dAcTs_8d7sJd2d_KhTh6sQh() {
    assertEquals(
      "7dAhQs9s 3h5dAcTs KhTh6sQh 5hTc2h8h 4cJs3s6d 8d7sJd2d 7c4hTdKd 9c4d8s3c",
      Solver.process("omaha-holdem 4s5c8cJcKs 5hTc2h8h 9c4d8s3c 7c4hTdKd 4cJs3s6d 7dAhQs9s 3h5dAcTs 8d7sJd2d KhTh6sQh"));
  }

  @Test
  public void test_omaha_holdem_6502_2d2s9sAsJd_4h6s7sAh_7h9cQs7d_4c3d3s6c_5dKdThJs_AcKsTc9d_Ts6h8s2h() {
    assertEquals(
      "4c3d3s6c 7h9cQs7d 5dKdThJs AcKsTc9d 4h6s7sAh Ts6h8s2h",
      Solver.process("omaha-holdem 2d2s9sAsJd 4h6s7sAh 7h9cQs7d 4c3d3s6c 5dKdThJs AcKsTc9d Ts6h8s2h"));
  }

  @Test
  public void test_omaha_holdem_6503_2h5dAdJcJs_Kd2cQhAc_7hQdTc2d_9c8h5h3h_7dAs6dKh_KcAh8s3c_7s9h4hJh_8c2sQs7c_9dTs4sKs_9s4c3d6c() {
    assertEquals(
      "9dTs4sKs 7hQdTc2d=8c2sQs7c 9c8h5h3h 7dAs6dKh=KcAh8s3c=Kd2cQhAc 7s9h4hJh 9s4c3d6c",
      Solver.process("omaha-holdem 2h5dAdJcJs Kd2cQhAc 7hQdTc2d 9c8h5h3h 7dAs6dKh KcAh8s3c 7s9h4hJh 8c2sQs7c 9dTs4sKs 9s4c3d6c"));
  }

  @Test
  public void test_omaha_holdem_6504_2c6c8dJdQc_8sTd7sAh_7d8h2h5d_Ts9s3c8c_9c4sKcTc_5s9dKd9h() {
    assertEquals(
      "8sTd7sAh 5s9dKd9h 7d8h2h5d Ts9s3c8c 9c4sKcTc",
      Solver.process("omaha-holdem 2c6c8dJdQc 8sTd7sAh 7d8h2h5d Ts9s3c8c 9c4sKcTc 5s9dKd9h"));
  }

  @Test
  public void test_omaha_holdem_6505_3h7c7sJdJs_Qc8cTsQd_Ks9s4s2h_KhKd6c5s_8s5hTcAc() {
    assertEquals(
      "Ks9s4s2h 8s5hTcAc Qc8cTsQd KhKd6c5s",
      Solver.process("omaha-holdem 3h7c7sJdJs Qc8cTsQd Ks9s4s2h KhKd6c5s 8s5hTcAc"));
  }

  @Test
  public void test_omaha_holdem_6506_3c4s6c7cJd_AsAcTs7s_Kc8d8s2c_8hQdKs6h_Jh7d4cKd() {
    assertEquals(
      "8hQdKs6h AsAcTs7s Jh7d4cKd Kc8d8s2c",
      Solver.process("omaha-holdem 3c4s6c7cJd AsAcTs7s Kc8d8s2c 8hQdKs6h Jh7d4cKd"));
  }

  @Test
  public void test_omaha_holdem_6507_5d5sAcAhJh_2s5hJc5c_AdKc9d7s_Ts2c6c7d_QdKh4sQh_7hQcTc3c_Th3s3h4h_3dJs2d9h() {
    assertEquals(
      "Ts2c6c7d 7hQcTc3c Th3s3h4h 3dJs2d9h QdKh4sQh AdKc9d7s 2s5hJc5c",
      Solver.process("omaha-holdem 5d5sAcAhJh 2s5hJc5c AdKc9d7s Ts2c6c7d QdKh4sQh 7hQcTc3c Th3s3h4h 3dJs2d9h"));
  }

  @Test
  public void test_omaha_holdem_6508_3s5h6hJcQs_9c3c7d6s_9sQh2sTc_JsKsTh7h_KcJh5sAc() {
    assertEquals(
      "JsKsTh7h 9sQh2sTc 9c3c7d6s KcJh5sAc",
      Solver.process("omaha-holdem 3s5h6hJcQs 9c3c7d6s 9sQh2sTc JsKsTh7h KcJh5sAc"));
  }

  @Test
  public void test_omaha_holdem_6509_3s8hJcJdKd_Ac6c7hQs_3dKc2hQc_Ah9hThKs_2d7dJh3h_6s5h8s9s_9c9d8c6d_AsTsKh4h() {
    assertEquals(
      "Ac6c7hQs 6s5h8s9s 9c9d8c6d 3dKc2hQc Ah9hThKs=AsTsKh4h 2d7dJh3h",
      Solver.process("omaha-holdem 3s8hJcJdKd Ac6c7hQs 3dKc2hQc Ah9hThKs 2d7dJh3h 6s5h8s9s 9c9d8c6d AsTsKh4h"));
  }

  @Test
  public void test_omaha_holdem_6510_2c5s6s7dAh_Qd5h8cQs_Kc9s2sAc_Js6d5c8d_TcKs3s7c_As3h7hAd_9d9hTs7s_TdKhJdQc_KdQh5dTh() {
    assertEquals(
      "TdKhJdQc KdQh5dTh TcKs3s7c 9d9hTs7s Qd5h8cQs Js6d5c8d Kc9s2sAc As3h7hAd",
      Solver.process("omaha-holdem 2c5s6s7dAh Qd5h8cQs Kc9s2sAc Js6d5c8d TcKs3s7c As3h7hAd 9d9hTs7s TdKhJdQc KdQh5dTh"));
  }

  @Test
  public void test_omaha_holdem_6511_2h3s5s7cJc_3dJsTd4h_7h5cAhKs_Jh4s3cTc() {
    assertEquals(
      "7h5cAhKs 3dJsTd4h=Jh4s3cTc",
      Solver.process("omaha-holdem 2h3s5s7cJc 3dJsTd4h 7h5cAhKs Jh4s3cTc"));
  }

  @Test
  public void test_omaha_holdem_6512_2d3h7d8dTc_Qh3s7sJc_Ts5c9cJs_Ah3dQd9d_TdKdThAs_5d5s6s4d() {
    assertEquals(
      "Qh3s7sJc Ts5c9cJs 5d5s6s4d Ah3dQd9d TdKdThAs",
      Solver.process("omaha-holdem 2d3h7d8dTc Qh3s7sJc Ts5c9cJs Ah3dQd9d TdKdThAs 5d5s6s4d"));
  }

  @Test
  public void test_omaha_holdem_6513_2c2h3hJhKh_3dAc9hKc_8cJd4s4d_Th9s8hJc() {
    assertEquals(
      "8cJd4s4d 3dAc9hKc Th9s8hJc",
      Solver.process("omaha-holdem 2c2h3hJhKh 3dAc9hKc 8cJd4s4d Th9s8hJc"));
  }

  @Test
  public void test_omaha_holdem_6514_3s8d9cKdTd_3cKc9d3d_Ac7dQdAh_3h9hTh6c_JdQh2sJs_8h7h4hKh() {
    assertEquals(
      "3h9hTh6c 8h7h4hKh JdQh2sJs 3cKc9d3d Ac7dQdAh",
      Solver.process("omaha-holdem 3s8d9cKdTd 3cKc9d3d Ac7dQdAh 3h9hTh6c JdQh2sJs 8h7h4hKh"));
  }

  @Test
  public void test_omaha_holdem_6515_4d5c6d8cKc_TdQh8s6s_Qc2cAh2d_7s8h3c4s_4h3s2h4c_QsTc9sAs_9c6c2sQd_Th6h9hJs() {
    assertEquals(
      "QsTc9sAs Th6h9hJs TdQh8s6s 4h3s2h4c 7s8h3c4s 9c6c2sQd Qc2cAh2d",
      Solver.process("omaha-holdem 4d5c6d8cKc TdQh8s6s Qc2cAh2d 7s8h3c4s 4h3s2h4c QsTc9sAs 9c6c2sQd Th6h9hJs"));
  }

  @Test
  public void test_omaha_holdem_6516_5d5hAhJcQs_4h9h3d2c_8h4c3cJd_Ac7hThKh_4sQc2s6c_6hTd9d8s_8d6d3sQh() {
    assertEquals(
      "4h9h3d2c 6hTd9d8s 8h4c3cJd 4sQc2s6c 8d6d3sQh Ac7hThKh",
      Solver.process("omaha-holdem 5d5hAhJcQs 4h9h3d2c 8h4c3cJd Ac7hThKh 4sQc2s6c 6hTd9d8s 8d6d3sQh"));
  }

  @Test
  public void test_omaha_holdem_6517_2s4c4s6cTh_7d6d2hKd_3sKsAdJh() {
    assertEquals(
      "3sKsAdJh 7d6d2hKd",
      Solver.process("omaha-holdem 2s4c4s6cTh 7d6d2hKd 3sKsAdJh"));
  }

  @Test
  public void test_omaha_holdem_6518_6s7c9dAdAh_ThTs4h2h_KhJd8h7s() {
    assertEquals(
      "KhJd8h7s ThTs4h2h",
      Solver.process("omaha-holdem 6s7c9dAdAh ThTs4h2h KhJd8h7s"));
  }

  @Test
  public void test_omaha_holdem_6519_3s4s7d8dTc_Qc9s5cTs_Kc5d3cTd_8s9h9dAh_KdJsTh7s_9cJdKh8h_5h2s4d6h_8cQd4c2d_As7hQsKs() {
    assertEquals(
      "As7hQsKs 8s9h9dAh Qc9s5cTs 8cQd4c2d Kc5d3cTd KdJsTh7s 5h2s4d6h 9cJdKh8h",
      Solver.process("omaha-holdem 3s4s7d8dTc Qc9s5cTs Kc5d3cTd 8s9h9dAh KdJsTh7s 9cJdKh8h 5h2s4d6h 8cQd4c2d As7hQsKs"));
  }

  @Test
  public void test_omaha_holdem_6520_2h4h5d6hKc_9c3s9d9h_7cQh8dTh_Kd4cJc5c() {
    assertEquals(
      "9c3s9d9h Kd4cJc5c 7cQh8dTh",
      Solver.process("omaha-holdem 2h4h5d6hKc 9c3s9d9h 7cQh8dTh Kd4cJc5c"));
  }

  @Test
  public void test_omaha_holdem_6521_4c6h8dJhQs_Ks7d3hTd_Qd6d4h2c_2dJdKd6s() {
    assertEquals(
      "Ks7d3hTd 2dJdKd6s Qd6d4h2c",
      Solver.process("omaha-holdem 4c6h8dJhQs Ks7d3hTd Qd6d4h2c 2dJdKd6s"));
  }

  @Test
  public void test_omaha_holdem_6522_3h6d9hJsTh_5c7hAs5h_Kc4hJdTs_8d3cAd6c_QhAcKsTd() {
    assertEquals(
      "8d3cAd6c Kc4hJdTs QhAcKsTd 5c7hAs5h",
      Solver.process("omaha-holdem 3h6d9hJsTh 5c7hAs5h Kc4hJdTs 8d3cAd6c QhAcKsTd"));
  }

  @Test
  public void test_omaha_holdem_6523_2s3d4s7cKc_6h8hThAh_9hTs4dQh_Qs7d8s7s_4c5h3cKh_Js9c9sQd_2hTcJdAs_7h9d8d2c_JhQc8c6d() {
    assertEquals(
      "JhQc8c6d 6h8hThAh 2hTcJdAs 9hTs4dQh Js9c9sQd 7h9d8d2c 4c5h3cKh Qs7d8s7s",
      Solver.process("omaha-holdem 2s3d4s7cKc 6h8hThAh 9hTs4dQh Qs7d8s7s 4c5h3cKh Js9c9sQd 2hTcJdAs 7h9d8d2c JhQc8c6d"));
  }

  @Test
  public void test_omaha_holdem_6524_2s7d7hAsQs_QdAh9c6d_9d6hJc4c_7cTs3s9s_7s2dTdKd() {
    assertEquals(
      "9d6hJc4c QdAh9c6d 7cTs3s9s 7s2dTdKd",
      Solver.process("omaha-holdem 2s7d7hAsQs QdAh9c6d 9d6hJc4c 7cTs3s9s 7s2dTdKd"));
  }

  @Test
  public void test_omaha_holdem_6525_2s4h9dAcJh_KcTcQhJd_JcAh6dKd_6hTd5hKh_5cKs8d3d_8c2dTh7c_Js3s8s9s_2h2c3hAs() {
    assertEquals(
      "6hTd5hKh 8c2dTh7c KcTcQhJd Js3s8s9s JcAh6dKd 2h2c3hAs 5cKs8d3d",
      Solver.process("omaha-holdem 2s4h9dAcJh KcTcQhJd JcAh6dKd 6hTd5hKh 5cKs8d3d 8c2dTh7c Js3s8s9s 2h2c3hAs"));
  }

  @Test
  public void test_omaha_holdem_6526_4h5d5h6cTd_Ac6d6s7d_2cKc2sAh_As9s9hJd_8c5s8sTh() {
    assertEquals(
      "2cKc2sAh As9s9hJd 8c5s8sTh Ac6d6s7d",
      Solver.process("omaha-holdem 4h5d5h6cTd Ac6d6s7d 2cKc2sAh As9s9hJd 8c5s8sTh"));
  }

  @Test
  public void test_omaha_holdem_6527_5d8h9cJhKs_Kd2hAs8d_9hThAd5s_3dTsAc3c_5cJd7d6d() {
    assertEquals(
      "3dTsAc3c 9hThAd5s Kd2hAs8d 5cJd7d6d",
      Solver.process("omaha-holdem 5d8h9cJhKs Kd2hAs8d 9hThAd5s 3dTsAc3c 5cJd7d6d"));
  }

  @Test
  public void test_omaha_holdem_6528_3h5d5h6hTh_7hTc9cKs_7dJcAs5s_6dKcJhTd_Ad6c4c2s_Js8s3d2c() {
    assertEquals(
      "Js8s3d2c 7hTc9cKs 6dKcJhTd 7dJcAs5s Ad6c4c2s",
      Solver.process("omaha-holdem 3h5d5h6hTh 7hTc9cKs 7dJcAs5s 6dKcJhTd Ad6c4c2s Js8s3d2c"));
  }

  @Test
  public void test_omaha_holdem_6529_6c6h7cAdJs_2d9h6sQc_2c5d8sKs() {
    assertEquals(
      "2c5d8sKs 2d9h6sQc",
      Solver.process("omaha-holdem 6c6h7cAdJs 2d9h6sQc 2c5d8sKs"));
  }

  @Test
  public void test_omaha_holdem_6530_3s4c9sAsTh_QcKd4h9h_9dAcTs3d_6c4sQsQh() {
    assertEquals(
      "QcKd4h9h 9dAcTs3d 6c4sQsQh",
      Solver.process("omaha-holdem 3s4c9sAsTh QcKd4h9h 9dAcTs3d 6c4sQsQh"));
  }

  @Test
  public void test_omaha_holdem_6531_2d6s8dJcKs_Kd2h6dKh_AhAc7s8h_4d7hQhTh_Jd7cJsQc() {
    assertEquals(
      "4d7hQhTh AhAc7s8h Jd7cJsQc Kd2h6dKh",
      Solver.process("omaha-holdem 2d6s8dJcKs Kd2h6dKh AhAc7s8h 4d7hQhTh Jd7cJsQc"));
  }

  @Test
  public void test_omaha_holdem_6532_4c8s9dQsTd_7dJh5hJd_Th3d7c3h_AhKh6sTs_9s3cTc2c_8d2s6dJs_5c3s2hQc_Qh7h9h9c_KsAc6h6c_7sJcQd4s() {
    assertEquals(
      "KsAc6h6c Th3d7c3h AhKh6sTs 5c3s2hQc 9s3cTc2c Qh7h9h9c 7dJh5hJd 7sJcQd4s=8d2s6dJs",
      Solver.process("omaha-holdem 4c8s9dQsTd 7dJh5hJd Th3d7c3h AhKh6sTs 9s3cTc2c 8d2s6dJs 5c3s2hQc Qh7h9h9c KsAc6h6c 7sJcQd4s"));
  }

  @Test
  public void test_omaha_holdem_6533_3c5d9cQcTh_2s4hQdAs_8dTsTdKd_8s8h5s6c_6hKs3d9s_Kc4cAh6s_2c2d7hKh_3s5h7d2h_7sAd5cJh_9h8c4sJd() {
    assertEquals(
      "2c2d7hKh 7sAd5cJh 8s8h5s6c 2s4hQdAs 3s5h7d2h 6hKs3d9s 8dTsTdKd 9h8c4sJd Kc4cAh6s",
      Solver.process("omaha-holdem 3c5d9cQcTh 2s4hQdAs 8dTsTdKd 8s8h5s6c 6hKs3d9s Kc4cAh6s 2c2d7hKh 3s5h7d2h 7sAd5cJh 9h8c4sJd"));
  }

  @Test
  public void test_omaha_holdem_6534_5d6s7c9sQc_8sQs2c3c_9dAcTdJd_AdAh5c2h_2dTh3s8h_8c9cKs8d_Kh6c5s6h_7s4c4d9h_7h4sKdAs_QhJhTsJc() {
    assertEquals(
      "7h4sKdAs 9dAcTdJd 8sQs2c3c QhJhTsJc AdAh5c2h 7s4c4d9h Kh6c5s6h 8c9cKs8d 2dTh3s8h",
      Solver.process("omaha-holdem 5d6s7c9sQc 8sQs2c3c 9dAcTdJd AdAh5c2h 2dTh3s8h 8c9cKs8d Kh6c5s6h 7s4c4d9h 7h4sKdAs QhJhTsJc"));
  }

  @Test
  public void test_omaha_holdem_6535_4c5h9c9hAc_KdTd7h4d_Ts2d8dQd_3cQs4s5s_TcJh8s8c() {
    assertEquals(
      "Ts2d8dQd KdTd7h4d 3cQs4s5s TcJh8s8c",
      Solver.process("omaha-holdem 4c5h9c9hAc KdTd7h4d Ts2d8dQd 3cQs4s5s TcJh8s8c"));
  }

  @Test
  public void test_omaha_holdem_6536_4c4s7s8d9c_5d8sAc7h_8h2s5s8c_5c2h3dTs_2dAsQh3h_Th6s6c7d_KhQd3s3c_Ad9s6hKs_4hQcTcKc_7cJd6dQs() {
    assertEquals(
      "5c2h3dTs 2dAsQh3h KhQd3s3c 7cJd6dQs 5d8sAc7h Ad9s6hKs 4hQcTcKc Th6s6c7d 8h2s5s8c",
      Solver.process("omaha-holdem 4c4s7s8d9c 5d8sAc7h 8h2s5s8c 5c2h3dTs 2dAsQh3h Th6s6c7d KhQd3s3c Ad9s6hKs 4hQcTcKc 7cJd6dQs"));
  }

  @Test
  public void test_omaha_holdem_6537_2d2s5dKdKh_KsAsTs9c_2hQd4d5c_8c9h4s4c() {
    assertEquals(
      "8c9h4s4c KsAsTs9c 2hQd4d5c",
      Solver.process("omaha-holdem 2d2s5dKdKh KsAsTs9c 2hQd4d5c 8c9h4s4c"));
  }

  @Test
  public void test_omaha_holdem_6538_4c5c6d6sJd_8hAs8d6c_Ac4sTcTh_KcQsJh8c_3c2s7dJs_Kd5sQdTd_7c3d9d9c_Ks6hAh7h_9hKh4hAd_2h9s7s5d() {
    assertEquals(
      "9hKh4hAd 2h9s7s5d Kd5sQdTd Ac4sTcTh KcQsJh8c 8hAs8d6c=Ks6hAh7h 3c2s7dJs=7c3d9d9c",
      Solver.process("omaha-holdem 4c5c6d6sJd 8hAs8d6c Ac4sTcTh KcQsJh8c 3c2s7dJs Kd5sQdTd 7c3d9d9c Ks6hAh7h 9hKh4hAd 2h9s7s5d"));
  }

  @Test
  public void test_omaha_holdem_6539_7h8d8hAhQc_Ac9c7s5c_ThQh3d5d() {
    assertEquals(
      "Ac9c7s5c ThQh3d5d",
      Solver.process("omaha-holdem 7h8d8hAhQc Ac9c7s5c ThQh3d5d"));
  }

  @Test
  public void test_omaha_holdem_6540_2d8cKsQcTc_8hAd3c5h_5c4cKd6h_2s6dTd9h_4h6c5dKh_9d9cKcJh_2hQh3sAh_4s7sQs7d_Qd3d7cJs_As3h4d8s() {
    assertEquals(
      "8hAd3c5h=As3h4d8s 4s7sQs7d Qd3d7cJs 4h6c5dKh 2s6dTd9h 2hQh3sAh 5c4cKd6h 9d9cKcJh",
      Solver.process("omaha-holdem 2d8cKsQcTc 8hAd3c5h 5c4cKd6h 2s6dTd9h 4h6c5dKh 9d9cKcJh 2hQh3sAh 4s7sQs7d Qd3d7cJs As3h4d8s"));
  }

  @Test
  public void test_omaha_holdem_6541_5h5s6d9sJs_3sQsTc8h_7cJh2s7s_QhKdJd9c_6s3dTd8s() {
    assertEquals(
      "QhKdJd9c 7cJh2s7s 6s3dTd8s 3sQsTc8h",
      Solver.process("omaha-holdem 5h5s6d9sJs 3sQsTc8h 7cJh2s7s QhKdJd9c 6s3dTd8s"));
  }

  @Test
  public void test_omaha_holdem_6542_2s4d6d7h8c_9dTs4sAd_KsQd7s5h_3cJs9hJd_TdAs3h2h_2dQc5d2c_8h8dJh6h() {
    assertEquals(
      "TdAs3h2h 3cJs9hJd 2dQc5d2c 8h8dJh6h KsQd7s5h 9dTs4sAd",
      Solver.process("omaha-holdem 2s4d6d7h8c 9dTs4sAd KsQd7s5h 3cJs9hJd TdAs3h2h 2dQc5d2c 8h8dJh6h"));
  }

  @Test
  public void test_omaha_holdem_6543_2h5s7sAhKh_Jd6cTd7c_QdQh7h4s_AdAs9d4d_Jh8d2sKs_8h4cJs6d_7d4h3d8c() {
    assertEquals(
      "8h4cJs6d Jd6cTd7c Jh8d2sKs AdAs9d4d 7d4h3d8c QdQh7h4s",
      Solver.process("omaha-holdem 2h5s7sAhKh Jd6cTd7c QdQh7h4s AdAs9d4d Jh8d2sKs 8h4cJs6d 7d4h3d8c"));
  }

  @Test
  public void test_omaha_holdem_6544_2d5c5d9hKh_8d3sTd7h_6hQsJdJc_4c4sJs7d_Qd6cKc8s_5sQcAc9s_2cTcTh8c_4h3d7sTs_5h9dJh8h() {
    assertEquals(
      "4h3d7sTs 8d3sTd7h 4c4sJs7d 2cTcTh8c 6hQsJdJc Qd6cKc8s 5h9dJh8h=5sQcAc9s",
      Solver.process("omaha-holdem 2d5c5d9hKh 8d3sTd7h 6hQsJdJc 4c4sJs7d Qd6cKc8s 5sQcAc9s 2cTcTh8c 4h3d7sTs 5h9dJh8h"));
  }

  @Test
  public void test_omaha_holdem_6545_5h5s9hJsQh_QsKs2h4s_5d3c5c8s_6c6s9sKc_4hJc8cJd() {
    assertEquals(
      "6c6s9sKc QsKs2h4s 4hJc8cJd 5d3c5c8s",
      Solver.process("omaha-holdem 5h5s9hJsQh QsKs2h4s 5d3c5c8s 6c6s9sKc 4hJc8cJd"));
  }

  @Test
  public void test_omaha_holdem_6546_9cJsQdTdTh_6h6c7c4d_2c8s8c6s_7sKsQhAc_9d3h9sAs_4h7h9hKd_QsKc4c8d() {
    assertEquals(
      "6h6c7c4d 2c8s8c6s 4h7h9hKd=QsKc4c8d 7sKsQhAc 9d3h9sAs",
      Solver.process("omaha-holdem 9cJsQdTdTh 6h6c7c4d 2c8s8c6s 7sKsQhAc 9d3h9sAs 4h7h9hKd QsKc4c8d"));
  }

  @Test
  public void test_omaha_holdem_6547_5h5s6h8cQh_Ad8sKs3c_Jh4s7c9d_8d3sQc2d_6s9c7s4d_Kh2hAcJc_JsTdQd4h_Ah4cQs9h_Kc9s8h2s() {
    assertEquals(
      "Kc9s8h2s Ad8sKs3c JsTdQd4h 8d3sQc2d 6s9c7s4d=Jh4s7c9d Kh2hAcJc Ah4cQs9h",
      Solver.process("omaha-holdem 5h5s6h8cQh Ad8sKs3c Jh4s7c9d 8d3sQc2d 6s9c7s4d Kh2hAcJc JsTdQd4h Ah4cQs9h Kc9s8h2s"));
  }

  @Test
  public void test_omaha_holdem_6548_2s3c4cJcKc_8s3h5s3s_9d7sJhQs() {
    assertEquals(
      "9d7sJhQs 8s3h5s3s",
      Solver.process("omaha-holdem 2s3c4cJcKc 8s3h5s3s 9d7sJhQs"));
  }

  @Test
  public void test_omaha_holdem_6549_5d7d9sKdTc_Js7cAhQs_3s6d4d9c_3dQh6h2c_9hAsTd7s_9d2d4c7h_QdKsQcJd_6s8d2h4s() {
    assertEquals(
      "3dQh6h2c 9hAsTd7s 6s8d2h4s Js7cAhQs 3s6d4d9c 9d2d4c7h QdKsQcJd",
      Solver.process("omaha-holdem 5d7d9sKdTc Js7cAhQs 3s6d4d9c 3dQh6h2c 9hAsTd7s 9d2d4c7h QdKsQcJd 6s8d2h4s"));
  }

  @Test
  public void test_omaha_holdem_6550_2s6s7c7d8s_9c9d8c9h_QhAh3cKc_3h5cKs4h_2d4sJdTd_2h6d5d7s_6cJcAs4c_QcQs5s4d_6h9sTcJs_8hAc5hKh() {
    assertEquals(
      "QhAh3cKc 2d4sJdTd 6cJcAs4c 8hAc5hKh 9c9d8c9h 3h5cKs4h 6h9sTcJs QcQs5s4d 2h6d5d7s",
      Solver.process("omaha-holdem 2s6s7c7d8s 9c9d8c9h QhAh3cKc 3h5cKs4h 2d4sJdTd 2h6d5d7s 6cJcAs4c QcQs5s4d 6h9sTcJs 8hAc5hKh"));
  }

  @Test
  public void test_omaha_holdem_6551_3d3h8cJcJs_TcAh7d3c_6c5cKs4h_As2s2cTd_5h4c5sQd_8d7s8sKd_2hQh6sQc() {
    assertEquals(
      "6c5cKs4h As2s2cTd 5h4c5sQd 2hQh6sQc TcAh7d3c 8d7s8sKd",
      Solver.process("omaha-holdem 3d3h8cJcJs TcAh7d3c 6c5cKs4h As2s2cTd 5h4c5sQd 8d7s8sKd 2hQh6sQc"));
  }

  @Test
  public void test_omaha_holdem_6552_2d3h5cJsKs_Kh3c8h7s_7h9h6s9c_Jd3s5h4h_6d9s7d7c() {
    assertEquals(
      "6d9s7d7c 7h9h6s9c Jd3s5h4h Kh3c8h7s",
      Solver.process("omaha-holdem 2d3h5cJsKs Kh3c8h7s 7h9h6s9c Jd3s5h4h 6d9s7d7c"));
  }

  @Test
  public void test_omaha_holdem_6553_3d6c7s9cTd_6sAhKsTs_4h3hJh2d_JdQsQcJs_6hAs6dTh() {
    assertEquals(
      "4h3hJh2d JdQsQcJs 6sAhKsTs 6hAs6dTh",
      Solver.process("omaha-holdem 3d6c7s9cTd 6sAhKsTs 4h3hJh2d JdQsQcJs 6hAs6dTh"));
  }

  @Test
  public void test_omaha_holdem_6554_4d5s9cKdQh_7s8s3d8c_2cQdAsJs() {
    assertEquals(
      "7s8s3d8c 2cQdAsJs",
      Solver.process("omaha-holdem 4d5s9cKdQh 7s8s3d8c 2cQdAsJs"));
  }

  @Test
  public void test_omaha_holdem_6555_3c4d5h8sTc_6hTdJhKs_As5s2d3h_6d7cKhAh_Kd2c9c8h() {
    assertEquals(
      "Kd2c9c8h 6hTdJhKs As5s2d3h 6d7cKhAh",
      Solver.process("omaha-holdem 3c4d5h8sTc 6hTdJhKs As5s2d3h 6d7cKhAh Kd2c9c8h"));
  }

  @Test
  public void test_omaha_holdem_6556_4c7c7s9dQs_Ah5d2d6s_6h5c3dJd_Kh8d2c3s_AdQh6c4h_4d9s3c7h() {
    assertEquals(
      "6h5c3dJd Kh8d2c3s Ah5d2d6s AdQh6c4h 4d9s3c7h",
      Solver.process("omaha-holdem 4c7c7s9dQs Ah5d2d6s 6h5c3dJd Kh8d2c3s AdQh6c4h 4d9s3c7h"));
  }

  @Test
  public void test_omaha_holdem_6557_3d3h5cKhQd_Ac6c2c9s_2d7s3sKs_QsQh4s9c() {
    assertEquals(
      "Ac6c2c9s 2d7s3sKs QsQh4s9c",
      Solver.process("omaha-holdem 3d3h5cKhQd Ac6c2c9s 2d7s3sKs QsQh4s9c"));
  }

  @Test
  public void test_omaha_holdem_6558_5d7c8sKsQs_6sKhJsJh_Kd8h3h5s_3cThKcAc_Jc6c9s2d_Ad9cQd5h_2s7dTs5c_7hAh4cTc() {
    assertEquals(
      "7hAh4cTc 3cThKcAc Ad9cQd5h Kd8h3h5s Jc6c9s2d 2s7dTs5c 6sKhJsJh",
      Solver.process("omaha-holdem 5d7c8sKsQs 6sKhJsJh Kd8h3h5s 3cThKcAc Jc6c9s2d Ad9cQd5h 2s7dTs5c 7hAh4cTc"));
  }

  @Test
  public void test_omaha_holdem_6559_7d8dAdKsQc_4h3h4c7c_5c3c6s5h_9c8s2c5d_Jd2s6dAh_Jc3sTcKd_Ac5s9dTs_7h8h2dKh() {
    assertEquals(
      "5c3c6s5h 4h3h4c7c 9c8s2c5d Ac5s9dTs 7h8h2dKh Jc3sTcKd Jd2s6dAh",
      Solver.process("omaha-holdem 7d8dAdKsQc 4h3h4c7c 5c3c6s5h 9c8s2c5d Jd2s6dAh Jc3sTcKd Ac5s9dTs 7h8h2dKh"));
  }

  @Test
  public void test_omaha_holdem_6560_4s7hAhQcTd_6cAc6hQh_5h3cTs6d_Jc5c3d5s_4h9c9sKc_KdJd8c4d_AsJh9dAd() {
    assertEquals(
      "Jc5c3d5s 4h9c9sKc 5h3cTs6d 6cAc6hQh AsJh9dAd KdJd8c4d",
      Solver.process("omaha-holdem 4s7hAhQcTd 6cAc6hQh 5h3cTs6d Jc5c3d5s 4h9c9sKc KdJd8c4d AsJh9dAd"));
  }

  @Test
  public void test_omaha_holdem_6561_6s9dJcKsQd_3d2h7cAh_9h4d5cJh_8d3h2cAc_4c6hAsQc_6d7dKc9c() {
    assertEquals(
      "3d2h7cAh 8d3h2cAc 9h4d5cJh 4c6hAsQc 6d7dKc9c",
      Solver.process("omaha-holdem 6s9dJcKsQd 3d2h7cAh 9h4d5cJh 8d3h2cAc 4c6hAsQc 6d7dKc9c"));
  }

  @Test
  public void test_omaha_holdem_6562_2d4c6c7cAs_7s2c8sQd_5d3d5cJd_4s9dAcQc_6s4hJc5h_3s8cTd8h_Qh9sKs7d_6h2s6dJh() {
    assertEquals(
      "Qh9sKs7d 3s8cTd8h 6s4hJc5h 7s2c8sQd 6h2s6dJh 5d3d5cJd 4s9dAcQc",
      Solver.process("omaha-holdem 2d4c6c7cAs 7s2c8sQd 5d3d5cJd 4s9dAcQc 6s4hJc5h 3s8cTd8h Qh9sKs7d 6h2s6dJh"));
  }

  @Test
  public void test_omaha_holdem_6563_2s4c7s9hAd_5hTd2cAc_8h3c8s4s_3sKh4d6c() {
    assertEquals(
      "3sKh4d6c 8h3c8s4s 5hTd2cAc",
      Solver.process("omaha-holdem 2s4c7s9hAd 5hTd2cAc 8h3c8s4s 3sKh4d6c"));
  }

  @Test
  public void test_omaha_holdem_6564_5d7h9cAsQh_8hQd7d6h_3d3s5h6c_2c4s7c4d() {
    assertEquals(
      "3d3s5h6c 2c4s7c4d 8hQd7d6h",
      Solver.process("omaha-holdem 5d7h9cAsQh 8hQd7d6h 3d3s5h6c 2c4s7c4d"));
  }

  @Test
  public void test_omaha_holdem_6565_8s9sKcTcTh_Ts9cKdQd_8hJhAh2d_4hQh5cAc_4c2h6s4s_6c4d6d7d_Jd8cAd3d_7s7h9h9d() {
    assertEquals(
      "4hQh5cAc 4c2h6s4s 8hJhAh2d=Jd8cAd3d 6c4d6d7d 7s7h9h9d Ts9cKdQd",
      Solver.process("omaha-holdem 8s9sKcTcTh Ts9cKdQd 8hJhAh2d 4hQh5cAc 4c2h6s4s 6c4d6d7d Jd8cAd3d 7s7h9h9d"));
  }

  @Test
  public void test_omaha_holdem_6566_8h9cKcKdQd_Tc8c5hAd_7hJhKs4s_7s9hAh6s_2c8d4d4c_TsAs2hJs_Qs5c7cKh_JdTd9s5d_Th5s6h9d_6c3s2s8s() {
    assertEquals(
      "2c8d4d4c 6c3s2s8s Tc8c5hAd Th5s6h9d 7s9hAh6s 7hJhKs4s JdTd9s5d=TsAs2hJs Qs5c7cKh",
      Solver.process("omaha-holdem 8h9cKcKdQd Tc8c5hAd 7hJhKs4s 7s9hAh6s 2c8d4d4c TsAs2hJs Qs5c7cKh JdTd9s5d Th5s6h9d 6c3s2s8s"));
  }

  @Test
  public void test_omaha_holdem_6567_2c3h8dAhQd_KdJd4s5d_Jh5cKh2d_3c4dAsTc_8sQh6c9c_6h9hJs9s_9dAdTh7s_7h4hTs5s_7d6sAc5h_Qs8h2h3d() {
    assertEquals(
      "Jh5cKh2d 6h9hJs9s 7d6sAc5h 9dAdTh7s 8sQh6c9c=Qs8h2h3d 3c4dAsTc 7h4hTs5s=KdJd4s5d",
      Solver.process("omaha-holdem 2c3h8dAhQd KdJd4s5d Jh5cKh2d 3c4dAsTc 8sQh6c9c 6h9hJs9s 9dAdTh7s 7h4hTs5s 7d6sAc5h Qs8h2h3d"));
  }

  @Test
  public void test_omaha_holdem_6568_3s7c9hKhTd_Kc7sAh4d_JsAcQd2c_6d5h5dTh_Tc8hQh6s_Ts5s8d3d_6c5cAs8s_Kd4cQsJc() {
    assertEquals(
      "6d5h5dTh Ts5s8d3d Kc7sAh4d 6c5cAs8s=Tc8hQh6s JsAcQd2c=Kd4cQsJc",
      Solver.process("omaha-holdem 3s7c9hKhTd Kc7sAh4d JsAcQd2c 6d5h5dTh Tc8hQh6s Ts5s8d3d 6c5cAs8s Kd4cQsJc"));
  }

  @Test
  public void test_omaha_holdem_6569_5s8h9hQcTh_Kd9sQd4d_3d3s7cTs_KsKc2dQs_3hTdAs4h() {
    assertEquals(
      "3d3s7cTs KsKc2dQs Kd9sQd4d 3hTdAs4h",
      Solver.process("omaha-holdem 5s8h9hQcTh Kd9sQd4d 3d3s7cTs KsKc2dQs 3hTdAs4h"));
  }

  @Test
  public void test_omaha_holdem_6570_3h5d5h9cQc_6hQdJc6s_Kd7h4hJs_Kc8h8d4c_2cThAcTs() {
    assertEquals(
      "Kd7h4hJs Kc8h8d4c 2cThAcTs 6hQdJc6s",
      Solver.process("omaha-holdem 3h5d5h9cQc 6hQdJc6s Kd7h4hJs Kc8h8d4c 2cThAcTs"));
  }

  @Test
  public void test_omaha_holdem_6571_2c3d5c9d9s_8c4h5hTc_JsKh2h4c_7h6h3sQd_9h2s8d7s_Jd9cKsAc_Jc5d6d8s_AhAs6cAd_KdTh7d5s_Kc3cTd2d() {
    assertEquals(
      "JsKh2h4c 7h6h3sQd Kc3cTd2d 8c4h5hTc Jc5d6d8s KdTh7d5s AhAs6cAd Jd9cKsAc 9h2s8d7s",
      Solver.process("omaha-holdem 2c3d5c9d9s 8c4h5hTc JsKh2h4c 7h6h3sQd 9h2s8d7s Jd9cKsAc Jc5d6d8s AhAs6cAd KdTh7d5s Kc3cTd2d"));
  }

  @Test
  public void test_omaha_holdem_6572_5c5sAsKhQs_2d8dQh2s_JdQc9hJs_Td2h7s4s_6cAdJcJh() {
    assertEquals(
      "2d8dQh2s JdQc9hJs 6cAdJcJh Td2h7s4s",
      Solver.process("omaha-holdem 5c5sAsKhQs 2d8dQh2s JdQc9hJs Td2h7s4s 6cAdJcJh"));
  }

  @Test
  public void test_omaha_holdem_6573_2h6s8d9hTh_Ad4s3dJh_3s2d3h2c_5s6cAhQh_4d8h5dQd_Ac8s7cAs_4h4c6hJd_5cKs7dTc_Kd9d7sQc_6dQs3cTs() {
    assertEquals(
      "Ad4s3dJh 4d8h5dQd 6dQs3cTs 3s2d3h2c 5cKs7dTc=Ac8s7cAs=Kd9d7sQc 4h4c6hJd 5s6cAhQh",
      Solver.process("omaha-holdem 2h6s8d9hTh Ad4s3dJh 3s2d3h2c 5s6cAhQh 4d8h5dQd Ac8s7cAs 4h4c6hJd 5cKs7dTc Kd9d7sQc 6dQs3cTs"));
  }

  @Test
  public void test_omaha_holdem_6574_3d5cJsKdKh_7dQdJh7h_5s9d6s2d_Ah7c4d4s_3s4hKc6d_6c8hAdTh_KsAc8d9c_QsTd8c7s_3c6hQc9h() {
    assertEquals(
      "QsTd8c7s 6c8hAdTh 3c6hQc9h Ah7c4d4s 5s9d6s2d 7dQdJh7h KsAc8d9c 3s4hKc6d",
      Solver.process("omaha-holdem 3d5cJsKdKh 7dQdJh7h 5s9d6s2d Ah7c4d4s 3s4hKc6d 6c8hAdTh KsAc8d9c QsTd8c7s 3c6hQc9h"));
  }

  @Test
  public void test_omaha_holdem_6575_2h3d3hAdQc_Jc7c2c5d_9hTc9c4s_Qh2sAh9s_4d8h3c7d_5h7hKc9d_7s6sKs5s() {
    assertEquals(
      "7s6sKs5s 5h7hKc9d Jc7c2c5d 9hTc9c4s Qh2sAh9s 4d8h3c7d",
      Solver.process("omaha-holdem 2h3d3hAdQc Jc7c2c5d 9hTc9c4s Qh2sAh9s 4d8h3c7d 5h7hKc9d 7s6sKs5s"));
  }

  @Test
  public void test_omaha_holdem_6576_4c4d4s8dKs_6c5hAh4h_6s8s2dKh_Jh3h2sTd_Jd7h8hTh() {
    assertEquals(
      "Jd7h8hTh=Jh3h2sTd 6s8s2dKh 6c5hAh4h",
      Solver.process("omaha-holdem 4c4d4s8dKs 6c5hAh4h 6s8s2dKh Jh3h2sTd Jd7h8hTh"));
  }

  @Test
  public void test_omaha_holdem_6577_5c5s8c8dTc_JsKd4c4h_7dTd7h6h_9dAsQsKc_3c5hTs7c_6s9c8s2s() {
    assertEquals(
      "9dAsQsKc JsKd4c4h 7dTd7h6h 6s9c8s2s 3c5hTs7c",
      Solver.process("omaha-holdem 5c5s8c8dTc JsKd4c4h 7dTd7h6h 9dAsQsKc 3c5hTs7c 6s9c8s2s"));
  }

  @Test
  public void test_omaha_holdem_6578_4h6d7h8sAh_6h3sJd8d_KdKcTs2c_2hKhQdKs_7cAs5c4s_3cJhQh2s_Td5hJc6c_Th2d7s3d_Tc9s8cQs_4cAdJs9h() {
    assertEquals(
      "Th2d7s3d KdKcTs2c 6h3sJd8d 4cAdJs9h 7cAs5c4s=Td5hJc6c Tc9s8cQs 3cJhQh2s 2hKhQdKs",
      Solver.process("omaha-holdem 4h6d7h8sAh 6h3sJd8d KdKcTs2c 2hKhQdKs 7cAs5c4s 3cJhQh2s Td5hJc6c Th2d7s3d Tc9s8cQs 4cAdJs9h"));
  }

  @Test
  public void test_omaha_holdem_6579_2h3h7h9cJs_3c2c8h7s_8d8s4s9d() {
    assertEquals(
      "8d8s4s9d 3c2c8h7s",
      Solver.process("omaha-holdem 2h3h7h9cJs 3c2c8h7s 8d8s4s9d"));
  }

  @Test
  public void test_omaha_holdem_6580_2c4c4s6c6d_Jd4h8d9c_5h2s5c7d_KcAd7c2h_3sJsTc9s_Qh8cQdQs() {
    assertEquals(
      "3sJsTc9s 5h2s5c7d Qh8cQdQs Jd4h8d9c KcAd7c2h",
      Solver.process("omaha-holdem 2c4c4s6c6d Jd4h8d9c 5h2s5c7d KcAd7c2h 3sJsTc9s Qh8cQdQs"));
  }

  @Test
  public void test_omaha_holdem_6581_2d3d6c8sTs_4c3h3c7s_QsKh4dAh_2cAsQcQd_9sJs5d2s_9h9dKd5s_8hTc8d7d_5c7h2hJc_9cAd6sTd() {
    assertEquals(
      "QsKh4dAh 5c7h2hJc=9sJs5d2s 9h9dKd5s 2cAsQcQd 9cAd6sTd 4c3h3c7s 8hTc8d7d",
      Solver.process("omaha-holdem 2d3d6c8sTs 4c3h3c7s QsKh4dAh 2cAsQcQd 9sJs5d2s 9h9dKd5s 8hTc8d7d 5c7h2hJc 9cAd6sTd"));
  }

  @Test
  public void test_omaha_holdem_6582_2h3c5h9cJs_8s7c9sKc_6d9dAcQh_3s7sAdKh_Qd3hJcTc_8c5s5c2s_8dKd3d4d_7h6s4cJd() {
    assertEquals(
      "8dKd3d4d 3s7sAdKh 8s7c9sKc 6d9dAcQh Qd3hJcTc 8c5s5c2s 7h6s4cJd",
      Solver.process("omaha-holdem 2h3c5h9cJs 8s7c9sKc 6d9dAcQh 3s7sAdKh Qd3hJcTc 8c5s5c2s 8dKd3d4d 7h6s4cJd"));
  }

  @Test
  public void test_omaha_holdem_6583_3h6d8sAhQs_5c5h2d3d_5dJcAdKc_2hJsKsQd_3sQc7c7h_9h6sTsKd() {
    assertEquals(
      "5c5h2d3d 9h6sTsKd 2hJsKsQd 5dJcAdKc 3sQc7c7h",
      Solver.process("omaha-holdem 3h6d8sAhQs 5c5h2d3d 5dJcAdKc 2hJsKsQd 3sQc7c7h 9h6sTsKd"));
  }

  @Test
  public void test_omaha_holdem_6584_3s7h9dKsTd_5d5s4dJs_9s9h8dKh_3d6c6d2c_Qd7c4h2s_Qh8hTcTs_AcQcQsJc_6sAdKd2d_9c8c7s3h() {
    assertEquals(
      "5d5s4dJs 3d6c6d2c Qd7c4h2s 6sAdKd2d 9c8c7s3h 9s9h8dKh Qh8hTcTs AcQcQsJc",
      Solver.process("omaha-holdem 3s7h9dKsTd 5d5s4dJs 9s9h8dKh 3d6c6d2c Qd7c4h2s Qh8hTcTs AcQcQsJc 6sAdKd2d 9c8c7s3h"));
  }

  @Test
  public void test_omaha_holdem_6585_6c7sAcKcKh_5dTcJdAh_4c8hQc6d_8d3s3dJh_2sJsKs3c_4d9s3h9d_4s8s2d9c_Jc5hTd9h_AdThAs2c_6sKd7h5s() {
    assertEquals(
      "4s8s2d9c Jc5hTd9h 8d3s3dJh 4d9s3h9d 5dTcJdAh 2sJsKs3c 4c8hQc6d 6sKd7h5s AdThAs2c",
      Solver.process("omaha-holdem 6c7sAcKcKh 5dTcJdAh 4c8hQc6d 8d3s3dJh 2sJsKs3c 4d9s3h9d 4s8s2d9c Jc5hTd9h AdThAs2c 6sKd7h5s"));
  }

  @Test
  public void test_omaha_holdem_6586_4d5h5sAcAh_8sAsKcTd_Jc3d2d9h_2h7c3cAd_9s7hKd6s_7d3h8cQc_ThQsQd7s_4s4cJs2s_Kh9c5dJd_9d6cKs5c() {
    assertEquals(
      "7d3h8cQc 9s7hKd6s ThQsQd7s 9d6cKs5c=Kh9c5dJd 8sAsKcTd 2h7c3cAd=Jc3d2d9h 4s4cJs2s",
      Solver.process("omaha-holdem 4d5h5sAcAh 8sAsKcTd Jc3d2d9h 2h7c3cAd 9s7hKd6s 7d3h8cQc ThQsQd7s 4s4cJs2s Kh9c5dJd 9d6cKs5c"));
  }

  @Test
  public void test_omaha_holdem_6587_2s4s7sKcQc_9h4hJd5d_5s6d9sKs_2d4d5h7d_8sQhTh9c_TcJs8h4c_Ts3dKh6h_9d3cAdTd_5c7c2c3h() {
    assertEquals(
      "9d3cAdTd 9h4hJd5d=TcJs8h4c 8sQhTh9c Ts3dKh6h 5c7c2c3h 2d4d5h7d 5s6d9sKs",
      Solver.process("omaha-holdem 2s4s7sKcQc 9h4hJd5d 5s6d9sKs 2d4d5h7d 8sQhTh9c TcJs8h4c Ts3dKh6h 9d3cAdTd 5c7c2c3h"));
  }

  @Test
  public void test_omaha_holdem_6588_3c5h7h8hAh_QhJh9h9s_5s5c6cTc_Th2h6h2s_TdQc2d3d_9cKs6s4s() {
    assertEquals(
      "TdQc2d3d 5s5c6cTc 9cKs6s4s Th2h6h2s QhJh9h9s",
      Solver.process("omaha-holdem 3c5h7h8hAh QhJh9h9s 5s5c6cTc Th2h6h2s TdQc2d3d 9cKs6s4s"));
  }

  @Test
  public void test_omaha_holdem_6589_5s6s8cKdTc_JsJh8d7d_7sThQhKh_As2sKs4s_6h7cQdQs_Kc3hQc9d() {
    assertEquals(
      "JsJh8d7d 6h7cQdQs Kc3hQc9d As2sKs4s 7sThQhKh",
      Solver.process("omaha-holdem 5s6s8cKdTc JsJh8d7d 7sThQhKh As2sKs4s 6h7cQdQs Kc3hQc9d"));
  }

  @Test
  public void test_omaha_holdem_6590_5dAdJcKsTd_7s6c8h5s_Kh6s5c2s_9dTc3cKc_9h2d2cQc() {
    assertEquals(
      "7s6c8h5s Kh6s5c2s 9dTc3cKc 9h2d2cQc",
      Solver.process("omaha-holdem 5dAdJcKsTd 7s6c8h5s Kh6s5c2s 9dTc3cKc 9h2d2cQc"));
  }

  @Test
  public void test_omaha_holdem_6591_3d6s8hKhQh_JdKd7c4h_AhTs9s6d_2s5c4d5d() {
    assertEquals(
      "2s5c4d5d AhTs9s6d JdKd7c4h",
      Solver.process("omaha-holdem 3d6s8hKhQh JdKd7c4h AhTs9s6d 2s5c4d5d"));
  }

  @Test
  public void test_omaha_holdem_6592_2c2s6c9dJs_As6dAcJd_7hKc4c4h_8dTsKs5s_TcAh7c5c_9c6h3hTd_8sAd7dKd_5d2h4d3s_5h6s2d8h() {
    assertEquals(
      "8dTsKs5s TcAh7c5c 8sAd7dKd 7hKc4c4h 9c6h3hTd As6dAcJd 5d2h4d3s 5h6s2d8h",
      Solver.process("omaha-holdem 2c2s6c9dJs As6dAcJd 7hKc4c4h 8dTsKs5s TcAh7c5c 9c6h3hTd 8sAd7dKd 5d2h4d3s 5h6s2d8h"));
  }

  @Test
  public void test_omaha_holdem_6593_3d4c6h9sAs_Ts9d5h9h_Ac4h4dKd() {
    assertEquals(
      "Ac4h4dKd Ts9d5h9h",
      Solver.process("omaha-holdem 3d4c6h9sAs Ts9d5h9h Ac4h4dKd"));
  }

  @Test
  public void test_omaha_holdem_6594_2c2h3s4hAc_5hTc7sQd_Ks7h3dQc_8cJsKh4s_9sJc8s3h_6dKdQhTh_8d5sTs9h_As6s3cKc() {
    assertEquals(
      "8d5sTs9h 5hTc7sQd 6dKdQhTh 9sJc8s3h Ks7h3dQc 8cJsKh4s As6s3cKc",
      Solver.process("omaha-holdem 2c2h3s4hAc 5hTc7sQd Ks7h3dQc 8cJsKh4s 9sJc8s3h 6dKdQhTh 8d5sTs9h As6s3cKc"));
  }

  @Test
  public void test_omaha_holdem_6595_2d4c5sJhQc_JsKs6hJc_5c9h7c5h_TdAs5d9c() {
    assertEquals(
      "TdAs5d9c 5c9h7c5h JsKs6hJc",
      Solver.process("omaha-holdem 2d4c5sJhQc JsKs6hJc 5c9h7c5h TdAs5d9c"));
  }

  @Test
  public void test_omaha_holdem_6596_2h8hAdJdJh_5s3h2c9h_Ac6d3d6h_TsKhTdKc_Jc7h9dAs_Js3c5c6s_6c2d8s8c_Qh7cAhQs() {
    assertEquals(
      "TsKhTdKc Ac6d3d6h Js3c5c6s 5s3h2c9h Qh7cAhQs 6c2d8s8c Jc7h9dAs",
      Solver.process("omaha-holdem 2h8hAdJdJh 5s3h2c9h Ac6d3d6h TsKhTdKc Jc7h9dAs Js3c5c6s 6c2d8s8c Qh7cAhQs"));
  }

  @Test
  public void test_omaha_holdem_6597_3d6d8h9cTc_6cTs7d4h_Jd8dJsQc_KcJc2d7h() {
    assertEquals(
      "6cTs7d4h KcJc2d7h Jd8dJsQc",
      Solver.process("omaha-holdem 3d6d8h9cTc 6cTs7d4h Jd8dJsQc KcJc2d7h"));
  }

  @Test
  public void test_omaha_holdem_6598_7hAsJcKcTh_Jh3sKs2d_2s6d8d9d_5d6sQs3d() {
    assertEquals(
      "5d6sQs3d Jh3sKs2d 2s6d8d9d",
      Solver.process("omaha-holdem 7hAsJcKcTh Jh3sKs2d 2s6d8d9d 5d6sQs3d"));
  }

  @Test
  public void test_omaha_holdem_6599_3s4s5c6dQc_2d5d6cJc_8h3hQs7h_3dQd7cQh_4hJs7d6h() {
    assertEquals(
      "2d5d6cJc 3dQd7cQh=4hJs7d6h 8h3hQs7h",
      Solver.process("omaha-holdem 3s4s5c6dQc 2d5d6cJc 8h3hQs7h 3dQd7cQh 4hJs7d6h"));
  }

  @Test
  public void test_omaha_holdem_6600_3h5s6sAcQh_5c2c4s7d_Jh3s5dTd_QcTcAhKh_KcTh8h6d_4d8d6c9h_4cKsQsAd() {
    assertEquals(
      "4d8d6c9h KcTh8h6d Jh3s5dTd 4cKsQsAd=QcTcAhKh 5c2c4s7d",
      Solver.process("omaha-holdem 3h5s6sAcQh 5c2c4s7d Jh3s5dTd QcTcAhKh KcTh8h6d 4d8d6c9h 4cKsQsAd"));
  }

  @Test
  public void test_omaha_holdem_6601_7s9hAsKdQc_5h2cKs3d_5dKh2s3s_9d9s8c7h_6s3h8s6c_KcQsTdQd_4dJd8h6h_5sAh2dTh_7d4h6d8d() {
    assertEquals(
      "4dJd8h6h 6s3h8s6c 7d4h6d8d 5dKh2s3s=5h2cKs3d 5sAh2dTh 9d9s8c7h KcQsTdQd",
      Solver.process("omaha-holdem 7s9hAsKdQc 5h2cKs3d 5dKh2s3s 9d9s8c7h 6s3h8s6c KcQsTdQd 4dJd8h6h 5sAh2dTh 7d4h6d8d"));
  }

  @Test
  public void test_omaha_holdem_6602_3c4s6h9d9s_4c9cJc2c_7c8dKs3d_4h7s7hJd_3s6d5cAs() {
    assertEquals(
      "7c8dKs3d 3s6d5cAs 4h7s7hJd 4c9cJc2c",
      Solver.process("omaha-holdem 3c4s6h9d9s 4c9cJc2c 7c8dKs3d 4h7s7hJd 3s6d5cAs"));
  }

  @Test
  public void test_omaha_holdem_6603_3s6c7dJsQd_Ah9sKcJc_6h4cKsAc_5s9c4s2s_3hTs3c2d_3d6dJhTh_5c8c9dKh() {
    assertEquals(
      "5c8c9dKh 6h4cKsAc Ah9sKcJc 3d6dJhTh 3hTs3c2d 5s9c4s2s",
      Solver.process("omaha-holdem 3s6c7dJsQd Ah9sKcJc 6h4cKsAc 5s9c4s2s 3hTs3c2d 3d6dJhTh 5c8c9dKh"));
  }

  @Test
  public void test_omaha_holdem_6604_2c3d9h9sKs_6c3cAc8d_Tc6hQdJd_TdJc9d4s_5sJs8s8h_4h4cKcQs_9cAh2s7h() {
    assertEquals(
      "Tc6hQdJd 6c3cAc8d 5sJs8s8h 4h4cKcQs TdJc9d4s 9cAh2s7h",
      Solver.process("omaha-holdem 2c3d9h9sKs 6c3cAc8d Tc6hQdJd TdJc9d4s 5sJs8s8h 4h4cKcQs 9cAh2s7h"));
  }

  @Test
  public void test_omaha_holdem_6605_4c9h9sQcTs_2c4h6h8c_Kc5dJs3s_QhAh9dQd_4s9c7dJc_5h4dJhKh_8s2hJd7h_6d5s6cKd() {
    assertEquals(
      "2c4h6h8c 6d5s6cKd 8s2hJd7h 5h4dJhKh=Kc5dJs3s 4s9c7dJc QhAh9dQd",
      Solver.process("omaha-holdem 4c9h9sQcTs 2c4h6h8c Kc5dJs3s QhAh9dQd 4s9c7dJc 5h4dJhKh 8s2hJd7h 6d5s6cKd"));
  }

  @Test
  public void test_omaha_holdem_6606_3h4hJdQsTc_8cTs7h9s_2dKhJcQd_Qc8sTd5c_6h8d6cAd_3c4c9h4s() {
    assertEquals(
      "6h8d6cAd Qc8sTd5c 2dKhJcQd 3c4c9h4s 8cTs7h9s",
      Solver.process("omaha-holdem 3h4hJdQsTc 8cTs7h9s 2dKhJcQd Qc8sTd5c 6h8d6cAd 3c4c9h4s"));
  }

  @Test
  public void test_omaha_holdem_6607_4d9sKdTdTs_Kh7h4s5h_2cQcKs2d_4cJsTc9d_5dKcQh7d_7c3cTh8c_8s2s3sAc_As6hAh6s() {
    assertEquals(
      "8s2s3sAc Kh7h4s5h 2cQcKs2d As6hAh6s 7c3cTh8c 5dKcQh7d 4cJsTc9d",
      Solver.process("omaha-holdem 4d9sKdTdTs Kh7h4s5h 2cQcKs2d 4cJsTc9d 5dKcQh7d 7c3cTh8c 8s2s3sAc As6hAh6s"));
  }

  @Test
  public void test_omaha_holdem_6608_2s7dQcQsTd_JsJh6d8h_5c5s4c8d() {
    assertEquals(
      "5c5s4c8d JsJh6d8h",
      Solver.process("omaha-holdem 2s7dQcQsTd JsJh6d8h 5c5s4c8d"));
  }

  @Test
  public void test_omaha_holdem_6609_3d6d9sAcJd_Ks4h7c3h_7sQsKcJs_9c2dKh4d_6c2h5cTh_3c8c5dQc_Kd5h9hTd_JcQd2s4c() {
    assertEquals(
      "3c8c5dQc Ks4h7c3h 6c2h5cTh JcQd2s4c 7sQsKcJs 9c2dKh4d Kd5h9hTd",
      Solver.process("omaha-holdem 3d6d9sAcJd Ks4h7c3h 7sQsKcJs 9c2dKh4d 6c2h5cTh 3c8c5dQc Kd5h9hTd JcQd2s4c"));
  }

  @Test
  public void test_omaha_holdem_6610_2c2h9hQsTh_8h4c8s9s_6dQh7h6c_2d5c7c3h() {
    assertEquals(
      "8h4c8s9s 2d5c7c3h 6dQh7h6c",
      Solver.process("omaha-holdem 2c2h9hQsTh 8h4c8s9s 6dQh7h6c 2d5c7c3h"));
  }

  @Test
  public void test_omaha_holdem_6611_2c7hAsJcKs_2d6cTsQh_AhAcJhQd_3dTc6h3s() {
    assertEquals(
      "3dTc6h3s AhAcJhQd 2d6cTsQh",
      Solver.process("omaha-holdem 2c7hAsJcKs 2d6cTsQh AhAcJhQd 3dTc6h3s"));
  }

  @Test
  public void test_omaha_holdem_6612_4s5s6h9c9d_Ad5h4h2c_AhAs4dTh_8s6sQsQh_Jh7d2s5d_7s8h7cAc() {
    assertEquals(
      "Jh7d2s5d Ad5h4h2c 8s6sQsQh AhAs4dTh 7s8h7cAc",
      Solver.process("omaha-holdem 4s5s6h9c9d Ad5h4h2c AhAs4dTh 8s6sQsQh Jh7d2s5d 7s8h7cAc"));
  }

  @Test
  public void test_omaha_holdem_6613_3d3sAdKhKs_Jc5h5sTh_3c6sKcQc_5c8h7s9s_7hJs4sQh() {
    assertEquals(
      "5c8h7s9s 7hJs4sQh Jc5h5sTh 3c6sKcQc",
      Solver.process("omaha-holdem 3d3sAdKhKs Jc5h5sTh 3c6sKcQc 5c8h7s9s 7hJs4sQh"));
  }

  @Test
  public void test_omaha_holdem_6614_5c9h9sAsJc_Jd4dKsTh_8d2d2h4c_5hAh2sTd_AdJs8cKh_8s8h7s7h() {
    assertEquals(
      "8d2d2h4c 8s8h7s7h Jd4dKsTh 5hAh2sTd AdJs8cKh",
      Solver.process("omaha-holdem 5c9h9sAsJc Jd4dKsTh 8d2d2h4c 5hAh2sTd AdJs8cKh 8s8h7s7h"));
  }

  @Test
  public void test_omaha_holdem_6615_2h3s8d8hAs_3c5c2d6s_3hAcTh4d_6c9c2sTd_4hQsKsQh_5d4cKh7c_QdQc9s6d_7hJhTcKc_Ts9h6hAd_7d9dJsJc() {
    assertEquals(
      "7hJhTcKc 6c9c2sTd 3c5c2d6s 7d9dJsJc 4hQsKsQh=QdQc9s6d 3hAcTh4d=Ts9h6hAd 5d4cKh7c",
      Solver.process("omaha-holdem 2h3s8d8hAs 3c5c2d6s 3hAcTh4d 6c9c2sTd 4hQsKsQh 5d4cKh7c QdQc9s6d 7hJhTcKc Ts9h6hAd 7d9dJsJc"));
  }

  @Test
  public void test_omaha_holdem_6616_7cJsKcQhTh_Qc8s2h2s_AsJhAd3h_7d3cKh7h_Qs5s6dJc_9c8d6h2c_8cAcQd3s_4sTd4dTs_AhTc5h7s_6c9h4hKs() {
    assertEquals(
      "Qc8s2h2s Qs5s6dJc 7d3cKh7h 4sTd4dTs 9c8d6h2c 6c9h4hKs 8cAcQd3s=AhTc5h7s=AsJhAd3h",
      Solver.process("omaha-holdem 7cJsKcQhTh Qc8s2h2s AsJhAd3h 7d3cKh7h Qs5s6dJc 9c8d6h2c 8cAcQd3s 4sTd4dTs AhTc5h7s 6c9h4hKs"));
  }

  @Test
  public void test_omaha_holdem_6617_2c4d6cJhKh_5dKs6s3h_Ad3d5c8c_Ah9dTd7d_QcTcJc8h_Th5s9s3s_Js4hQh3c_Qd9c7sKd_Ac6h6d8d_9h4s2dKc() {
    assertEquals(
      "Ah9dTd7d QcTcJc8h Qd9c7sKd Js4hQh3c 9h4s2dKc Ac6h6d8d 5dKs6s3h=Ad3d5c8c=Th5s9s3s",
      Solver.process("omaha-holdem 2c4d6cJhKh 5dKs6s3h Ad3d5c8c Ah9dTd7d QcTcJc8h Th5s9s3s Js4hQh3c Qd9c7sKd Ac6h6d8d 9h4s2dKc"));
  }

  @Test
  public void test_omaha_holdem_6618_2c2h5hJdJh_As3c9dKh_9hQcQh7s_AdTd8d3d_3s6s6d4h_4c4dKsTh_Jc2d7c5d_Ac9c8s5c_Kc6hQsAh_TsJs2s8h() {
    assertEquals(
      "AdTd8d3d As3c9dKh 4c4dKsTh Ac9c8s5c 3s6s6d4h 9hQcQh7s Kc6hQsAh TsJs2s8h Jc2d7c5d",
      Solver.process("omaha-holdem 2c2h5hJdJh As3c9dKh 9hQcQh7s AdTd8d3d 3s6s6d4h 4c4dKsTh Jc2d7c5d Ac9c8s5c Kc6hQsAh TsJs2s8h"));
  }

  @Test
  public void test_omaha_holdem_6619_2h5s9sAsKd_3d6dQh3c_9h8h6cQs_KsJc6h4c_2s2c8s9c_Td4s5d2d_7d9d7sJs() {
    assertEquals(
      "3d6dQh3c 9h8h6cQs KsJc6h4c Td4s5d2d 2s2c8s9c 7d9d7sJs",
      Solver.process("omaha-holdem 2h5s9sAsKd 3d6dQh3c 9h8h6cQs KsJc6h4c 2s2c8s9c Td4s5d2d 7d9d7sJs"));
  }

  @Test
  public void test_omaha_holdem_6620_2h2s7d8sKh_6hQdKs3c_3dQhKd2c_9h9dQs3h_7sJd8c4h_5cTc9cTh_5sAc2dJh() {
    assertEquals(
      "7sJd8c4h 9h9dQs3h 5cTc9cTh 6hQdKs3c 5sAc2dJh 3dQhKd2c",
      Solver.process("omaha-holdem 2h2s7d8sKh 6hQdKs3c 3dQhKd2c 9h9dQs3h 7sJd8c4h 5cTc9cTh 5sAc2dJh"));
  }

  @Test
  public void test_omaha_holdem_6621_3sAhQhTdTs_Kh7dQs8h_7hAc5d9h_8d5c9c8c_Jd6s2s6d() {
    assertEquals(
      "Jd6s2s6d 8d5c9c8c Kh7dQs8h 7hAc5d9h",
      Solver.process("omaha-holdem 3sAhQhTdTs Kh7dQs8h 7hAc5d9h 8d5c9c8c Jd6s2s6d"));
  }

  @Test
  public void test_omaha_holdem_6622_2d3d4sAsKh_3cThQh9s_4h2cJsTc_4d8hTsKs() {
    assertEquals(
      "3cThQh9s 4h2cJsTc 4d8hTsKs",
      Solver.process("omaha-holdem 2d3d4sAsKh 3cThQh9s 4h2cJsTc 4d8hTsKs"));
  }

  @Test
  public void test_omaha_holdem_6623_4s5d8h8sAd_3s6hJcAh_6sKh9sTh_4cTs2dJh() {
    assertEquals(
      "6sKh9sTh 4cTs2dJh 3s6hJcAh",
      Solver.process("omaha-holdem 4s5d8h8sAd 3s6hJcAh 6sKh9sTh 4cTs2dJh"));
  }

  @Test
  public void test_omaha_holdem_6624_5h5s8sAhTh_7s2sQhAs_AdKd5c4c_4hKh5d7c_Jd6d8c9s_Td4dQc9d() {
    assertEquals(
      "Jd6d8c9s Td4dQc9d 7s2sQhAs 4hKh5d7c AdKd5c4c",
      Solver.process("omaha-holdem 5h5s8sAhTh 7s2sQhAs AdKd5c4c 4hKh5d7c Jd6d8c9s Td4dQc9d"));
  }

  @Test
  public void test_omaha_holdem_6625_7c7s9hAdTc_4sKs4h3h_Qh8s9s6h() {
    assertEquals(
      "4sKs4h3h Qh8s9s6h",
      Solver.process("omaha-holdem 7c7s9hAdTc 4sKs4h3h Qh8s9s6h"));
  }

  @Test
  public void test_omaha_holdem_6626_8hAhAsKcTc_7hTdQc7d_4c9h4hJh_Ks9c6cQh_Js6hJc3d() {
    assertEquals(
      "4c9h4hJh 7hTdQc7d Js6hJc3d Ks9c6cQh",
      Solver.process("omaha-holdem 8hAhAsKcTc 7hTdQc7d 4c9h4hJh Ks9c6cQh Js6hJc3d"));
  }

  @Test
  public void test_omaha_holdem_6627_3s8d9dJsKd_QhQsTc8c_QdAd6h7h_9c2d2h8s() {
    assertEquals(
      "9c2d2h8s QhQsTc8c QdAd6h7h",
      Solver.process("omaha-holdem 3s8d9dJsKd QhQsTc8c QdAd6h7h 9c2d2h8s"));
  }

  @Test
  public void test_omaha_holdem_6628_8hQcQhTdTs_KhQsAh5h_2sQdTh6s_Ks8s6c4c_9h5s2cJc_9d2h8c3h_As3c8d3d_4sJs6hKd() {
    assertEquals(
      "4sJs6hKd 9d2h8c3h Ks8s6c4c As3c8d3d KhQsAh5h 9h5s2cJc 2sQdTh6s",
      Solver.process("omaha-holdem 8hQcQhTdTs KhQsAh5h 2sQdTh6s Ks8s6c4c 9h5s2cJc 9d2h8c3h As3c8d3d 4sJs6hKd"));
  }

  @Test
  public void test_omaha_holdem_6629_2h9cJcKsTh_3c8sQd3d_TdQs5cAc_Qc2s6s3h() {
    assertEquals(
      "Qc2s6s3h 3c8sQd3d TdQs5cAc",
      Solver.process("omaha-holdem 2h9cJcKsTh 3c8sQd3d TdQs5cAc Qc2s6s3h"));
  }

  @Test
  public void test_omaha_holdem_6630_6h7d8cKsTs_6dJs9dTd_Tc3dQc5s_As2d4dAh_2h6s8s8h() {
    assertEquals(
      "Tc3dQc5s As2d4dAh 2h6s8s8h 6dJs9dTd",
      Solver.process("omaha-holdem 6h7d8cKsTs 6dJs9dTd Tc3dQc5s As2d4dAh 2h6s8s8h"));
  }

  @Test
  public void test_omaha_holdem_6631_7dAdJdQsTs_9c2c5hAs_6d6s5cQd_KdKh2h4c() {
    assertEquals(
      "KdKh2h4c 9c2c5hAs 6d6s5cQd",
      Solver.process("omaha-holdem 7dAdJdQsTs 9c2c5hAs 6d6s5cQd KdKh2h4c"));
  }

  @Test
  public void test_omaha_holdem_6632_2s3d8s9dTs_Jc6dTh4c_4h8c5h7h_6c9cJdAh_5s8dQsAd() {
    assertEquals(
      "4h8c5h7h 6c9cJdAh Jc6dTh4c 5s8dQsAd",
      Solver.process("omaha-holdem 2s3d8s9dTs Jc6dTh4c 4h8c5h7h 6c9cJdAh 5s8dQsAd"));
  }

  @Test
  public void test_omaha_holdem_6633_2s9cAdAsJh_3cJs6s4c_5d7d2d9d_2c5sKdJc_4dQhQs3d_AhAc8cTd_7sKc4h7c_6h5c9h3s_Jd8hTs6c_3h2h4s9s() {
    assertEquals(
      "7sKc4h7c 3h2h4s9s 6h5c9h3s 5d7d2d9d 3cJs6s4c Jd8hTs6c 2c5sKdJc 4dQhQs3d AhAc8cTd",
      Solver.process("omaha-holdem 2s9cAdAsJh 3cJs6s4c 5d7d2d9d 2c5sKdJc 4dQhQs3d AhAc8cTd 7sKc4h7c 6h5c9h3s Jd8hTs6c 3h2h4s9s"));
  }

  @Test
  public void test_omaha_holdem_6634_5s6sAhAsQd_Kc7s2h5h_Ts4h8d9h_KsJd9cKh_7d4s8h7h_Th8s9dJc() {
    assertEquals(
      "Ts4h8d9h Th8s9dJc Kc7s2h5h 7d4s8h7h KsJd9cKh",
      Solver.process("omaha-holdem 5s6sAhAsQd Kc7s2h5h Ts4h8d9h KsJd9cKh 7d4s8h7h Th8s9dJc"));
  }

  @Test
  public void test_omaha_holdem_6635_4s7cJcThTs_2s3hAs8c_5cAc5sQd_3sAh4h8h_5h9s3c6c() {
    assertEquals(
      "5h9s3c6c 2s3hAs8c 3sAh4h8h 5cAc5sQd",
      Solver.process("omaha-holdem 4s7cJcThTs 2s3hAs8c 5cAc5sQd 3sAh4h8h 5h9s3c6c"));
  }

  @Test
  public void test_omaha_holdem_6636_2s6c7h7sJc_QdKd8hTc_Ks4c8c5c_Ac3dKhAs_2hJh5d9c_Jd4s5s4d_AdQhTs7c_6s6d2d2c_7dJsQcKc_8d9s3s4h() {
    assertEquals(
      "8d9s3s4h Ks4c8c5c QdKd8hTc Jd4s5s4d 2hJh5d9c Ac3dKhAs AdQhTs7c 6s6d2d2c 7dJsQcKc",
      Solver.process("omaha-holdem 2s6c7h7sJc QdKd8hTc Ks4c8c5c Ac3dKhAs 2hJh5d9c Jd4s5s4d AdQhTs7c 6s6d2d2c 7dJsQcKc 8d9s3s4h"));
  }

  @Test
  public void test_omaha_holdem_6637_4h7d8h9dJh_8c9h3d2d_3hQcAh4d_2s5sJs2c_Jc8d6dAc() {
    assertEquals(
      "2s5sJs2c 8c9h3d2d Jc8d6dAc 3hQcAh4d",
      Solver.process("omaha-holdem 4h7d8h9dJh 8c9h3d2d 3hQcAh4d 2s5sJs2c Jc8d6dAc"));
  }

  @Test
  public void test_omaha_holdem_6638_2s6cAhJhKh_Td4sTc3s_5h7cTh4c_4hQhJcAc() {
    assertEquals(
      "Td4sTc3s 5h7cTh4c 4hQhJcAc",
      Solver.process("omaha-holdem 2s6cAhJhKh Td4sTc3s 5h7cTh4c 4hQhJcAc"));
  }

  @Test
  public void test_omaha_holdem_6639_3s6c6h9cJd_9s8c6dAs_9d8sQc3c_Td4sKcJs_KdJh7h4h() {
    assertEquals(
      "9d8sQc3c KdJh7h4h=Td4sKcJs 9s8c6dAs",
      Solver.process("omaha-holdem 3s6c6h9cJd 9s8c6dAs 9d8sQc3c Td4sKcJs KdJh7h4h"));
  }

  @Test
  public void test_omaha_holdem_6640_3c4s9dKhTh_Ts3h2h2c_Ks6sJdAd_Jc2sKdTc_7c6d9c5s() {
    assertEquals(
      "7c6d9c5s Ks6sJdAd Ts3h2h2c Jc2sKdTc",
      Solver.process("omaha-holdem 3c4s9dKhTh Ts3h2h2c Ks6sJdAd Jc2sKdTc 7c6d9c5s"));
  }

  @Test
  public void test_omaha_holdem_6641_2s3h7cKdTd_9d6d4hKs_QcQdJd8h_Qs6hAs9s_JhTh9h2c() {
    assertEquals(
      "Qs6hAs9s QcQdJd8h 9d6d4hKs JhTh9h2c",
      Solver.process("omaha-holdem 2s3h7cKdTd 9d6d4hKs QcQdJd8h Qs6hAs9s JhTh9h2c"));
  }

  @Test
  public void test_omaha_holdem_6642_2s3d6cJcQd_3s6h9d2c_Qc4h5c7h_AdKd8dQs_Td3cJhTc_8sKh6sQh_8h2h7c4d() {
    assertEquals(
      "8h2h7c4d AdKd8dQs 3s6h9d2c Td3cJhTc 8sKh6sQh Qc4h5c7h",
      Solver.process("omaha-holdem 2s3d6cJcQd 3s6h9d2c Qc4h5c7h AdKd8dQs Td3cJhTc 8sKh6sQh 8h2h7c4d"));
  }

  @Test
  public void test_omaha_holdem_6643_4c5s7sAsQd_Qc8h5h4d_8s6cKs7c_Tc7d3s9s_3dJcTd2d_Ad4sAh9h() {
    assertEquals(
      "Qc8h5h4d Ad4sAh9h 3dJcTd2d Tc7d3s9s 8s6cKs7c",
      Solver.process("omaha-holdem 4c5s7sAsQd Qc8h5h4d 8s6cKs7c Tc7d3s9s 3dJcTd2d Ad4sAh9h"));
  }

  @Test
  public void test_omaha_holdem_6644_8cAdJhKcKs_JdTdJsTs_9d2s9s6h_3d8sTh6c_Kd4s5c2h() {
    assertEquals(
      "3d8sTh6c 9d2s9s6h Kd4s5c2h JdTdJsTs",
      Solver.process("omaha-holdem 8cAdJhKcKs JdTdJsTs 9d2s9s6h 3d8sTh6c Kd4s5c2h"));
  }

  @Test
  public void test_omaha_holdem_6645_6d9hAdAsJs_3s5d6hAc_9sTh5h8d_Kh3d3h2d_2sKs8h7d() {
    assertEquals(
      "2sKs8h7d Kh3d3h2d 9sTh5h8d 3s5d6hAc",
      Solver.process("omaha-holdem 6d9hAdAsJs 3s5d6hAc 9sTh5h8d Kh3d3h2d 2sKs8h7d"));
  }

  @Test
  public void test_omaha_holdem_6646_3h7hKcQsTs_7cThAc8s_Ad3cTdJc_5h4cQhAs_AhKdQc4d() {
    assertEquals(
      "5h4cQhAs 7cThAc8s AhKdQc4d Ad3cTdJc",
      Solver.process("omaha-holdem 3h7hKcQsTs 7cThAc8s Ad3cTdJc 5h4cQhAs AhKdQc4d"));
  }

  @Test
  public void test_omaha_holdem_6647_3d6cAsQdQs_7h3s4s8h_8c5c9dJs_Jh6sAcTd_5sJd2c8s_Tc3c7sQh_2dKhJc7c_Ah9s4h9h_6dQc6hTh_9cKd5dAd() {
    assertEquals(
      "5sJd2c8s 8c5c9dJs 2dKhJc7c 7h3s4s8h Ah9s4h9h Jh6sAcTd 9cKd5dAd Tc3c7sQh 6dQc6hTh",
      Solver.process("omaha-holdem 3d6cAsQdQs 7h3s4s8h 8c5c9dJs Jh6sAcTd 5sJd2c8s Tc3c7sQh 2dKhJc7c Ah9s4h9h 6dQc6hTh 9cKd5dAd"));
  }

  @Test
  public void test_omaha_holdem_6648_2c3h4c9hAc_2s2d9sTd_Ad3c6dJh_5s4sQsQd_5h3d6c8h_7d6h4hKd_4d2h6sTs_9cThQc5d_5c7s8dKh() {
    assertEquals(
      "5c7s8dKh 7d6h4hKd 4d2h6sTs Ad3c6dJh 2s2d9sTd 5s4sQsQd 5h3d6c8h 9cThQc5d",
      Solver.process("omaha-holdem 2c3h4c9hAc 2s2d9sTd Ad3c6dJh 5s4sQsQd 5h3d6c8h 7d6h4hKd 4d2h6sTs 9cThQc5d 5c7s8dKh"));
  }

  @Test
  public void test_omaha_holdem_6649_2s3c6sJsTs_4hKc7c4d_9c8sAh4s_7d3sKd5c_8h7hTh2d_QhAs3h5s() {
    assertEquals(
      "7d3sKd5c 4hKc7c4d 8h7hTh2d 9c8sAh4s QhAs3h5s",
      Solver.process("omaha-holdem 2s3c6sJsTs 4hKc7c4d 9c8sAh4s 7d3sKd5c 8h7hTh2d QhAs3h5s"));
  }

  @Test
  public void test_omaha_holdem_6650_2s3h6c9hQs_7s4h5cAc_5sKhJsJc_Qc7d9d5d_Td3d8c8d() {
    assertEquals(
      "Td3d8c8d 5sKhJsJc Qc7d9d5d 7s4h5cAc",
      Solver.process("omaha-holdem 2s3h6c9hQs 7s4h5cAc 5sKhJsJc Qc7d9d5d Td3d8c8d"));
  }

  @Test
  public void test_omaha_holdem_6651_4h5c6s7d7s_6c9hJsQh_Jc8sJhTs_3sAd8c3c_KhKd5sQd_Tc9s4c4d() {
    assertEquals(
      "3sAd8c3c 6c9hJsQh Jc8sJhTs KhKd5sQd Tc9s4c4d",
      Solver.process("omaha-holdem 4h5c6s7d7s 6c9hJsQh Jc8sJhTs 3sAd8c3c KhKd5sQd Tc9s4c4d"));
  }

  @Test
  public void test_omaha_holdem_6652_2c3sAsJhTd_Ts8c7c4s_QhKd3d6s_4c6c2d5h_QdKcQsAh_KhAc5s2h_Ks5d8d8s_6d6hAd8h() {
    assertEquals(
      "Ks5d8d8s Ts8c7c4s 6d6hAd8h KhAc5s2h 4c6c2d5h QdKcQsAh=QhKd3d6s",
      Solver.process("omaha-holdem 2c3sAsJhTd Ts8c7c4s QhKd3d6s 4c6c2d5h QdKcQsAh KhAc5s2h Ks5d8d8s 6d6hAd8h"));
  }

  @Test
  public void test_omaha_holdem_6653_9cAhJsKdQd_9s5sKs2h_Tc8h3sQh_8cTs2sAd_6h7c7d8s_6sQs3c9h_JdTd8d4h_7hThJc4d_5cAs6d4c_3dAc2dQc() {
    assertEquals(
      "6h7c7d8s 5cAs6d4c 6sQs3c9h 9s5sKs2h 3dAc2dQc 7hThJc4d=8cTs2sAd=JdTd8d4h=Tc8h3sQh",
      Solver.process("omaha-holdem 9cAhJsKdQd 9s5sKs2h Tc8h3sQh 8cTs2sAd 6h7c7d8s 6sQs3c9h JdTd8d4h 7hThJc4d 5cAs6d4c 3dAc2dQc"));
  }

  @Test
  public void test_omaha_holdem_6654_4s5dKdKsQd_TdKh4d9s_9cTs8d5c() {
    assertEquals(
      "9cTs8d5c TdKh4d9s",
      Solver.process("omaha-holdem 4s5dKdKsQd TdKh4d9s 9cTs8d5c"));
  }

  @Test
  public void test_omaha_holdem_6655_4c7d8s9sKh_Th7h7c2s_2c5c3dJd_2d9hKc6c_5sJc7s4h_JsQsTdQc() {
    assertEquals(
      "2c5c3dJd 5sJc7s4h 2d9hKc6c Th7h7c2s JsQsTdQc",
      Solver.process("omaha-holdem 4c7d8s9sKh Th7h7c2s 2c5c3dJd 2d9hKc6c 5sJc7s4h JsQsTdQc"));
  }

  @Test
  public void test_omaha_holdem_6656_4c4dJhJsTc_5dTd7s9h_ThQdAcAd_9s4h8d8c_3d2sTsQs() {
    assertEquals(
      "5dTd7s9h 3d2sTsQs ThQdAcAd 9s4h8d8c",
      Solver.process("omaha-holdem 4c4dJhJsTc 5dTd7s9h ThQdAcAd 9s4h8d8c 3d2sTsQs"));
  }

  @Test
  public void test_omaha_holdem_6657_2c5h8hAdJh_8c6sJd3h_2sAcTc5s() {
    assertEquals(
      "8c6sJd3h 2sAcTc5s",
      Solver.process("omaha-holdem 2c5h8hAdJh 8c6sJd3h 2sAcTc5s"));
  }

  @Test
  public void test_omaha_holdem_6658_2h4s9sJdQs_KdKc8c9c_7cQhJs2c_8h3d6hAd() {
    assertEquals(
      "8h3d6hAd KdKc8c9c 7cQhJs2c",
      Solver.process("omaha-holdem 2h4s9sJdQs KdKc8c9c 7cQhJs2c 8h3d6hAd"));
  }

  @Test
  public void test_omaha_holdem_6659_3d4d5s8c8d_QcTh2h4h_8h9d7d6s_2c3hAhKs_Qs4cKhQd_AcJh6dKd_8sAd9c2s() {
    assertEquals(
      "QcTh2h4h Qs4cKhQd 2c3hAhKs=8sAd9c2s 8h9d7d6s AcJh6dKd",
      Solver.process("omaha-holdem 3d4d5s8c8d QcTh2h4h 8h9d7d6s 2c3hAhKs Qs4cKhQd AcJh6dKd 8sAd9c2s"));
  }

  @Test
  public void test_omaha_holdem_6660_3s8h9sAdKh_6d8d2dKd_Ac6s3c5d_Ts9d9h6h_4c3h5sAs_4d8cKs3d_5hQhTh4h() {
    assertEquals(
      "5hQhTh4h 4d8cKs3d=6d8d2dKd 4c3h5sAs=Ac6s3c5d Ts9d9h6h",
      Solver.process("omaha-holdem 3s8h9sAdKh 6d8d2dKd Ac6s3c5d Ts9d9h6h 4c3h5sAs 4d8cKs3d 5hQhTh4h"));
  }

  @Test
  public void test_omaha_holdem_6661_4s5d7h7sQd_3dKd5sAc_9cQsKh4c_2sTh6d2d_3sQhJd4d_2c5c8c6c_8sTdJsAh_6hTcAd8h_4hQc7d3c_3hTs9sJh() {
    assertEquals(
      "3hTs9sJh 8sTdJsAh 2sTh6d2d 3dKd5sAc 3sQhJd4d 9cQsKh4c 2c5c8c6c=6hTcAd8h 4hQc7d3c",
      Solver.process("omaha-holdem 4s5d7h7sQd 3dKd5sAc 9cQsKh4c 2sTh6d2d 3sQhJd4d 2c5c8c6c 8sTdJsAh 6hTcAd8h 4hQc7d3c 3hTs9sJh"));
  }

  @Test
  public void test_omaha_holdem_6662_3h5d7sJcQd_5c7cKdTh_Jd6sKc7h() {
    assertEquals(
      "5c7cKdTh Jd6sKc7h",
      Solver.process("omaha-holdem 3h5d7sJcQd 5c7cKdTh Jd6sKc7h"));
  }

  @Test
  public void test_omaha_holdem_6663_2dAdAhQcTs_Kc8d7sJd_As6d6sTc_3sQs4s4c_4d3cKsJs_5s3dJc2s() {
    assertEquals(
      "5s3dJc2s 3sQs4s4c 4d3cKsJs=Kc8d7sJd As6d6sTc",
      Solver.process("omaha-holdem 2dAdAhQcTs Kc8d7sJd As6d6sTc 3sQs4s4c 4d3cKsJs 5s3dJc2s"));
  }

  @Test
  public void test_omaha_holdem_6664_2h4c7dAhKh_AcAdKd3h_Th9h5s2d_Jh6cJd5h_3cKcQh7s_AsTs5d2s_Qd9cQs8d_3d5c3s9s_8hQcKs8c_4s8s9dJc() {
    assertEquals(
      "4s8s9dJc Qd9cQs8d 8hQcKs8c 3cKcQh7s AsTs5d2s AcAdKd3h 3d5c3s9s Th9h5s2d Jh6cJd5h",
      Solver.process("omaha-holdem 2h4c7dAhKh AcAdKd3h Th9h5s2d Jh6cJd5h 3cKcQh7s AsTs5d2s Qd9cQs8d 3d5c3s9s 8hQcKs8c 4s8s9dJc"));
  }

  @Test
  public void test_omaha_holdem_6665_2s4d8cAhTs_KhJc8hJs_4h7sQc9s_8dAsQs4c_AdJh5h9c_3hJd3dKd_6h2h4sKs_TcQh2cAc_5c5s7d3c() {
    assertEquals(
      "3hJd3dKd 4h7sQc9s KhJc8hJs AdJh5h9c 6h2h4sKs 8dAsQs4c TcQh2cAc 5c5s7d3c",
      Solver.process("omaha-holdem 2s4d8cAhTs KhJc8hJs 4h7sQc9s 8dAsQs4c AdJh5h9c 3hJd3dKd 6h2h4sKs TcQh2cAc 5c5s7d3c"));
  }

  @Test
  public void test_omaha_holdem_6666_2d4h5c6sTh_9cQsAh2c_3sAs5dJc_6d2h7hAd_9d6h4c9s() {
    assertEquals(
      "9cQsAh2c 6d2h7hAd 9d6h4c9s 3sAs5dJc",
      Solver.process("omaha-holdem 2d4h5c6sTh 9cQsAh2c 3sAs5dJc 6d2h7hAd 9d6h4c9s"));
  }

  @Test
  public void test_omaha_holdem_6667_6s8c8d9sTh_Qs4c2dAd_TdQhAc2h_7hJs2cKd_7c7dQd9h() {
    assertEquals(
      "Qs4c2dAd TdQhAc2h 7c7dQd9h 7hJs2cKd",
      Solver.process("omaha-holdem 6s8c8d9sTh Qs4c2dAd TdQhAc2h 7hJs2cKd 7c7dQd9h"));
  }

  @Test
  public void test_omaha_holdem_6668_4d9cAdQcQh_Td4c4sAs_5c6dKs7c_3s9dKdJd_2hTc7s8d_8s5hJhAc_6c4hQd8c() {
    assertEquals(
      "2hTc7s8d 5c6dKs7c 3s9dKdJd 8s5hJhAc Td4c4sAs 6c4hQd8c",
      Solver.process("omaha-holdem 4d9cAdQcQh Td4c4sAs 5c6dKs7c 3s9dKdJd 2hTc7s8d 8s5hJhAc 6c4hQd8c"));
  }

  @Test
  public void test_omaha_holdem_6669_3c4c5sKhQs_Js6sTc7d_7c4s5dJd_Jc9s9hQc_2c6c7s2h_AhAs7h4d_3sQh9dAd() {
    assertEquals(
      "Jc9s9hQc AhAs7h4d 7c4s5dJd 3sQh9dAd 2c6c7s2h=Js6sTc7d",
      Solver.process("omaha-holdem 3c4c5sKhQs Js6sTc7d 7c4s5dJd Jc9s9hQc 2c6c7s2h AhAs7h4d 3sQh9dAd"));
  }

  @Test
  public void test_omaha_holdem_6670_2h5h9sJhKc_7s7hThKs_2c6c4s5s_Kh5c8cKd_9cJc7cQc() {
    assertEquals(
      "2c6c4s5s 9cJc7cQc Kh5c8cKd 7s7hThKs",
      Solver.process("omaha-holdem 2h5h9sJhKc 7s7hThKs 2c6c4s5s Kh5c8cKd 9cJc7cQc"));
  }

  @Test
  public void test_omaha_holdem_6671_7c8hAdJhTs_3h3cAs5c_3d5sQh4c_6c6sTd8d_9dAhAc4s_JdJc5h2h_5d9hJs2c_Qd8c4d7d_TcQs6h8s() {
    assertEquals(
      "3d5sQh4c 3h3cAs5c Qd8c4d7d 6c6sTd8d=TcQs6h8s JdJc5h2h 9dAhAc4s 5d9hJs2c",
      Solver.process("omaha-holdem 7c8hAdJhTs 3h3cAs5c 3d5sQh4c 6c6sTd8d 9dAhAc4s JdJc5h2h 5d9hJs2c Qd8c4d7d TcQs6h8s"));
  }

  @Test
  public void test_omaha_holdem_6672_2c4dAdKdTc_KsTd5s7d_6dTs8d5d_2dQcAh6s_4h4cJsQd() {
    assertEquals(
      "2dQcAh6s 4h4cJsQd 6dTs8d5d KsTd5s7d",
      Solver.process("omaha-holdem 2c4dAdKdTc KsTd5s7d 6dTs8d5d 2dQcAh6s 4h4cJsQd"));
  }

  @Test
  public void test_omaha_holdem_6673_5h9c9h9sQd_KcTh5d5s_Td4dQh3c_6d7hJs7c_Jh2c4hAs_6cQcAh3h_KsKh4c3s() {
    assertEquals(
      "Td4dQh3c Jh2c4hAs 6cQcAh3h KcTh5d5s 6d7hJs7c KsKh4c3s",
      Solver.process("omaha-holdem 5h9c9h9sQd KcTh5d5s Td4dQh3c 6d7hJs7c Jh2c4hAs 6cQcAh3h KsKh4c3s"));
  }

  @Test
  public void test_omaha_holdem_6674_2c3s7d8dTd_6s5d2d7s_Kd2sKh4c_8sQh4sAd_4dAhTc2h_8cQdTh7c_9h4h9dAs_6h8hKs5s() {
    assertEquals(
      "6h8hKs5s 8sQh4sAd 9h4h9dAs Kd2sKh4c 4dAhTc2h 8cQdTh7c 6s5d2d7s",
      Solver.process("omaha-holdem 2c3s7d8dTd 6s5d2d7s Kd2sKh4c 8sQh4sAd 4dAhTc2h 8cQdTh7c 9h4h9dAs 6h8hKs5s"));
  }

  @Test
  public void test_omaha_holdem_6675_4d7c8c9sQs_8d5hQd3d_2cTd4cJh_7h6sTsAh_3c7dTh6d_Kd3h5d4s_Qh7s5s4h() {
    assertEquals(
      "Kd3h5d4s Qh7s5s4h 8d5hQd3d 3c7dTh6d=7h6sTsAh 2cTd4cJh",
      Solver.process("omaha-holdem 4d7c8c9sQs 8d5hQd3d 2cTd4cJh 7h6sTsAh 3c7dTh6d Kd3h5d4s Qh7s5s4h"));
  }

  @Test
  public void test_omaha_holdem_6676_2h5h9cQhTd_KsKc9d8d_8c8s4sAc_Qd5s6c5d_5c2sTs7c_7dAs8hJd_Ad3s3cKh_6s3dTcJs_2d9h9sJc() {
    assertEquals(
      "Ad3s3cKh 8c8s4sAc 6s3dTcJs KsKc9d8d 5c2sTs7c Qd5s6c5d 2d9h9sJc 7dAs8hJd",
      Solver.process("omaha-holdem 2h5h9cQhTd KsKc9d8d 8c8s4sAc Qd5s6c5d 5c2sTs7c 7dAs8hJd Ad3s3cKh 6s3dTcJs 2d9h9sJc"));
  }

  @Test
  public void test_omaha_holdem_6677_2c2s4c6sKs_Td7c7hAs_8cTs8h3s_6h9c3dJh_7s9hAdAc_KcQd8sQs_6c3hQc4h_2h2d6d5s_4s5c7dTc() {
    assertEquals(
      "4s5c7dTc 6h9c3dJh 6c3hQc4h Td7c7hAs 7s9hAdAc 8cTs8h3s KcQd8sQs 2h2d6d5s",
      Solver.process("omaha-holdem 2c2s4c6sKs Td7c7hAs 8cTs8h3s 6h9c3dJh 7s9hAdAc KcQd8sQs 6c3hQc4h 2h2d6d5s 4s5c7dTc"));
  }

  @Test
  public void test_omaha_holdem_6678_2c2d9cJhQc_3dJs6d4s_7cQd3c9s_4h4cJdAs_7h9h5cTs_8hJc6c5d_KdKs8dAh_8s5h6s3s_Td7dKcQs_8c3hTc2h() {
    assertEquals(
      "8s5h6s3s 7h9h5cTs 3dJs6d4s 4h4cJdAs KdKs8dAh Td7dKcQs 7cQd3c9s 8c3hTc2h 8hJc6c5d",
      Solver.process("omaha-holdem 2c2d9cJhQc 3dJs6d4s 7cQd3c9s 4h4cJdAs 7h9h5cTs 8hJc6c5d KdKs8dAh 8s5h6s3s Td7dKcQs 8c3hTc2h"));
  }

  @Test
  public void test_omaha_holdem_6679_2d2h4sKsTc_Jh8d3sKd_9sAd6d3d_6cAcAhJc_8c2c4cQh() {
    assertEquals(
      "9sAd6d3d Jh8d3sKd 6cAcAhJc 8c2c4cQh",
      Solver.process("omaha-holdem 2d2h4sKsTc Jh8d3sKd 9sAd6d3d 6cAcAhJc 8c2c4cQh"));
  }

  @Test
  public void test_omaha_holdem_6680_5s7dAhKcTh_7s6sKsKd_Jh8s6d6c_3d7h5cTs_3sQs4hAd_4s4c3c9s_2sJc2c5d_Tc3h8c2d() {
    assertEquals(
      "4s4c3c9s 2sJc2c5d Jh8s6d6c Tc3h8c2d 3sQs4hAd 3d7h5cTs 7s6sKsKd",
      Solver.process("omaha-holdem 5s7dAhKcTh 7s6sKsKd Jh8s6d6c 3d7h5cTs 3sQs4hAd 4s4c3c9s 2sJc2c5d Tc3h8c2d"));
  }

  @Test
  public void test_omaha_holdem_6681_6h9c9h9sJc_7s5d9d2s_KcTd7hKh_JhAh2h2c_8h3d8s3s() {
    assertEquals(
      "JhAh2h2c 8h3d8s3s KcTd7hKh 7s5d9d2s",
      Solver.process("omaha-holdem 6h9c9h9sJc 7s5d9d2s KcTd7hKh JhAh2h2c 8h3d8s3s"));
  }

  @Test
  public void test_omaha_holdem_6682_3d3s5c8hJh_Ks6c4dJd_9cQhAhTd_KcJcTh3h_8sAc9h2c_Kh2sAs7s_9d6hQd7h_9sQsTs6d_Kd5hQc8d_AdJs4h5s() {
    assertEquals(
      "9d6hQd7h 9sQsTs6d 9cQhAhTd Kh2sAs7s 8sAc9h2c Kd5hQc8d Ks6c4dJd AdJs4h5s KcJcTh3h",
      Solver.process("omaha-holdem 3d3s5c8hJh Ks6c4dJd 9cQhAhTd KcJcTh3h 8sAc9h2c Kh2sAs7s 9d6hQd7h 9sQsTs6d Kd5hQc8d AdJs4h5s"));
  }

  @Test
  public void test_omaha_holdem_6683_4h6h8d8hKd_Td5d6cJd_TsKh6dJs_2cKc3d5h_Ah6s7d8c() {
    assertEquals(
      "Td5d6cJd 2cKc3d5h TsKh6dJs Ah6s7d8c",
      Solver.process("omaha-holdem 4h6h8d8hKd Td5d6cJd TsKh6dJs 2cKc3d5h Ah6s7d8c"));
  }

  @Test
  public void test_omaha_holdem_6684_5d6cJcJdKc_4sAcKh3s_AdTdAsTc_Qd9d4hTh_8dAh7d8s_8cQh3c7s_6s2d7c9c_6hQcQsKs_2s2hTs6d() {
    assertEquals(
      "Qd9d4hTh 2s2hTs6d 8dAh7d8s 6hQcQsKs 4sAcKh3s AdTdAsTc 8cQh3c7s 6s2d7c9c",
      Solver.process("omaha-holdem 5d6cJcJdKc 4sAcKh3s AdTdAsTc Qd9d4hTh 8dAh7d8s 8cQh3c7s 6s2d7c9c 6hQcQsKs 2s2hTs6d"));
  }

  @Test
  public void test_omaha_holdem_6685_3d3s4s6sKd_KhJs3c9s_Ks5c2hTc_2sAhAs5h_4dJhQc6h_5s9c8s5d() {
    assertEquals(
      "4dJhQc6h Ks5c2hTc 5s9c8s5d 2sAhAs5h KhJs3c9s",
      Solver.process("omaha-holdem 3d3s4s6sKd KhJs3c9s Ks5c2hTc 2sAhAs5h 4dJhQc6h 5s9c8s5d"));
  }

  @Test
  public void test_omaha_holdem_6686_2h6c7c7hQc_8c9sKd8h_Th7d2d8d_Tc3s3c4s_3dTd4d4c_As5d2c6h_5sJdTsAh_AcAd4h7s_9dKcKhJc() {
    assertEquals(
      "5sJdTsAh 3dTd4d4c As5d2c6h 8c9sKd8h AcAd4h7s Tc3s3c4s 9dKcKhJc Th7d2d8d",
      Solver.process("omaha-holdem 2h6c7c7hQc 8c9sKd8h Th7d2d8d Tc3s3c4s 3dTd4d4c As5d2c6h 5sJdTsAh AcAd4h7s 9dKcKhJc"));
  }

  @Test
  public void test_omaha_holdem_6687_2c5s7cAsKc_QdAc4cKh_8dJcJdKd() {
    assertEquals(
      "8dJcJdKd QdAc4cKh",
      Solver.process("omaha-holdem 2c5s7cAsKc QdAc4cKh 8dJcJdKd"));
  }

  @Test
  public void test_omaha_holdem_6688_2d3h8dJhQh_Kc2cAh5s_5hKs3c4c() {
    assertEquals(
      "Kc2cAh5s 5hKs3c4c",
      Solver.process("omaha-holdem 2d3h8dJhQh Kc2cAh5s 5hKs3c4c"));
  }

  @Test
  public void test_omaha_holdem_6689_4s9hAdKsQc_3h5h8dTc_QdKh6c7s() {
    assertEquals(
      "3h5h8dTc QdKh6c7s",
      Solver.process("omaha-holdem 4s9hAdKsQc 3h5h8dTc QdKh6c7s"));
  }

  @Test
  public void test_omaha_holdem_6690_2d6h7c7dTh_9c7h8cKd_5hKh6c9s() {
    assertEquals(
      "5hKh6c9s 9c7h8cKd",
      Solver.process("omaha-holdem 2d6h7c7dTh 9c7h8cKd 5hKh6c9s"));
  }

  @Test
  public void test_omaha_holdem_6691_2h3s4h5c6s_3cJc5hTs_Kd8s3dAs_9d8d8c5d_QcQdTd7c_6h6d2c3h_Ah9sAdQs_9hTcJsQh_4dJh8h2s_Ac7d4cKs() {
    assertEquals(
      "9hTcJsQh 9d8d8c5d QcQdTd7c Ah9sAdQs Kd8s3dAs 3cJc5hTs=4dJh8h2s=6h6d2c3h Ac7d4cKs",
      Solver.process("omaha-holdem 2h3s4h5c6s 3cJc5hTs Kd8s3dAs 9d8d8c5d QcQdTd7c 6h6d2c3h Ah9sAdQs 9hTcJsQh 4dJh8h2s Ac7d4cKs"));
  }

  @Test
  public void test_omaha_holdem_6692_2h4s9hKcQc_Qs5hKdTd_Js9cQh4c_4dJd7s8h_3hQd6h6d() {
    assertEquals(
      "4dJd7s8h 3hQd6h6d Js9cQh4c Qs5hKdTd",
      Solver.process("omaha-holdem 2h4s9hKcQc Qs5hKdTd Js9cQh4c 4dJd7s8h 3hQd6h6d"));
  }

  @Test
  public void test_omaha_holdem_6693_3h6s9cKdQc_Qd4c9dQh_4s7s5c8c_6dTc2s3c_5s7c2cKs_6c3sKcAh_7dTs8h5d() {
    assertEquals(
      "4s7s5c8c 7dTs8h5d 5s7c2cKs 6dTc2s3c 6c3sKcAh Qd4c9dQh",
      Solver.process("omaha-holdem 3h6s9cKdQc Qd4c9dQh 4s7s5c8c 6dTc2s3c 5s7c2cKs 6c3sKcAh 7dTs8h5d"));
  }

  @Test
  public void test_omaha_holdem_6694_4d8s9cAcQd_Td5s6d2c_Qh6cQsJd_TsJh9d4h_2dKh7s2s_As7d2h3c_5d5c8dJs_Kd4s6sAh_6hTh4c7h() {
    assertEquals(
      "Td5s6d2c 2dKh7s2s 6hTh4c7h 5d5c8dJs As7d2h3c Kd4s6sAh Qh6cQsJd TsJh9d4h",
      Solver.process("omaha-holdem 4d8s9cAcQd Td5s6d2c Qh6cQsJd TsJh9d4h 2dKh7s2s As7d2h3c 5d5c8dJs Kd4s6sAh 6hTh4c7h"));
  }

  @Test
  public void test_omaha_holdem_6695_4s7hAdKcQs_3s9s4hKd_8sTc8d6s_9dJhTs4c_As8hQd7s_Ks9h2dAh_Jc7cQh3d_5sQcAc6d() {
    assertEquals(
      "8sTc8d6s Jc7cQh3d 3s9s4hKd 5sQcAc6d=As8hQd7s Ks9h2dAh 9dJhTs4c",
      Solver.process("omaha-holdem 4s7hAdKcQs 3s9s4hKd 8sTc8d6s 9dJhTs4c As8hQd7s Ks9h2dAh Jc7cQh3d 5sQcAc6d"));
  }

  @Test
  public void test_omaha_holdem_6696_2c3h4d8hQh_9hKh3c5d_Js8dAcTh_7c2s5h9c_9dJd6dKd_3d8s5c6h_QsKc7d9s_AdTs4hJh_8c5sQdTc_4cAsKsTd() {
    assertEquals(
      "9dJd6dKd 7c2s5h9c 4cAsKsTd Js8dAcTh QsKc7d9s 8c5sQdTc 3d8s5c6h AdTs4hJh 9hKh3c5d",
      Solver.process("omaha-holdem 2c3h4d8hQh 9hKh3c5d Js8dAcTh 7c2s5h9c 9dJd6dKd 3d8s5c6h QsKc7d9s AdTs4hJh 8c5sQdTc 4cAsKsTd"));
  }

  @Test
  public void test_omaha_holdem_6697_2s3s4c7cJc_9h8cJhQc_5c7sTc9c() {
    assertEquals(
      "5c7sTc9c 9h8cJhQc",
      Solver.process("omaha-holdem 2s3s4c7cJc 9h8cJhQc 5c7sTc9c"));
  }

  @Test
  public void test_omaha_holdem_6698_4s5c6s7dTc_JcAc9dQd_As3dAhKs_5hQc2c3c_Kd2h5s7h_5dKhJd3h_4d6cTs7c() {
    assertEquals(
      "JcAc9dQd As3dAhKs Kd2h5s7h 4d6cTs7c 5dKhJd3h=5hQc2c3c",
      Solver.process("omaha-holdem 4s5c6s7dTc JcAc9dQd As3dAhKs 5hQc2c3c Kd2h5s7h 5dKhJd3h 4d6cTs7c"));
  }

  @Test
  public void test_omaha_holdem_6699_3c7h9sAcKh_Kd5dAhQh_2c5h5c2s_Qs8s4c3d_Qc2d6d6s() {
    assertEquals(
      "Qs8s4c3d 2c5h5c2s Qc2d6d6s Kd5dAhQh",
      Solver.process("omaha-holdem 3c7h9sAcKh Kd5dAhQh 2c5h5c2s Qs8s4c3d Qc2d6d6s"));
  }

  @Test
  public void test_omaha_holdem_6700_7c7sKsQhTc_As8sTs5s_5h2c6dQd() {
    assertEquals(
      "As8sTs5s 5h2c6dQd",
      Solver.process("omaha-holdem 7c7sKsQhTc As8sTs5s 5h2c6dQd"));
  }

  @Test
  public void test_omaha_holdem_6701_2c2h3sAsTc_4s9cKhKs_3hQd5h5c_7hAc7dTh() {
    assertEquals(
      "3hQd5h5c 4s9cKhKs 7hAc7dTh",
      Solver.process("omaha-holdem 2c2h3sAsTc 4s9cKhKs 3hQd5h5c 7hAc7dTh"));
  }

  @Test
  public void test_omaha_holdem_6702_4d5h7sAhJh_4sAdQs2s_QhTh6c4h_5d2h5c8d_5sJd7hJs_7d9s9dJc_KhQc3s8h_7c2d4c6d() {
    assertEquals(
      "7c2d4c6d 7d9s9dJc 4sAdQs2s 5d2h5c8d 5sJd7hJs QhTh6c4h KhQc3s8h",
      Solver.process("omaha-holdem 4d5h7sAhJh 4sAdQs2s QhTh6c4h 5d2h5c8d 5sJd7hJs 7d9s9dJc KhQc3s8h 7c2d4c6d"));
  }

  @Test
  public void test_omaha_holdem_6703_4h5h6cJdKs_Js5cTh6s_8dTc2dAs_7sKh4dJh_2h4s6d9h_JcQh5sQd_3hQs7d5d() {
    assertEquals(
      "8dTc2dAs 2h4s6d9h JcQh5sQd Js5cTh6s 7sKh4dJh 3hQs7d5d",
      Solver.process("omaha-holdem 4h5h6cJdKs Js5cTh6s 8dTc2dAs 7sKh4dJh 2h4s6d9h JcQh5sQd 3hQs7d5d"));
  }

  @Test
  public void test_omaha_holdem_6704_3d8c8s9hQh_TdJhAd2c_4cQd3sQc_7dKs2dKd_Ah4d5h8h() {
    assertEquals(
      "7dKs2dKd Ah4d5h8h TdJhAd2c 4cQd3sQc",
      Solver.process("omaha-holdem 3d8c8s9hQh TdJhAd2c 4cQd3sQc 7dKs2dKd Ah4d5h8h"));
  }

  @Test
  public void test_omaha_holdem_6705_2d9cAcJhJs_7s2cKc4h_9hKd4s9d_2h3h8hTs_7d5h8sQh_QsAsKh9s_6dAdQd5s() {
    assertEquals(
      "7d5h8sQh 2h3h8hTs 7s2cKc4h 6dAdQd5s QsAsKh9s 9hKd4s9d",
      Solver.process("omaha-holdem 2d9cAcJhJs 7s2cKc4h 9hKd4s9d 2h3h8hTs 7d5h8sQh QsAsKh9s 6dAdQd5s"));
  }

  @Test
  public void test_omaha_holdem_6706_8sAdKsQhQs_KcAs5sJs_Th4sAc6d() {
    assertEquals(
      "Th4sAc6d KcAs5sJs",
      Solver.process("omaha-holdem 8sAdKsQhQs KcAs5sJs Th4sAc6d"));
  }

  @Test
  public void test_omaha_holdem_6707_4d5d6c6hKh_3sQhKd7d_Jc8hAhTs_8c3hAc4h_4s8d5s4c_5hTc8sKc() {
    assertEquals(
      "Jc8hAhTs 8c3hAc4h 5hTc8sKc 3sQhKd7d 4s8d5s4c",
      Solver.process("omaha-holdem 4d5d6c6hKh 3sQhKd7d Jc8hAhTs 8c3hAc4h 4s8d5s4c 5hTc8sKc"));
  }

  @Test
  public void test_omaha_holdem_6708_7d8d9c9hTh_AsJsTd4c_8c2sQs9d() {
    assertEquals(
      "AsJsTd4c 8c2sQs9d",
      Solver.process("omaha-holdem 7d8d9c9hTh AsJsTd4c 8c2sQs9d"));
  }

  @Test
  public void test_omaha_holdem_6709_5d6dAcJhKh_9c3sTs6s_5s4h2c2s_2h7d6h3d_3c4cKc9d_9sAs7h2d() {
    assertEquals(
      "5s4h2c2s 2h7d6h3d 9c3sTs6s 3c4cKc9d 9sAs7h2d",
      Solver.process("omaha-holdem 5d6dAcJhKh 9c3sTs6s 5s4h2c2s 2h7d6h3d 3c4cKc9d 9sAs7h2d"));
  }

  @Test
  public void test_omaha_holdem_6710_6d6sAdKcTd_2h3cTc7h_5d9dKd7d_4d8cQdTh_7s8d9sAc_Jd3sKh5c_Qs5s2cQc_9h7c6cJs_5hAh8h3d() {
    assertEquals(
      "2h3cTc7h Qs5s2cQc Jd3sKh5c 5hAh8h3d 7s8d9sAc 9h7c6cJs 4d8cQdTh 5d9dKd7d",
      Solver.process("omaha-holdem 6d6sAdKcTd 2h3cTc7h 5d9dKd7d 4d8cQdTh 7s8d9sAc Jd3sKh5c Qs5s2cQc 9h7c6cJs 5hAh8h3d"));
  }

  @Test
  public void test_omaha_holdem_6711_4d7d9dAdQc_3s4s8cJs_As5h9cTh_9sTd2d6c_4c7c6h3c_Ts8hKs3d_JcQs5c2c_Tc7s3hKd() {
    assertEquals(
      "Ts8hKs3d 3s4s8cJs Tc7s3hKd JcQs5c2c 4c7c6h3c As5h9cTh 9sTd2d6c",
      Solver.process("omaha-holdem 4d7d9dAdQc 3s4s8cJs As5h9cTh 9sTd2d6c 4c7c6h3c Ts8hKs3d JcQs5c2c Tc7s3hKd"));
  }

  @Test
  public void test_omaha_holdem_6712_3h4c7h8cAc_AhQhKcTc_5c6h5d2d_9h9dJc2h() {
    assertEquals(
      "9h9dJc2h 5c6h5d2d AhQhKcTc",
      Solver.process("omaha-holdem 3h4c7h8cAc AhQhKcTc 5c6h5d2d 9h9dJc2h"));
  }

  @Test
  public void test_omaha_holdem_6713_5s8dAcQsTh_KsTs9dAh_Kh2dAsQc_4d7d4h4s_6hQd2h6s_3s8c9hJh_9s6c2s5h() {
    assertEquals(
      "4d7d4h4s 9s6c2s5h 6hQd2h6s KsTs9dAh Kh2dAsQc 3s8c9hJh",
      Solver.process("omaha-holdem 5s8dAcQsTh KsTs9dAh Kh2dAsQc 4d7d4h4s 6hQd2h6s 3s8c9hJh 9s6c2s5h"));
  }

  @Test
  public void test_omaha_holdem_6714_7c9c9hQcTh_3cJd3hTc_5sAdQhKs_9s9d6d8d_7d7h4dQs_6h2d5hTs_3d3s5d4c_Td7s4s6c_6sJh2h2s() {
    assertEquals(
      "6sJh2h2s 3d3s5d4c 6h2d5hTs Td7s4s6c 5sAdQhKs 3cJd3hTc 7d7h4dQs 9s9d6d8d",
      Solver.process("omaha-holdem 7c9c9hQcTh 3cJd3hTc 5sAdQhKs 9s9d6d8d 7d7h4dQs 6h2d5hTs 3d3s5d4c Td7s4s6c 6sJh2h2s"));
  }

  @Test
  public void test_omaha_holdem_6715_5d7d7h9hTh_Js3h5c2s_KhQcKd9c_7s4d5hTd_9dKs2dQh() {
    assertEquals(
      "Js3h5c2s 9dKs2dQh KhQcKd9c 7s4d5hTd",
      Solver.process("omaha-holdem 5d7d7h9hTh Js3h5c2s KhQcKd9c 7s4d5hTd 9dKs2dQh"));
  }

  @Test
  public void test_omaha_holdem_6716_2h3h7c8sQh_3d6dAh9h_Qc7d7sJc_Jd4s7h9s_9cQs3s3c() {
    assertEquals(
      "Jd4s7h9s 9cQs3s3c Qc7d7sJc 3d6dAh9h",
      Solver.process("omaha-holdem 2h3h7c8sQh 3d6dAh9h Qc7d7sJc Jd4s7h9s 9cQs3s3c"));
  }

  @Test
  public void test_omaha_holdem_6717_3s4s8dAcQs_Js8s7h4h_Jh6h5hKc_7c8h2sQc_5d8cTs4d_Ks5s9hAd_9d7sQhKd_Kh9c3d6s() {
    assertEquals(
      "Jh6h5hKc Kh9c3d6s 9d7sQhKd 5d8cTs4d 7c8h2sQc Js8s7h4h Ks5s9hAd",
      Solver.process("omaha-holdem 3s4s8dAcQs Js8s7h4h Jh6h5hKc 7c8h2sQc 5d8cTs4d Ks5s9hAd 9d7sQhKd Kh9c3d6s"));
  }

  @Test
  public void test_omaha_holdem_6718_2c2h8h9cAd_5hQs9s5s_Kd2d4c4s_3d7h6d4d_QcTs6c7c_Ac6h3h3c_Qd7s8cTh_QhJdKsJh() {
    assertEquals(
      "3d7h6d4d QcTs6c7c Qd7s8cTh 5hQs9s5s QhJdKsJh Ac6h3h3c Kd2d4c4s",
      Solver.process("omaha-holdem 2c2h8h9cAd 5hQs9s5s Kd2d4c4s 3d7h6d4d QcTs6c7c Ac6h3h3c Qd7s8cTh QhJdKsJh"));
  }

  @Test
  public void test_omaha_holdem_6719_8dAsKsQhTh_5h5c6d7c_Js6s2hJc_QsAh7s9h_3s6c8c7d_5d4hKdKh_Td8s3c9c() {
    assertEquals(
      "5h5c6d7c 3s6c8c7d Js6s2hJc Td8s3c9c QsAh7s9h 5d4hKdKh",
      Solver.process("omaha-holdem 8dAsKsQhTh 5h5c6d7c Js6s2hJc QsAh7s9h 3s6c8c7d 5d4hKdKh Td8s3c9c"));
  }

  @Test
  public void test_omaha_holdem_6720_3d5d7s8cJh_5c4s7c5h_As9h3s9c_Ah3c4dTd_2c9dQh4h_8dJs6h8h() {
    assertEquals(
      "2c9dQh4h Ah3c4dTd As9h3s9c 5c4s7c5h 8dJs6h8h",
      Solver.process("omaha-holdem 3d5d7s8cJh 5c4s7c5h As9h3s9c Ah3c4dTd 2c9dQh4h 8dJs6h8h"));
  }

  @Test
  public void test_omaha_holdem_6721_5d7cJcJdJs_3d6sAh4c_KcJh9c5h() {
    assertEquals(
      "3d6sAh4c KcJh9c5h",
      Solver.process("omaha-holdem 5d7cJcJdJs 3d6sAh4c KcJh9c5h"));
  }

  @Test
  public void test_omaha_holdem_6722_5h7hJdKcQc_9c2d2h7c_Ts6h3sTc_9s3d8d4c_6d8hJsAs() {
    assertEquals(
      "9s3d8d4c 9c2d2h7c Ts6h3sTc 6d8hJsAs",
      Solver.process("omaha-holdem 5h7hJdKcQc 9c2d2h7c Ts6h3sTc 9s3d8d4c 6d8hJsAs"));
  }

  @Test
  public void test_omaha_holdem_6723_2s4h6c6hAd_3s9c4c2d_AhTh2cKd_Ks7dAs3c() {
    assertEquals(
      "3s9c4c2d AhTh2cKd=Ks7dAs3c",
      Solver.process("omaha-holdem 2s4h6c6hAd 3s9c4c2d AhTh2cKd Ks7dAs3c"));
  }

  @Test
  public void test_omaha_holdem_6724_5c8cAsTcTd_Kc9h8sKd_Qh9d3h7c() {
    assertEquals(
      "Qh9d3h7c Kc9h8sKd",
      Solver.process("omaha-holdem 5c8cAsTcTd Kc9h8sKd Qh9d3h7c"));
  }

  @Test
  public void test_omaha_holdem_6725_2h2s4s8hKh_3c9c4d4c_2dQcQh8s_Tc4h7h7s_Ad8d9sJc_5d6c3s9d_7cTd5s2c_TsTh5c3d() {
    assertEquals(
      "5d6c3s9d Ad8d9sJc TsTh5c3d 7cTd5s2c Tc4h7h7s 2dQcQh8s 3c9c4d4c",
      Solver.process("omaha-holdem 2h2s4s8hKh 3c9c4d4c 2dQcQh8s Tc4h7h7s Ad8d9sJc 5d6c3s9d 7cTd5s2c TsTh5c3d"));
  }

  @Test
  public void test_omaha_holdem_6726_2d4h8cJcKc_7sTc4c6c_7c7hTd6s_2h3hJsKh_3d9hAsQd() {
    assertEquals(
      "3d9hAsQd 7c7hTd6s 2h3hJsKh 7sTc4c6c",
      Solver.process("omaha-holdem 2d4h8cJcKc 7sTc4c6c 7c7hTd6s 2h3hJsKh 3d9hAsQd"));
  }

  @Test
  public void test_omaha_holdem_6727_8dAhKdKhTc_5sThQc9h_6h9s3dJs_8s7d5c7c_7hKc6dAd_5d8hTsJh_7sAc9d3c_3hAs3sJd_2cJcQhQs_2h6c4sTd() {
    assertEquals(
      "6h9s3dJs 8s7d5c7c 2h6c4sTd 5d8hTsJh 5sThQc9h 7sAc9d3c 3hAs3sJd 2cJcQhQs 7hKc6dAd",
      Solver.process("omaha-holdem 8dAhKdKhTc 5sThQc9h 6h9s3dJs 8s7d5c7c 7hKc6dAd 5d8hTsJh 7sAc9d3c 3hAs3sJd 2cJcQhQs 2h6c4sTd"));
  }

  @Test
  public void test_omaha_holdem_6728_2h4s5sAhTh_4c2sJc2d_TdQc9cKs_2cAc9sTc_6h4h3s8s_4d8d3h5c_TsQsKc7d_As9d5h8c_Jh6c7c3d_Qh9hQdKh() {
    assertEquals(
      "TdQc9cKs=TsQsKc7d As9d5h8c 2cAc9sTc 4c2sJc2d 4d8d3h5c Jh6c7c3d 6h4h3s8s Qh9hQdKh",
      Solver.process("omaha-holdem 2h4s5sAhTh 4c2sJc2d TdQc9cKs 2cAc9sTc 6h4h3s8s 4d8d3h5c TsQsKc7d As9d5h8c Jh6c7c3d Qh9hQdKh"));
  }

  @Test
  public void test_omaha_holdem_6729_3h5s8cKdKh_5cThJsAd_4d9sQh3d_4hAc2sTc_9h4cAh9d_Qs2d9c7d() {
    assertEquals(
      "Qs2d9c7d 4hAc2sTc 4d9sQh3d 5cThJsAd 9h4cAh9d",
      Solver.process("omaha-holdem 3h5s8cKdKh 5cThJsAd 4d9sQh3d 4hAc2sTc 9h4cAh9d Qs2d9c7d"));
  }

  @Test
  public void test_omaha_holdem_6730_2c4h4s6sJs_4d5s6dTc_8dTh9c3s_2d9dAs9s_6h3h8h7h_KsQd2h8s_AdJhQc9h_8cQsAcAh() {
    assertEquals(
      "8dTh9c3s 6h3h8h7h AdJhQc9h 8cQsAcAh KsQd2h8s 2d9dAs9s 4d5s6dTc",
      Solver.process("omaha-holdem 2c4h4s6sJs 4d5s6dTc 8dTh9c3s 2d9dAs9s 6h3h8h7h KsQd2h8s AdJhQc9h 8cQsAcAh"));
  }

  @Test
  public void test_omaha_holdem_6731_3h4c9h9sAd_3cTh6c3d_6dQd5hTd_8c8s7h7c_4h5s2c2d_6sKc4sJh_7dTs8hJc_Tc2s5d4d_8dAh3sQc() {
    assertEquals(
      "7dTs8hJc 6dQd5hTd 6sKc4sJh 8c8s7h7c 8dAh3sQc 4h5s2c2d=Tc2s5d4d 3cTh6c3d",
      Solver.process("omaha-holdem 3h4c9h9sAd 3cTh6c3d 6dQd5hTd 8c8s7h7c 4h5s2c2d 6sKc4sJh 7dTs8hJc Tc2s5d4d 8dAh3sQc"));
  }

  @Test
  public void test_omaha_holdem_6732_3h7d7hKsQs_4sQh8dQd_2d3s2hJd() {
    assertEquals(
      "2d3s2hJd 4sQh8dQd",
      Solver.process("omaha-holdem 3h7d7hKsQs 4sQh8dQd 2d3s2hJd"));
  }

  @Test
  public void test_omaha_holdem_6733_3c3h6c9sQh_7c8cTd3s_Qd5dKhQc_4cTsAh9h_8d3d5h6h_2h9cAs8h_9dJs2s8s_4dJd4hKc_2cKdAcTc() {
    assertEquals(
      "2cKdAcTc 4dJd4hKc 9dJs2s8s 2h9cAs8h=4cTsAh9h 7c8cTd3s 8d3d5h6h Qd5dKhQc",
      Solver.process("omaha-holdem 3c3h6c9sQh 7c8cTd3s Qd5dKhQc 4cTsAh9h 8d3d5h6h 2h9cAs8h 9dJs2s8s 4dJd4hKc 2cKdAcTc"));
  }

  @Test
  public void test_omaha_holdem_6734_2c2s9dKdQd_Jc7cTd4c_ThQc2h2d() {
    assertEquals(
      "Jc7cTd4c ThQc2h2d",
      Solver.process("omaha-holdem 2c2s9dKdQd Jc7cTd4c ThQc2h2d"));
  }

  @Test
  public void test_omaha_holdem_6735_6c8h9hJdQd_Qh7dQc3s_5sJs5c5d_KcAd9d3d_TdKs8cTh_2s3h2d8s_4c9c3c7h_Ah5h6d4d_JhQsKhTc_8dJc4sAs() {
    assertEquals(
      "Ah5h6d4d 2s3h2d8s 4c9c3c7h KcAd9d3d 5sJs5c5d 8dJc4sAs Qh7dQc3s JhQsKhTc=TdKs8cTh",
      Solver.process("omaha-holdem 6c8h9hJdQd Qh7dQc3s 5sJs5c5d KcAd9d3d TdKs8cTh 2s3h2d8s 4c9c3c7h Ah5h6d4d JhQsKhTc 8dJc4sAs"));
  }

  @Test
  public void test_omaha_holdem_6736_4h7d9h9sQd_9c8dAhKh_QcJc8cAd_Ac8s5c8h_5hQh5dQs() {
    assertEquals(
      "Ac8s5c8h QcJc8cAd 9c8dAhKh 5hQh5dQs",
      Solver.process("omaha-holdem 4h7d9h9sQd 9c8dAhKh QcJc8cAd Ac8s5c8h 5hQh5dQs"));
  }

  @Test
  public void test_omaha_holdem_6737_5s7sJhQhTd_Ah8d9c8h_Qd6s9hKh_5c3s3c7h_3d9d2sTh_9sKcTs4c() {
    assertEquals(
      "3d9d2sTh 5c3s3c7h Ah8d9c8h 9sKcTs4c=Qd6s9hKh",
      Solver.process("omaha-holdem 5s7sJhQhTd Ah8d9c8h Qd6s9hKh 5c3s3c7h 3d9d2sTh 9sKcTs4c"));
  }

  @Test
  public void test_omaha_holdem_6738_3c5c8c8h9h_7d2s2d3h_Qs2hKdAc_9sAs6dAh_6h3s4h2c_8dQdAdTc_Kc5sQh3d() {
    assertEquals(
      "Qs2hKdAc 6h3s4h2c 7d2s2d3h Kc5sQh3d 9sAs6dAh 8dQdAdTc",
      Solver.process("omaha-holdem 3c5c8c8h9h 7d2s2d3h Qs2hKdAc 9sAs6dAh 6h3s4h2c 8dQdAdTc Kc5sQh3d"));
  }

  @Test
  public void test_omaha_holdem_6739_5c6d8d9cTc_6c8s6h4c_Qs5hTd4d_ThJhQc5s_9sAs7sKs_8c8hAc4h() {
    assertEquals(
      "Qs5hTd4d 9sAs7sKs ThJhQc5s 6c8s6h4c 8c8hAc4h",
      Solver.process("omaha-holdem 5c6d8d9cTc 6c8s6h4c Qs5hTd4d ThJhQc5s 9sAs7sKs 8c8hAc4h"));
  }

  @Test
  public void test_omaha_holdem_6740_3d5dJhQhTs_2h9h7cJd_4c9s7h4h_6h6sAdTd_8sQc3s4d_8h7dJc7s() {
    assertEquals(
      "4c9s7h4h 6h6sAdTd 8h7dJc7s 2h9h7cJd 8sQc3s4d",
      Solver.process("omaha-holdem 3d5dJhQhTs 2h9h7cJd 4c9s7h4h 6h6sAdTd 8sQc3s4d 8h7dJc7s"));
  }

  @Test
  public void test_omaha_holdem_6741_6h7d9d9hKd_4h4cJd3d_4d9sKsKh_3c5h9c7s_Ah5d7c5c_2s3hQd6s() {
    assertEquals(
      "2s3hQd6s Ah5d7c5c 4h4cJd3d 3c5h9c7s 4d9sKsKh",
      Solver.process("omaha-holdem 6h7d9d9hKd 4h4cJd3d 4d9sKsKh 3c5h9c7s Ah5d7c5c 2s3hQd6s"));
  }

  @Test
  public void test_omaha_holdem_6742_3h3s5c9hJc_9sQc8d6d_4d2s7cTs_KdKs8h2h_9c6sAd2c_Qs4h5sAh_Tc4s3c3d_AcAs8c6h_Th7h6cJh_QdQh8s7s() {
    assertEquals(
      "4d2s7cTs Qs4h5sAh 9sQc8d6d 9c6sAd2c Th7h6cJh QdQh8s7s KdKs8h2h AcAs8c6h Tc4s3c3d",
      Solver.process("omaha-holdem 3h3s5c9hJc 9sQc8d6d 4d2s7cTs KdKs8h2h 9c6sAd2c Qs4h5sAh Tc4s3c3d AcAs8c6h Th7h6cJh QdQh8s7s"));
  }

  @Test
  public void test_omaha_holdem_6743_2c2d5sAhKc_9c8c4d3h_8dTh8sQs() {
    assertEquals(
      "8dTh8sQs 9c8c4d3h",
      Solver.process("omaha-holdem 2c2d5sAhKc 9c8c4d3h 8dTh8sQs"));
  }

  @Test
  public void test_omaha_holdem_6744_3c4h4s7sAd_8h9c4d3h_Qs6d9hTd_9d4cJdKd_8sQc5sKc() {
    assertEquals(
      "Qs6d9hTd 8sQc5sKc 9d4cJdKd 8h9c4d3h",
      Solver.process("omaha-holdem 3c4h4s7sAd 8h9c4d3h Qs6d9hTd 9d4cJdKd 8sQc5sKc"));
  }

  @Test
  public void test_omaha_holdem_6745_3h3sKcKsTd_Jc5h8dQh_Ah6c4sTc_2d7s2hQd() {
    assertEquals(
      "Jc5h8dQh 2d7s2hQd Ah6c4sTc",
      Solver.process("omaha-holdem 3h3sKcKsTd Jc5h8dQh Ah6c4sTc 2d7s2hQd"));
  }

  @Test
  public void test_omaha_holdem_6746_8cKcKsQcTh_TsAsQs4c_Js7hTc3d_6s7d8s3c_4d6dAd4h_Kh3sKd2s() {
    assertEquals(
      "4d6dAd4h 6s7d8s3c Js7hTc3d TsAsQs4c Kh3sKd2s",
      Solver.process("omaha-holdem 8cKcKsQcTh TsAsQs4c Js7hTc3d 6s7d8s3c 4d6dAd4h Kh3sKd2s"));
  }

  @Test
  public void test_omaha_holdem_6747_2h3h7c9cKs_4d3d6cTh_9s3sJs2c() {
    assertEquals(
      "4d3d6cTh 9s3sJs2c",
      Solver.process("omaha-holdem 2h3h7c9cKs 4d3d6cTh 9s3sJs2c"));
  }

  @Test
  public void test_omaha_holdem_6748_2d2h3c9dKc_Qh6d9c4s_8s7d4h5d_Th7c2c4c_5sKhJhKs_QdAdKd8d_TdAcJd6c_8h3h7s9s_Js3sTs4d_TcAh5h5c() {
    assertEquals(
      "8s7d4h5d TdAcJd6c Js3sTs4d TcAh5h5c Qh6d9c4s 8h3h7s9s QdAdKd8d Th7c2c4c 5sKhJhKs",
      Solver.process("omaha-holdem 2d2h3c9dKc Qh6d9c4s 8s7d4h5d Th7c2c4c 5sKhJhKs QdAdKd8d TdAcJd6c 8h3h7s9s Js3sTs4d TcAh5h5c"));
  }

  @Test
  public void test_omaha_holdem_6749_2s7sQcTdTs_Ah6h8d5d_KcKh5c7d_AcJc9c4c_9h5hQs7h_2dQh9s9d_8c4h4sJs() {
    assertEquals(
      "Ah6h8d5d AcJc9c4c 2dQh9s9d=9h5hQs7h KcKh5c7d 8c4h4sJs",
      Solver.process("omaha-holdem 2s7sQcTdTs Ah6h8d5d KcKh5c7d AcJc9c4c 9h5hQs7h 2dQh9s9d 8c4h4sJs"));
  }

}
