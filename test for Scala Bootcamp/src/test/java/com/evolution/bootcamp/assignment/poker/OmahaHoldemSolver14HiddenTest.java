
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver14HiddenTest {


  @Test
  public void test_omaha_holdem_3500_2d3h3s9sJd_KdKs6d5d_4cAc6cAd_QhJh8s4d() {
    assertEquals(
      "QhJh8s4d KdKs6d5d 4cAc6cAd",
      Solver.process("omaha-holdem 2d3h3s9sJd KdKs6d5d 4cAc6cAd QhJh8s4d"));
  }

  @Test
  public void test_omaha_holdem_3501_2c3c5c7c8h_QcJcJhQd_6cKh2d6h_3sTc5s3h_KdAc2s7d_Js7hKcAd_Ks3dAs9d() {
    assertEquals(
      "Ks3dAs9d 6cKh2d6h Js7hKcAd KdAc2s7d 3sTc5s3h QcJcJhQd",
      Solver.process("omaha-holdem 2c3c5c7c8h QcJcJhQd 6cKh2d6h 3sTc5s3h KdAc2s7d Js7hKcAd Ks3dAs9d"));
  }

  @Test
  public void test_omaha_holdem_3502_5s8d9sQcQh_Js8h6d6s_Tc5hTsAc_3h5dKsQs_4dKd7c7d() {
    assertEquals(
      "4dKd7c7d Js8h6d6s Tc5hTsAc 3h5dKsQs",
      Solver.process("omaha-holdem 5s8d9sQcQh Js8h6d6s Tc5hTsAc 3h5dKsQs 4dKd7c7d"));
  }

  @Test
  public void test_omaha_holdem_3503_4c7d7sAdKh_6h4h5d9s_8s6dAh6c() {
    assertEquals(
      "6h4h5d9s 8s6dAh6c",
      Solver.process("omaha-holdem 4c7d7sAdKh 6h4h5d9s 8s6dAh6c"));
  }

  @Test
  public void test_omaha_holdem_3504_3c8hJdKsQd_9s2hAd8c_Qc8dJs6s_Ah4hAs9c_Kh6h3h9h_Jc5c6d5d_KdAc5sKc() {
    assertEquals(
      "9s2hAd8c Jc5c6d5d Ah4hAs9c Qc8dJs6s Kh6h3h9h KdAc5sKc",
      Solver.process("omaha-holdem 3c8hJdKsQd 9s2hAd8c Qc8dJs6s Ah4hAs9c Kh6h3h9h Jc5c6d5d KdAc5sKc"));
  }

  @Test
  public void test_omaha_holdem_3505_2h2s4d6dAd_5d7h5c5h_3c9c8cKh_8d2cKcTh_Qh4s8s6c_Td3sTc6s_3dJdJsAs() {
    assertEquals(
      "3c9c8cKh 5d7h5c5h Qh4s8s6c Td3sTc6s 8d2cKcTh 3dJdJsAs",
      Solver.process("omaha-holdem 2h2s4d6dAd 5d7h5c5h 3c9c8cKh 8d2cKcTh Qh4s8s6c Td3sTc6s 3dJdJsAs"));
  }

  @Test
  public void test_omaha_holdem_3506_2hAsKsQhTs_3d9c8d2c_Tc7cAdKd_AcThTdAh() {
    assertEquals(
      "3d9c8d2c Tc7cAdKd AcThTdAh",
      Solver.process("omaha-holdem 2hAsKsQhTs 3d9c8d2c Tc7cAdKd AcThTdAh"));
  }

  @Test
  public void test_omaha_holdem_3507_4c6c8sAcKd_8hAsAd5c_9s5dJc5s_3h3dKsQc_2sTc7c9c_7h7s3c8d_TdTh4sQs() {
    assertEquals(
      "9s5dJc5s 7h7s3c8d TdTh4sQs 3h3dKsQc 8hAsAd5c 2sTc7c9c",
      Solver.process("omaha-holdem 4c6c8sAcKd 8hAsAd5c 9s5dJc5s 3h3dKsQc 2sTc7c9c 7h7s3c8d TdTh4sQs"));
  }

  @Test
  public void test_omaha_holdem_3508_4dJsKdTcTh_7s8cQdKs_JhKh8h4s_Jc3d9h9c_4c8s6d8d() {
    assertEquals(
      "4c8s6d8d Jc3d9h9c 7s8cQdKs JhKh8h4s",
      Solver.process("omaha-holdem 4dJsKdTcTh 7s8cQdKs JhKh8h4s Jc3d9h9c 4c8s6d8d"));
  }

  @Test
  public void test_omaha_holdem_3509_4h5h7dKsTs_8hAd8c8s_Ac2d5dTd_7c4d9cJd_QdKd6c2c_Qc3dTcAs_5cTh3s2s_JsJc6s9h_9d6dAh2h_4s8dKh7s() {
    assertEquals(
      "9d6dAh2h 8hAd8c8s Qc3dTcAs JsJc6s9h QdKd6c2c 7c4d9cJd 5cTh3s2s=Ac2d5dTd 4s8dKh7s",
      Solver.process("omaha-holdem 4h5h7dKsTs 8hAd8c8s Ac2d5dTd 7c4d9cJd QdKd6c2c Qc3dTcAs 5cTh3s2s JsJc6s9h 9d6dAh2h 4s8dKh7s"));
  }

  @Test
  public void test_omaha_holdem_3510_6s8d8sAhTh_7dQs7hTd_KsKd6d9c_2c3d7s3s_5h7c9d6c_Kc2h9h5d_4sQdJc4d() {
    assertEquals(
      "Kc2h9h5d 2c3d7s3s 4sQdJc4d 7dQs7hTd KsKd6d9c 5h7c9d6c",
      Solver.process("omaha-holdem 6s8d8sAhTh 7dQs7hTd KsKd6d9c 2c3d7s3s 5h7c9d6c Kc2h9h5d 4sQdJc4d"));
  }

  @Test
  public void test_omaha_holdem_3511_2h5c6c9sAd_3d2s8hAh_3sJh2c2d_Ts7cJdKh_7h6dQc8d_6hQdThAc_7dQsJc3c_4d6sTd8c() {
    assertEquals(
      "7dQsJc3c Ts7cJdKh 4d6sTd8c 3d2s8hAh 6hQdThAc 3sJh2c2d 7h6dQc8d",
      Solver.process("omaha-holdem 2h5c6c9sAd 3d2s8hAh 3sJh2c2d Ts7cJdKh 7h6dQc8d 6hQdThAc 7dQsJc3c 4d6sTd8c"));
  }

  @Test
  public void test_omaha_holdem_3512_2c2h2s7sJs_Jh4d2dKh_ThKcQcJc_Ac8dAh5s() {
    assertEquals(
      "ThKcQcJc Ac8dAh5s Jh4d2dKh",
      Solver.process("omaha-holdem 2c2h2s7sJs Jh4d2dKh ThKcQcJc Ac8dAh5s"));
  }

  @Test
  public void test_omaha_holdem_3513_5c5sKcTcTd_8c7sJc5h_8sThTs9c_3hKdKs3d_Ac3cAdJd_2s2c5dQc_3sAs9dJs_7d6s9s9h_8h2dAhJh_4s6c8d4d() {
    assertEquals(
      "3sAs9dJs=8h2dAhJh 4s6c8d4d 7d6s9s9h 8c7sJc5h 2s2c5dQc Ac3cAdJd 3hKdKs3d 8sThTs9c",
      Solver.process("omaha-holdem 5c5sKcTcTd 8c7sJc5h 8sThTs9c 3hKdKs3d Ac3cAdJd 2s2c5dQc 3sAs9dJs 7d6s9s9h 8h2dAhJh 4s6c8d4d"));
  }

  @Test
  public void test_omaha_holdem_3514_3h6s8hTcTd_5h9s9c8c_QdAs8s4d_7dKc5c7c_3sJc5sTs_6c3dJdQh() {
    assertEquals(
      "6c3dJdQh 7dKc5c7c QdAs8s4d 5h9s9c8c 3sJc5sTs",
      Solver.process("omaha-holdem 3h6s8hTcTd 5h9s9c8c QdAs8s4d 7dKc5c7c 3sJc5sTs 6c3dJdQh"));
  }

  @Test
  public void test_omaha_holdem_3515_3d4s8cJsQh_4d2s7dQs_9hAs8d4c_5h8s5s9c_KsTs2d4h_TdAh5c6d() {
    assertEquals(
      "TdAh5c6d KsTs2d4h 5h8s5s9c 9hAs8d4c 4d2s7dQs",
      Solver.process("omaha-holdem 3d4s8cJsQh 4d2s7dQs 9hAs8d4c 5h8s5s9c KsTs2d4h TdAh5c6d"));
  }

  @Test
  public void test_omaha_holdem_3516_4c6c7dKsTd_AdQcKdQd_Jh7h3dAs_9d5cJdAh_Tc5d6h9s_8h7cKhAc_Kc4hQs7s_4d3h5h8c_6s5sJc2d() {
    assertEquals(
      "9d5cJdAh 6s5sJc2d Jh7h3dAs AdQcKdQd Tc5d6h9s 8h7cKhAc=Kc4hQs7s 4d3h5h8c",
      Solver.process("omaha-holdem 4c6c7dKsTd AdQcKdQd Jh7h3dAs 9d5cJdAh Tc5d6h9s 8h7cKhAc Kc4hQs7s 4d3h5h8c 6s5sJc2d"));
  }

  @Test
  public void test_omaha_holdem_3517_2h5h5s8hAs_Ah6sTc4c_3d6dQs2c_Kd9dTd6c_Jh8s7s4d_Js7dKc3s() {
    assertEquals(
      "Kd9dTd6c Js7dKc3s 3d6dQs2c Jh8s7s4d Ah6sTc4c",
      Solver.process("omaha-holdem 2h5h5s8hAs Ah6sTc4c 3d6dQs2c Kd9dTd6c Jh8s7s4d Js7dKc3s"));
  }

  @Test
  public void test_omaha_holdem_3518_2d5d7c7dAc_JcThKd2h_3d9hTs4s_Qh8h3s7h_TcAsKcQc_AdJd6h4c_3c9cQd8c_8s8d3h6d_7sAh4d9d_2s4h5cJs() {
    assertEquals(
      "3c9cQd8c JcThKd2h 2s4h5cJs TcAsKcQc Qh8h3s7h 3d9hTs4s 8s8d3h6d AdJd6h4c 7sAh4d9d",
      Solver.process("omaha-holdem 2d5d7c7dAc JcThKd2h 3d9hTs4s Qh8h3s7h TcAsKcQc AdJd6h4c 3c9cQd8c 8s8d3h6d 7sAh4d9d 2s4h5cJs"));
  }

  @Test
  public void test_omaha_holdem_3519_2c4cAcKdTd_7sJd3c3s_Tc5cQs6c_4h8dJc5h_9c5s5dQh_QdAs2sAd() {
    assertEquals(
      "7sJd3c3s 4h8dJc5h 9c5s5dQh QdAs2sAd Tc5cQs6c",
      Solver.process("omaha-holdem 2c4cAcKdTd 7sJd3c3s Tc5cQs6c 4h8dJc5h 9c5s5dQh QdAs2sAd"));
  }

  @Test
  public void test_omaha_holdem_3520_3d6c6h7dKs_2dTs4cJc_Js5dKh9h_QcJdAh2h_TcAcKc6s_7sAd5sQs_2s9dAs9s_3cJh7c9c_8h6d5h4s_8c3h8sTh() {
    assertEquals(
      "2dTs4cJc QcJdAh2h 3cJh7c9c 7sAd5sQs 8c3h8sTh 2s9dAs9s Js5dKh9h 8h6d5h4s TcAcKc6s",
      Solver.process("omaha-holdem 3d6c6h7dKs 2dTs4cJc Js5dKh9h QcJdAh2h TcAcKc6s 7sAd5sQs 2s9dAs9s 3cJh7c9c 8h6d5h4s 8c3h8sTh"));
  }

  @Test
  public void test_omaha_holdem_3521_5c7d8hAcJs_7h9c7s6s_9s2cQsKs_7c4h3dJd_TsThTd8c_5h9d8dAh_6hAd3hKh_4d6c9h4c_2s6dKdQd_2hJh4s3s() {
    assertEquals(
      "2s6dKdQd=9s2cQsKs TsThTd8c 2hJh4s3s 6hAd3hKh 7c4h3dJd 5h9d8dAh 4d6c9h4c=7h9c7s6s",
      Solver.process("omaha-holdem 5c7d8hAcJs 7h9c7s6s 9s2cQsKs 7c4h3dJd TsThTd8c 5h9d8dAh 6hAd3hKh 4d6c9h4c 2s6dKdQd 2hJh4s3s"));
  }

  @Test
  public void test_omaha_holdem_3522_7s9c9hQhTc_Qc5dKc4s_7c6c3h6d_Ac8hTd5s_2h8c7h2s() {
    assertEquals(
      "7c6c3h6d 2h8c7h2s Ac8hTd5s Qc5dKc4s",
      Solver.process("omaha-holdem 7s9c9hQhTc Qc5dKc4s 7c6c3h6d Ac8hTd5s 2h8c7h2s"));
  }

  @Test
  public void test_omaha_holdem_3523_2h2s4dJhTd_8h7dKc6d_5sKh8d7c_9c3c2cJs_5c8c7sAc_Ah4s4h9d_4c6hTcKs_QhKd7hAd_2d3s5hJd_3h9hJcQs() {
    assertEquals(
      "5sKh8d7c=8h7dKc6d 5c8c7sAc QhKd7hAd 4c6hTcKs 3h9hJcQs 2d3s5hJd=9c3c2cJs Ah4s4h9d",
      Solver.process("omaha-holdem 2h2s4dJhTd 8h7dKc6d 5sKh8d7c 9c3c2cJs 5c8c7sAc Ah4s4h9d 4c6hTcKs QhKd7hAd 2d3s5hJd 3h9hJcQs"));
  }

  @Test
  public void test_omaha_holdem_3524_6d8h8sKcQc_Js8cAd7s_5d9c3d4c_5cTc3hQd_4s9sAc3s_7d9d7h2h_5sKs7cQh() {
    assertEquals(
      "5d9c3d4c 4s9sAc3s 7d9d7h2h 5cTc3hQd 5sKs7cQh Js8cAd7s",
      Solver.process("omaha-holdem 6d8h8sKcQc Js8cAd7s 5d9c3d4c 5cTc3hQd 4s9sAc3s 7d9d7h2h 5sKs7cQh"));
  }

  @Test
  public void test_omaha_holdem_3525_2s8hAsQhTc_3h7cJsTs_Qc7hQd9h() {
    assertEquals(
      "3h7cJsTs Qc7hQd9h",
      Solver.process("omaha-holdem 2s8hAsQhTc 3h7cJsTs Qc7hQd9h"));
  }

  @Test
  public void test_omaha_holdem_3526_5h8dAcJhTc_2sJs7d5c_4cJd8h2d_6dJcQcKs_4dAd5s7c_Td2hAhKc_7h6sTs3h_9c2c6hAs_3sQsThQd() {
    assertEquals(
      "7h6sTs3h 3sQsThQd 9c2c6hAs 2sJs7d5c 4cJd8h2d 4dAd5s7c Td2hAhKc 6dJcQcKs",
      Solver.process("omaha-holdem 5h8dAcJhTc 2sJs7d5c 4cJd8h2d 6dJcQcKs 4dAd5s7c Td2hAhKc 7h6sTs3h 9c2c6hAs 3sQsThQd"));
  }

  @Test
  public void test_omaha_holdem_3527_5c5s9cJsKh_Jc7cTcJd_ThKdJh7s_TsAsKs8d_2d8c9h3s_Qd4h6c2c_6s9d7hQh_9s3d3hKc_7d5d8s3c_6d5h8h2s() {
    assertEquals(
      "Qd4h6c2c 2d8c9h3s 6s9d7hQh TsAsKs8d 9s3d3hKc ThKdJh7s 6d5h8h2s=7d5d8s3c Jc7cTcJd",
      Solver.process("omaha-holdem 5c5s9cJsKh Jc7cTcJd ThKdJh7s TsAsKs8d 2d8c9h3s Qd4h6c2c 6s9d7hQh 9s3d3hKc 7d5d8s3c 6d5h8h2s"));
  }

  @Test
  public void test_omaha_holdem_3528_3c4c5hJcJd_Qs4s5cAs_6d9h5d6h_Tc3dQdQc() {
    assertEquals(
      "Qs4s5cAs 6d9h5d6h Tc3dQdQc",
      Solver.process("omaha-holdem 3c4c5hJcJd Qs4s5cAs 6d9h5d6h Tc3dQdQc"));
  }

  @Test
  public void test_omaha_holdem_3529_4c4s6d7s9c_3hTh7h2h_AhKsQd8c_3dAc6cKh_Js6sJh2c_TsKdAd8h_7d7cQc9s() {
    assertEquals(
      "AhKsQd8c 3dAc6cKh 3hTh7h2h Js6sJh2c TsKdAd8h 7d7cQc9s",
      Solver.process("omaha-holdem 4c4s6d7s9c 3hTh7h2h AhKsQd8c 3dAc6cKh Js6sJh2c TsKdAd8h 7d7cQc9s"));
  }

  @Test
  public void test_omaha_holdem_3530_4c7h8c9c9s_3s4sAc3h_JhKc6s8d_Th2cAdAs_QdTsJc5s_2s2hJd5h_3d6h7s6c_7c7d9hKh() {
    assertEquals(
      "2s2hJd5h 3s4sAc3h 3d6h7s6c JhKc6s8d Th2cAdAs QdTsJc5s 7c7d9hKh",
      Solver.process("omaha-holdem 4c7h8c9c9s 3s4sAc3h JhKc6s8d Th2cAdAs QdTsJc5s 2s2hJd5h 3d6h7s6c 7c7d9hKh"));
  }

  @Test
  public void test_omaha_holdem_3531_3h6h6sAsTd_5h2c2hAd_6d9dKd4h_9c8d4sAh() {
    assertEquals(
      "5h2c2hAd 9c8d4sAh 6d9dKd4h",
      Solver.process("omaha-holdem 3h6h6sAsTd 5h2c2hAd 6d9dKd4h 9c8d4sAh"));
  }

  @Test
  public void test_omaha_holdem_3532_4d5d7cJhQh_7h6h9h7s_4hAh5c8c() {
    assertEquals(
      "4hAh5c8c 7h6h9h7s",
      Solver.process("omaha-holdem 4d5d7cJhQh 7h6h9h7s 4hAh5c8c"));
  }

  @Test
  public void test_omaha_holdem_3533_2h3c5s8sJh_6c8d4cAh_Js9hAs2c_7h8h8cTd_4s3h6hKh_Qs3s4h6s() {
    assertEquals(
      "Js9hAs2c 7h8h8cTd 4s3h6hKh=6c8d4cAh=Qs3s4h6s",
      Solver.process("omaha-holdem 2h3c5s8sJh 6c8d4cAh Js9hAs2c 7h8h8cTd 4s3h6hKh Qs3s4h6s"));
  }

  @Test
  public void test_omaha_holdem_3534_3c4h8hKcQd_2cAsAc9s_6d8dJh5s_2s3d8s5d_4sQc7hTc_JdJc2dJs_3s9h5hKh_8c7d3h6c() {
    assertEquals(
      "6d8dJh5s JdJc2dJs 2cAsAc9s 2s3d8s5d=8c7d3h6c 4sQc7hTc 3s9h5hKh",
      Solver.process("omaha-holdem 3c4h8hKcQd 2cAsAc9s 6d8dJh5s 2s3d8s5d 4sQc7hTc JdJc2dJs 3s9h5hKh 8c7d3h6c"));
  }

  @Test
  public void test_omaha_holdem_3535_4d8sAcAdQd_6sThAs9d_8dTcKsKd_7c7d9s4s_3dJc3cJh_7s2sQsAh_7hJdKc5s() {
    assertEquals(
      "7hJdKc5s 7c7d9s4s 3dJc3cJh 6sThAs9d 8dTcKsKd 7s2sQsAh",
      Solver.process("omaha-holdem 4d8sAcAdQd 6sThAs9d 8dTcKsKd 7c7d9s4s 3dJc3cJh 7s2sQsAh 7hJdKc5s"));
  }

  @Test
  public void test_omaha_holdem_3536_3c5c5dJcJh_8sTc6h2c_QdQs2h3h_9sTs7d3d_8dQhJsAh() {
    assertEquals(
      "9sTs7d3d QdQs2h3h 8dQhJsAh 8sTc6h2c",
      Solver.process("omaha-holdem 3c5c5dJcJh 8sTc6h2c QdQs2h3h 9sTs7d3d 8dQhJsAh"));
  }

  @Test
  public void test_omaha_holdem_3537_4hAcQsTdTs_As6sThJc_4d4c8d4s_6h8hKd9h() {
    assertEquals(
      "6h8hKd9h 4d4c8d4s As6sThJc",
      Solver.process("omaha-holdem 4hAcQsTdTs As6sThJc 4d4c8d4s 6h8hKd9h"));
  }

  @Test
  public void test_omaha_holdem_3538_3c9d9sKcQs_Jc7c4c4h_5h7s9c9h_4d6h2hAc_Ah8dKdJs() {
    assertEquals(
      "4d6h2hAc Jc7c4c4h Ah8dKdJs 5h7s9c9h",
      Solver.process("omaha-holdem 3c9d9sKcQs Jc7c4c4h 5h7s9c9h 4d6h2hAc Ah8dKdJs"));
  }

  @Test
  public void test_omaha_holdem_3539_4d4s5d7c9c_Kd9d9h2s_ThQcKcKs() {
    assertEquals(
      "ThQcKcKs Kd9d9h2s",
      Solver.process("omaha-holdem 4d4s5d7c9c Kd9d9h2s ThQcKcKs"));
  }

  @Test
  public void test_omaha_holdem_3540_3s9dJsTcTd_5c8s6hTs_9hQd6c5s_KhKd7d7h_2sQcTh4c_4h8h9sKs_5hJd4sAs_2h7c7s6d() {
    assertEquals(
      "2h7c7s6d 9hQd6c5s 4h8h9sKs 5hJd4sAs KhKd7d7h 5c8s6hTs 2sQcTh4c",
      Solver.process("omaha-holdem 3s9dJsTcTd 5c8s6hTs 9hQd6c5s KhKd7d7h 2sQcTh4c 4h8h9sKs 5hJd4sAs 2h7c7s6d"));
  }

  @Test
  public void test_omaha_holdem_3541_3h4h6h6sKh_TsKd9d8c_4sJd2dKs_9s5dAcAd_9c2h7h5h_7s8dTcTd_8sQs6dJh_5sJc4c7c_5cJsQd8h() {
    assertEquals(
      "5cJsQd8h 7s8dTcTd TsKd9d8c 4sJd2dKs 9s5dAcAd 8sQs6dJh 5sJc4c7c 9c2h7h5h",
      Solver.process("omaha-holdem 3h4h6h6sKh TsKd9d8c 4sJd2dKs 9s5dAcAd 9c2h7h5h 7s8dTcTd 8sQs6dJh 5sJc4c7c 5cJsQd8h"));
  }

  @Test
  public void test_omaha_holdem_3542_2s7c7dAdKc_TdAs3dTs_Tc4c8hKh_9dKsAhJc_9sAc6d6s_4d5dQc3s_QdTh5h2h_6h5c8s9c_2d4hQh5s() {
    assertEquals(
      "6h5c8s9c 4d5dQc3s 2d4hQh5s=QdTh5h2h Tc4c8hKh 9sAc6d6s TdAs3dTs 9dKsAhJc",
      Solver.process("omaha-holdem 2s7c7dAdKc TdAs3dTs Tc4c8hKh 9dKsAhJc 9sAc6d6s 4d5dQc3s QdTh5h2h 6h5c8s9c 2d4hQh5s"));
  }

  @Test
  public void test_omaha_holdem_3543_3h4c5c5hKd_6h2sAd2h_QsAc9s9h() {
    assertEquals(
      "QsAc9s9h 6h2sAd2h",
      Solver.process("omaha-holdem 3h4c5c5hKd 6h2sAd2h QsAc9s9h"));
  }

  @Test
  public void test_omaha_holdem_3544_3c5h8dAsTd_KdJc9c6d_7c7s4hJd() {
    assertEquals(
      "KdJc9c6d 7c7s4hJd",
      Solver.process("omaha-holdem 3c5h8dAsTd KdJc9c6d 7c7s4hJd"));
  }

  @Test
  public void test_omaha_holdem_3545_6d7d9cJcTs_8h7s2hKc_5hKs9sQd() {
    assertEquals(
      "8h7s2hKc 5hKs9sQd",
      Solver.process("omaha-holdem 6d7d9cJcTs 8h7s2hKc 5hKs9sQd"));
  }

  @Test
  public void test_omaha_holdem_3546_7c9hJhKhKs_AcQsKc7s_Jc2s3hQh_6h6d3dTd_6s2c5c4s_Ts4dTh4h() {
    assertEquals(
      "6s2c5c4s 6h6d3dTd Ts4dTh4h Jc2s3hQh AcQsKc7s",
      Solver.process("omaha-holdem 7c9hJhKhKs AcQsKc7s Jc2s3hQh 6h6d3dTd 6s2c5c4s Ts4dTh4h"));
  }

  @Test
  public void test_omaha_holdem_3547_3s4h9c9sTd_Qs6h6dAs_8h9dQh3d_Js4d4sAd_8c6cAhKh_KcJh7dTc_5c2cKd4c() {
    assertEquals(
      "8c6cAhKh 5c2cKd4c Qs6h6dAs KcJh7dTc Js4d4sAd 8h9dQh3d",
      Solver.process("omaha-holdem 3s4h9c9sTd Qs6h6dAs 8h9dQh3d Js4d4sAd 8c6cAhKh KcJh7dTc 5c2cKd4c"));
  }

  @Test
  public void test_omaha_holdem_3548_4s6hJcQcQd_5h9s3d4h_6d4d7c9c() {
    assertEquals(
      "5h9s3d4h 6d4d7c9c",
      Solver.process("omaha-holdem 4s6hJcQcQd 5h9s3d4h 6d4d7c9c"));
  }

  @Test
  public void test_omaha_holdem_3549_5c9hAdQhTs_5h8h3dQd_3c5d9d6c_2cAcJh6s_2dJd3s5s_Kd4sJcKc() {
    assertEquals(
      "2dJd3s5s 2cAcJh6s 3c5d9d6c 5h8h3dQd Kd4sJcKc",
      Solver.process("omaha-holdem 5c9hAdQhTs 5h8h3dQd 3c5d9d6c 2cAcJh6s 2dJd3s5s Kd4sJcKc"));
  }

  @Test
  public void test_omaha_holdem_3550_3h5d7h9sQd_Ah2hQc9c_4sJc6d5h_8d4d4hJd_Js6c7d6h_2sQs2cKs_Kd8cTcTd() {
    assertEquals(
      "8d4d4hJd Js6c7d6h Kd8cTcTd 2sQs2cKs Ah2hQc9c 4sJc6d5h",
      Solver.process("omaha-holdem 3h5d7h9sQd Ah2hQc9c 4sJc6d5h 8d4d4hJd Js6c7d6h 2sQs2cKs Kd8cTcTd"));
  }

  @Test
  public void test_omaha_holdem_3551_3c5h8sTdTs_5c6s2cJc_Qh8c9d6d_TcQsAcKd_8h5sKsTh_2d6h3s2s_JsJh7h5d() {
    assertEquals(
      "2d6h3s2s 5c6s2cJc Qh8c9d6d JsJh7h5d TcQsAcKd 8h5sKsTh",
      Solver.process("omaha-holdem 3c5h8sTdTs 5c6s2cJc Qh8c9d6d TcQsAcKd 8h5sKsTh 2d6h3s2s JsJh7h5d"));
  }

  @Test
  public void test_omaha_holdem_3552_5h7hJsKdTs_5s2s6h8c_2hJh6sKs_9d3sAsJd() {
    assertEquals(
      "5s2s6h8c 9d3sAsJd 2hJh6sKs",
      Solver.process("omaha-holdem 5h7hJsKdTs 5s2s6h8c 2hJh6sKs 9d3sAsJd"));
  }

  @Test
  public void test_omaha_holdem_3553_2c4h6hQdTh_JhQs4cTs_2s9s5s4d_7sKd7h6d_JsJc6c6s() {
    assertEquals(
      "7sKd7h6d 2s9s5s4d JhQs4cTs JsJc6c6s",
      Solver.process("omaha-holdem 2c4h6hQdTh JhQs4cTs 2s9s5s4d 7sKd7h6d JsJc6c6s"));
  }

  @Test
  public void test_omaha_holdem_3554_4h5h6dQdTs_TcJh5d8d_Jc7h2c5s_3dJdQh8h_9c8sKh4s_4d6cKdJs_6h8cAc3h_5cQc9s2d_7c2s3c4c() {
    assertEquals(
      "9c8sKh4s Jc7h2c5s 6h8cAc3h 3dJdQh8h 4d6cKdJs TcJh5d8d 5cQc9s2d 7c2s3c4c",
      Solver.process("omaha-holdem 4h5h6dQdTs TcJh5d8d Jc7h2c5s 3dJdQh8h 9c8sKh4s 4d6cKdJs 6h8cAc3h 5cQc9s2d 7c2s3c4c"));
  }

  @Test
  public void test_omaha_holdem_3555_4h5s8c8dQc_KcQhAh2s_TsTcQs5d_2hJd3d4s_9d9hKh3s_Td9s7c3c_4c5h6d7s() {
    assertEquals(
      "Td9s7c3c 2hJd3d4s 9d9hKh3s TsTcQs5d KcQhAh2s 4c5h6d7s",
      Solver.process("omaha-holdem 4h5s8c8dQc KcQhAh2s TsTcQs5d 2hJd3d4s 9d9hKh3s Td9s7c3c 4c5h6d7s"));
  }

  @Test
  public void test_omaha_holdem_3556_5h7s9hAdJs_Kd6d2cQd_2d9c3s5c() {
    assertEquals(
      "Kd6d2cQd 2d9c3s5c",
      Solver.process("omaha-holdem 5h7s9hAdJs Kd6d2cQd 2d9c3s5c"));
  }

  @Test
  public void test_omaha_holdem_3557_3c3h4h8d9c_2h2c7cTs_Ac5c6c5s_9sThTc6d_2s5h3s4d() {
    assertEquals(
      "2h2c7cTs Ac5c6c5s 9sThTc6d 2s5h3s4d",
      Solver.process("omaha-holdem 3c3h4h8d9c 2h2c7cTs Ac5c6c5s 9sThTc6d 2s5h3s4d"));
  }

  @Test
  public void test_omaha_holdem_3558_3s4s5c9dJs_5sThAd7h_Ac2s7dQs_9c3hTd6h_Jh8dAh8c_TsKc3d2h_Qc8sJd5h_AsKh2c8h_Qd2d9s9h_6s5d6dKd() {
    assertEquals(
      "TsKc3d2h 5sThAd7h 6s5d6dKd Jh8dAh8c 9c3hTd6h Qc8sJd5h Qd2d9s9h AsKh2c8h Ac2s7dQs",
      Solver.process("omaha-holdem 3s4s5c9dJs 5sThAd7h Ac2s7dQs 9c3hTd6h Jh8dAh8c TsKc3d2h Qc8sJd5h AsKh2c8h Qd2d9s9h 6s5d6dKd"));
  }

  @Test
  public void test_omaha_holdem_3559_5s6h8s9dJs_4d4c7h6s_6d7d8hQh_9sJcAhQs_6c5dKcKd() {
    assertEquals(
      "6c5dKcKd 4d4c7h6s=6d7d8hQh 9sJcAhQs",
      Solver.process("omaha-holdem 5s6h8s9dJs 4d4c7h6s 6d7d8hQh 9sJcAhQs 6c5dKcKd"));
  }

  @Test
  public void test_omaha_holdem_3560_3h6s7h8hAc_2s7cAh4s_QhQs5d9s_7s8s9c5c_QcAdJsJd_3s4h6d9h_5h2hTc6h() {
    assertEquals(
      "QcAdJsJd 2s7cAh4s 7s8s9c5c=QhQs5d9s 5h2hTc6h 3s4h6d9h",
      Solver.process("omaha-holdem 3h6s7h8hAc 2s7cAh4s QhQs5d9s 7s8s9c5c QcAdJsJd 3s4h6d9h 5h2hTc6h"));
  }

  @Test
  public void test_omaha_holdem_3561_3h4h7c7sKh_Th6dTsAc_9sJhAsAh_4d3d8hKc_QsAdKd2c_6hTc5c5h_Js7h8s7d() {
    assertEquals(
      "Th6dTsAc 4d3d8hKc QsAdKd2c 6hTc5c5h 9sJhAsAh Js7h8s7d",
      Solver.process("omaha-holdem 3h4h7c7sKh Th6dTsAc 9sJhAsAh 4d3d8hKc QsAdKd2c 6hTc5c5h Js7h8s7d"));
  }

  @Test
  public void test_omaha_holdem_3562_3h6h8h8sAs_8dKh7hJd_AcQd5h2d_TsTh4sKc_3sAd6c4h() {
    assertEquals(
      "TsTh4sKc 3sAd6c4h AcQd5h2d 8dKh7hJd",
      Solver.process("omaha-holdem 3h6h8h8sAs 8dKh7hJd AcQd5h2d TsTh4sKc 3sAd6c4h"));
  }

  @Test
  public void test_omaha_holdem_3563_5c6h7sTdTs_AcKs7d9s_Qc8d4h6s_2d4c7hAh_Qs5hJhQd_Jc2s6d8c() {
    assertEquals(
      "Jc2s6d8c 2d4c7hAh=AcKs7d9s Qs5hJhQd Qc8d4h6s",
      Solver.process("omaha-holdem 5c6h7sTdTs AcKs7d9s Qc8d4h6s 2d4c7hAh Qs5hJhQd Jc2s6d8c"));
  }

  @Test
  public void test_omaha_holdem_3564_2h4h6dAdTc_4cThKsKd_6c7sKc7d_8d5dQd5c() {
    assertEquals(
      "8d5dQd5c 6c7sKc7d 4cThKsKd",
      Solver.process("omaha-holdem 2h4h6dAdTc 4cThKsKd 6c7sKc7d 8d5dQd5c"));
  }

  @Test
  public void test_omaha_holdem_3565_3s7s8sTcTd_9d4dJdKc_2d4hKh9s_QhKd5hJh_Qd7h6hQs_8c8dTs5c() {
    assertEquals(
      "2d4hKh9s QhKd5hJh Qd7h6hQs 9d4dJdKc 8c8dTs5c",
      Solver.process("omaha-holdem 3s7s8sTcTd 9d4dJdKc 2d4hKh9s QhKd5hJh Qd7h6hQs 8c8dTs5c"));
  }

  @Test
  public void test_omaha_holdem_3566_3c5d5h5s9h_8h3hTsTd_Jd6hQsAc() {
    assertEquals(
      "Jd6hQsAc 8h3hTsTd",
      Solver.process("omaha-holdem 3c5d5h5s9h 8h3hTsTd Jd6hQsAc"));
  }

  @Test
  public void test_omaha_holdem_3567_5h7c7dQsTc_Kd9h9dAc_QdKs2d2h() {
    assertEquals(
      "Kd9h9dAc QdKs2d2h",
      Solver.process("omaha-holdem 5h7c7dQsTc Kd9h9dAc QdKs2d2h"));
  }

  @Test
  public void test_omaha_holdem_3568_3c5c7h8dAh_AcJh7sKs_3dQs9h4c_9sThTs7d_8sKhQcQd_8c5s2dKd_Qh9d6c3s_5h4d8hJc() {
    assertEquals(
      "3dQs9h4c 9sThTs7d 8sKhQcQd 5h4d8hJc=8c5s2dKd AcJh7sKs Qh9d6c3s",
      Solver.process("omaha-holdem 3c5c7h8dAh AcJh7sKs 3dQs9h4c 9sThTs7d 8sKhQcQd 8c5s2dKd Qh9d6c3s 5h4d8hJc"));
  }

  @Test
  public void test_omaha_holdem_3569_3d5d6dAdJd_8c6s2hTs_2d7hKcJc_Kh4sKs9c_5cJsQh2c_As5s6h4d_Qc9d8dAc_AhTc7s3h_Jh7dKd7c() {
    assertEquals(
      "8c6s2hTs 2d7hKcJc Kh4sKs9c 5cJsQh2c AhTc7s3h As5s6h4d Qc9d8dAc Jh7dKd7c",
      Solver.process("omaha-holdem 3d5d6dAdJd 8c6s2hTs 2d7hKcJc Kh4sKs9c 5cJsQh2c As5s6h4d Qc9d8dAc AhTc7s3h Jh7dKd7c"));
  }

  @Test
  public void test_omaha_holdem_3570_2h3s4c8cQc_AsQhJsTh_Tc6dQd5d_Ts2d4sAd_Td4d7d6c_7h7cJc5s_9s5c5h6h() {
    assertEquals(
      "Td4d7d6c AsQhJsTh Ts2d4sAd 9s5c5h6h=Tc6dQd5d 7h7cJc5s",
      Solver.process("omaha-holdem 2h3s4c8cQc AsQhJsTh Tc6dQd5d Ts2d4sAd Td4d7d6c 7h7cJc5s 9s5c5h6h"));
  }

  @Test
  public void test_omaha_holdem_3571_4h9sAdJhKc_6h4c8d7c_Ts8s3h5h_8hJs5s5d_2c9c6dQh() {
    assertEquals(
      "Ts8s3h5h 6h4c8d7c 2c9c6dQh 8hJs5s5d",
      Solver.process("omaha-holdem 4h9sAdJhKc 6h4c8d7c Ts8s3h5h 8hJs5s5d 2c9c6dQh"));
  }

  @Test
  public void test_omaha_holdem_3572_4s5s9dJcQd_3hQs2s4h_5d2dKsKd_2h3d8s4c_7c6d9hJs() {
    assertEquals(
      "2h3d8s4c 5d2dKsKd 7c6d9hJs 3hQs2s4h",
      Solver.process("omaha-holdem 4s5s9dJcQd 3hQs2s4h 5d2dKsKd 2h3d8s4c 7c6d9hJs"));
  }

  @Test
  public void test_omaha_holdem_3573_4c4h5h7h8d_2sAcAd3c_9hQc6cAh_2cQhThQs_KdTd8s8h_Ks9s3hKh_TsTcJh7s() {
    assertEquals(
      "TsTcJh7s 2sAcAd3c 2cQhThQs Ks9s3hKh 9hQc6cAh KdTd8s8h",
      Solver.process("omaha-holdem 4c4h5h7h8d 2sAcAd3c 9hQc6cAh 2cQhThQs KdTd8s8h Ks9s3hKh TsTcJh7s"));
  }

  @Test
  public void test_omaha_holdem_3574_2d8d9sJcKh_KdQh7sTc_9d9c2hQs_Kc3sKsAh_7h6c5s6s() {
    assertEquals(
      "7h6c5s6s 9d9c2hQs Kc3sKsAh KdQh7sTc",
      Solver.process("omaha-holdem 2d8d9sJcKh KdQh7sTc 9d9c2hQs Kc3sKsAh 7h6c5s6s"));
  }

  @Test
  public void test_omaha_holdem_3575_5c5h6d7sQh_2dKsAd4h_6cAc4c3d() {
    assertEquals(
      "2dKsAd4h 6cAc4c3d",
      Solver.process("omaha-holdem 5c5h6d7sQh 2dKsAd4h 6cAc4c3d"));
  }

  @Test
  public void test_omaha_holdem_3576_4d4hJcKhTh_9d6c3hJs_Ks9h5h4s_8h4c5sQh_QsAsKd2h_3c3sQc2c_Ts8c7sTc_8sAcQdTd_AhAd7h6h_3d5c2sKc() {
    assertEquals(
      "3c3sQc2c 9d6c3hJs 3d5c2sKc 8sAcQdTd=QsAsKd2h 8h4c5sQh AhAd7h6h Ks9h5h4s Ts8c7sTc",
      Solver.process("omaha-holdem 4d4hJcKhTh 9d6c3hJs Ks9h5h4s 8h4c5sQh QsAsKd2h 3c3sQc2c Ts8c7sTc 8sAcQdTd AhAd7h6h 3d5c2sKc"));
  }

  @Test
  public void test_omaha_holdem_3577_2c5h7c9hJh_4h3dQcJs_Ac9d7d5c_6sKc8sKd_Qd6hQh4s_3s2h3c4d_Ks8dKhAs_TcThAh6c_Qs5sJc9c_TdTs8c2s() {
    assertEquals(
      "3s2h3c4d 4h3dQcJs Ks8dKhAs Ac9d7d5c Qs5sJc9c 6sKc8sKd TdTs8c2s Qd6hQh4s TcThAh6c",
      Solver.process("omaha-holdem 2c5h7c9hJh 4h3dQcJs Ac9d7d5c 6sKc8sKd Qd6hQh4s 3s2h3c4d Ks8dKhAs TcThAh6c Qs5sJc9c TdTs8c2s"));
  }

  @Test
  public void test_omaha_holdem_3578_3c5c8dAhKd_2d9h7hTh_9d4d5sKs_4s4h3hJs() {
    assertEquals(
      "2d9h7hTh 4s4h3hJs 9d4d5sKs",
      Solver.process("omaha-holdem 3c5c8dAhKd 2d9h7hTh 9d4d5sKs 4s4h3hJs"));
  }

  @Test
  public void test_omaha_holdem_3579_3s5c8d9hAd_3d7h7dQs_2s2h6h5h_Kc6s8sQc_KhJs3c9s_Ks7c2cJd_2dAh4c4d_8c6c3hTh_5d8h4sTc_7s9cAcKd() {
    assertEquals(
      "Ks7c2cJd 2s2h6h5h 3d7h7dQs Kc6s8sQc 8c6c3hTh 5d8h4sTc KhJs3c9s 7s9cAcKd 2dAh4c4d",
      Solver.process("omaha-holdem 3s5c8d9hAd 3d7h7dQs 2s2h6h5h Kc6s8sQc KhJs3c9s Ks7c2cJd 2dAh4c4d 8c6c3hTh 5d8h4sTc 7s9cAcKd"));
  }

  @Test
  public void test_omaha_holdem_3580_5h7d8h9dQc_Js7h3s3c_5c4s2d9h_2hKsTs9c() {
    assertEquals(
      "Js7h3s3c 2hKsTs9c 5c4s2d9h",
      Solver.process("omaha-holdem 5h7d8h9dQc Js7h3s3c 5c4s2d9h 2hKsTs9c"));
  }

  @Test
  public void test_omaha_holdem_3581_3h7d8d8sQc_Kc5dJhAs_4c6c3c7h_Th4sTc6d_9sKd4d2s_9c6h3d2h() {
    assertEquals(
      "9sKd4d2s Kc5dJhAs 9c6h3d2h 4c6c3c7h Th4sTc6d",
      Solver.process("omaha-holdem 3h7d8d8sQc Kc5dJhAs 4c6c3c7h Th4sTc6d 9sKd4d2s 9c6h3d2h"));
  }

  @Test
  public void test_omaha_holdem_3582_4d5s7hKsTd_3cAh6sJc_7s9s8s3s_4hAdKhQh() {
    assertEquals(
      "7s9s8s3s 4hAdKhQh 3cAh6sJc",
      Solver.process("omaha-holdem 4d5s7hKsTd 3cAh6sJc 7s9s8s3s 4hAdKhQh"));
  }

  @Test
  public void test_omaha_holdem_3583_2d3s4h7d8h_4c7sAs5d_6h8d4sQs_5cKd3h4d_Ks6d2s9s_Kc9h6sTd() {
    assertEquals(
      "Kc9h6sTd Ks6d2s9s 5cKd3h4d 6h8d4sQs 4c7sAs5d",
      Solver.process("omaha-holdem 2d3s4h7d8h 4c7sAs5d 6h8d4sQs 5cKd3h4d Ks6d2s9s Kc9h6sTd"));
  }

  @Test
  public void test_omaha_holdem_3584_2c2d4sJsTd_QhJc9hAh_ThQd2hTs_8s8d3s3d() {
    assertEquals(
      "8s8d3s3d QhJc9hAh ThQd2hTs",
      Solver.process("omaha-holdem 2c2d4sJsTd QhJc9hAh ThQd2hTs 8s8d3s3d"));
  }

  @Test
  public void test_omaha_holdem_3585_5cAcJcJsTh_6c3d2s5h_4d7sTd7h_9hKhAh2c_8c9cTsJd_2d8d2hJh_Ks6sAd5s_7c3cQh9s_6h7d5d4c() {
    assertEquals(
      "6c3d2s5h 6h7d5d4c 4d7sTd7h 9hKhAh2c=Ks6sAd5s 2d8d2hJh 7c3cQh9s 8c9cTsJd",
      Solver.process("omaha-holdem 5cAcJcJsTh 6c3d2s5h 4d7sTd7h 9hKhAh2c 8c9cTsJd 2d8d2hJh Ks6sAd5s 7c3cQh9s 6h7d5d4c"));
  }

  @Test
  public void test_omaha_holdem_3586_6s7hAcAhKh_7s4c5d4d_3h9c5c2h_7d5sKsKd_7cQh4h4s() {
    assertEquals(
      "7s4c5d4d 3h9c5c2h 7cQh4h4s 7d5sKsKd",
      Solver.process("omaha-holdem 6s7hAcAhKh 7s4c5d4d 3h9c5c2h 7d5sKsKd 7cQh4h4s"));
  }

  @Test
  public void test_omaha_holdem_3587_5s6d9sJcKc_7h8hJs8d_2h8s7dAc_7sQd5h2c_3d6s3sTc_QsTh2sTs_AdJh2d5d_5cTd3h4c_4s9h7c4d() {
    assertEquals(
      "5cTd3h4c 7sQd5h2c 3d6s3sTc 4s9h7c4d AdJh2d5d 2h8s7dAc=7h8hJs8d QsTh2sTs",
      Solver.process("omaha-holdem 5s6d9sJcKc 7h8hJs8d 2h8s7dAc 7sQd5h2c 3d6s3sTc QsTh2sTs AdJh2d5d 5cTd3h4c 4s9h7c4d"));
  }

  @Test
  public void test_omaha_holdem_3588_2c2hAdJcTh_TcQhKh9h_8h5c3h5h_6c2s6s6d() {
    assertEquals(
      "8h5c3h5h 6c2s6s6d TcQhKh9h",
      Solver.process("omaha-holdem 2c2hAdJcTh TcQhKh9h 8h5c3h5h 6c2s6s6d"));
  }

  @Test
  public void test_omaha_holdem_3589_4h6hAcKsTc_Kd2c9d7d_7c9cJc8s_QsQdKh2d_2h6c7s5s() {
    assertEquals(
      "7c9cJc8s 2h6c7s5s Kd2c9d7d QsQdKh2d",
      Solver.process("omaha-holdem 4h6hAcKsTc Kd2c9d7d 7c9cJc8s QsQdKh2d 2h6c7s5s"));
  }

  @Test
  public void test_omaha_holdem_3590_2c3d5d5s6s_AcTsKs4s_4dTh8h8d_8c5cJc2d_KhQh3s4h() {
    assertEquals(
      "4dTh8h8d AcTsKs4s KhQh3s4h 8c5cJc2d",
      Solver.process("omaha-holdem 2c3d5d5s6s AcTsKs4s 4dTh8h8d 8c5cJc2d KhQh3s4h"));
  }

  @Test
  public void test_omaha_holdem_3591_7c8c8dJhTh_4hQs9dQc_TcQdAd9c_QhAs2dJc_5dKh3h3s_3c5cAc4c() {
    assertEquals(
      "3c5cAc4c 5dKh3h3s QhAs2dJc 4hQs9dQc=TcQdAd9c",
      Solver.process("omaha-holdem 7c8c8dJhTh 4hQs9dQc TcQdAd9c QhAs2dJc 5dKh3h3s 3c5cAc4c"));
  }

  @Test
  public void test_omaha_holdem_3592_2h3h5d7d9s_Ac5c4h5s_3c7cKs7h_Ad2c8cJs_KhTh6h6s_Ts4s8h9h_AhKd7s2d_6c4d3s3d() {
    assertEquals(
      "Ad2c8cJs KhTh6h6s Ts4s8h9h AhKd7s2d 3c7cKs7h Ac5c4h5s 6c4d3s3d",
      Solver.process("omaha-holdem 2h3h5d7d9s Ac5c4h5s 3c7cKs7h Ad2c8cJs KhTh6h6s Ts4s8h9h AhKd7s2d 6c4d3s3d"));
  }

  @Test
  public void test_omaha_holdem_3593_3h3s4h7hQc_2h9c4sJc_Js8d4c7s_7c4dAc6s_3c9s5hAs_2d8c3dQs() {
    assertEquals(
      "2h9c4sJc 7c4dAc6s=Js8d4c7s 3c9s5hAs 2d8c3dQs",
      Solver.process("omaha-holdem 3h3s4h7hQc 2h9c4sJc Js8d4c7s 7c4dAc6s 3c9s5hAs 2d8c3dQs"));
  }

  @Test
  public void test_omaha_holdem_3594_3h5h5s9sAd_Kc4s8d2s_JcQcKd2d_9h6c3cTh_KsTs6h4h_6sQd2h7d_Qh8hAcTc_JhKh6dTd() {
    assertEquals(
      "6sQd2h7d KsTs6h4h JhKh6dTd JcQcKd2d 9h6c3cTh Qh8hAcTc Kc4s8d2s",
      Solver.process("omaha-holdem 3h5h5s9sAd Kc4s8d2s JcQcKd2d 9h6c3cTh KsTs6h4h 6sQd2h7d Qh8hAcTc JhKh6dTd"));
  }

  @Test
  public void test_omaha_holdem_3595_3d4h5h6s7h_8hAsTcQd_9hAh9s6c_9cJc3cTs() {
    assertEquals(
      "8hAsTcQd 9cJc3cTs 9hAh9s6c",
      Solver.process("omaha-holdem 3d4h5h6s7h 8hAsTcQd 9hAh9s6c 9cJc3cTs"));
  }

  @Test
  public void test_omaha_holdem_3596_3d3s4s5sTs_JcTd7dKh_9hQdQcAs() {
    assertEquals(
      "JcTd7dKh 9hQdQcAs",
      Solver.process("omaha-holdem 3d3s4s5sTs JcTd7dKh 9hQdQcAs"));
  }

  @Test
  public void test_omaha_holdem_3597_2s4d5sQcTh_5c6c7dQh_Ad4s2h6h_9s8cAhJh_2c2d5hKs_AsAcJc9d_8dKh7c5d_Tc7h6sJs_3h9c6d9h() {
    assertEquals(
      "9s8cAhJh 8dKh7c5d Tc7h6sJs AsAcJc9d Ad4s2h6h 5c6c7dQh 2c2d5hKs 3h9c6d9h",
      Solver.process("omaha-holdem 2s4d5sQcTh 5c6c7dQh Ad4s2h6h 9s8cAhJh 2c2d5hKs AsAcJc9d 8dKh7c5d Tc7h6sJs 3h9c6d9h"));
  }

  @Test
  public void test_omaha_holdem_3598_3d5s8c9dTs_3h4h2d2s_9hKh7sAc_Kc2h6c8d_AhKs7c4s_JdAdJh5h_8sJsQc3s_6s3cTc2c_4d5dThQs_7d5cJcQd() {
    assertEquals(
      "AhKs7c4s 3h4h2d2s Kc2h6c8d 9hKh7sAc JdAdJh5h 6s3cTc2c 4d5dThQs 7d5cJcQd=8sJsQc3s",
      Solver.process("omaha-holdem 3d5s8c9dTs 3h4h2d2s 9hKh7sAc Kc2h6c8d AhKs7c4s JdAdJh5h 8sJsQc3s 6s3cTc2c 4d5dThQs 7d5cJcQd"));
  }

  @Test
  public void test_omaha_holdem_3599_2h4d8cKsQs_2sTdJc6h_3h5h8d9h_2cTh7d7s_AdJhKd7h_5d5cQhQc_Kh8sJsAs_7cAc4c6s_3c4hJd2d_9s3dQd9d() {
    assertEquals(
      "2sTdJc6h 7cAc4c6s 2cTh7d7s 3h5h8d9h 9s3dQd9d AdJhKd7h 3c4hJd2d Kh8sJsAs 5d5cQhQc",
      Solver.process("omaha-holdem 2h4d8cKsQs 2sTdJc6h 3h5h8d9h 2cTh7d7s AdJhKd7h 5d5cQhQc Kh8sJsAs 7cAc4c6s 3c4hJd2d 9s3dQd9d"));
  }

  @Test
  public void test_omaha_holdem_3600_2d4c7c7sAc_Kc9c3c5s_Th4d5hAh() {
    assertEquals(
      "Th4d5hAh Kc9c3c5s",
      Solver.process("omaha-holdem 2d4c7c7sAc Kc9c3c5s Th4d5hAh"));
  }

  @Test
  public void test_omaha_holdem_3601_5s7dAsJdTs_Kd4h4c7h_6h2s8h9s_3dKcJhQc_5dJs3c8c() {
    assertEquals(
      "Kd4h4c7h 5dJs3c8c 3dKcJhQc 6h2s8h9s",
      Solver.process("omaha-holdem 5s7dAsJdTs Kd4h4c7h 6h2s8h9s 3dKcJhQc 5dJs3c8c"));
  }

  @Test
  public void test_omaha_holdem_3602_2c6h7h8dKc_2dJsJc5c_Ad2h6c9c_KdQs4cKh_3cJh4d5s_2s3dJd8c() {
    assertEquals(
      "2dJsJc5c Ad2h6c9c 2s3dJd8c KdQs4cKh 3cJh4d5s",
      Solver.process("omaha-holdem 2c6h7h8dKc 2dJsJc5c Ad2h6c9c KdQs4cKh 3cJh4d5s 2s3dJd8c"));
  }

  @Test
  public void test_omaha_holdem_3603_3s5d9sJdKd_8cQs4d6s_6d4sQd4c() {
    assertEquals(
      "8cQs4d6s 6d4sQd4c",
      Solver.process("omaha-holdem 3s5d9sJdKd 8cQs4d6s 6d4sQd4c"));
  }

  @Test
  public void test_omaha_holdem_3604_2d3s5d9dJd_8sTh9hJs_8cAs5cKc_6h7d4h7h() {
    assertEquals(
      "8cAs5cKc 8sTh9hJs 6h7d4h7h",
      Solver.process("omaha-holdem 2d3s5d9dJd 8sTh9hJs 8cAs5cKc 6h7d4h7h"));
  }

  @Test
  public void test_omaha_holdem_3605_7d7s8hJhQc_3s7h3d5c_TsJc8d6h_9cJs2h5d_Qh6dAc2c_6sJdAs6c_8c9d2d5h() {
    assertEquals(
      "8c9d2d5h 9cJs2h5d 6sJdAs6c TsJc8d6h Qh6dAc2c 3s7h3d5c",
      Solver.process("omaha-holdem 7d7s8hJhQc 3s7h3d5c TsJc8d6h 9cJs2h5d Qh6dAc2c 6sJdAs6c 8c9d2d5h"));
  }

  @Test
  public void test_omaha_holdem_3606_7cAdQdQsTc_2sJsKsKh_4h5s6c4s_6s8h3dJc_6h6d3s9h_3h5d4dTd_7dQh8cTs_Qc5c2hKc() {
    assertEquals(
      "6s8h3dJc 4h5s6c4s 6h6d3s9h 3h5d4dTd Qc5c2hKc 2sJsKsKh 7dQh8cTs",
      Solver.process("omaha-holdem 7cAdQdQsTc 2sJsKsKh 4h5s6c4s 6s8h3dJc 6h6d3s9h 3h5d4dTd 7dQh8cTs Qc5c2hKc"));
  }

  @Test
  public void test_omaha_holdem_3607_7h8cAdQdQs_5cTcKcTh_3h7c3s9d_AsKdJc2c_AcKh9hTs_7d4s2d2h_4h8dJs6h_4c3c6dQh_Td5d9cJd() {
    assertEquals(
      "Td5d9cJd 7d4s2d2h 3h7c3s9d 4h8dJs6h 5cTcKcTh AcKh9hTs=AsKdJc2c 4c3c6dQh",
      Solver.process("omaha-holdem 7h8cAdQdQs 5cTcKcTh 3h7c3s9d AsKdJc2c AcKh9hTs 7d4s2d2h 4h8dJs6h 4c3c6dQh Td5d9cJd"));
  }

  @Test
  public void test_omaha_holdem_3608_7d9c9d9hJd_Qc7h6hAs_Ac5h6d2h() {
    assertEquals(
      "Ac5h6d2h Qc7h6hAs",
      Solver.process("omaha-holdem 7d9c9d9hJd Qc7h6hAs Ac5h6d2h"));
  }

  @Test
  public void test_omaha_holdem_3609_6hJhKdKhKs_8s5c5d6s_Ah3s9c3d_9h8h2cQc_Jd2d9d7h_2hJcQdJs_4d6d2sAs_5sAdTs8c_9s4hQsQh_4sKc8d3h() {
    assertEquals(
      "Jd2d9d7h 4d6d2sAs 5sAdTs8c 9h8h2cQc Ah3s9c3d 8s5c5d6s 2hJcQdJs 9s4hQsQh 4sKc8d3h",
      Solver.process("omaha-holdem 6hJhKdKhKs 8s5c5d6s Ah3s9c3d 9h8h2cQc Jd2d9d7h 2hJcQdJs 4d6d2sAs 5sAdTs8c 9s4hQsQh 4sKc8d3h"));
  }

  @Test
  public void test_omaha_holdem_3610_5h7s9hKcKh_7h5s8sJh_4hQd8d2s_Jc3hAc9d_Th5cTsAs_4s8cQc2c_8h9sJd4d() {
    assertEquals(
      "4hQd8d2s=4s8cQc2c 8h9sJd4d Jc3hAc9d Th5cTsAs 7h5s8sJh",
      Solver.process("omaha-holdem 5h7s9hKcKh 7h5s8sJh 4hQd8d2s Jc3hAc9d Th5cTsAs 4s8cQc2c 8h9sJd4d"));
  }

  @Test
  public void test_omaha_holdem_3611_4s8d9sJsQh_Ks3h7c5h_Ac5cQs9h_Kc6hJd6s_7s9dJc6d_2s4cTh3s_AsAh7dQd_Ts3d7hTc_8h8c4h3c_2d2c9cTd() {
    assertEquals(
      "Ks3h7c5h Kc6hJd6s AsAh7dQd 7s9dJc6d Ac5cQs9h 8h8c4h3c Ts3d7hTc 2d2c9cTd 2s4cTh3s",
      Solver.process("omaha-holdem 4s8d9sJsQh Ks3h7c5h Ac5cQs9h Kc6hJd6s 7s9dJc6d 2s4cTh3s AsAh7dQd Ts3d7hTc 8h8c4h3c 2d2c9cTd"));
  }

  @Test
  public void test_omaha_holdem_3612_2h5c9hAsKh_3s7hTs9d_5h7sTdKd_Ac7dQc4c_2c3dJdAd_Qh2dJhAh() {
    assertEquals(
      "3s7hTs9d Ac7dQc4c 5h7sTdKd 2c3dJdAd Qh2dJhAh",
      Solver.process("omaha-holdem 2h5c9hAsKh 3s7hTs9d 5h7sTdKd Ac7dQc4c 2c3dJdAd Qh2dJhAh"));
  }

  @Test
  public void test_omaha_holdem_3613_2h4h9d9sKh_4cJcKd8d_9hKs2cTh_5dKc6s3d_3s7dAhTc_6dTd6cAs_6h4dJd7c_JhQs2sQc() {
    assertEquals(
      "3s7dAhTc 6h4dJd7c 6dTd6cAs JhQs2sQc 5dKc6s3d 4cJcKd8d 9hKs2cTh",
      Solver.process("omaha-holdem 2h4h9d9sKh 4cJcKd8d 9hKs2cTh 5dKc6s3d 3s7dAhTc 6dTd6cAs 6h4dJd7c JhQs2sQc"));
  }

  @Test
  public void test_omaha_holdem_3614_6d9c9h9sTs_7dJc3c7c_4hJd2hKd_7s4s6sQs_5d8h3dQd() {
    assertEquals(
      "7s4s6sQs 5d8h3dQd 4hJd2hKd 7dJc3c7c",
      Solver.process("omaha-holdem 6d9c9h9sTs 7dJc3c7c 4hJd2hKd 7s4s6sQs 5d8h3dQd"));
  }

  @Test
  public void test_omaha_holdem_3615_3s6s7s8hKd_Ac2hJhQc_4s3d8cQd_7dAsTc3h_Ks7cAdQh_ThTsJd4h() {
    assertEquals(
      "Ac2hJhQc ThTsJd4h 7dAsTc3h 4s3d8cQd Ks7cAdQh",
      Solver.process("omaha-holdem 3s6s7s8hKd Ac2hJhQc 4s3d8cQd 7dAsTc3h Ks7cAdQh ThTsJd4h"));
  }

  @Test
  public void test_omaha_holdem_3616_3c4d6sAsKh_8h6dQsTs_3h5sQd5d_4cTc3dAd_4s8sThKs_2d3sKc5c_2s7h2h8d_Td2cKd9c_Qc6c9h9s_Jc7d5h6h() {
    assertEquals(
      "2s7h2h8d 3h5sQd5d 8h6dQsTs Qc6c9h9s Td2cKd9c 4s8sThKs 4cTc3dAd 2d3sKc5c Jc7d5h6h",
      Solver.process("omaha-holdem 3c4d6sAsKh 8h6dQsTs 3h5sQd5d 4cTc3dAd 4s8sThKs 2d3sKc5c 2s7h2h8d Td2cKd9c Qc6c9h9s Jc7d5h6h"));
  }

  @Test
  public void test_omaha_holdem_3617_3h5c9cKsTc_3s7h2s4h_AdJdJs7d_6s8c3c5h_7c6hQcQd_Kd7s9d9s_Ts2hJh6c_AcAhTh5s_4d2dJc9h() {
    assertEquals(
      "3s7h2s4h 4d2dJc9h Ts2hJh6c AdJdJs7d AcAhTh5s Kd7s9d9s 6s8c3c5h 7c6hQcQd",
      Solver.process("omaha-holdem 3h5c9cKsTc 3s7h2s4h AdJdJs7d 6s8c3c5h 7c6hQcQd Kd7s9d9s Ts2hJh6c AcAhTh5s 4d2dJc9h"));
  }

  @Test
  public void test_omaha_holdem_3618_3h5h6h7sTs_3dKd7dAd_Qd3c8hJs_3sKsQhTc_2c8s8cTh_Td4s7c5d_AsAc6sKh() {
    assertEquals(
      "Qd3c8hJs 2c8s8cTh AsAc6sKh 3dKd7dAd 3sKsQhTc Td4s7c5d",
      Solver.process("omaha-holdem 3h5h6h7sTs 3dKd7dAd Qd3c8hJs 3sKsQhTc 2c8s8cTh Td4s7c5d AsAc6sKh"));
  }

  @Test
  public void test_omaha_holdem_3619_2d2s4hKdTd_Kh6c7cJh_4s8c8sAc_6hThQcAh_Ad8d6sTc_7sTs3d2h_4c4d5d9s() {
    assertEquals(
      "4s8c8sAc 6hThQcAh Kh6c7cJh Ad8d6sTc 7sTs3d2h 4c4d5d9s",
      Solver.process("omaha-holdem 2d2s4hKdTd Kh6c7cJh 4s8c8sAc 6hThQcAh Ad8d6sTc 7sTs3d2h 4c4d5d9s"));
  }

  @Test
  public void test_omaha_holdem_3620_6sJhKcQdTh_JcKs2d7d_8cQc6c3h_5dTd2s7h_9c3sJdKd_5c8s4h7c_AcJs9hKh_Ad3c5sTc_9s2h3dAs() {
    assertEquals(
      "5c8s4h7c 9s2h3dAs 5dTd2s7h 8cQc6c3h JcKs2d7d 9c3sJdKd AcJs9hKh=Ad3c5sTc",
      Solver.process("omaha-holdem 6sJhKcQdTh JcKs2d7d 8cQc6c3h 5dTd2s7h 9c3sJdKd 5c8s4h7c AcJs9hKh Ad3c5sTc 9s2h3dAs"));
  }

  @Test
  public void test_omaha_holdem_3621_3c4s5d6sAc_2sKdQc7s_Jd9d4cKc_3s5h7hAh_Th2h9h7d_Jc6d5sQd() {
    assertEquals(
      "Th2h9h7d 2sKdQc7s Jd9d4cKc Jc6d5sQd 3s5h7hAh",
      Solver.process("omaha-holdem 3c4s5d6sAc 2sKdQc7s Jd9d4cKc 3s5h7hAh Th2h9h7d Jc6d5sQd"));
  }

  @Test
  public void test_omaha_holdem_3622_7cAsQhTcTh_8c7sKd6c_QsKcTd9s_4hTsJs2s_Ah3hJc9c_2d4s5s6d_9d2cAd7h_6h6s7d4d_8hJd8d3s_5d8s3cQc() {
    assertEquals(
      "2d4s5s6d 6h6s7d4d 8c7sKd6c 8hJd8d3s 5d8s3cQc 9d2cAd7h Ah3hJc9c 4hTsJs2s QsKcTd9s",
      Solver.process("omaha-holdem 7cAsQhTcTh 8c7sKd6c QsKcTd9s 4hTsJs2s Ah3hJc9c 2d4s5s6d 9d2cAd7h 6h6s7d4d 8hJd8d3s 5d8s3cQc"));
  }

  @Test
  public void test_omaha_holdem_3623_2h4d5sJcKc_6s2s4s8c_7s2d8d9s_8sAd9d7c_AsJs4hTc_3sQhTs5h_3h8hJhQs_4c6d2cQd_6h7hAhQc() {
    assertEquals(
      "8sAd9d7c 6h7hAhQc 7s2d8d9s 3sQhTs5h 3h8hJhQs 4c6d2cQd=6s2s4s8c AsJs4hTc",
      Solver.process("omaha-holdem 2h4d5sJcKc 6s2s4s8c 7s2d8d9s 8sAd9d7c AsJs4hTc 3sQhTs5h 3h8hJhQs 4c6d2cQd 6h7hAhQc"));
  }

  @Test
  public void test_omaha_holdem_3624_3c5h6d9cTs_Kh4s5s3h_QdAh7s4c_7c2sJsKd_2c2d5d6c_TcQc8h9s_3sTh7hQh_8dJcKs6s_KcAsAdJd() {
    assertEquals(
      "7c2sJsKd 8dJcKs6s KcAsAdJd Kh4s5s3h 2c2d5d6c 3sTh7hQh TcQc8h9s QdAh7s4c",
      Solver.process("omaha-holdem 3c5h6d9cTs Kh4s5s3h QdAh7s4c 7c2sJsKd 2c2d5d6c TcQc8h9s 3sTh7hQh 8dJcKs6s KcAsAdJd"));
  }

  @Test
  public void test_omaha_holdem_3625_5c5h9dAhKs_TcTh9h2h_Qs3c8hJc() {
    assertEquals(
      "Qs3c8hJc TcTh9h2h",
      Solver.process("omaha-holdem 5c5h9dAhKs TcTh9h2h Qs3c8hJc"));
  }

  @Test
  public void test_omaha_holdem_3626_3d9c9dKsQc_TsAhQd3s_JhJs6dQs_7d9s9h7s_3hTdKh6h_2s8d4s8h_8cAc7c2c() {
    assertEquals(
      "8cAc7c2c 2s8d4s8h JhJs6dQs TsAhQd3s 3hTdKh6h 7d9s9h7s",
      Solver.process("omaha-holdem 3d9c9dKsQc TsAhQd3s JhJs6dQs 7d9s9h7s 3hTdKh6h 2s8d4s8h 8cAc7c2c"));
  }

  @Test
  public void test_omaha_holdem_3627_2d5c8dAhTd_4hTcKs8s_4s3h3cKh_9s2s6d3s_Ad8h9dTs_KcJhAcJs_Qc7hAs6h_5s6s8cTh_Qs4c2h5d() {
    assertEquals(
      "9s2s6d3s Qc7hAs6h KcJhAcJs Qs4c2h5d 4hTcKs8s=5s6s8cTh 4s3h3cKh Ad8h9dTs",
      Solver.process("omaha-holdem 2d5c8dAhTd 4hTcKs8s 4s3h3cKh 9s2s6d3s Ad8h9dTs KcJhAcJs Qc7hAs6h 5s6s8cTh Qs4c2h5d"));
  }

  @Test
  public void test_omaha_holdem_3628_6c6sJcJdTc_Kc4sQdAs_KsQs2c3s_3h9dTs8c() {
    assertEquals(
      "KsQs2c3s Kc4sQdAs 3h9dTs8c",
      Solver.process("omaha-holdem 6c6sJcJdTc Kc4sQdAs KsQs2c3s 3h9dTs8c"));
  }

  @Test
  public void test_omaha_holdem_3629_4h6s7h8sTs_Ah9h3d6c_9c5d8d8h_2cAcAsTd_JsQc2d5h_9s6d9dKd_7d8c5sKs_2hThTcQs_4s7s6h7c() {
    assertEquals(
      "JsQc2d5h 2cAcAsTd 2hThTcQs 9c5d8d8h=9s6d9dKd=Ah9h3d6c 4s7s6h7c 7d8c5sKs",
      Solver.process("omaha-holdem 4h6s7h8sTs Ah9h3d6c 9c5d8d8h 2cAcAsTd JsQc2d5h 9s6d9dKd 7d8c5sKs 2hThTcQs 4s7s6h7c"));
  }

  @Test
  public void test_omaha_holdem_3630_3s6s8c9cJh_8sKd6h5c_QsTh7sTd_3h9sQhKh_9d8dAhTc_Ks7dKc2s_4dJd9h3c_TsQc5s6d_7h3dAc2h() {
    assertEquals(
      "7h3dAc2h Ks7dKc2s 8sKd6h5c 3h9sQhKh 9d8dAhTc 4dJd9h3c QsTh7sTd=TsQc5s6d",
      Solver.process("omaha-holdem 3s6s8c9cJh 8sKd6h5c QsTh7sTd 3h9sQhKh 9d8dAhTc Ks7dKc2s 4dJd9h3c TsQc5s6d 7h3dAc2h"));
  }

  @Test
  public void test_omaha_holdem_3631_4cAcAdQhTs_Kc5hJs7c_7d3d6dTd_4s5c8cKh_3h5d5s9d() {
    assertEquals(
      "4s5c8cKh 3h5d5s9d 7d3d6dTd Kc5hJs7c",
      Solver.process("omaha-holdem 4cAcAdQhTs Kc5hJs7c 7d3d6dTd 4s5c8cKh 3h5d5s9d"));
  }

  @Test
  public void test_omaha_holdem_3632_3s4s5c9hTc_9cQsAdTd_Kd6dQcAh() {
    assertEquals(
      "Kd6dQcAh 9cQsAdTd",
      Solver.process("omaha-holdem 3s4s5c9hTc 9cQsAdTd Kd6dQcAh"));
  }

  @Test
  public void test_omaha_holdem_3633_5s9sJdKsTh_Tc6c7h2s_4sAdQs6h_8c4hTs7d_5d2h2c3c_6s9h8d9c_7sTdKhJc_Js5h9dKc_4dKd8hAs_AhQc8sQh() {
    assertEquals(
      "5d2h2c3c Tc6c7h2s 4dKd8hAs 7sTdKhJc=Js5h9dKc 6s9h8d9c 8c4hTs7d AhQc8sQh 4sAdQs6h",
      Solver.process("omaha-holdem 5s9sJdKsTh Tc6c7h2s 4sAdQs6h 8c4hTs7d 5d2h2c3c 6s9h8d9c 7sTdKhJc Js5h9dKc 4dKd8hAs AhQc8sQh"));
  }

  @Test
  public void test_omaha_holdem_3634_3c8h8sAdAh_7s9h3sTd_6s9c9sTs_7dKcKd6c_2h5h4h8c_Ks6d2sQc_3d2c7c5c_QdJsJcJh_Th6hKh5d_8d4c7h3h() {
    assertEquals(
      "Th6hKh5d Ks6d2sQc 3d2c7c5c 7s9h3sTd 6s9c9sTs QdJsJcJh 7dKcKd6c 2h5h4h8c 8d4c7h3h",
      Solver.process("omaha-holdem 3c8h8sAdAh 7s9h3sTd 6s9c9sTs 7dKcKd6c 2h5h4h8c Ks6d2sQc 3d2c7c5c QdJsJcJh Th6hKh5d 8d4c7h3h"));
  }

  @Test
  public void test_omaha_holdem_3635_3d4c9hAcKd_Qd6dAh2d_Kh4dJdQc_7d8cKcQs_5h8s9c7c() {
    assertEquals(
      "5h8s9c7c 7d8cKcQs Qd6dAh2d Kh4dJdQc",
      Solver.process("omaha-holdem 3d4c9hAcKd Qd6dAh2d Kh4dJdQc 7d8cKcQs 5h8s9c7c"));
  }

  @Test
  public void test_omaha_holdem_3636_4d9dAsKcKs_6dTs4c5c_8s5dTc6h_7hAc3hQd_Jh5sKdTh_2hQs6s7s_7cTdQh6c() {
    assertEquals(
      "8s5dTc6h 2hQs6s7s 7cTdQh6c 6dTs4c5c 7hAc3hQd Jh5sKdTh",
      Solver.process("omaha-holdem 4d9dAsKcKs 6dTs4c5c 8s5dTc6h 7hAc3hQd Jh5sKdTh 2hQs6s7s 7cTdQh6c"));
  }

  @Test
  public void test_omaha_holdem_3637_5d8dKcKdTd_8c7hQc4h_JcQdJs5c_2cQhAs3h_8s5s5h3d() {
    assertEquals(
      "2cQhAs3h 8c7hQc4h JcQdJs5c 8s5s5h3d",
      Solver.process("omaha-holdem 5d8dKcKdTd 8c7hQc4h JcQdJs5c 2cQhAs3h 8s5s5h3d"));
  }

  @Test
  public void test_omaha_holdem_3638_3s6cAsKdTc_Th8sQc6h_JsJh8c5d_QhKs2d5c_AhTs4sQs_Jd3h2h4c_4d2s2c6s_JcTdAc3d() {
    assertEquals(
      "Jd3h2h4c 4d2s2c6s JsJh8c5d QhKs2d5c Th8sQc6h AhTs4sQs=JcTdAc3d",
      Solver.process("omaha-holdem 3s6cAsKdTc Th8sQc6h JsJh8c5d QhKs2d5c AhTs4sQs Jd3h2h4c 4d2s2c6s JcTdAc3d"));
  }

  @Test
  public void test_omaha_holdem_3639_3s4d6h6sAh_2c6dQc3d_TcJh8dAd_7c5h8hQd_JsQh8s4s_AcTs6c5c() {
    assertEquals(
      "JsQh8s4s TcJh8dAd 7c5h8hQd 2c6dQc3d AcTs6c5c",
      Solver.process("omaha-holdem 3s4d6h6sAh 2c6dQc3d TcJh8dAd 7c5h8hQd JsQh8s4s AcTs6c5c"));
  }

  @Test
  public void test_omaha_holdem_3640_2d4d8hAcJh_2s6h3d6s_8s4hJs5d_6c9d9sAs_5sQsTs3c_7s4c6d5h() {
    assertEquals(
      "7s4c6d5h 2s6h3d6s 6c9d9sAs 8s4hJs5d 5sQsTs3c",
      Solver.process("omaha-holdem 2d4d8hAcJh 2s6h3d6s 8s4hJs5d 6c9d9sAs 5sQsTs3c 7s4c6d5h"));
  }

  @Test
  public void test_omaha_holdem_3641_2sAdKsQsTh_4hJsJcTd_5s3hJd8h_Ac9c3s9s_7h5c7s8s() {
    assertEquals(
      "5s3hJd8h 4hJsJcTd 7h5c7s8s Ac9c3s9s",
      Solver.process("omaha-holdem 2sAdKsQsTh 4hJsJcTd 5s3hJd8h Ac9c3s9s 7h5c7s8s"));
  }

  @Test
  public void test_omaha_holdem_3642_3d4h6d7c7h_Kc5h6s2h_8d3hKd5c_3c8sJs2s_7sTdJcTs_2d6h9dAc_8hAs9cAh_4cQc3s4d_Qs9sTc4s() {
    assertEquals(
      "3c8sJs2s Qs9sTc4s 2d6h9dAc 8hAs9cAh 7sTdJcTs Kc5h6s2h 8d3hKd5c 4cQc3s4d",
      Solver.process("omaha-holdem 3d4h6d7c7h Kc5h6s2h 8d3hKd5c 3c8sJs2s 7sTdJcTs 2d6h9dAc 8hAs9cAh 4cQc3s4d Qs9sTc4s"));
  }

  @Test
  public void test_omaha_holdem_3643_3s6s9sQcTd_8sKd2hAh_Jd5hAs2c_7h6d9h2s_6h5d6c5c_KsJsKc9c() {
    assertEquals(
      "Jd5hAs2c 8sKd2hAh 7h6d9h2s 6h5d6c5c KsJsKc9c",
      Solver.process("omaha-holdem 3s6s9sQcTd 8sKd2hAh Jd5hAs2c 7h6d9h2s 6h5d6c5c KsJsKc9c"));
  }

  @Test
  public void test_omaha_holdem_3644_2c4s7h8hJc_9d3c4c6h_Qc5hTd4d_Kc3h7s7c_Ks6cJs6d_Tc9hAs9s_8c5d5c3d() {
    assertEquals(
      "9d3c4c6h Qc5hTd4d 8c5d5c3d Ks6cJs6d Kc3h7s7c Tc9hAs9s",
      Solver.process("omaha-holdem 2c4s7h8hJc 9d3c4c6h Qc5hTd4d Kc3h7s7c Ks6cJs6d Tc9hAs9s 8c5d5c3d"));
  }

  @Test
  public void test_omaha_holdem_3645_4s6c6s8c9c_9hTh2sQh_7sKd2c5d() {
    assertEquals(
      "9hTh2sQh 7sKd2c5d",
      Solver.process("omaha-holdem 4s6c6s8c9c 9hTh2sQh 7sKd2c5d"));
  }

  @Test
  public void test_omaha_holdem_3646_4d9d9sKhTh_2h3s2d7d_Qs3c4cJs_7s7cTs5d() {
    assertEquals(
      "2h3s2d7d 7s7cTs5d Qs3c4cJs",
      Solver.process("omaha-holdem 4d9d9sKhTh 2h3s2d7d Qs3c4cJs 7s7cTs5d"));
  }

  @Test
  public void test_omaha_holdem_3647_4d7c9d9sKc_Td5h2dAd_JcTh7hQd_2s4cAhKh_2h2c7dKs_4s8dAsKd_Ts6c8h3h_4h5d6h3c_3sJhQc5s_8s6sQsJd() {
    assertEquals(
      "Ts6c8h3h 3sJhQc5s=8s6sQsJd Td5h2dAd 4h5d6h3c JcTh7hQd 2h2c7dKs 2s4cAhKh=4s8dAsKd",
      Solver.process("omaha-holdem 4d7c9d9sKc Td5h2dAd JcTh7hQd 2s4cAhKh 2h2c7dKs 4s8dAsKd Ts6c8h3h 4h5d6h3c 3sJhQc5s 8s6sQsJd"));
  }

  @Test
  public void test_omaha_holdem_3648_3h7cJhKhQs_5d7hQdKd_4h6cTh3s_4s9h4cQh_9s2s6s2c_8d8s8c6h_JcTcKc6d_5sAc9d3d_Jd5hTd8h_9cKsAdAs() {
    assertEquals(
      "9s2s6s2c 5sAc9d3d 8d8s8c6h 9cKsAdAs JcTcKc6d 5d7hQdKd Jd5hTd8h 4h6cTh3s 4s9h4cQh",
      Solver.process("omaha-holdem 3h7cJhKhQs 5d7hQdKd 4h6cTh3s 4s9h4cQh 9s2s6s2c 8d8s8c6h JcTcKc6d 5sAc9d3d Jd5hTd8h 9cKsAdAs"));
  }

  @Test
  public void test_omaha_holdem_3649_7c7dKcQhTh_KhQcQd5h_8hAh4h9c_6s3h4c9s_6c8c5dJs_4d2cAs5s_9d6dKs8s_7sAc6hJd() {
    assertEquals(
      "6s3h4c9s 6c8c5dJs 4d2cAs5s 8hAh4h9c 9d6dKs8s 7sAc6hJd KhQcQd5h",
      Solver.process("omaha-holdem 7c7dKcQhTh KhQcQd5h 8hAh4h9c 6s3h4c9s 6c8c5dJs 4d2cAs5s 9d6dKs8s 7sAc6hJd"));
  }

  @Test
  public void test_omaha_holdem_3650_2s9dAdJhJs_Th6h3h8h_2h7c8c3d_9h4cQcJd_5dQdKd8s_9s3sAs5s_5c8d7h6s_6dKc2cAh() {
    assertEquals(
      "5c8d7h6s Th6h3h8h 5dQdKd8s 2h7c8c3d 9s3sAs5s 6dKc2cAh 9h4cQcJd",
      Solver.process("omaha-holdem 2s9dAdJhJs Th6h3h8h 2h7c8c3d 9h4cQcJd 5dQdKd8s 9s3sAs5s 5c8d7h6s 6dKc2cAh"));
  }

  @Test
  public void test_omaha_holdem_3651_4s5s8h9cJh_3d6s2c6d_TcQc2s3h_8cJc5d5c() {
    assertEquals(
      "3d6s2c6d 8cJc5d5c TcQc2s3h",
      Solver.process("omaha-holdem 4s5s8h9cJh 3d6s2c6d TcQc2s3h 8cJc5d5c"));
  }

  @Test
  public void test_omaha_holdem_3652_2s4cAcQhTs_5c5s3sTc_Qd3d3h9h() {
    assertEquals(
      "Qd3d3h9h 5c5s3sTc",
      Solver.process("omaha-holdem 2s4cAcQhTs 5c5s3sTc Qd3d3h9h"));
  }

  @Test
  public void test_omaha_holdem_3653_2s6hJdJhQs_8cTdAh7h_Kc8s2hKh_Jc2cQh5c_5s3dTs7s_6cTc3s2d() {
    assertEquals(
      "5s3dTs7s 8cTdAh7h 6cTc3s2d Kc8s2hKh Jc2cQh5c",
      Solver.process("omaha-holdem 2s6hJdJhQs 8cTdAh7h Kc8s2hKh Jc2cQh5c 5s3dTs7s 6cTc3s2d"));
  }

  @Test
  public void test_omaha_holdem_3654_3d6h7hAcAs_Tc9s8dJd_4h9hAd5s_4c5h5d9c() {
    assertEquals(
      "Tc9s8dJd 4c5h5d9c=4h9hAd5s",
      Solver.process("omaha-holdem 3d6h7hAcAs Tc9s8dJd 4h9hAd5s 4c5h5d9c"));
  }

  @Test
  public void test_omaha_holdem_3655_5h8dJsKdQc_6c5c9c7s_7cQh8s6s_5s8c4sQs_Jd8h4d2h_As9hJh2s() {
    assertEquals(
      "6c5c9c7s As9hJh2s Jd8h4d2h 5s8c4sQs=7cQh8s6s",
      Solver.process("omaha-holdem 5h8dJsKdQc 6c5c9c7s 7cQh8s6s 5s8c4sQs Jd8h4d2h As9hJh2s"));
  }

  @Test
  public void test_omaha_holdem_3656_2s6d7cJcJh_5dTc4hTh_Ah5cAs2c_2dQh8c7s() {
    assertEquals(
      "2dQh8c7s 5dTc4hTh Ah5cAs2c",
      Solver.process("omaha-holdem 2s6d7cJcJh 5dTc4hTh Ah5cAs2c 2dQh8c7s"));
  }

  @Test
  public void test_omaha_holdem_3657_6h7d7s9sTc_5s3c6c6s_2c3s2h4d() {
    assertEquals(
      "2c3s2h4d 5s3c6c6s",
      Solver.process("omaha-holdem 6h7d7s9sTc 5s3c6c6s 2c3s2h4d"));
  }

  @Test
  public void test_omaha_holdem_3658_3h8dAdJhTd_6sQs9s8h_7cThQd2h_4s3d5hKd_9hAc6cTs_7dKc8c2c_Ah5dKsJc() {
    assertEquals(
      "7dKc8c2c 7cThQd2h 9hAc6cTs Ah5dKsJc 6sQs9s8h 4s3d5hKd",
      Solver.process("omaha-holdem 3h8dAdJhTd 6sQs9s8h 7cThQd2h 4s3d5hKd 9hAc6cTs 7dKc8c2c Ah5dKsJc"));
  }

  @Test
  public void test_omaha_holdem_3659_3d8c8hJdTh_Qd3h5d7d_3cQhTc7h_2c2dKh6d_Kc4hQs7s_2s4c5h2h_Ah6hAdKd_6cJhJsAs() {
    assertEquals(
      "Kc4hQs7s 2c2dKh6d=2s4c5h2h Qd3h5d7d 3cQhTc7h Ah6hAdKd 6cJhJsAs",
      Solver.process("omaha-holdem 3d8c8hJdTh Qd3h5d7d 3cQhTc7h 2c2dKh6d Kc4hQs7s 2s4c5h2h Ah6hAdKd 6cJhJsAs"));
  }

  @Test
  public void test_omaha_holdem_3660_3d3s5c5s6d_8h7d9cJc_4cQc2c3c_5d2s4dJs_4s9h7hTd_AsKhJhTc_9dTs8s7c() {
    assertEquals(
      "9dTs8s7c 8h7d9cJc AsKhJhTc 4cQc2c3c=5d2s4dJs 4s9h7hTd",
      Solver.process("omaha-holdem 3d3s5c5s6d 8h7d9cJc 4cQc2c3c 5d2s4dJs 4s9h7hTd AsKhJhTc 9dTs8s7c"));
  }

  @Test
  public void test_omaha_holdem_3661_4h5d6hAhQc_JdAdKs4s_Js5h5cKc_6dJh3sKh_Jc7cAc6s_Qd3d8h7d_Qh7s2cTh_2h4c8c4d_6cKd3h8d_5s2dAs9c() {
    assertEquals(
      "6cKd3h8d JdAdKs4s 5s2dAs9c Jc7cAc6s 2h4c8c4d Js5h5cKc Qd3d8h7d Qh7s2cTh 6dJh3sKh",
      Solver.process("omaha-holdem 4h5d6hAhQc JdAdKs4s Js5h5cKc 6dJh3sKh Jc7cAc6s Qd3d8h7d Qh7s2cTh 2h4c8c4d 6cKd3h8d 5s2dAs9c"));
  }

  @Test
  public void test_omaha_holdem_3662_2s9cAcAhKh_4h5s6hTc_4cJh4dJc_3cQc2cAd_7hJd6dQs_KcAs2h5c_QdQh4s3s_Td5dKs3d_7s7cJsKd_5h7dTh9s() {
    assertEquals(
      "4h5s6hTc 7hJd6dQs 5h7dTh9s 4cJh4dJc QdQh4s3s Td5dKs3d 7s7cJsKd 3cQc2cAd KcAs2h5c",
      Solver.process("omaha-holdem 2s9cAcAhKh 4h5s6hTc 4cJh4dJc 3cQc2cAd 7hJd6dQs KcAs2h5c QdQh4s3s Td5dKs3d 7s7cJsKd 5h7dTh9s"));
  }

  @Test
  public void test_omaha_holdem_3663_2d6c6sAdTc_8dTdTs4d_Qd5d7d3s() {
    assertEquals(
      "Qd5d7d3s 8dTdTs4d",
      Solver.process("omaha-holdem 2d6c6sAdTc 8dTdTs4d Qd5d7d3s"));
  }

  @Test
  public void test_omaha_holdem_3664_6c6s7s8sKd_7c4cKs6h_2s8h8cQd_3cJc4d9c_KhJh7d6d_9d5d5s9s_AhQhKc5h_TdAdQc5c_2h2c4hQs() {
    assertEquals(
      "3cJc4d9c TdAdQc5c 2h2c4hQs AhQhKc5h 7c4cKs6h=KhJh7d6d 2s8h8cQd 9d5d5s9s",
      Solver.process("omaha-holdem 6c6s7s8sKd 7c4cKs6h 2s8h8cQd 3cJc4d9c KhJh7d6d 9d5d5s9s AhQhKc5h TdAdQc5c 2h2c4hQs"));
  }

  @Test
  public void test_omaha_holdem_3665_2d6s7dJhQh_Ks6d3d9d_AhQs8c4s_KdKc9hJd_7s9c9sAs_4dAc8dJc_5d6c4c4h_Qd5c6h3c_3s2cJs7c() {
    assertEquals(
      "5d6c4c4h Ks6d3d9d 7s9c9sAs 4dAc8dJc AhQs8c4s KdKc9hJd 3s2cJs7c Qd5c6h3c",
      Solver.process("omaha-holdem 2d6s7dJhQh Ks6d3d9d AhQs8c4s KdKc9hJd 7s9c9sAs 4dAc8dJc 5d6c4c4h Qd5c6h3c 3s2cJs7c"));
  }

  @Test
  public void test_omaha_holdem_3666_2h2s4s8s9s_AcKh4h6s_7h7d8h9d_Jh9cTh5d_7cQd6h2c_6cJdAs3h() {
    assertEquals(
      "6cJdAs3h AcKh4h6s Jh9cTh5d 7h7d8h9d 7cQd6h2c",
      Solver.process("omaha-holdem 2h2s4s8s9s AcKh4h6s 7h7d8h9d Jh9cTh5d 7cQd6h2c 6cJdAs3h"));
  }

  @Test
  public void test_omaha_holdem_3667_5s8s9cQcQs_Kd4sJc5d_2sTd4d9h_3h6h4cAh_Jh5c9s7h_Qh7s8cTc_4hKsJs2c_8d6s3c6c_2h2d9d7c() {
    assertEquals(
      "3h6h4cAh Kd4sJc5d 8d6s3c6c 2h2d9d7c 2sTd4d9h Jh5c9s7h 4hKsJs2c Qh7s8cTc",
      Solver.process("omaha-holdem 5s8s9cQcQs Kd4sJc5d 2sTd4d9h 3h6h4cAh Jh5c9s7h Qh7s8cTc 4hKsJs2c 8d6s3c6c 2h2d9d7c"));
  }

  @Test
  public void test_omaha_holdem_3668_4h8c9sAsKc_3hAh5c2d_JhKdAd6c_9h9d2s4s_Ac8hTh4d_6dQdTcKs_5sTd4c5h_Jd7s3sJc_3d6s6h8s_2cJs7c8d() {
    assertEquals(
      "5sTd4c5h 3d6s6h8s 2cJs7c8d Jd7s3sJc 6dQdTcKs 3hAh5c2d Ac8hTh4d JhKdAd6c 9h9d2s4s",
      Solver.process("omaha-holdem 4h8c9sAsKc 3hAh5c2d JhKdAd6c 9h9d2s4s Ac8hTh4d 6dQdTcKs 5sTd4c5h Jd7s3sJc 3d6s6h8s 2cJs7c8d"));
  }

  @Test
  public void test_omaha_holdem_3669_5s6s9sAcJh_QdJd3c9h_8h9d2dKs_Td8c7cKh_8s7s2c5d_Ah3sKc4h_As5hThJc_9cQc7hTs_6h4s3d2s() {
    assertEquals(
      "9cQc7hTs 8h9d2dKs Ah3sKc4h QdJd3c9h As5hThJc Td8c7cKh 6h4s3d2s 8s7s2c5d",
      Solver.process("omaha-holdem 5s6s9sAcJh QdJd3c9h 8h9d2dKs Td8c7cKh 8s7s2c5d Ah3sKc4h As5hThJc 9cQc7hTs 6h4s3d2s"));
  }

  @Test
  public void test_omaha_holdem_3670_4s5c5s8dKs_8cKhTd7h_3h8h6c9h() {
    assertEquals(
      "3h8h6c9h 8cKhTd7h",
      Solver.process("omaha-holdem 4s5c5s8dKs 8cKhTd7h 3h8h6c9h"));
  }

  @Test
  public void test_omaha_holdem_3671_2s5s9hAhTs_5d9sKh9c_6s6dQhTd_4sQd2dAd_As8h3cKc_JcKd3d2h_QcAc4hTh_3s7h3h8d() {
    assertEquals(
      "JcKd3d2h 3s7h3h8d 6s6dQhTd As8h3cKc 4sQd2dAd QcAc4hTh 5d9sKh9c",
      Solver.process("omaha-holdem 2s5s9hAhTs 5d9sKh9c 6s6dQhTd 4sQd2dAd As8h3cKc JcKd3d2h QcAc4hTh 3s7h3h8d"));
  }

  @Test
  public void test_omaha_holdem_3672_5h6d6sJdKh_8h8s7cKs_4h4cAh4s_9cAs5sQc_6h3sJs2c_3dQdAc4d_KdTdKcTc_QsAd9d3c_Jc3h6cQh() {
    assertEquals(
      "3dQdAc4d=QsAd9d3c 4h4cAh4s 9cAs5sQc 8h8s7cKs 6h3sJs2c=Jc3h6cQh KdTdKcTc",
      Solver.process("omaha-holdem 5h6d6sJdKh 8h8s7cKs 4h4cAh4s 9cAs5sQc 6h3sJs2c 3dQdAc4d KdTdKcTc QsAd9d3c Jc3h6cQh"));
  }

  @Test
  public void test_omaha_holdem_3673_5d7d7hQhTh_6h2hJh2d_AhTsTc9c_6dJsKh7c_8d9hAd4d_QcKc8s3s_9d6s7s4c_3dQd5c4h_QsJc3c6c_Ks2sAs3h() {
    assertEquals(
      "8d9hAd4d Ks2sAs3h 3dQd5c4h QsJc3c6c QcKc8s3s 9d6s7s4c 6dJsKh7c 6h2hJh2d AhTsTc9c",
      Solver.process("omaha-holdem 5d7d7hQhTh 6h2hJh2d AhTsTc9c 6dJsKh7c 8d9hAd4d QcKc8s3s 9d6s7s4c 3dQd5c4h QsJc3c6c Ks2sAs3h"));
  }

  @Test
  public void test_omaha_holdem_3674_5s7s9h9sQd_Kc9dTc6d_8d3hTs2c_4cQsJs5c_4d8h3cAd_QhKd2dAc() {
    assertEquals(
      "8d3hTs2c 4d8h3cAd QhKd2dAc Kc9dTc6d 4cQsJs5c",
      Solver.process("omaha-holdem 5s7s9h9sQd Kc9dTc6d 8d3hTs2c 4cQsJs5c 4d8h3cAd QhKd2dAc"));
  }

  @Test
  public void test_omaha_holdem_3675_3c4d9c9dJs_2s8c7s8s_4s3dKh7h_QdAhTs8h_Ks3h7c8d_Jd2d7dJh_Jc3sTh2c_Qc9s5s6h_4c6dKcTd_Ad2h5c9h() {
    assertEquals(
      "QdAhTs8h Ks3h7c8d 4c6dKcTd=4s3dKh7h 2s8c7s8s Jc3sTh2c Qc9s5s6h Ad2h5c9h Jd2d7dJh",
      Solver.process("omaha-holdem 3c4d9c9dJs 2s8c7s8s 4s3dKh7h QdAhTs8h Ks3h7c8d Jd2d7dJh Jc3sTh2c Qc9s5s6h 4c6dKcTd Ad2h5c9h"));
  }

  @Test
  public void test_omaha_holdem_3676_4s8h9hAdTc_6hQd7c5c_7hTs5h3h_9dKhAh5s() {
    assertEquals(
      "7hTs5h3h 9dKhAh5s 6hQd7c5c",
      Solver.process("omaha-holdem 4s8h9hAdTc 6hQd7c5c 7hTs5h3h 9dKhAh5s"));
  }

  @Test
  public void test_omaha_holdem_3677_2c3d6h7sTh_8d2dAs9h_AcKh5cAh_Qc3h5sTc_2h4h6dJd_6c3c5h2s_Td8c4c7d() {
    assertEquals(
      "AcKh5cAh 2h4h6dJd 6c3c5h2s Qc3h5sTc Td8c4c7d 8d2dAs9h",
      Solver.process("omaha-holdem 2c3d6h7sTh 8d2dAs9h AcKh5cAh Qc3h5sTc 2h4h6dJd 6c3c5h2s Td8c4c7d"));
  }

  @Test
  public void test_omaha_holdem_3678_2c5hQhTcTs_QcKcJdTd_5s6cAc2d_Jc8d4h5c_4d6h2h3d_8cQs7h8s_9sJsKdAh_6s7d9c6d_9d3sAsJh_7s4c3cTh() {
    assertEquals(
      "9d3sAsJh 9sJsKdAh 4d6h2h3d Jc8d4h5c 5s6cAc2d 6s7d9c6d 8cQs7h8s 7s4c3cTh QcKcJdTd",
      Solver.process("omaha-holdem 2c5hQhTcTs QcKcJdTd 5s6cAc2d Jc8d4h5c 4d6h2h3d 8cQs7h8s 9sJsKdAh 6s7d9c6d 9d3sAsJh 7s4c3cTh"));
  }

  @Test
  public void test_omaha_holdem_3679_3c4c8cAdJs_6d8s9cAc_5cKs2h5h_Ah3s6s2s_9d7c6cKd() {
    assertEquals(
      "Ah3s6s2s 5cKs2h5h 9d7c6cKd 6d8s9cAc",
      Solver.process("omaha-holdem 3c4c8cAdJs 6d8s9cAc 5cKs2h5h Ah3s6s2s 9d7c6cKd"));
  }

  @Test
  public void test_omaha_holdem_3680_4d5h5s8h8s_QhJcQd7h_Jd7c9c6h_3sKd9sQs_6c4sAh3h_TdJs3c2s_Kc8dQc9d_KhTsTc9h_5cAs6s5d_6d7s7d2c() {
    assertEquals(
      "TdJs3c2s 3sKd9sQs 6c4sAh3h KhTsTc9h QhJcQd7h Kc8dQc9d 6d7s7d2c=Jd7c9c6h 5cAs6s5d",
      Solver.process("omaha-holdem 4d5h5s8h8s QhJcQd7h Jd7c9c6h 3sKd9sQs 6c4sAh3h TdJs3c2s Kc8dQc9d KhTsTc9h 5cAs6s5d 6d7s7d2c"));
  }

  @Test
  public void test_omaha_holdem_3681_6c8c9dJcJd_Kh4dJs4s_3c5sTh3h() {
    assertEquals(
      "3c5sTh3h Kh4dJs4s",
      Solver.process("omaha-holdem 6c8c9dJcJd Kh4dJs4s 3c5sTh3h"));
  }

  @Test
  public void test_omaha_holdem_3682_5sJdKdTdTs_4dKs5h8s_6cAd9h2s_Qh8d4s5d_TcJs3sKc() {
    assertEquals(
      "6cAd9h2s 4dKs5h8s Qh8d4s5d TcJs3sKc",
      Solver.process("omaha-holdem 5sJdKdTdTs 4dKs5h8s 6cAd9h2s Qh8d4s5d TcJs3sKc"));
  }

  @Test
  public void test_omaha_holdem_3683_JsQcQhQsTc_7d9hAc8c_TsKs5d4d_Kd2hJc6h_4c4sTdTh_3hQd9d6c_3c8s9s6s_4h9cJd2c_7h3d5c7s_Kh6dAd7c() {
    assertEquals(
      "4h9cJd2c TsKs5d4d Kd2hJc6h 3c8s9s6s=7d9hAc8c Kh6dAd7c 7h3d5c7s 4c4sTdTh 3hQd9d6c",
      Solver.process("omaha-holdem JsQcQhQsTc 7d9hAc8c TsKs5d4d Kd2hJc6h 4c4sTdTh 3hQd9d6c 3c8s9s6s 4h9cJd2c 7h3d5c7s Kh6dAd7c"));
  }

  @Test
  public void test_omaha_holdem_3684_6s8c8sAdJc_Js9c2dKh_Tc3d7c7s_As6h5h7d_ThKc4c5s_9d3h8d2c_Ks9s2s4h_JdAh2hKd() {
    assertEquals(
      "Ks9s2s4h ThKc4c5s Tc3d7c7s Js9c2dKh As6h5h7d JdAh2hKd 9d3h8d2c",
      Solver.process("omaha-holdem 6s8c8sAdJc Js9c2dKh Tc3d7c7s As6h5h7d ThKc4c5s 9d3h8d2c Ks9s2s4h JdAh2hKd"));
  }

  @Test
  public void test_omaha_holdem_3685_7hKcKsQhTh_2h5d3s6s_Jc2d2sKd_7c6d9h3h_QsTcTs6h_Ad5c8sQd_5s4s9d8c_QcTd9c4d() {
    assertEquals(
      "2h5d3s6s 5s4s9d8c QcTd9c4d Ad5c8sQd Jc2d2sKd 7c6d9h3h QsTcTs6h",
      Solver.process("omaha-holdem 7hKcKsQhTh 2h5d3s6s Jc2d2sKd 7c6d9h3h QsTcTs6h Ad5c8sQd 5s4s9d8c QcTd9c4d"));
  }

  @Test
  public void test_omaha_holdem_3686_2d3s7s8sKs_6c4dAdJh_Js6d9hAc() {
    assertEquals(
      "6c4dAdJh=Js6d9hAc",
      Solver.process("omaha-holdem 2d3s7s8sKs 6c4dAdJh Js6d9hAc"));
  }

  @Test
  public void test_omaha_holdem_3687_5dAhJcKcKd_8sTh5hQd_6h6d3c7c_AsJh9d9s_6cKh5c4h_9c5s3h4c_2cTdAcAd_3s4d7h8d() {
    assertEquals(
      "3s4d7h8d 9c5s3h4c 6h6d3c7c AsJh9d9s 8sTh5hQd 6cKh5c4h 2cTdAcAd",
      Solver.process("omaha-holdem 5dAhJcKcKd 8sTh5hQd 6h6d3c7c AsJh9d9s 6cKh5c4h 9c5s3h4c 2cTdAcAd 3s4d7h8d"));
  }

  @Test
  public void test_omaha_holdem_3688_3c3h6dTdTh_6sJc4cQd_4sJd9hJs_5d8h9c5c_Kc2c6hQs_8c4hAsKd_9sKs7d7c_8sKh9dTc_7s4dTs3d() {
    assertEquals(
      "8c4hAsKd 5d8h9c5c 6sJc4cQd Kc2c6hQs 9sKs7d7c 4sJd9hJs 8sKh9dTc 7s4dTs3d",
      Solver.process("omaha-holdem 3c3h6dTdTh 6sJc4cQd 4sJd9hJs 5d8h9c5c Kc2c6hQs 8c4hAsKd 9sKs7d7c 8sKh9dTc 7s4dTs3d"));
  }

  @Test
  public void test_omaha_holdem_3689_6d9cAcJcKs_6h2d6sJs_8s4d9hAd_5dKh6cTh() {
    assertEquals(
      "5dKh6cTh 8s4d9hAd 6h2d6sJs",
      Solver.process("omaha-holdem 6d9cAcJcKs 6h2d6sJs 8s4d9hAd 5dKh6cTh"));
  }

  @Test
  public void test_omaha_holdem_3690_3d5hAsJcKd_7hQd5c7d_8cQc3s7s() {
    assertEquals(
      "8cQc3s7s 7hQd5c7d",
      Solver.process("omaha-holdem 3d5hAsJcKd 7hQd5c7d 8cQc3s7s"));
  }

  @Test
  public void test_omaha_holdem_3691_6d7d8sJdQs_Jh6sAdTs_5s2h9c8d_3hTcKhTd_AsAcKs5c() {
    assertEquals(
      "3hTcKhTd AsAcKs5c Jh6sAdTs 5s2h9c8d",
      Solver.process("omaha-holdem 6d7d8sJdQs Jh6sAdTs 5s2h9c8d 3hTcKhTd AsAcKs5c"));
  }

  @Test
  public void test_omaha_holdem_3692_4h4s6cJsTd_6sKdJh3d_Jd7c2h2c_Ac3c6hAh_ThTs5dQs_2s7s9s8s_TcQc9cAs() {
    assertEquals(
      "2s7s9s8s TcQc9cAs Jd7c2h2c 6sKdJh3d Ac3c6hAh ThTs5dQs",
      Solver.process("omaha-holdem 4h4s6cJsTd 6sKdJh3d Jd7c2h2c Ac3c6hAh ThTs5dQs 2s7s9s8s TcQc9cAs"));
  }

  @Test
  public void test_omaha_holdem_3693_4c4dKdQcTd_3dQd3hKh_Ac2h3s9h_Ad7c8hJd_5h8cTh6h_8sAs7sJh() {
    assertEquals(
      "Ac2h3s9h 5h8cTh6h 8sAs7sJh 3dQd3hKh Ad7c8hJd",
      Solver.process("omaha-holdem 4c4dKdQcTd 3dQd3hKh Ac2h3s9h Ad7c8hJd 5h8cTh6h 8sAs7sJh"));
  }

  @Test
  public void test_omaha_holdem_3694_3d3s4c4sJs_JcKd7dTs_9c8dJh2c() {
    assertEquals(
      "9c8dJh2c JcKd7dTs",
      Solver.process("omaha-holdem 3d3s4c4sJs JcKd7dTs 9c8dJh2c"));
  }

  @Test
  public void test_omaha_holdem_3695_3h4s6cJhQd_2sJs9c4c_Ac2hKsKc_8h4h6sQh_Th5s5hAs_TsKh7s3d_JcJd2c5d_5c2dAh7c_7d8dTc8s() {
    assertEquals(
      "TsKh7s3d Th5s5hAs 7d8dTc8s Ac2hKsKc 2sJs9c4c 8h4h6sQh JcJd2c5d 5c2dAh7c",
      Solver.process("omaha-holdem 3h4s6cJhQd 2sJs9c4c Ac2hKsKc 8h4h6sQh Th5s5hAs TsKh7s3d JcJd2c5d 5c2dAh7c 7d8dTc8s"));
  }

  @Test
  public void test_omaha_holdem_3696_5h8hKhQcQd_JsKd5d5s_2hJhTdJc_7c6dTs8c_2dTh9h4d_6h5c9s9d_3s7d4h2s() {
    assertEquals(
      "3s7d4h2s 7c6dTs8c 6h5c9s9d 2dTh9h4d 2hJhTdJc JsKd5d5s",
      Solver.process("omaha-holdem 5h8hKhQcQd JsKd5d5s 2hJhTdJc 7c6dTs8c 2dTh9h4d 6h5c9s9d 3s7d4h2s"));
  }

  @Test
  public void test_omaha_holdem_3697_3c5c5s8sAh_6h2h6c9s_Qh3sTh7h_4h4d8c7c_Jh2c5hTs_4s9hJd9d_3d7s6d3h_QdKdAsQs() {
    assertEquals(
      "Qh3sTh7h 6h2h6c9s 4h4d8c7c 4s9hJd9d QdKdAsQs Jh2c5hTs 3d7s6d3h",
      Solver.process("omaha-holdem 3c5c5s8sAh 6h2h6c9s Qh3sTh7h 4h4d8c7c Jh2c5hTs 4s9hJd9d 3d7s6d3h QdKdAsQs"));
  }

  @Test
  public void test_omaha_holdem_3698_7c8d9sTcTd_4dAc8cKc_6c6s9d4c_7d8s9c2s() {
    assertEquals(
      "4dAc8cKc 7d8s9c2s 6c6s9d4c",
      Solver.process("omaha-holdem 7c8d9sTcTd 4dAc8cKc 6c6s9d4c 7d8s9c2s"));
  }

  @Test
  public void test_omaha_holdem_3699_3c4c4d4sJd_AhTcAsQh_8h8sQd8d_7s2d7c5s_Qc9s3d5c_JsJhThAd_Ks3hTs9c_6dKd7dJc_9hKc5h6s() {
    assertEquals(
      "Qc9s3d5c 9hKc5h6s Ks3hTs9c 6dKd7dJc 7s2d7c5s 8h8sQd8d AhTcAsQh JsJhThAd",
      Solver.process("omaha-holdem 3c4c4d4sJd AhTcAsQh 8h8sQd8d 7s2d7c5s Qc9s3d5c JsJhThAd Ks3hTs9c 6dKd7dJc 9hKc5h6s"));
  }

  @Test
  public void test_omaha_holdem_3700_2d5c5h7h8s_Ad5s7c4c_6c2h9s5d() {
    assertEquals(
      "6c2h9s5d Ad5s7c4c",
      Solver.process("omaha-holdem 2d5c5h7h8s Ad5s7c4c 6c2h9s5d"));
  }

  @Test
  public void test_omaha_holdem_3701_AcJcKcKdTd_3c7hJs6d_8h5c4h5d_As9s6sTs() {
    assertEquals(
      "8h5c4h5d 3c7hJs6d As9s6sTs",
      Solver.process("omaha-holdem AcJcKcKdTd 3c7hJs6d 8h5c4h5d As9s6sTs"));
  }

  @Test
  public void test_omaha_holdem_3702_3c3h4d6hQd_2d5d8s9d_KcTc3d3s_2sAc8c4h_4c2cJcTh_2hAsAh7c_9s9hQsQh_Ks5h9c6c() {
    assertEquals(
      "4c2cJcTh 2sAc8c4h Ks5h9c6c 2hAsAh7c 2d5d8s9d 9s9hQsQh KcTc3d3s",
      Solver.process("omaha-holdem 3c3h4d6hQd 2d5d8s9d KcTc3d3s 2sAc8c4h 4c2cJcTh 2hAsAh7c 9s9hQsQh Ks5h9c6c"));
  }

  @Test
  public void test_omaha_holdem_3703_3h5d8sAhQs_9d9c2c5c_4c7h5s3d_Ac8h7s4d() {
    assertEquals(
      "9d9c2c5c 4c7h5s3d Ac8h7s4d",
      Solver.process("omaha-holdem 3h5d8sAhQs 9d9c2c5c 4c7h5s3d Ac8h7s4d"));
  }

  @Test
  public void test_omaha_holdem_3704_3c7c9hKcTd_5sQcKsTs_4hQs5cAs_6dAc4sQh_6sJcKd6h_8d7sJd3s_8s3h6cKh_8cThAd5h_7d8h3dAh_2hTcJs2c() {
    assertEquals(
      "4hQs5cAs=6dAc4sQh 8cThAd5h 6sJcKd6h 7d8h3dAh 5sQcKsTs 8s3h6cKh 8d7sJd3s 2hTcJs2c",
      Solver.process("omaha-holdem 3c7c9hKcTd 5sQcKsTs 4hQs5cAs 6dAc4sQh 6sJcKd6h 8d7sJd3s 8s3h6cKh 8cThAd5h 7d8h3dAh 2hTcJs2c"));
  }

  @Test
  public void test_omaha_holdem_3705_4c5d6c6sTs_8d4dKsQs_5hKdTd6d_3c2hQdTh() {
    assertEquals(
      "8d4dKsQs 3c2hQdTh 5hKdTd6d",
      Solver.process("omaha-holdem 4c5d6c6sTs 8d4dKsQs 5hKdTd6d 3c2hQdTh"));
  }

  @Test
  public void test_omaha_holdem_3706_6h8c9cKsTc_6s5d9h4h_8d3c7sTd_6cTsJh8h_2sQd5hTh_Jc3d2h7h_9dKd4sKh_7d5s9s5c_Qc3s3h2d() {
    assertEquals(
      "Qc3s3h2d 2sQd5hTh 6s5d9h4h 6cTsJh8h 9dKd4sKh 7d5s9s5c=8d3c7sTd Jc3d2h7h",
      Solver.process("omaha-holdem 6h8c9cKsTc 6s5d9h4h 8d3c7sTd 6cTsJh8h 2sQd5hTh Jc3d2h7h 9dKd4sKh 7d5s9s5c Qc3s3h2d"));
  }

  @Test
  public void test_omaha_holdem_3707_4c9dAcKdKh_3s4dQd2d_2c8s8h7d_5d7sAsTs_3dTc2s9s_KcQs4sJc_6c3c6dQh_3hKs6s5s_7cAd9c2h_8c7h6h5h() {
    assertEquals(
      "8c7h6h5h 3s4dQd2d 6c3c6dQh 2c8s8h7d 3dTc2s9s 7cAd9c2h 5d7sAsTs 3hKs6s5s KcQs4sJc",
      Solver.process("omaha-holdem 4c9dAcKdKh 3s4dQd2d 2c8s8h7d 5d7sAsTs 3dTc2s9s KcQs4sJc 6c3c6dQh 3hKs6s5s 7cAd9c2h 8c7h6h5h"));
  }

  @Test
  public void test_omaha_holdem_3708_3c4h4sAsJs_8h2hQdJh_8c3dTh5c_4d2c5sKd_AhKh8s7s_7h4c7dTd() {
    assertEquals(
      "8c3dTh5c 8h2hQdJh 7h4c7dTd 4d2c5sKd AhKh8s7s",
      Solver.process("omaha-holdem 3c4h4sAsJs 8h2hQdJh 8c3dTh5c 4d2c5sKd AhKh8s7s 7h4c7dTd"));
  }

  @Test
  public void test_omaha_holdem_3709_3d5c8d9cJh_3c9dKhKc_2hAhKs7h_8s6h4cJc_4sTh6dQh_7cQsAdTs() {
    assertEquals(
      "2hAhKs7h 3c9dKhKc 8s6h4cJc 4sTh6dQh=7cQsAdTs",
      Solver.process("omaha-holdem 3d5c8d9cJh 3c9dKhKc 2hAhKs7h 8s6h4cJc 4sTh6dQh 7cQsAdTs"));
  }

  @Test
  public void test_omaha_holdem_3710_3s5sAcQhTs_4c2d2h6s_8hAdKd5d_7d4s9h2c() {
    assertEquals(
      "8hAdKd5d 4c2d2h6s=7d4s9h2c",
      Solver.process("omaha-holdem 3s5sAcQhTs 4c2d2h6s 8hAdKd5d 7d4s9h2c"));
  }

  @Test
  public void test_omaha_holdem_3711_5s6hAcAsKd_3c8cAdJd_9c7sQd5h_4sTs2d2c_8d8h6cJh() {
    assertEquals(
      "4sTs2d2c 9c7sQd5h 8d8h6cJh 3c8cAdJd",
      Solver.process("omaha-holdem 5s6hAcAsKd 3c8cAdJd 9c7sQd5h 4sTs2d2c 8d8h6cJh"));
  }

  @Test
  public void test_omaha_holdem_3712_7d7h7s8cTd_ThKdQs3d_Jd6h4dAs_3cAdQc4h_5s8h9cJh() {
    assertEquals(
      "ThKdQs3d Jd6h4dAs 3cAdQc4h 5s8h9cJh",
      Solver.process("omaha-holdem 7d7h7s8cTd ThKdQs3d Jd6h4dAs 3cAdQc4h 5s8h9cJh"));
  }

  @Test
  public void test_omaha_holdem_3713_6h7d8c9hJh_2cQd8hQh_2s4cQc8s_8d5d3cKs_5s4d6dTs_Kh4sQs3d_AcTc9c5c_Js6cKcTd_Th2h9sAh_Jd4h6s2d() {
    assertEquals(
      "Kh4sQs3d 2s4cQc8s Jd4h6s2d 8d5d3cKs 5s4d6dTs AcTc9c5c=Js6cKcTd 2cQd8hQh Th2h9sAh",
      Solver.process("omaha-holdem 6h7d8c9hJh 2cQd8hQh 2s4cQc8s 8d5d3cKs 5s4d6dTs Kh4sQs3d AcTc9c5c Js6cKcTd Th2h9sAh Jd4h6s2d"));
  }

  @Test
  public void test_omaha_holdem_3714_4d9sAdAhJd_9cKhKd5c_2h6dAcTs() {
    assertEquals(
      "9cKhKd5c 2h6dAcTs",
      Solver.process("omaha-holdem 4d9sAdAhJd 9cKhKd5c 2h6dAcTs"));
  }

  @Test
  public void test_omaha_holdem_3715_3s5cAhJsQd_7s6d7dQc_4dTs3cAs() {
    assertEquals(
      "7s6d7dQc 4dTs3cAs",
      Solver.process("omaha-holdem 3s5cAhJsQd 7s6d7dQc 4dTs3cAs"));
  }

  @Test
  public void test_omaha_holdem_3716_2s3c4c8s9c_9s2d5h6c_KcTsKs2h_3s8cTh4d_2cQhAs4h_QcJdQs6s_8d6d5dJs_Jh9dKd7h() {
    assertEquals(
      "Jh9dKd7h QcJdQs6s KcTsKs2h 2cQhAs4h 3s8cTh4d 8d6d5dJs=9s2d5h6c",
      Solver.process("omaha-holdem 2s3c4c8s9c 9s2d5h6c KcTsKs2h 3s8cTh4d 2cQhAs4h QcJdQs6s 8d6d5dJs Jh9dKd7h"));
  }

  @Test
  public void test_omaha_holdem_3717_2h3c5hAhTs_7cAs9s3d_5d6sQcJc() {
    assertEquals(
      "5d6sQcJc 7cAs9s3d",
      Solver.process("omaha-holdem 2h3c5hAhTs 7cAs9s3d 5d6sQcJc"));
  }

  @Test
  public void test_omaha_holdem_3718_3h9dJcJdKh_Td8h2hQh_Ks5hQs8c_2d8sAh8d_3c5c9hJh_Th4d7d5d_6c7c6d6s_4hKdQdAc_Kc2c5sJs() {
    assertEquals(
      "Th4d7d5d 6c7c6d6s 2d8sAh8d Ks5hQs8c 4hKdQdAc Td8h2hQh 3c5c9hJh Kc2c5sJs",
      Solver.process("omaha-holdem 3h9dJcJdKh Td8h2hQh Ks5hQs8c 2d8sAh8d 3c5c9hJh Th4d7d5d 6c7c6d6s 4hKdQdAc Kc2c5sJs"));
  }

  @Test
  public void test_omaha_holdem_3719_3s6h9cJcKs_Tc3h9d5s_3dQs4s7s_9hKhJh5d_8s8c9s7d_Ts4dAh6s_2c6cTh2d() {
    assertEquals(
      "3dQs4s7s 2c6cTh2d Ts4dAh6s 8s8c9s7d Tc3h9d5s 9hKhJh5d",
      Solver.process("omaha-holdem 3s6h9cJcKs Tc3h9d5s 3dQs4s7s 9hKhJh5d 8s8c9s7d Ts4dAh6s 2c6cTh2d"));
  }

  @Test
  public void test_omaha_holdem_3720_2s3cJdKsTd_8s9h8cQc_6hAhQs9d() {
    assertEquals(
      "8s9h8cQc 6hAhQs9d",
      Solver.process("omaha-holdem 2s3cJdKsTd 8s9h8cQc 6hAhQs9d"));
  }

  @Test
  public void test_omaha_holdem_3721_2c6cQdQhTs_Ks9c4dTc_7sJhAs9d_Ad6hAh8c_3d8dQcQs() {
    assertEquals(
      "7sJhAs9d Ks9c4dTc Ad6hAh8c 3d8dQcQs",
      Solver.process("omaha-holdem 2c6cQdQhTs Ks9c4dTc 7sJhAs9d Ad6hAh8c 3d8dQcQs"));
  }

  @Test
  public void test_omaha_holdem_3722_3s7h7sJcJh_2dQs7d4d_Js8sTsQd_3c3dAh2h_Ks2s6h4s_TcAd9s6c_8h7c5c9d_3h6dTd8d_Kc2cThAs() {
    assertEquals(
      "Ks2s6h4s TcAd9s6c Kc2cThAs 3h6dTd8d 8h7c5c9d 2dQs7d4d Js8sTsQd 3c3dAh2h",
      Solver.process("omaha-holdem 3s7h7sJcJh 2dQs7d4d Js8sTsQd 3c3dAh2h Ks2s6h4s TcAd9s6c 8h7c5c9d 3h6dTd8d Kc2cThAs"));
  }

  @Test
  public void test_omaha_holdem_3723_2c5h6d8cJh_6h9cKdTh_3h4cKc7c_Td9s8d2s_7h4dJd5c_QdKsAcAs_JcAhAd5d_3c6sKhJs_8sTc5s2h() {
    assertEquals(
      "6h9cKdTh QdKsAcAs Td9s8d2s 8sTc5s2h JcAhAd5d 3c6sKhJs 3h4cKc7c=7h4dJd5c",
      Solver.process("omaha-holdem 2c5h6d8cJh 6h9cKdTh 3h4cKc7c Td9s8d2s 7h4dJd5c QdKsAcAs JcAhAd5d 3c6sKhJs 8sTc5s2h"));
  }

  @Test
  public void test_omaha_holdem_3724_3s5c5sKsQh_AsTs6s4c_2d2sQd5d() {
    assertEquals(
      "AsTs6s4c 2d2sQd5d",
      Solver.process("omaha-holdem 3s5c5sKsQh AsTs6s4c 2d2sQd5d"));
  }

  @Test
  public void test_omaha_holdem_3725_6s9dAsJhQc_6dTs9c5d_4sKh8d4d_5c7s8c9s_Jc9h5s2d() {
    assertEquals(
      "4sKh8d4d 5c7s8c9s 6dTs9c5d Jc9h5s2d",
      Solver.process("omaha-holdem 6s9dAsJhQc 6dTs9c5d 4sKh8d4d 5c7s8c9s Jc9h5s2d"));
  }

  @Test
  public void test_omaha_holdem_3726_2d2h7s8cJd_2sAhJcQc_2c6c9d8h_7d4dAs3h_4h3s9s8s_7cJsQhAc() {
    assertEquals(
      "7d4dAs3h 4h3s9s8s 7cJsQhAc 2c6c9d8h 2sAhJcQc",
      Solver.process("omaha-holdem 2d2h7s8cJd 2sAhJcQc 2c6c9d8h 7d4dAs3h 4h3s9s8s 7cJsQhAc"));
  }

  @Test
  public void test_omaha_holdem_3727_2s3s6sAsTh_AcJc5h9s_4s5sKhJh_Qc4hKc8s_6d2d3d4d_Kd4cAh9c_2cJsQs9d_6c8c6h5d_7hQd8hTc() {
    assertEquals(
      "Qc4hKc8s 7hQd8hTc AcJc5h9s Kd4cAh9c 6d2d3d4d 6c8c6h5d 2cJsQs9d 4s5sKhJh",
      Solver.process("omaha-holdem 2s3s6sAsTh AcJc5h9s 4s5sKhJh Qc4hKc8s 6d2d3d4d Kd4cAh9c 2cJsQs9d 6c8c6h5d 7hQd8hTc"));
  }

  @Test
  public void test_omaha_holdem_3728_3dAcKdQhQs_8h2cJh3s_Ad4s5h8d_Ts3hJs8s_7d6cKcTh_3c4cQc9c_7s5c6sAh_2d9s4h4d_Jd2sQd2h_As9d6h5s() {
    assertEquals(
      "8h2cJh3s 2d9s4h4d 7d6cKcTh 7s5c6sAh Ad4s5h8d As9d6h5s Jd2sQd2h Ts3hJs8s 3c4cQc9c",
      Solver.process("omaha-holdem 3dAcKdQhQs 8h2cJh3s Ad4s5h8d Ts3hJs8s 7d6cKcTh 3c4cQc9c 7s5c6sAh 2d9s4h4d Jd2sQd2h As9d6h5s"));
  }

  @Test
  public void test_omaha_holdem_3729_2s3d7dKdQh_6d4hJhKh_Jc5c5sQc_3h3c9sTd() {
    assertEquals(
      "Jc5c5sQc 6d4hJhKh 3h3c9sTd",
      Solver.process("omaha-holdem 2s3d7dKdQh 6d4hJhKh Jc5c5sQc 3h3c9sTd"));
  }

  @Test
  public void test_omaha_holdem_3730_3d3s4c5d7c_2hAs8sAd_TcQh7s9d_5h6cTh6h_7h9s6d7d_QdTdKd5c_8h4sAh9c_JdTsQs8c() {
    assertEquals(
      "JdTsQs8c 8h4sAh9c QdTdKd5c TcQh7s9d 2hAs8sAd 5h6cTh6h 7h9s6d7d",
      Solver.process("omaha-holdem 3d3s4c5d7c 2hAs8sAd TcQh7s9d 5h6cTh6h 7h9s6d7d QdTdKd5c 8h4sAh9c JdTsQs8c"));
  }

  @Test
  public void test_omaha_holdem_3731_8d8s9dAhQs_Qd2c2sJh_4h2hQc6d_Ts5d4dTh_AcKc5hTd_6c6h3c8h_Tc3hKsJd() {
    assertEquals(
      "Ts5d4dTh 4h2hQc6d Qd2c2sJh AcKc5hTd 6c6h3c8h Tc3hKsJd",
      Solver.process("omaha-holdem 8d8s9dAhQs Qd2c2sJh 4h2hQc6d Ts5d4dTh AcKc5hTd 6c6h3c8h Tc3hKsJd"));
  }

  @Test
  public void test_omaha_holdem_3732_3d3s4c6hAd_8cQd4d7c_9cTs8hKs_3c5cAcTh_5sJdQsJs_Ah2dKd5d_6s6c4s5h() {
    assertEquals(
      "9cTs8hKs 8cQd4d7c 5sJdQsJs Ah2dKd5d 3c5cAcTh 6s6c4s5h",
      Solver.process("omaha-holdem 3d3s4c6hAd 8cQd4d7c 9cTs8hKs 3c5cAcTh 5sJdQsJs Ah2dKd5d 6s6c4s5h"));
  }

  @Test
  public void test_omaha_holdem_3733_3s6h6s7sQc_Ac9s3c8s_2sKh4c9d_6c4s2h9h_QdKc4h6d_AsJdTd7c_Ts8h3h7d() {
    assertEquals(
      "2sKh4c9d Ts8h3h7d AsJdTd7c 6c4s2h9h Ac9s3c8s QdKc4h6d",
      Solver.process("omaha-holdem 3s6h6s7sQc Ac9s3c8s 2sKh4c9d 6c4s2h9h QdKc4h6d AsJdTd7c Ts8h3h7d"));
  }

  @Test
  public void test_omaha_holdem_3734_2d6c7dJdJs_2c8c6hKc_5s8h8sAd_KhQhAsQd_6d4c4h4d() {
    assertEquals(
      "2c8c6hKc 5s8h8sAd KhQhAsQd 6d4c4h4d",
      Solver.process("omaha-holdem 2d6c7dJdJs 2c8c6hKc 5s8h8sAd KhQhAsQd 6d4c4h4d"));
  }

  @Test
  public void test_omaha_holdem_3735_2c3s8d9hQd_9c9d8s3c_Kd9s6sTs() {
    assertEquals(
      "Kd9s6sTs 9c9d8s3c",
      Solver.process("omaha-holdem 2c3s8d9hQd 9c9d8s3c Kd9s6sTs"));
  }

  @Test
  public void test_omaha_holdem_3736_8cAdJsKdQs_9s7s6s5c_6d3h6cQc_Tc9h6h5d_4dAs4h7h_7cKcJdJc_8sJhTd5s() {
    assertEquals(
      "9s7s6s5c 6d3h6cQc 4dAs4h7h 7cKcJdJc Tc9h6h5d 8sJhTd5s",
      Solver.process("omaha-holdem 8cAdJsKdQs 9s7s6s5c 6d3h6cQc Tc9h6h5d 4dAs4h7h 7cKcJdJc 8sJhTd5s"));
  }

  @Test
  public void test_omaha_holdem_3737_3h3s5c5hKd_QcAhTs7s_Qs3dTc4c_8c4s6c6h_9s9hQhJc_5sJdTd2d_8h6d7d3c() {
    assertEquals(
      "QcAhTs7s 8c4s6c6h 9s9hQhJc 8h6d7d3c Qs3dTc4c 5sJdTd2d",
      Solver.process("omaha-holdem 3h3s5c5hKd QcAhTs7s Qs3dTc4c 8c4s6c6h 9s9hQhJc 5sJdTd2d 8h6d7d3c"));
  }

  @Test
  public void test_omaha_holdem_3738_6h7d9hAhTc_5d3h4h2d_3d5s2cJh_8d7c8sKc_Ad6d5h2s_Jd4d9s6c() {
    assertEquals(
      "3d5s2cJh Jd4d9s6c Ad6d5h2s 8d7c8sKc 5d3h4h2d",
      Solver.process("omaha-holdem 6h7d9hAhTc 5d3h4h2d 3d5s2cJh 8d7c8sKc Ad6d5h2s Jd4d9s6c"));
  }

  @Test
  public void test_omaha_holdem_3739_2s5c6h9hTc_KhThAc3c_8s4h4dJd_QcAhJs4s() {
    assertEquals(
      "QcAhJs4s 8s4h4dJd KhThAc3c",
      Solver.process("omaha-holdem 2s5c6h9hTc KhThAc3c 8s4h4dJd QcAhJs4s"));
  }

  @Test
  public void test_omaha_holdem_3740_2d4h9dKdQd_TcKcJcAc_6h7c7dJh_6sKs8h7h_5c3h5sJs_3dQsQc8c_As8d5d4s_9s2s9h4c_3cAh8s3s_6dQhTd6c() {
    assertEquals(
      "3cAh8s3s 5c3h5sJs 6h7c7dJh 6sKs8h7h 9s2s9h4c 3dQsQc8c TcKcJcAc As8d5d4s 6dQhTd6c",
      Solver.process("omaha-holdem 2d4h9dKdQd TcKcJcAc 6h7c7dJh 6sKs8h7h 5c3h5sJs 3dQsQc8c As8d5d4s 9s2s9h4c 3cAh8s3s 6dQhTd6c"));
  }

  @Test
  public void test_omaha_holdem_3741_4d5d7d9cJc_QhJh4c2h_9dAd8s2d_Ah6cJd6d_9s6hKdQc_2sQsTdTs_8cKcTh3c_Ac3d4s5c_5h7cAs8h_Ks6s9h3s() {
    assertEquals(
      "9s6hKdQc 2sQsTdTs Ac3d4s5c 5h7cAs8h QhJh4c2h Ks6s9h3s 8cKcTh3c Ah6cJd6d 9dAd8s2d",
      Solver.process("omaha-holdem 4d5d7d9cJc QhJh4c2h 9dAd8s2d Ah6cJd6d 9s6hKdQc 2sQsTdTs 8cKcTh3c Ac3d4s5c 5h7cAs8h Ks6s9h3s"));
  }

  @Test
  public void test_omaha_holdem_3742_5c9hKsQsTh_Ts3c7h3h_QhAsKhJc_JhQd8c9c_Kd8h2d3s_5d6s8sTc_2sAhQc9d_4c6h2cJd() {
    assertEquals(
      "4c6h2cJd Ts3c7h3h Kd8h2d3s 5d6s8sTc 2sAhQc9d JhQd8c9c QhAsKhJc",
      Solver.process("omaha-holdem 5c9hKsQsTh Ts3c7h3h QhAsKhJc JhQd8c9c Kd8h2d3s 5d6s8sTc 2sAhQc9d 4c6h2cJd"));
  }

  @Test
  public void test_omaha_holdem_3743_3c7h8c9dTc_7d2h9sTd_9cQsAd2d_Ah3d6dTs_6c8dKh2s_8sTh6sQc() {
    assertEquals(
      "9cQsAd2d 7d2h9sTd 6c8dKh2s=8sTh6sQc=Ah3d6dTs",
      Solver.process("omaha-holdem 3c7h8c9dTc 7d2h9sTd 9cQsAd2d Ah3d6dTs 6c8dKh2s 8sTh6sQc"));
  }

  @Test
  public void test_omaha_holdem_3744_5h7sJcKdTc_9hAd9s7h_2d7dKsQh_3h6d9d7c_Kh5d4dQs_3cTs8s8h_6c4s6s9c() {
    assertEquals(
      "6c4s6s9c 3h6d9d7c 9hAd9s7h 3cTs8s8h Kh5d4dQs 2d7dKsQh",
      Solver.process("omaha-holdem 5h7sJcKdTc 9hAd9s7h 2d7dKsQh 3h6d9d7c Kh5d4dQs 3cTs8s8h 6c4s6s9c"));
  }

  @Test
  public void test_omaha_holdem_3745_2h3c6hAhTh_8sTd5dAs_4sJs7sJh() {
    assertEquals(
      "4sJs7sJh 8sTd5dAs",
      Solver.process("omaha-holdem 2h3c6hAhTh 8sTd5dAs 4sJs7sJh"));
  }

  @Test
  public void test_omaha_holdem_3746_3h5d8cQdTc_5s3dQh3c_8h4hAhTd_4sTsJc5c() {
    assertEquals(
      "4sTsJc5c 8h4hAhTd 5s3dQh3c",
      Solver.process("omaha-holdem 3h5d8cQdTc 5s3dQh3c 8h4hAhTd 4sTsJc5c"));
  }

  @Test
  public void test_omaha_holdem_3747_5d6c7d7sJd_Tc7cTd8h_6dQh9c2s_JsJhQs4h_Ah2hQd5h_AsAc8sJc_6h8d4dAd_3hKdQc2c_6sTs4s8c() {
    assertEquals(
      "3hKdQc2c Ah2hQd5h 6dQh9c2s AsAc8sJc Tc7cTd8h 6sTs4s8c 6h8d4dAd JsJhQs4h",
      Solver.process("omaha-holdem 5d6c7d7sJd Tc7cTd8h 6dQh9c2s JsJhQs4h Ah2hQd5h AsAc8sJc 6h8d4dAd 3hKdQc2c 6sTs4s8c"));
  }

  @Test
  public void test_omaha_holdem_3748_2d6h7s9cKs_QcJdAc4d_8d2c7d4h_3hJs3cJh_KdQdTd6s_5s7h4sAs_6dAd9d3d() {
    assertEquals(
      "QcJdAc4d 5s7h4sAs 3hJs3cJh 8d2c7d4h 6dAd9d3d KdQdTd6s",
      Solver.process("omaha-holdem 2d6h7s9cKs QcJdAc4d 8d2c7d4h 3hJs3cJh KdQdTd6s 5s7h4sAs 6dAd9d3d"));
  }

  @Test
  public void test_omaha_holdem_3749_2h3h7s9cTd_5cKd7d6h_AdAc6dKh_3dQd8s9s_TsJdJcTc_As4s5hAh_Qc4hKs8d() {
    assertEquals(
      "Qc4hKs8d 5cKd7d6h AdAc6dKh=As4s5hAh 3dQd8s9s TsJdJcTc",
      Solver.process("omaha-holdem 2h3h7s9cTd 5cKd7d6h AdAc6dKh 3dQd8s9s TsJdJcTc As4s5hAh Qc4hKs8d"));
  }

}
