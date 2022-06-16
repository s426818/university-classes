
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver30HiddenTest {


  @Test
  public void test_omaha_holdem_7500_2h3c6cAdJd_2s4s2d5s_TcJhKsKc() {
    assertEquals(
      "TcJhKsKc 2s4s2d5s",
      Solver.process("omaha-holdem 2h3c6cAdJd 2s4s2d5s TcJhKsKc"));
  }

  @Test
  public void test_omaha_holdem_7501_7dAhJhJsTc_5c3dAdQd_QcAs5d7h_2hKhTh9c_2d8hKd8c_2s3c8s9s_4c4hTs2c_6h3h6d6s_Ac7c6c9d_KcJd9h3s() {
    assertEquals(
      "6h3h6d6s 2d8hKd8c 4c4hTs2c 2hKhTh9c Ac7c6c9d 5c3dAdQd=QcAs5d7h KcJd9h3s 2s3c8s9s",
      Solver.process("omaha-holdem 7dAhJhJsTc 5c3dAdQd QcAs5d7h 2hKhTh9c 2d8hKd8c 2s3c8s9s 4c4hTs2c 6h3h6d6s Ac7c6c9d KcJd9h3s"));
  }

  @Test
  public void test_omaha_holdem_7502_7h8hJcQcQd_3c9h9dAd_3h7c6s5d_9s5h2sKs_2c9c2hAh_6h6cQhKc_2dJdQs8s_4hJs7sTd_Th5sAs7d() {
    assertEquals(
      "9s5h2sKs 2c9c2hAh 3h7c6s5d Th5sAs7d 3c9h9dAd 4hJs7sTd 6h6cQhKc 2dJdQs8s",
      Solver.process("omaha-holdem 7h8hJcQcQd 3c9h9dAd 3h7c6s5d 9s5h2sKs 2c9c2hAh 6h6cQhKc 2dJdQs8s 4hJs7sTd Th5sAs7d"));
  }

  @Test
  public void test_omaha_holdem_7503_3h8c9cQcTd_8h5cTsTc_8sJs3s6h_2cJd2hKd_7sKcAcKs_5d5h9d2s_7h5sJc2d_7dAdKh9h() {
    assertEquals(
      "5d5h9d2s 7dAdKh9h 7h5sJc2d 8sJs3s6h 2cJd2hKd 8h5cTsTc 7sKcAcKs",
      Solver.process("omaha-holdem 3h8c9cQcTd 8h5cTsTc 8sJs3s6h 2cJd2hKd 7sKcAcKs 5d5h9d2s 7h5sJc2d 7dAdKh9h"));
  }

  @Test
  public void test_omaha_holdem_7504_4s5c7hKhTd_KdAd3h8d_Qh5h7d3c_8cJcQd4c_Ac2h9h9c_9s7sJh2s_2dQcQs2c_7cAs5dTs() {
    assertEquals(
      "8cJcQd4c 9s7sJh2s Ac2h9h9c 2dQcQs2c KdAd3h8d Qh5h7d3c 7cAs5dTs",
      Solver.process("omaha-holdem 4s5c7hKhTd KdAd3h8d Qh5h7d3c 8cJcQd4c Ac2h9h9c 9s7sJh2s 2dQcQs2c 7cAs5dTs"));
  }

  @Test
  public void test_omaha_holdem_7505_4d5c7dKcKs_Td8d8h5d_3c8sTsQd_JhAc5sQh_6h2h7s9s_JcKdAs4s_Qc3s9h3d_AdQs2sJs_3h6dJdTh() {
    assertEquals(
      "3c8sTsQd AdQs2sJs Qc3s9h3d JhAc5sQh 6h2h7s9s Td8d8h5d 3h6dJdTh JcKdAs4s",
      Solver.process("omaha-holdem 4d5c7dKcKs Td8d8h5d 3c8sTsQd JhAc5sQh 6h2h7s9s JcKdAs4s Qc3s9h3d AdQs2sJs 3h6dJdTh"));
  }

  @Test
  public void test_omaha_holdem_7506_4h5s6s7d9s_Qs2sTs9c_JdKh8s8c_Ac2dJc9d_3s2h4s5d_6c2c7s4c_KdQcTh3h() {
    assertEquals(
      "KdQcTh3h JdKh8s8c Ac2dJc9d 6c2c7s4c 3s2h4s5d Qs2sTs9c",
      Solver.process("omaha-holdem 4h5s6s7d9s Qs2sTs9c JdKh8s8c Ac2dJc9d 3s2h4s5d 6c2c7s4c KdQcTh3h"));
  }

  @Test
  public void test_omaha_holdem_7507_3c3d3s6c8h_9c3hQhAd_7sQc8cJs_4s9sTc7d_Ac7c5cQs_5dKc8sJd_TsAh7h6s_2sTd4dJc_8dKh9h6d() {
    assertEquals(
      "4s9sTc7d 2sTd4dJc 7sQc8cJs 8dKh9h6d 5dKc8sJd TsAh7h6s Ac7c5cQs 9c3hQhAd",
      Solver.process("omaha-holdem 3c3d3s6c8h 9c3hQhAd 7sQc8cJs 4s9sTc7d Ac7c5cQs 5dKc8sJd TsAh7h6s 2sTd4dJc 8dKh9h6d"));
  }

  @Test
  public void test_omaha_holdem_7508_4c8h9dJsKd_9cJcQd6d_Ad4h3s5c_Qc9sKh5h_6h6c8dAc_6s7h2c7c_Ah4sJd5s_7sJh3c4d() {
    assertEquals(
      "Ad4h3s5c 6s7h2c7c 6h6c8dAc 7sJh3c4d=Ah4sJd5s 9cJcQd6d Qc9sKh5h",
      Solver.process("omaha-holdem 4c8h9dJsKd 9cJcQd6d Ad4h3s5c Qc9sKh5h 6h6c8dAc 6s7h2c7c Ah4sJd5s 7sJh3c4d"));
  }

  @Test
  public void test_omaha_holdem_7509_2s5s6c7s9c_AsQcKcAd_8cKs4sTd_2d3s3h9d_9s5d2c7h_Qs6hJs4d_4c2h8sTh_6sJhTs8h() {
    assertEquals(
      "AsQcKcAd 2d3s3h9d 9s5d2c7h 4c2h8sTh 6sJhTs8h Qs6hJs4d 8cKs4sTd",
      Solver.process("omaha-holdem 2s5s6c7s9c AsQcKcAd 8cKs4sTd 2d3s3h9d 9s5d2c7h Qs6hJs4d 4c2h8sTh 6sJhTs8h"));
  }

  @Test
  public void test_omaha_holdem_7510_3s5h6sQdQh_Js5c9cKs_6c4h2s4d() {
    assertEquals(
      "Js5c9cKs 6c4h2s4d",
      Solver.process("omaha-holdem 3s5h6sQdQh Js5c9cKs 6c4h2s4d"));
  }

  @Test
  public void test_omaha_holdem_7511_3s5h6hTdTs_Jd5s3c8c_8s2c4c7d_8d2d3d5d_4s9h8hKd_AhAsJsJh_9cTh3h6c() {
    assertEquals(
      "4s9h8hKd 8d2d3d5d Jd5s3c8c AhAsJsJh 8s2c4c7d 9cTh3h6c",
      Solver.process("omaha-holdem 3s5h6hTdTs Jd5s3c8c 8s2c4c7d 8d2d3d5d 4s9h8hKd AhAsJsJh 9cTh3h6c"));
  }

  @Test
  public void test_omaha_holdem_7512_3c7c9sJdJs_5h5s8h9c_3s9dKc3d_6hAc7hTc_Kh5d6dQd_8c6s4hQh_7d3hJcAh_4d5c9h8s_TdJh6c2d() {
    assertEquals(
      "8c6s4hQh Kh5d6dQd 6hAc7hTc 4d5c9h8s=5h5s8h9c TdJh6c2d 3s9dKc3d 7d3hJcAh",
      Solver.process("omaha-holdem 3c7c9sJdJs 5h5s8h9c 3s9dKc3d 6hAc7hTc Kh5d6dQd 8c6s4hQh 7d3hJcAh 4d5c9h8s TdJh6c2d"));
  }

  @Test
  public void test_omaha_holdem_7513_5h6h9dAhQd_8s7cJs2s_3s4h9h4d_3c3d4s6c_5cTsKc8d_5s2d4cAc_7hKdJd7s_Qs6sAs2c_ThKs9sTc_5d7dAdQh() {
    assertEquals(
      "5cTsKc8d 3c3d4s6c 7hKdJd7s ThKs9sTc 5s2d4cAc 5d7dAdQh=Qs6sAs2c 8s7cJs2s 3s4h9h4d",
      Solver.process("omaha-holdem 5h6h9dAhQd 8s7cJs2s 3s4h9h4d 3c3d4s6c 5cTsKc8d 5s2d4cAc 7hKdJd7s Qs6sAs2c ThKs9sTc 5d7dAdQh"));
  }

  @Test
  public void test_omaha_holdem_7514_3s5c7s8cTs_4dKh2d4c_JdAh4h8h_3h6s5d7d_KsAc4s5s() {
    assertEquals(
      "4dKh2d4c JdAh4h8h 3h6s5d7d KsAc4s5s",
      Solver.process("omaha-holdem 3s5c7s8cTs 4dKh2d4c JdAh4h8h 3h6s5d7d KsAc4s5s"));
  }

  @Test
  public void test_omaha_holdem_7515_4c4s6dAdKh_4h2sKc9h_8s3d2h9c_3hJd6cQc() {
    assertEquals(
      "8s3d2h9c 3hJd6cQc 4h2sKc9h",
      Solver.process("omaha-holdem 4c4s6dAdKh 4h2sKc9h 8s3d2h9c 3hJd6cQc"));
  }

  @Test
  public void test_omaha_holdem_7516_7c8c9sJcKd_3d6c7h5c_9h2h2sTs_4d3h4h8d_Th3s7d6s_5hTc7s8h_Ad5sJh6d_Ah4cKcQh_5dJd2d9c_3c4s2cTd() {
    assertEquals(
      "4d3h4h8d 5dJd2d9c Ad5sJh6d 5hTc7s8h=9h2h2sTs=Th3s7d6s 3c4s2cTd 3d6c7h5c Ah4cKcQh",
      Solver.process("omaha-holdem 7c8c9sJcKd 3d6c7h5c 9h2h2sTs 4d3h4h8d Th3s7d6s 5hTc7s8h Ad5sJh6d Ah4cKcQh 5dJd2d9c 3c4s2cTd"));
  }

  @Test
  public void test_omaha_holdem_7517_2c5dAdAsKh_TcKcQh7d_8d7s3s3d_5h5sJs5c_4d7h9sTh_8h4s6c8c_Jc9d6d2h_4c2sQcQd() {
    assertEquals(
      "4d7h9sTh Jc9d6d2h 8d7s3s3d 8h4s6c8c 4c2sQcQd TcKcQh7d 5h5sJs5c",
      Solver.process("omaha-holdem 2c5dAdAsKh TcKcQh7d 8d7s3s3d 5h5sJs5c 4d7h9sTh 8h4s6c8c Jc9d6d2h 4c2sQcQd"));
  }

  @Test
  public void test_omaha_holdem_7518_2d3c3h7dAs_TdQs8dAh_5cJd9cKd_2hAd6s4d_9d2c8cKc_7c2s9h6h_Jc9s4cAc_Kh6cQh5d_8hJh8s4s() {
    assertEquals(
      "5cJd9cKd Kh6cQh5d 9d2c8cKc 7c2s9h6h 8hJh8s4s 2hAd6s4d Jc9s4cAc TdQs8dAh",
      Solver.process("omaha-holdem 2d3c3h7dAs TdQs8dAh 5cJd9cKd 2hAd6s4d 9d2c8cKc 7c2s9h6h Jc9s4cAc Kh6cQh5d 8hJh8s4s"));
  }

  @Test
  public void test_omaha_holdem_7519_4s6h8h9dQd_7d7cAcTd_Tc8c9sKh_Jc9hJhAd() {
    assertEquals(
      "Jc9hJhAd Tc8c9sKh 7d7cAcTd",
      Solver.process("omaha-holdem 4s6h8h9dQd 7d7cAcTd Tc8c9sKh Jc9hJhAd"));
  }

  @Test
  public void test_omaha_holdem_7520_2s4d6sJhKc_4c9sAh7h_Jc7cJd5c_TdAdQhKs_9h6h3d4h_2cKd8hJs_6d5h3h7s_6cAcTc9c_QsTs2d8c() {
    assertEquals(
      "QsTs2d8c 4c9sAh7h 6cAcTc9c TdAdQhKs 9h6h3d4h 2cKd8hJs Jc7cJd5c 6d5h3h7s",
      Solver.process("omaha-holdem 2s4d6sJhKc 4c9sAh7h Jc7cJd5c TdAdQhKs 9h6h3d4h 2cKd8hJs 6d5h3h7s 6cAcTc9c QsTs2d8c"));
  }

  @Test
  public void test_omaha_holdem_7521_2h3h4s9cJh_5c6dThAd_8dTd6h2c_9s2s3c8s_KcTcJc8c_6cKs8h7c_7dQsJs5h() {
    assertEquals(
      "6cKs8h7c 8dTd6h2c 7dQsJs5h KcTcJc8c 9s2s3c8s 5c6dThAd",
      Solver.process("omaha-holdem 2h3h4s9cJh 5c6dThAd 8dTd6h2c 9s2s3c8s KcTcJc8c 6cKs8h7c 7dQsJs5h"));
  }

  @Test
  public void test_omaha_holdem_7522_2d5h6dKdQc_5c7cTcKc_Jc5s4sAd() {
    assertEquals(
      "Jc5s4sAd 5c7cTcKc",
      Solver.process("omaha-holdem 2d5h6dKdQc 5c7cTcKc Jc5s4sAd"));
  }

  @Test
  public void test_omaha_holdem_7523_5d6cKdQcTs_Ah2c3h2d_3s4d7hTc_8h9d2sKc_3dTd7c9c_Ac5hKsQs_AsJdJs6h_Qh7d8s4s_9h6d4c4h() {
    assertEquals(
      "Ah2c3h2d 9h6d4c4h 3s4d7hTc 3dTd7c9c Qh7d8s4s 8h9d2sKc Ac5hKsQs AsJdJs6h",
      Solver.process("omaha-holdem 5d6cKdQcTs Ah2c3h2d 3s4d7hTc 8h9d2sKc 3dTd7c9c Ac5hKsQs AsJdJs6h Qh7d8s4s 9h6d4c4h"));
  }

  @Test
  public void test_omaha_holdem_7524_2s6hAdKdTd_TsAsTc9c_9s2d3h2h_5sQcAhQs_8c6d3sKh_4c4h7dAc_4s3d7s4d_KsJc8hJs() {
    assertEquals(
      "KsJc8hJs 4c4h7dAc 5sQcAhQs 8c6d3sKh 9s2d3h2h TsAsTc9c 4s3d7s4d",
      Solver.process("omaha-holdem 2s6hAdKdTd TsAsTc9c 9s2d3h2h 5sQcAhQs 8c6d3sKh 4c4h7dAc 4s3d7s4d KsJc8hJs"));
  }

  @Test
  public void test_omaha_holdem_7525_2s5c6cJdQd_3s5h2d4h_Tc4cKs7h() {
    assertEquals(
      "Tc4cKs7h 3s5h2d4h",
      Solver.process("omaha-holdem 2s5c6cJdQd 3s5h2d4h Tc4cKs7h"));
  }

  @Test
  public void test_omaha_holdem_7526_2s3d4h8h9h_2h9c5s3c_6dAhAs3h_6c7c3sQs_Ks9dAd8s_4c6sJd8d_KhJs5c8c() {
    assertEquals(
      "6c7c3sQs KhJs5c8c 4c6sJd8d 2h9c5s3c Ks9dAd8s 6dAhAs3h",
      Solver.process("omaha-holdem 2s3d4h8h9h 2h9c5s3c 6dAhAs3h 6c7c3sQs Ks9dAd8s 4c6sJd8d KhJs5c8c"));
  }

  @Test
  public void test_omaha_holdem_7527_4h5h6dJhKh_Tc2d4sKc_AdJcKdAc_Qh2c3s7d_As5c3d9h_5s6sQd7h_8s4dQs6h() {
    assertEquals(
      "As5c3d9h 8s4dQs6h 5s6sQd7h Tc2d4sKc AdJcKdAc Qh2c3s7d",
      Solver.process("omaha-holdem 4h5h6dJhKh Tc2d4sKc AdJcKdAc Qh2c3s7d As5c3d9h 5s6sQd7h 8s4dQs6h"));
  }

  @Test
  public void test_omaha_holdem_7528_2c5c8d8sJc_6h7hQsKs_2h7s9sTs_Td6sQhAs() {
    assertEquals(
      "6h7hQsKs Td6sQhAs 2h7s9sTs",
      Solver.process("omaha-holdem 2c5c8d8sJc 6h7hQsKs 2h7s9sTs Td6sQhAs"));
  }

  @Test
  public void test_omaha_holdem_7529_2h7s9cQcTd_8dJh3s3h_Ah9d7d6c_Ks6d6h7h_Ts5d4d9s_5h4sTh2c_4c2dQh9h() {
    assertEquals(
      "Ks6d6h7h Ah9d7d6c 5h4sTh2c Ts5d4d9s 4c2dQh9h 8dJh3s3h",
      Solver.process("omaha-holdem 2h7s9cQcTd 8dJh3s3h Ah9d7d6c Ks6d6h7h Ts5d4d9s 5h4sTh2c 4c2dQh9h"));
  }

  @Test
  public void test_omaha_holdem_7530_3d5c7d9hTh_8cJcQh7h_KsAh7cTs_7sTc4c3h_8s2s5hJs_2d2h3s4s_Kc6d9dAd() {
    assertEquals(
      "2d2h3s4s Kc6d9dAd 7sTc4c3h=KsAh7cTs 8cJcQh7h=8s2s5hJs",
      Solver.process("omaha-holdem 3d5c7d9hTh 8cJcQh7h KsAh7cTs 7sTc4c3h 8s2s5hJs 2d2h3s4s Kc6d9dAd"));
  }

  @Test
  public void test_omaha_holdem_7531_5hAdQhTdTh_7c8s3dTs_2h2s4cKh_2c5s9s6c_Ah5dJc7s() {
    assertEquals(
      "2c5s9s6c Ah5dJc7s 7c8s3dTs 2h2s4cKh",
      Solver.process("omaha-holdem 5hAdQhTdTh 7c8s3dTs 2h2s4cKh 2c5s9s6c Ah5dJc7s"));
  }

  @Test
  public void test_omaha_holdem_7532_2s7c7d8h8s_As6cJs9c_4h7h7s2h_KsKcAhTd_QhJc8c5h_5sAd8d3h_6dJhQdQc_Th3sKh4c_Jd9hQs6s() {
    assertEquals(
      "Jd9hQs6s Th3sKh4c As6cJs9c 6dJhQdQc KsKcAhTd QhJc8c5h 5sAd8d3h 4h7h7s2h",
      Solver.process("omaha-holdem 2s7c7d8h8s As6cJs9c 4h7h7s2h KsKcAhTd QhJc8c5h 5sAd8d3h 6dJhQdQc Th3sKh4c Jd9hQs6s"));
  }

  @Test
  public void test_omaha_holdem_7533_2h6s8hQcTd_8s8cTcKd_7hQhKc7c() {
    assertEquals(
      "7hQhKc7c 8s8cTcKd",
      Solver.process("omaha-holdem 2h6s8hQcTd 8s8cTcKd 7hQhKc7c"));
  }

  @Test
  public void test_omaha_holdem_7534_2c2s9cTdTs_QhQd9hAs_8d9d6s8c_6h4hJc9s_7s3sKhQc_5dJdKcTc() {
    assertEquals(
      "7s3sKhQc 8d9d6s8c 6h4hJc9s QhQd9hAs 5dJdKcTc",
      Solver.process("omaha-holdem 2c2s9cTdTs QhQd9hAs 8d9d6s8c 6h4hJc9s 7s3sKhQc 5dJdKcTc"));
  }

  @Test
  public void test_omaha_holdem_7535_2sKdQdTcTh_Td2c7c6c_TsJd2d5h_QsAs3s4c_8s8dQc6d_KsJc4h4d_9s3h7h9h_Kc7s6h9d_Ac2h3c6s() {
    assertEquals(
      "Ac2h3c6s 9s3h7h9h 8s8dQc6d QsAs3s4c Kc7s6h9d KsJc4h4d Td2c7c6c=TsJd2d5h",
      Solver.process("omaha-holdem 2sKdQdTcTh Td2c7c6c TsJd2d5h QsAs3s4c 8s8dQc6d KsJc4h4d 9s3h7h9h Kc7s6h9d Ac2h3c6s"));
  }

  @Test
  public void test_omaha_holdem_7536_4d5c6c6hJc_8cAd3s7h_3c2c2d4c_7s6s3h4s_JdKs5dQs_Jh7cKhTc_KcJs3dAs_2h9c9dTs_Ac4h5h8h_QcQd6dTh() {
    assertEquals(
      "Ac4h5h8h 2h9c9dTs JdKs5dQs KcJs3dAs QcQd6dTh 8cAd3s7h 3c2c2d4c Jh7cKhTc 7s6s3h4s",
      Solver.process("omaha-holdem 4d5c6c6hJc 8cAd3s7h 3c2c2d4c 7s6s3h4s JdKs5dQs Jh7cKhTc KcJs3dAs 2h9c9dTs Ac4h5h8h QcQd6dTh"));
  }

  @Test
  public void test_omaha_holdem_7537_2c4c5h8cJh_TcAsAdQh_Jc7hThTd_6dJd2h3s_9s7sQc4h_6sTs9h2d() {
    assertEquals(
      "6sTs9h2d 9s7sQc4h Jc7hThTd TcAsAdQh 6dJd2h3s",
      Solver.process("omaha-holdem 2c4c5h8cJh TcAsAdQh Jc7hThTd 6dJd2h3s 9s7sQc4h 6sTs9h2d"));
  }

  @Test
  public void test_omaha_holdem_7538_5c6d8hAdTc_9sKdKs8c_Js2sTh6s_3s9d2hAs_3hQh4cQc_Ts4sAh2c_JdQd3c9c() {
    assertEquals(
      "JdQd3c9c 3hQh4cQc 9sKdKs8c 3s9d2hAs Js2sTh6s Ts4sAh2c",
      Solver.process("omaha-holdem 5c6d8hAdTc 9sKdKs8c Js2sTh6s 3s9d2hAs 3hQh4cQc Ts4sAh2c JdQd3c9c"));
  }

  @Test
  public void test_omaha_holdem_7539_4s7dKdKsQh_9s5sKc4h_8cAd9c4d_Jd3h9hTd_6cJcAc6h_7cKhQsAh_5cQc4c8s_2h6dQd2d_5d6s9d8h() {
    assertEquals(
      "5d6s9d8h Jd3h9hTd 8cAd9c4d 6cJcAc6h 2h6dQd2d 5cQc4c8s 9s5sKc4h 7cKhQsAh",
      Solver.process("omaha-holdem 4s7dKdKsQh 9s5sKc4h 8cAd9c4d Jd3h9hTd 6cJcAc6h 7cKhQsAh 5cQc4c8s 2h6dQd2d 5d6s9d8h"));
  }

  @Test
  public void test_omaha_holdem_7540_2d4s5c7sTs_ThQh7dAh_KhQd9cAd() {
    assertEquals(
      "KhQd9cAd ThQh7dAh",
      Solver.process("omaha-holdem 2d4s5c7sTs ThQh7dAh KhQd9cAd"));
  }

  @Test
  public void test_omaha_holdem_7541_3s4c5s9cQs_QhQc2sTh_TsJc4dQd_KcAdTc9h_5cKh2dAh_7h5h8h4h_7s3cKd3h_8sAc6cTd() {
    assertEquals(
      "8sAc6cTd KcAdTc9h 7h5h8h4h TsJc4dQd 7s3cKd3h QhQc2sTh 5cKh2dAh",
      Solver.process("omaha-holdem 3s4c5s9cQs QhQc2sTh TsJc4dQd KcAdTc9h 5cKh2dAh 7h5h8h4h 7s3cKd3h 8sAc6cTd"));
  }

  @Test
  public void test_omaha_holdem_7542_2c4s5d5sQh_JhKs8hQd_TdQc7d9c_9h4hAc3s_7sAh4cKh_2d7cAd8s_5cTs3dKc_2s5h8dJc_6sAs8cTc() {
    assertEquals(
      "6sAs8cTc 2d7cAd8s 7sAh4cKh TdQc7d9c JhKs8hQd 5cTs3dKc 9h4hAc3s 2s5h8dJc",
      Solver.process("omaha-holdem 2c4s5d5sQh JhKs8hQd TdQc7d9c 9h4hAc3s 7sAh4cKh 2d7cAd8s 5cTs3dKc 2s5h8dJc 6sAs8cTc"));
  }

  @Test
  public void test_omaha_holdem_7543_4h6cJsQhTh_5c9sTs8d_Ac5s5h8h() {
    assertEquals(
      "5c9sTs8d Ac5s5h8h",
      Solver.process("omaha-holdem 4h6cJsQhTh 5c9sTs8d Ac5s5h8h"));
  }

  @Test
  public void test_omaha_holdem_7544_2c8h9dAcAd_5h5s2dQc_7c7s5cJc() {
    assertEquals(
      "5h5s2dQc 7c7s5cJc",
      Solver.process("omaha-holdem 2c8h9dAcAd 5h5s2dQc 7c7s5cJc"));
  }

  @Test
  public void test_omaha_holdem_7545_2h3h3s8hAs_6dAhTsJh_8d5c4h6h() {
    assertEquals(
      "8d5c4h6h 6dAhTsJh",
      Solver.process("omaha-holdem 2h3h3s8hAs 6dAhTsJh 8d5c4h6h"));
  }

  @Test
  public void test_omaha_holdem_7546_2s4d6hJhKd_9h6dKsAd_5s3hJsKh() {
    assertEquals(
      "9h6dKsAd 5s3hJsKh",
      Solver.process("omaha-holdem 2s4d6hJhKd 9h6dKsAd 5s3hJsKh"));
  }

  @Test
  public void test_omaha_holdem_7547_3d6hAdJsTs_6s4cTd6d_Ac3sQhQc_3h7c9s5c_4hQd7h8h() {
    assertEquals(
      "4hQd7h8h 3h7c9s5c Ac3sQhQc 6s4cTd6d",
      Solver.process("omaha-holdem 3d6hAdJsTs 6s4cTd6d Ac3sQhQc 3h7c9s5c 4hQd7h8h"));
  }

  @Test
  public void test_omaha_holdem_7548_5c6s9hAdTc_7sJc2sKh_4s9dQs8h_2cAs6dJd_5d5sKs3s_9cAhTh8d_Qc4h9sJs_3cJh3d8s_2dKd8c7h_Qd3h6h7c() {
    assertEquals(
      "7sJc2sKh 3cJh3d8s Qd3h6h7c 4s9dQs8h=Qc4h9sJs 2cAs6dJd 9cAhTh8d 5d5sKs3s 2dKd8c7h",
      Solver.process("omaha-holdem 5c6s9hAdTc 7sJc2sKh 4s9dQs8h 2cAs6dJd 5d5sKs3s 9cAhTh8d Qc4h9sJs 3cJh3d8s 2dKd8c7h Qd3h6h7c"));
  }

  @Test
  public void test_omaha_holdem_7549_6h6sJhKdTh_As6d8d8c_2d4d2c3d_AhTs5d2s_5h9c7dJd_8h5sJc2h() {
    assertEquals(
      "2d4d2c3d AhTs5d2s 5h9c7dJd As6d8d8c 8h5sJc2h",
      Solver.process("omaha-holdem 6h6sJhKdTh As6d8d8c 2d4d2c3d AhTs5d2s 5h9c7dJd 8h5sJc2h"));
  }

  @Test
  public void test_omaha_holdem_7550_5s7c8c9hJd_8s4dQcJh_5cKsJc3s_Qd3c6s2s_8hTc3d7h_9s2dKcAh() {
    assertEquals(
      "Qd3c6s2s 9s2dKcAh 5cKsJc3s 8s4dQcJh 8hTc3d7h",
      Solver.process("omaha-holdem 5s7c8c9hJd 8s4dQcJh 5cKsJc3s Qd3c6s2s 8hTc3d7h 9s2dKcAh"));
  }

  @Test
  public void test_omaha_holdem_7551_2c4s6c7sAd_6d3d9cQd_KhQhAhKc_5h9d8h5s() {
    assertEquals(
      "6d3d9cQd KhQhAhKc 5h9d8h5s",
      Solver.process("omaha-holdem 2c4s6c7sAd 6d3d9cQd KhQhAhKc 5h9d8h5s"));
  }

  @Test
  public void test_omaha_holdem_7552_4h7dAcAhKc_Qd4s9c6d_6s6h3dJc_9h2hJh5h_Qh7c8d5s_5c5dKs4c_As7s3s9s_TdJs7hTh() {
    assertEquals(
      "9h2hJh5h Qd4s9c6d 6s6h3dJc Qh7c8d5s TdJs7hTh 5c5dKs4c As7s3s9s",
      Solver.process("omaha-holdem 4h7dAcAhKc Qd4s9c6d 6s6h3dJc 9h2hJh5h Qh7c8d5s 5c5dKs4c As7s3s9s TdJs7hTh"));
  }

  @Test
  public void test_omaha_holdem_7553_3c4s6h7hTc_8s4h9dAd_9cKc5dQs_8hKs4cJh_5h8cJsTh_5s4d6cAs_Jd2s7cKh_2h6dKdTd() {
    assertEquals(
      "9cKc5dQs 8hKs4cJh Jd2s7cKh 2h6dKdTd 5s4d6cAs 5h8cJsTh 8s4h9dAd",
      Solver.process("omaha-holdem 3c4s6h7hTc 8s4h9dAd 9cKc5dQs 8hKs4cJh 5h8cJsTh 5s4d6cAs Jd2s7cKh 2h6dKdTd"));
  }

  @Test
  public void test_omaha_holdem_7554_3h4cJdJhKd_Ah3dJs6d_TsQc2hKc_QdTcQh5c_9d5sKs7h() {
    assertEquals(
      "QdTcQh5c 9d5sKs7h TsQc2hKc Ah3dJs6d",
      Solver.process("omaha-holdem 3h4cJdJhKd Ah3dJs6d TsQc2hKc QdTcQh5c 9d5sKs7h"));
  }

  @Test
  public void test_omaha_holdem_7555_3c5d6hKcKs_Ts2c3h4s_4dTdQd9d_5sJs4h6s() {
    assertEquals(
      "4dTdQd9d 5sJs4h6s Ts2c3h4s",
      Solver.process("omaha-holdem 3c5d6hKcKs Ts2c3h4s 4dTdQd9d 5sJs4h6s"));
  }

  @Test
  public void test_omaha_holdem_7556_2h4d6s7d8s_JhKs6hAd_5c3c3s4c_8dAh3d2d_ThQc4h9c_3hJd2c9s_5sAs7cQs() {
    assertEquals(
      "3hJd2c9s JhKs6hAd 8dAh3d2d 5c3c3s4c=5sAs7cQs ThQc4h9c",
      Solver.process("omaha-holdem 2h4d6s7d8s JhKs6hAd 5c3c3s4c 8dAh3d2d ThQc4h9c 3hJd2c9s 5sAs7cQs"));
  }

  @Test
  public void test_omaha_holdem_7557_3h4c7sKdTs_5cJhTc6h_2h9cKs8h_5s6s9h8d() {
    assertEquals(
      "2h9cKs8h 5cJhTc6h=5s6s9h8d",
      Solver.process("omaha-holdem 3h4c7sKdTs 5cJhTc6h 2h9cKs8h 5s6s9h8d"));
  }

  @Test
  public void test_omaha_holdem_7558_6d7hKdQdQh_QsKh4h3c_7d4s9c4d_2d2s8h7c() {
    assertEquals(
      "2d2s8h7c 7d4s9c4d QsKh4h3c",
      Solver.process("omaha-holdem 6d7hKdQdQh QsKh4h3c 7d4s9c4d 2d2s8h7c"));
  }

  @Test
  public void test_omaha_holdem_7559_5c6sKsQcQh_9hJd7s8c_7d8s2h3d_TcAhKhTd() {
    assertEquals(
      "7d8s2h3d 9hJd7s8c TcAhKhTd",
      Solver.process("omaha-holdem 5c6sKsQcQh 9hJd7s8c 7d8s2h3d TcAhKhTd"));
  }

  @Test
  public void test_omaha_holdem_7560_3h6h7sAsTc_2c3cJh9s_9d6sKs7h_9hQs8s5c_Jc4hQdJd_6d9c7d8c_5s8d4s2s_Ad4dJs8h() {
    assertEquals(
      "2c3cJh9s Jc4hQdJd Ad4dJs8h 9d6sKs7h 5s8d4s2s 6d9c7d8c=9hQs8s5c",
      Solver.process("omaha-holdem 3h6h7sAsTc 2c3cJh9s 9d6sKs7h 9hQs8s5c Jc4hQdJd 6d9c7d8c 5s8d4s2s Ad4dJs8h"));
  }

  @Test
  public void test_omaha_holdem_7561_4d4s7dJcJd_AhAcQhQs_Qd8sJs9d_2c3cTs8c_5hTh6h2h_2dKd9c3s_5d6cKs7s_4c7c7hKh_Jh3d9sQc_As2sAd8d() {
    assertEquals(
      "5hTh6h2h 2c3cTs8c 5d6cKs7s AhAcQhQs Jh3d9sQc Qd8sJs9d 2dKd9c3s As2sAd8d 4c7c7hKh",
      Solver.process("omaha-holdem 4d4s7dJcJd AhAcQhQs Qd8sJs9d 2c3cTs8c 5hTh6h2h 2dKd9c3s 5d6cKs7s 4c7c7hKh Jh3d9sQc As2sAd8d"));
  }

  @Test
  public void test_omaha_holdem_7562_3s5c7dJdQc_8c2h2d9h_Qd9c9d2s() {
    assertEquals(
      "8c2h2d9h Qd9c9d2s",
      Solver.process("omaha-holdem 3s5c7dJdQc 8c2h2d9h Qd9c9d2s"));
  }

  @Test
  public void test_omaha_holdem_7563_6c9hAdJdKs_3d4cTd2h_4d6s2dTc_6hJc8cQd_4h3s5c5s() {
    assertEquals(
      "3d4cTd2h 4h3s5c5s 4d6s2dTc 6hJc8cQd",
      Solver.process("omaha-holdem 6c9hAdJdKs 3d4cTd2h 4d6s2dTc 6hJc8cQd 4h3s5c5s"));
  }

  @Test
  public void test_omaha_holdem_7564_2s3d3s7dAc_5hAh5dKc_Th7c3h4d_Kd6cJs8d() {
    assertEquals(
      "Kd6cJs8d 5hAh5dKc Th7c3h4d",
      Solver.process("omaha-holdem 2s3d3s7dAc 5hAh5dKc Th7c3h4d Kd6cJs8d"));
  }

  @Test
  public void test_omaha_holdem_7565_2d6d7h9dKs_2cThJs6h_3d4d5hKd_Ts5sQd8h_Ac3h5cTc_2s4s6c8s_QcKc4h9c_QhAsKhJh() {
    assertEquals(
      "Ac3h5cTc QhAsKhJh 2cThJs6h=2s4s6c8s QcKc4h9c Ts5sQd8h 3d4d5hKd",
      Solver.process("omaha-holdem 2d6d7h9dKs 2cThJs6h 3d4d5hKd Ts5sQd8h Ac3h5cTc 2s4s6c8s QcKc4h9c QhAsKhJh"));
  }

  @Test
  public void test_omaha_holdem_7566_5d7d8h9dAc_9s3c6h2c_7cQh4h7s_Kd6s9h4s_AdJd3d2h_8d6c5cTh_Qc9cTsJs() {
    assertEquals(
      "7cQh4h7s 9s3c6h2c=Kd6s9h4s 8d6c5cTh Qc9cTsJs AdJd3d2h",
      Solver.process("omaha-holdem 5d7d8h9dAc 9s3c6h2c 7cQh4h7s Kd6s9h4s AdJd3d2h 8d6c5cTh Qc9cTsJs"));
  }

  @Test
  public void test_omaha_holdem_7567_9hAhJdKcKh_Tc4s6sQs_8sTh5h3h() {
    assertEquals(
      "Tc4s6sQs 8sTh5h3h",
      Solver.process("omaha-holdem 9hAhJdKcKh Tc4s6sQs 8sTh5h3h"));
  }

  @Test
  public void test_omaha_holdem_7568_6c7sAcAsQh_KsKh2sAd_9dJh4d3c() {
    assertEquals(
      "9dJh4d3c KsKh2sAd",
      Solver.process("omaha-holdem 6c7sAcAsQh KsKh2sAd 9dJh4d3c"));
  }

  @Test
  public void test_omaha_holdem_7569_2h2s3s8cAh_7hQd3dTs_Ks8d4dAs_9cQsJdKd_4c9s4s6s_Ac6h9h3h_7d7s8s5d_9d6d7cTd_6c5sJh5h() {
    assertEquals(
      "9d6d7cTd 9cQsJdKd 7hQd3dTs 4c9s4s6s 6c5sJh5h 7d7s8s5d Ac6h9h3h Ks8d4dAs",
      Solver.process("omaha-holdem 2h2s3s8cAh 7hQd3dTs Ks8d4dAs 9cQsJdKd 4c9s4s6s Ac6h9h3h 7d7s8s5d 9d6d7cTd 6c5sJh5h"));
  }

  @Test
  public void test_omaha_holdem_7570_5h7d8h9sAc_4sAd2sQd_7s6d8s7h_7c5s6h2c_2h4d9hJd_8d3c6sJs_TcQsKs5c_AhTd5d2d() {
    assertEquals(
      "TcQsKs5c 2h4d9hJd 4sAd2sQd AhTd5d2d 7c5s6h2c=7s6d8s7h=8d3c6sJs",
      Solver.process("omaha-holdem 5h7d8h9sAc 4sAd2sQd 7s6d8s7h 7c5s6h2c 2h4d9hJd 8d3c6sJs TcQsKs5c AhTd5d2d"));
  }

  @Test
  public void test_omaha_holdem_7571_5c6c8c8d8s_QsKh9c7h_Tc2d4sAd_3dKsTs7s_Kc3sAs8h_5d7d9s3c_Td6dJs9d_Jh6h9hTh_QdJd2c4d_AcJcAh2s() {
    assertEquals(
      "Jh6h9hTh=Td6dJs9d QdJd2c4d 3dKsTs7s Tc2d4sAd 5d7d9s3c=QsKh9c7h AcJcAh2s Kc3sAs8h",
      Solver.process("omaha-holdem 5c6c8c8d8s QsKh9c7h Tc2d4sAd 3dKsTs7s Kc3sAs8h 5d7d9s3c Td6dJs9d Jh6h9hTh QdJd2c4d AcJcAh2s"));
  }

  @Test
  public void test_omaha_holdem_7572_4c8c8sQdTd_3c2h8h5c_4d3h6d4s_QhAcJh6s_Ks9dJdTh_Jc6h4h5d() {
    assertEquals(
      "Jc6h4h5d QhAcJh6s 3c2h8h5c Ks9dJdTh 4d3h6d4s",
      Solver.process("omaha-holdem 4c8c8sQdTd 3c2h8h5c 4d3h6d4s QhAcJh6s Ks9dJdTh Jc6h4h5d"));
  }

  @Test
  public void test_omaha_holdem_7573_2s7s9dKhQh_2hQsTsAc_6dKs2dJd_Ad8s7d9h_QdJc6h3h_2cQc6s4c_KdJhKc3d_3c5h9c5d_3sAs7cTd_6c8c4hAh() {
    assertEquals(
      "6c8c4hAh 3sAs7cTd 3c5h9c5d QdJc6h3h Ad8s7d9h 2cQc6s4c=2hQsTsAc 6dKs2dJd KdJhKc3d",
      Solver.process("omaha-holdem 2s7s9dKhQh 2hQsTsAc 6dKs2dJd Ad8s7d9h QdJc6h3h 2cQc6s4c KdJhKc3d 3c5h9c5d 3sAs7cTd 6c8c4hAh"));
  }

  @Test
  public void test_omaha_holdem_7574_4h6dAdQcTs_Kd6cTdAs_Ks3h5c9c_8sJdJc7s() {
    assertEquals(
      "Ks3h5c9c 8sJdJc7s Kd6cTdAs",
      Solver.process("omaha-holdem 4h6dAdQcTs Kd6cTdAs Ks3h5c9c 8sJdJc7s"));
  }

  @Test
  public void test_omaha_holdem_7575_4s7h7s8sAc_AdQs5sKs_9h8dKdTh_2s2c8c8h_As6dJdJc_Kh4dAh7d() {
    assertEquals(
      "9h8dKdTh As6dJdJc AdQs5sKs Kh4dAh7d 2s2c8c8h",
      Solver.process("omaha-holdem 4s7h7s8sAc AdQs5sKs 9h8dKdTh 2s2c8c8h As6dJdJc Kh4dAh7d"));
  }

  @Test
  public void test_omaha_holdem_7576_7s8cAcKhKs_8h2dJhQd_QcKc3cJs_3sJd3h9h_6sTc8d9c_Ts2h2sTd_4c6dQh4s_7c4d9s9d() {
    assertEquals(
      "3sJd3h9h 4c6dQh4s 6sTc8d9c 8h2dJhQd 7c4d9s9d Ts2h2sTd QcKc3cJs",
      Solver.process("omaha-holdem 7s8cAcKhKs 8h2dJhQd QcKc3cJs 3sJd3h9h 6sTc8d9c Ts2h2sTd 4c6dQh4s 7c4d9s9d"));
  }

  @Test
  public void test_omaha_holdem_7577_7c9sJsQdQs_9hTdAsTc_6h2hQh2s_3dJd5c3c_8hJh7d6d() {
    assertEquals(
      "9hTdAsTc 3dJd5c3c 8hJh7d6d 6h2hQh2s",
      Solver.process("omaha-holdem 7c9sJsQdQs 9hTdAsTc 6h2hQh2s 3dJd5c3c 8hJh7d6d"));
  }

  @Test
  public void test_omaha_holdem_7578_2d3h6dAdJs_9h8dKcTs_6c5d8c7h_5h4c9sKh_6hAh3d5s_AcJcTh9d_JhAsQd8h() {
    assertEquals(
      "9h8dKcTs 6c5d8c7h 6hAh3d5s AcJcTh9d=JhAsQd8h 5h4c9sKh",
      Solver.process("omaha-holdem 2d3h6dAdJs 9h8dKcTs 6c5d8c7h 5h4c9sKh 6hAh3d5s AcJcTh9d JhAsQd8h"));
  }

  @Test
  public void test_omaha_holdem_7579_5c6c6sKhQs_2s2c7h3d_3s4s7sQc_Jc9hQdKd_KcAh5d8d_8s7dKs9c() {
    assertEquals(
      "2s2c7h3d 3s4s7sQc 8s7dKs9c KcAh5d8d Jc9hQdKd",
      Solver.process("omaha-holdem 5c6c6sKhQs 2s2c7h3d 3s4s7sQc Jc9hQdKd KcAh5d8d 8s7dKs9c"));
  }

  @Test
  public void test_omaha_holdem_7580_3c4c6c6sQc_JhJs7s8d_3dKs2h7h_Th5s2dTc_5d2cKh9c_Qs4d2s8s_3s7dAc8c_4h7c4s5c() {
    assertEquals(
      "3dKs2h7h JhJs7s8d Qs4d2s8s Th5s2dTc 5d2cKh9c 3s7dAc8c 4h7c4s5c",
      Solver.process("omaha-holdem 3c4c6c6sQc JhJs7s8d 3dKs2h7h Th5s2dTc 5d2cKh9c Qs4d2s8s 3s7dAc8c 4h7c4s5c"));
  }

  @Test
  public void test_omaha_holdem_7581_7d8s9cAcTd_8c8d3d4s_Kc4hQsTs_Ad2dAsJd_Tc3cJs5c_KsJhTh5d_2c6s4d3h() {
    assertEquals(
      "2c6s4d3h Kc4hQsTs 8c8d3d4s Ad2dAsJd KsJhTh5d=Tc3cJs5c",
      Solver.process("omaha-holdem 7d8s9cAcTd 8c8d3d4s Kc4hQsTs Ad2dAsJd Tc3cJs5c KsJhTh5d 2c6s4d3h"));
  }

  @Test
  public void test_omaha_holdem_7582_6d9cJcJhTc_4dQd6c5c_TdJsKd8s_7dKh6sQs_5d2sAs3s_Kc8d7s9d() {
    assertEquals(
      "5d2sAs3s Kc8d7s9d 7dKh6sQs 4dQd6c5c TdJsKd8s",
      Solver.process("omaha-holdem 6d9cJcJhTc 4dQd6c5c TdJsKd8s 7dKh6sQs 5d2sAs3s Kc8d7s9d"));
  }

  @Test
  public void test_omaha_holdem_7583_3d4s6d6hAh_KdTsQdTh_3s2hTdKc_4dQc8h7h_5c3c8d4h() {
    assertEquals(
      "3s2hTdKc 5c3c8d4h 4dQc8h7h KdTsQdTh",
      Solver.process("omaha-holdem 3d4s6d6hAh KdTsQdTh 3s2hTdKc 4dQc8h7h 5c3c8d4h"));
  }

  @Test
  public void test_omaha_holdem_7584_6h6s9sJdTc_8sQc2hAd_4dKd7h7s() {
    assertEquals(
      "4dKd7h7s 8sQc2hAd",
      Solver.process("omaha-holdem 6h6s9sJdTc 8sQc2hAd 4dKd7h7s"));
  }

  @Test
  public void test_omaha_holdem_7585_3h5s6d9dTd_Qs9sAsAh_8sJs3dJh_9hJc4s6c_Ad2hTc6h_5h7c6s4c_3sAc3c7h() {
    assertEquals(
      "8sJs3dJh Qs9sAsAh 9hJc4s6c Ad2hTc6h 3sAc3c7h 5h7c6s4c",
      Solver.process("omaha-holdem 3h5s6d9dTd Qs9sAsAh 8sJs3dJh 9hJc4s6c Ad2hTc6h 5h7c6s4c 3sAc3c7h"));
  }

  @Test
  public void test_omaha_holdem_7586_3c5d8hJcQc_Ts4hAh4d_4c9dTc2s() {
    assertEquals(
      "Ts4hAh4d 4c9dTc2s",
      Solver.process("omaha-holdem 3c5d8hJcQc Ts4hAh4d 4c9dTc2s"));
  }

  @Test
  public void test_omaha_holdem_7587_5s7h7sKhTc_As3s4s7c_9dAhJhQs_JsAcThQh_4hKs2s5d_3d6c6hTd_8h9hQd3c_Qc5c5h8d_9c2h4c6d() {
    assertEquals(
      "9c2h4c6d 8h9hQd3c 9dAhJhQs 3d6c6hTd JsAcThQh 4hKs2s5d As3s4s7c Qc5c5h8d",
      Solver.process("omaha-holdem 5s7h7sKhTc As3s4s7c 9dAhJhQs JsAcThQh 4hKs2s5d 3d6c6hTd 8h9hQd3c Qc5c5h8d 9c2h4c6d"));
  }

  @Test
  public void test_omaha_holdem_7588_2h3h8hJdTc_5c2d6cKc_2s9d4s2c_8s8dJsJc_4dQsAh9h_Qc3sJh7s_4h6sKhQh_QdKd8cAc_7hTd6dAs() {
    assertEquals(
      "5c2d6cKc QdKd8cAc 7hTd6dAs Qc3sJh7s 2s9d4s2c 8s8dJsJc 4h6sKhQh 4dQsAh9h",
      Solver.process("omaha-holdem 2h3h8hJdTc 5c2d6cKc 2s9d4s2c 8s8dJsJc 4dQsAh9h Qc3sJh7s 4h6sKhQh QdKd8cAc 7hTd6dAs"));
  }

  @Test
  public void test_omaha_holdem_7589_2h8dKcQcQd_3s9d5c4c_9h4sAd5s_6d3h8h2d_9sTc9cAh_KsTsQs7c_JsTh3d3c_8c6hJc6s() {
    assertEquals(
      "3s9d5c4c 9h4sAd5s JsTh3d3c 6d3h8h2d 8c6hJc6s 9sTc9cAh KsTsQs7c",
      Solver.process("omaha-holdem 2h8dKcQcQd 3s9d5c4c 9h4sAd5s 6d3h8h2d 9sTc9cAh KsTsQs7c JsTh3d3c 8c6hJc6s"));
  }

  @Test
  public void test_omaha_holdem_7590_9sAhJcJhTc_6d5h9h2h_Qc2s5d5s_As4h3dJs() {
    assertEquals(
      "Qc2s5d5s 6d5h9h2h As4h3dJs",
      Solver.process("omaha-holdem 9sAhJcJhTc 6d5h9h2h Qc2s5d5s As4h3dJs"));
  }

  @Test
  public void test_omaha_holdem_7591_3d5c7d8hKh_9s2s9h6d_8dTh7c6c() {
    assertEquals(
      "8dTh7c6c 9s2s9h6d",
      Solver.process("omaha-holdem 3d5c7d8hKh 9s2s9h6d 8dTh7c6c"));
  }

  @Test
  public void test_omaha_holdem_7592_4c7sJcJdQh_2cKhTd6h_9h6s8hAd_2d2s5d9d_Js8s4dTh_Ac5c4sTs_Kd9c3h6d_Kc8c7cAs_QdJh2h6c() {
    assertEquals(
      "Kd9c3h6d 2cKhTd6h 9h6s8hAd 2d2s5d9d Ac5c4sTs Kc8c7cAs Js8s4dTh QdJh2h6c",
      Solver.process("omaha-holdem 4c7sJcJdQh 2cKhTd6h 9h6s8hAd 2d2s5d9d Js8s4dTh Ac5c4sTs Kd9c3h6d Kc8c7cAs QdJh2h6c"));
  }

  @Test
  public void test_omaha_holdem_7593_2c4dJhTcTd_7sKdQh3s_Kc8sAs6c_Qd9s6d5s_4h9c5h8d_3cThKs8h_7dJc3d9h() {
    assertEquals(
      "Qd9s6d5s 7sKdQh3s Kc8sAs6c 4h9c5h8d 7dJc3d9h 3cThKs8h",
      Solver.process("omaha-holdem 2c4dJhTcTd 7sKdQh3s Kc8sAs6c Qd9s6d5s 4h9c5h8d 3cThKs8h 7dJc3d9h"));
  }

  @Test
  public void test_omaha_holdem_7594_3c5sKsQdTc_3dKcAs6c_7d9s8s6h_Qh2h4s9d_4d6s8c7s_3h2dAhTd_Js9hTsTh_Kd2c3sJh_Ac4h4c7c_Qs8d9cQc() {
    assertEquals(
      "4d6s8c7s 7d9s8s6h Ac4h4c7c Qh2h4s9d 3h2dAhTd 3dKcAs6c=Kd2c3sJh Qs8d9cQc Js9hTsTh",
      Solver.process("omaha-holdem 3c5sKsQdTc 3dKcAs6c 7d9s8s6h Qh2h4s9d 4d6s8c7s 3h2dAhTd Js9hTsTh Kd2c3sJh Ac4h4c7c Qs8d9cQc"));
  }

  @Test
  public void test_omaha_holdem_7595_2s3s7c9sJh_5h3hAhKh_Qh6dAcJd_5c3c2c8c() {
    assertEquals(
      "5h3hAhKh Qh6dAcJd 5c3c2c8c",
      Solver.process("omaha-holdem 2s3s7c9sJh 5h3hAhKh Qh6dAcJd 5c3c2c8c"));
  }

  @Test
  public void test_omaha_holdem_7596_3h7c7hAdQd_Kh9hKs8s_Jh5dJc8h_4sAcJdQh_Kc9sJs6s_Qc9c5h4c() {
    assertEquals(
      "Kc9sJs6s Jh5dJc8h Qc9c5h4c Kh9hKs8s 4sAcJdQh",
      Solver.process("omaha-holdem 3h7c7hAdQd Kh9hKs8s Jh5dJc8h 4sAcJdQh Kc9sJs6s Qc9c5h4c"));
  }

  @Test
  public void test_omaha_holdem_7597_3d6hAcKhQh_6cTsKs8h_JcAd3c7d_6s5dTc3s_2c6d4d2h_Jh7s7hQc_2s5cQd5h_9cKd9h4s_8c2dAsQs_9s8dAhKc() {
    assertEquals(
      "2c6d4d2h 2s5cQd5h 9cKd9h4s 6s5dTc3s 6cTsKs8h JcAd3c7d 8c2dAsQs 9s8dAhKc Jh7s7hQc",
      Solver.process("omaha-holdem 3d6hAcKhQh 6cTsKs8h JcAd3c7d 6s5dTc3s 2c6d4d2h Jh7s7hQc 2s5cQd5h 9cKd9h4s 8c2dAsQs 9s8dAhKc"));
  }

  @Test
  public void test_omaha_holdem_7598_3d7h8c9hTs_QhQsKc4d_Kd5h3hJs_9c5d2dJd_4hTd4sTc_Ah8d5s7s() {
    assertEquals(
      "Kd5h3hJs QhQsKc4d Ah8d5s7s 4hTd4sTc 9c5d2dJd",
      Solver.process("omaha-holdem 3d7h8c9hTs QhQsKc4d Kd5h3hJs 9c5d2dJd 4hTd4sTc Ah8d5s7s"));
  }

  @Test
  public void test_omaha_holdem_7599_2c3d5c7h8d_Qh5h6cAh_4cJc7s5d_9c3c9hAd_6d4dKhTh_Ts4sJs6h_AcKd7dJh_Ks8c4h6s_3s5s8s7c() {
    assertEquals(
      "Qh5h6cAh AcKd7dJh 9c3c9hAd 4cJc7s5d 3s5s8s7c 6d4dKhTh=Ks8c4h6s=Ts4sJs6h",
      Solver.process("omaha-holdem 2c3d5c7h8d Qh5h6cAh 4cJc7s5d 9c3c9hAd 6d4dKhTh Ts4sJs6h AcKd7dJh Ks8c4h6s 3s5s8s7c"));
  }

  @Test
  public void test_omaha_holdem_7600_6sAcAsJhKd_AdQd8d4c_8s3h6hTd() {
    assertEquals(
      "8s3h6hTd AdQd8d4c",
      Solver.process("omaha-holdem 6sAcAsJhKd AdQd8d4c 8s3h6hTd"));
  }

  @Test
  public void test_omaha_holdem_7601_2c2h3hTcTs_6cJc9d9s_9h3s5c5h_6h5dKh6d_QdJsAc3d() {
    assertEquals(
      "QdJsAc3d 9h3s5c5h 6h5dKh6d 6cJc9d9s",
      Solver.process("omaha-holdem 2c2h3hTcTs 6cJc9d9s 9h3s5c5h 6h5dKh6d QdJsAc3d"));
  }

  @Test
  public void test_omaha_holdem_7602_4s5d5hAsJc_7hJd8h4c_QsAhJsJh_Td3s6c8s_2s8c7c4h_Tc9cAdKc_4d9sTsTh_2d9hAc5s_6h6d6s3d() {
    assertEquals(
      "Td3s6c8s 2s8c7c4h 6h6d6s3d 4d9sTsTh 7hJd8h4c Tc9cAdKc 2d9hAc5s QsAhJsJh",
      Solver.process("omaha-holdem 4s5d5hAsJc 7hJd8h4c QsAhJsJh Td3s6c8s 2s8c7c4h Tc9cAdKc 4d9sTsTh 2d9hAc5s 6h6d6s3d"));
  }

  @Test
  public void test_omaha_holdem_7603_7h8h9sKcQh_5d8s8d2d_9h4s8c7c_TsTd4cAs_Js3sQd7s_6s5h3d2s_Kh2c3hTh_Ah5s2hJd() {
    assertEquals(
      "TsTd4cAs 9h4s8c7c Js3sQd7s 5d8s8d2d 6s5h3d2s Kh2c3hTh Ah5s2hJd",
      Solver.process("omaha-holdem 7h8h9sKcQh 5d8s8d2d 9h4s8c7c TsTd4cAs Js3sQd7s 6s5h3d2s Kh2c3hTh Ah5s2hJd"));
  }

  @Test
  public void test_omaha_holdem_7604_3h6c8hAcKd_5d6dAhTs_9d7sJhQs_3d8c7c5c() {
    assertEquals(
      "9d7sJhQs 3d8c7c5c 5d6dAhTs",
      Solver.process("omaha-holdem 3h6c8hAcKd 5d6dAhTs 9d7sJhQs 3d8c7c5c"));
  }

  @Test
  public void test_omaha_holdem_7605_3d3h3s9d9h_Kh2h7s9c_8c9s7dJc_8s5d8d2s_Jh2c5s2d() {
    assertEquals(
      "8c9s7dJc Kh2h7s9c Jh2c5s2d 8s5d8d2s",
      Solver.process("omaha-holdem 3d3h3s9d9h Kh2h7s9c 8c9s7dJc 8s5d8d2s Jh2c5s2d"));
  }

  @Test
  public void test_omaha_holdem_7606_2c8hJdKhQc_QsAdQh4d_As5d3d6c_9h4hAh6h_JsJhTd5h_9d9c7d2h_3s2d4sKc_9s7c6s4c_5s8d2s8c_KdJc3cTc() {
    assertEquals(
      "9s7c6s4c As5d3d6c 9h4hAh6h 9d9c7d2h 3s2d4sKc KdJc3cTc 5s8d2s8c JsJhTd5h QsAdQh4d",
      Solver.process("omaha-holdem 2c8hJdKhQc QsAdQh4d As5d3d6c 9h4hAh6h JsJhTd5h 9d9c7d2h 3s2d4sKc 9s7c6s4c 5s8d2s8c KdJc3cTc"));
  }

  @Test
  public void test_omaha_holdem_7607_7cAsJdJsQc_3sAcTc3h_7sTs9cQs_5d2cTd2d_5s4dJhAd_8h9d7dKd_Th8s2h6c_4c9hKc3c() {
    assertEquals(
      "Th8s2h6c 4c9hKc3c 5d2cTd2d 8h9d7dKd 7sTs9cQs 3sAcTc3h 5s4dJhAd",
      Solver.process("omaha-holdem 7cAsJdJsQc 3sAcTc3h 7sTs9cQs 5d2cTd2d 5s4dJhAd 8h9d7dKd Th8s2h6c 4c9hKc3c"));
  }

  @Test
  public void test_omaha_holdem_7608_7s8sAsQdTh_4dKc8d6d_2dTcJdJh_8c2h4c2c() {
    assertEquals(
      "8c2h4c2c 4dKc8d6d 2dTcJdJh",
      Solver.process("omaha-holdem 7s8sAsQdTh 4dKc8d6d 2dTcJdJh 8c2h4c2c"));
  }

  @Test
  public void test_omaha_holdem_7609_3c4d6cKcQd_5c3dAs2c_9d6s8s8d_4c4s6d7c_3sJd8hQc_JcThTc7h_KhJsJh6h_5d7s9s4h() {
    assertEquals(
      "9d6s8s8d 3sJd8hQc KhJsJh6h 5d7s9s4h 5c3dAs2c 4c4s6d7c JcThTc7h",
      Solver.process("omaha-holdem 3c4d6cKcQd 5c3dAs2c 9d6s8s8d 4c4s6d7c 3sJd8hQc JcThTc7h KhJsJh6h 5d7s9s4h"));
  }

  @Test
  public void test_omaha_holdem_7610_4c9c9sAcJc_QcTsQh2h_4sKd5sJh_JdKs6c6s_As5c8hQd_8s5h3h7d() {
    assertEquals(
      "8s5h3h7d 4sKd5sJh=JdKs6c6s QcTsQh2h As5c8hQd",
      Solver.process("omaha-holdem 4c9c9sAcJc QcTsQh2h 4sKd5sJh JdKs6c6s As5c8hQd 8s5h3h7d"));
  }

  @Test
  public void test_omaha_holdem_7611_3h9cAhKcKh_As7c5h8c_4h2sJh5s_7s6c2d2h_4d6s9d4s_Th7d7hQh_5cTcAd2c_3dJdQsAc() {
    assertEquals(
      "7s6c2d2h 4d6s9d4s As7c5h8c 5cTcAd2c 3dJdQsAc 4h2sJh5s Th7d7hQh",
      Solver.process("omaha-holdem 3h9cAhKcKh As7c5h8c 4h2sJh5s 7s6c2d2h 4d6s9d4s Th7d7hQh 5cTcAd2c 3dJdQsAc"));
  }

  @Test
  public void test_omaha_holdem_7612_4d4h8cAhQh_5hAc5dKs_5cQdTc9h() {
    assertEquals(
      "5cQdTc9h 5hAc5dKs",
      Solver.process("omaha-holdem 4d4h8cAhQh 5hAc5dKs 5cQdTc9h"));
  }

  @Test
  public void test_omaha_holdem_7613_3h5s8hJdKs_Th2h7s6d_5hKc7c8s_7hJhAhJs_9cAcTc6h_9h8d4cJc_TsAs3c8c_Qc2d2c9d() {
    assertEquals(
      "Th2h7s6d 9cAcTc6h Qc2d2c9d TsAs3c8c 9h8d4cJc 5hKc7c8s 7hJhAhJs",
      Solver.process("omaha-holdem 3h5s8hJdKs Th2h7s6d 5hKc7c8s 7hJhAhJs 9cAcTc6h 9h8d4cJc TsAs3c8c Qc2d2c9d"));
  }

  @Test
  public void test_omaha_holdem_7614_2s8hAsQsTs_8s5c4c8d_TcKd6c3s_5h4h5s2h_3c4s4dJs_9cKhTh2d_9s6sJd3h() {
    assertEquals(
      "5h4h5s2h TcKd6c3s 9cKhTh2d 8s5c4c8d 9s6sJd3h 3c4s4dJs",
      Solver.process("omaha-holdem 2s8hAsQsTs 8s5c4c8d TcKd6c3s 5h4h5s2h 3c4s4dJs 9cKhTh2d 9s6sJd3h"));
  }

  @Test
  public void test_omaha_holdem_7615_6h8cAsJsKh_6c2s4h3h_KcAcTc2d_7cTs9c5c_Ks8sJdQh_8dTd5d7h_QsKd3cJc_5s3d6s8h_9hAdTh3s_4d7d9dQc() {
    assertEquals(
      "7cTs9c5c 4d7d9dQc 6c2s4h3h 8dTd5d7h 9hAdTh3s 5s3d6s8h Ks8sJdQh=QsKd3cJc KcAcTc2d",
      Solver.process("omaha-holdem 6h8cAsJsKh 6c2s4h3h KcAcTc2d 7cTs9c5c Ks8sJdQh 8dTd5d7h QsKd3cJc 5s3d6s8h 9hAdTh3s 4d7d9dQc"));
  }

  @Test
  public void test_omaha_holdem_7616_7h8sAdThTs_TcTd4s2d_Kc5cQs6s_8c7c3h3d_6dAc2h5s_2sJsKdQd_Ah4h8h6c_8d9d5d3s_9c2c9h7s() {
    assertEquals(
      "2sJsKdQd=Kc5cQs6s 8c7c3h3d 8d9d5d3s 9c2c9h7s 6dAc2h5s Ah4h8h6c TcTd4s2d",
      Solver.process("omaha-holdem 7h8sAdThTs TcTd4s2d Kc5cQs6s 8c7c3h3d 6dAc2h5s 2sJsKdQd Ah4h8h6c 8d9d5d3s 9c2c9h7s"));
  }

  @Test
  public void test_omaha_holdem_7617_3s6h7c8sAd_Ah4c5c3d_Jd8hKh2d_Kd5d4s9c_9s8c6dKs_Qc6s4hJs_QdJh7h2s_3hThJc4d_KcAsQh2c() {
    assertEquals(
      "3hThJc4d Qc6s4hJs QdJh7h2s Jd8hKh2d KcAsQh2c 9s8c6dKs Ah4c5c3d Kd5d4s9c",
      Solver.process("omaha-holdem 3s6h7c8sAd Ah4c5c3d Jd8hKh2d Kd5d4s9c 9s8c6dKs Qc6s4hJs QdJh7h2s 3hThJc4d KcAsQh2c"));
  }

  @Test
  public void test_omaha_holdem_7618_3d3sJhKdTh_6hAc9sKh_9c4s6sJs() {
    assertEquals(
      "9c4s6sJs 6hAc9sKh",
      Solver.process("omaha-holdem 3d3sJhKdTh 6hAc9sKh 9c4s6sJs"));
  }

  @Test
  public void test_omaha_holdem_7619_3s6d6sKdQh_4h8d6h6c_7cAh2sAc_9d4cTsJh_2d9sJs3c_7hTh4d4s_Kh3d8h5h_AdQsAs5d() {
    assertEquals(
      "9d4cTsJh 2d9sJs3c 7hTh4d4s Kh3d8h5h 7cAh2sAc=AdQsAs5d 4h8d6h6c",
      Solver.process("omaha-holdem 3s6d6sKdQh 4h8d6h6c 7cAh2sAc 9d4cTsJh 2d9sJs3c 7hTh4d4s Kh3d8h5h AdQsAs5d"));
  }

  @Test
  public void test_omaha_holdem_7620_3c4d5d6dKh_Ts5c9h4h_KcQcThAh_2d7d2c7c_8c3dAs6s_Ks3h8s8h_Qd4cJd4s_KdTd3sAc() {
    assertEquals(
      "KcQcThAh Ts5c9h4h 8c3dAs6s Ks3h8s8h 2d7d2c7c Qd4cJd4s KdTd3sAc",
      Solver.process("omaha-holdem 3c4d5d6dKh Ts5c9h4h KcQcThAh 2d7d2c7c 8c3dAs6s Ks3h8s8h Qd4cJd4s KdTd3sAc"));
  }

  @Test
  public void test_omaha_holdem_7621_7c8hAcKdTh_AdAh8dQs_Kh2s5c9s_Qc5dQd6c_7hQh2c3h() {
    assertEquals(
      "7hQh2c3h Qc5dQd6c Kh2s5c9s AdAh8dQs",
      Solver.process("omaha-holdem 7c8hAcKdTh AdAh8dQs Kh2s5c9s Qc5dQd6c 7hQh2c3h"));
  }

  @Test
  public void test_omaha_holdem_7622_2d3d6s7d8h_Js9hJc6c_7hAs3sKs_QdQs5h9c_8c4s4dJh() {
    assertEquals(
      "8c4s4dJh Js9hJc6c 7hAs3sKs QdQs5h9c",
      Solver.process("omaha-holdem 2d3d6s7d8h Js9hJc6c 7hAs3sKs QdQs5h9c 8c4s4dJh"));
  }

  @Test
  public void test_omaha_holdem_7623_2d6s7cAdAh_7hKsJdQd_4dKhJc3s_6hTh2sQs_3cTc5cKd_3h8hAs4h_9s5h8c2h() {
    assertEquals(
      "3cTc5cKd 4dKhJc3s 9s5h8c2h 6hTh2sQs 7hKsJdQd 3h8hAs4h",
      Solver.process("omaha-holdem 2d6s7cAdAh 7hKsJdQd 4dKhJc3s 6hTh2sQs 3cTc5cKd 3h8hAs4h 9s5h8c2h"));
  }

  @Test
  public void test_omaha_holdem_7624_8h9cAsQcQd_Kc5c4hKs_9h2h5d7c_KhQs5s6d_AhAdAc7s() {
    assertEquals(
      "9h2h5d7c Kc5c4hKs KhQs5s6d AhAdAc7s",
      Solver.process("omaha-holdem 8h9cAsQcQd Kc5c4hKs 9h2h5d7c KhQs5s6d AhAdAc7s"));
  }

  @Test
  public void test_omaha_holdem_7625_6c8s9cKsQs_6s3sThJs_2h7h2d8d_JdAcAh9s_7sTs9dKc_8h5c6hQc_4d2s3d5s_Qh5hQd9h_4c4h7dTc() {
    assertEquals(
      "2h7h2d8d JdAcAh9s 8h5c6hQc Qh5hQd9h 4c4h7dTc 4d2s3d5s 7sTs9dKc 6s3sThJs",
      Solver.process("omaha-holdem 6c8s9cKsQs 6s3sThJs 2h7h2d8d JdAcAh9s 7sTs9dKc 8h5c6hQc 4d2s3d5s Qh5hQd9h 4c4h7dTc"));
  }

  @Test
  public void test_omaha_holdem_7626_7c7s9c9sAs_6dJc6cKd_4d9hKs3h_2sKh3sQc() {
    assertEquals(
      "6dJc6cKd 4d9hKs3h 2sKh3sQc",
      Solver.process("omaha-holdem 7c7s9c9sAs 6dJc6cKd 4d9hKs3h 2sKh3sQc"));
  }

  @Test
  public void test_omaha_holdem_7627_2h3d5s8sJs_Th6cQsQh_6s6h4hAs() {
    assertEquals(
      "Th6cQsQh 6s6h4hAs",
      Solver.process("omaha-holdem 2h3d5s8sJs Th6cQsQh 6s6h4hAs"));
  }

  @Test
  public void test_omaha_holdem_7628_4s7d8d8hKh_Ac4cQd5c_QcKd3c4d() {
    assertEquals(
      "Ac4cQd5c QcKd3c4d",
      Solver.process("omaha-holdem 4s7d8d8hKh Ac4cQd5c QcKd3c4d"));
  }

  @Test
  public void test_omaha_holdem_7629_3d4s8cQhTh_Jc6hTd5c_Ks5h6c5s_JhKd4c7s_Qd8hAc3s_4dQs2cKc() {
    assertEquals(
      "JhKd4c7s Ks5h6c5s Jc6hTd5c 4dQs2cKc Qd8hAc3s",
      Solver.process("omaha-holdem 3d4s8cQhTh Jc6hTd5c Ks5h6c5s JhKd4c7s Qd8hAc3s 4dQs2cKc"));
  }

  @Test
  public void test_omaha_holdem_7630_6c6d7cKhTc_Jc2h5d8s_As6h9cQd_8d7d2dQc_QhJd9hJh_ThAc9s4c() {
    assertEquals(
      "Jc2h5d8s 8d7d2dQc QhJd9hJh As6h9cQd ThAc9s4c",
      Solver.process("omaha-holdem 6c6d7cKhTc Jc2h5d8s As6h9cQd 8d7d2dQc QhJd9hJh ThAc9s4c"));
  }

  @Test
  public void test_omaha_holdem_7631_3d6dAhQcQs_Jd3s2sAs_Tc5h2d7d_4s4cQdKh_9sAd5s9h_5c4d9c8h_Ac6s8dJs_JhJcTsQh() {
    assertEquals(
      "5c4d9c8h Tc5h2d7d 9sAd5s9h Ac6s8dJs=Jd3s2sAs JhJcTsQh 4s4cQdKh",
      Solver.process("omaha-holdem 3d6dAhQcQs Jd3s2sAs Tc5h2d7d 4s4cQdKh 9sAd5s9h 5c4d9c8h Ac6s8dJs JhJcTsQh"));
  }

  @Test
  public void test_omaha_holdem_7632_2h9sAcKdQs_9dKcKh2s_9h4d4hAh_6c8cKs4c_7hAd3sQc() {
    assertEquals(
      "6c8cKs4c 9h4d4hAh 7hAd3sQc 9dKcKh2s",
      Solver.process("omaha-holdem 2h9sAcKdQs 9dKcKh2s 9h4d4hAh 6c8cKs4c 7hAd3sQc"));
  }

  @Test
  public void test_omaha_holdem_7633_7sAsKsTcTs_4h4cKh8h_Jh6s3hJc_QdAh5h2c_Th9hAc8s_8cKd7h5c_TdJs2d3s() {
    assertEquals(
      "Jh6s3hJc 4h4cKh8h=8cKd7h5c QdAh5h2c TdJs2d3s Th9hAc8s",
      Solver.process("omaha-holdem 7sAsKsTcTs 4h4cKh8h Jh6s3hJc QdAh5h2c Th9hAc8s 8cKd7h5c TdJs2d3s"));
  }

  @Test
  public void test_omaha_holdem_7634_3c3h7dKdTc_JcJs6d5h_Ad2d6hQh_5d8dKs4s_Jd2hQsTd_Ac6cKc2s_3s3dAh4h() {
    assertEquals(
      "Ad2d6hQh Jd2hQsTd JcJs6d5h 5d8dKs4s Ac6cKc2s 3s3dAh4h",
      Solver.process("omaha-holdem 3c3h7dKdTc JcJs6d5h Ad2d6hQh 5d8dKs4s Jd2hQsTd Ac6cKc2s 3s3dAh4h"));
  }

  @Test
  public void test_omaha_holdem_7635_8h9dJhKhTd_5s9s4s7s_KsQs6d6h_ThJd8d7c_8cQh2hAh_Kc6cJc7d_Qc5h2c4h() {
    assertEquals(
      "5s9s4s7s=Kc6cJc7d=ThJd8d7c KsQs6d6h Qc5h2c4h 8cQh2hAh",
      Solver.process("omaha-holdem 8h9dJhKhTd 5s9s4s7s KsQs6d6h ThJd8d7c 8cQh2hAh Kc6cJc7d Qc5h2c4h"));
  }

  @Test
  public void test_omaha_holdem_7636_5c9hAsJcQh_TcAd6c3s_Jh5d6s4d_Qs9cQcTs_5hJd9d5s_4cJs8c2c_3c6h7hAc_Kc7s2s2d_3h4h7cKd() {
    assertEquals(
      "3h4h7cKd Kc7s2s2d 4cJs8c2c 3c6h7hAc TcAd6c3s Jh5d6s4d 5hJd9d5s Qs9cQcTs",
      Solver.process("omaha-holdem 5c9hAsJcQh TcAd6c3s Jh5d6s4d Qs9cQcTs 5hJd9d5s 4cJs8c2c 3c6h7hAc Kc7s2s2d 3h4h7cKd"));
  }

  @Test
  public void test_omaha_holdem_7637_7c7s8cJcQc_6d2cQd3d_QsKd8dTs() {
    assertEquals(
      "6d2cQd3d QsKd8dTs",
      Solver.process("omaha-holdem 7c7s8cJcQc 6d2cQd3d QsKd8dTs"));
  }

  @Test
  public void test_omaha_holdem_7638_3s4s5c9cAc_9sJsKh7c_QsQc6sJc_Tc4h4d4c_KsTs2cKc_Jh9hThJd_As6hQd2s_7sAhQh2d_7dAd8h5h() {
    assertEquals(
      "9sJsKh7c Jh9hThJd 7dAd8h5h 7sAhQh2d As6hQd2s Tc4h4d4c QsQc6sJc KsTs2cKc",
      Solver.process("omaha-holdem 3s4s5c9cAc 9sJsKh7c QsQc6sJc Tc4h4d4c KsTs2cKc Jh9hThJd As6hQd2s 7sAhQh2d 7dAd8h5h"));
  }

  @Test
  public void test_omaha_holdem_7639_2d6c8hAcAh_8s7h2s8c_9s5s2hKh_9dJs6h8d() {
    assertEquals(
      "9s5s2hKh 9dJs6h8d 8s7h2s8c",
      Solver.process("omaha-holdem 2d6c8hAcAh 8s7h2s8c 9s5s2hKh 9dJs6h8d"));
  }

  @Test
  public void test_omaha_holdem_7640_5d6d7c8c9d_Kc3h2s6s_3d7d8s6c_TdKdTcKs_Ad9cAc5s() {
    assertEquals(
      "Kc3h2s6s Ad9cAc5s 3d7d8s6c TdKdTcKs",
      Solver.process("omaha-holdem 5d6d7c8c9d Kc3h2s6s 3d7d8s6c TdKdTcKs Ad9cAc5s"));
  }

  @Test
  public void test_omaha_holdem_7641_4s6hAdJhKs_8d2c7dKd_7s5s7c2d_9cThTd8s_Jc4c3hJd_9d6s3s9h_6d2s3c5c_2h7hAh4d_4hAs5h9s() {
    assertEquals(
      "6d2s3c5c 7s5s7c2d 9d6s3s9h 9cThTd8s 8d2c7dKd 2h7hAh4d=4hAs5h9s Jc4c3hJd",
      Solver.process("omaha-holdem 4s6hAdJhKs 8d2c7dKd 7s5s7c2d 9cThTd8s Jc4c3hJd 9d6s3s9h 6d2s3c5c 2h7hAh4d 4hAs5h9s"));
  }

  @Test
  public void test_omaha_holdem_7642_4c4sAdAhKs_3sKc2d7h_KdAc6s3c_Jh5cQd2h_9s5hJd6h_9dAs9h7s() {
    assertEquals(
      "9s5hJd6h Jh5cQd2h 3sKc2d7h 9dAs9h7s KdAc6s3c",
      Solver.process("omaha-holdem 4c4sAdAhKs 3sKc2d7h KdAc6s3c Jh5cQd2h 9s5hJd6h 9dAs9h7s"));
  }

  @Test
  public void test_omaha_holdem_7643_2c3s4d4h7c_5c7d2s7s_7h3cJd4s_3dAd6s2h() {
    assertEquals(
      "3dAd6s2h 7h3cJd4s 5c7d2s7s",
      Solver.process("omaha-holdem 2c3s4d4h7c 5c7d2s7s 7h3cJd4s 3dAd6s2h"));
  }

  @Test
  public void test_omaha_holdem_7644_3s7d8hQcQh_9d8c6c5h_5dKc4hTh_8dJh9h3h_Kd6h3d3c_4dAd2dJc() {
    assertEquals(
      "5dKc4hTh 4dAd2dJc 9d8c6c5h 8dJh9h3h Kd6h3d3c",
      Solver.process("omaha-holdem 3s7d8hQcQh 9d8c6c5h 5dKc4hTh 8dJh9h3h Kd6h3d3c 4dAd2dJc"));
  }

  @Test
  public void test_omaha_holdem_7645_3c8c9dJdTs_5c9c4s4d_6h2d8d9s_8hQhKc7h_7sJcAd6d_2c6sQs7d_4c5h8sAh_Td3sKdKs_5dJh3hTh_5sQcKhQd() {
    assertEquals(
      "4c5h8sAh 5c9c4s4d 6h2d8d9s Td3sKdKs 5dJh3hTh 2c6sQs7d 7sJcAd6d 5sQcKhQd=8hQhKc7h",
      Solver.process("omaha-holdem 3c8c9dJdTs 5c9c4s4d 6h2d8d9s 8hQhKc7h 7sJcAd6d 2c6sQs7d 4c5h8sAh Td3sKdKs 5dJh3hTh 5sQcKhQd"));
  }

  @Test
  public void test_omaha_holdem_7646_5d5s9dAhQh_TdJd3hKc_7d9h4h4s_6d4d3c3s_2cKs8dAc_7c6c4c2s_Qd8hTcKh_2h5hJs6s() {
    assertEquals(
      "7c6c4c2s TdJd3hKc 6d4d3c3s 7d9h4h4s Qd8hTcKh 2cKs8dAc 2h5hJs6s",
      Solver.process("omaha-holdem 5d5s9dAhQh TdJd3hKc 7d9h4h4s 6d4d3c3s 2cKs8dAc 7c6c4c2s Qd8hTcKh 2h5hJs6s"));
  }

  @Test
  public void test_omaha_holdem_7647_3s7c9hJhKs_4s9cKc9s_JdAs3cAh_2c3h2d6c_5s8dQdKd_4d8h5dJc_AdThQc7d() {
    assertEquals(
      "2c3h2d6c 4d8h5dJc 5s8dQdKd JdAs3cAh 4s9cKc9s AdThQc7d",
      Solver.process("omaha-holdem 3s7c9hJhKs 4s9cKc9s JdAs3cAh 2c3h2d6c 5s8dQdKd 4d8h5dJc AdThQc7d"));
  }

  @Test
  public void test_omaha_holdem_7648_2s7c7dJsQc_As5sJhJc_6hQsAcQh_TdTh5h2c_Ad7h3c4c_8s6d7s9s_Ks4h2hKc_9cKh6c4d_Ts8c3hTc() {
    assertEquals(
      "9cKh6c4d TdTh5h2c=Ts8c3hTc Ks4h2hKc 8s6d7s9s Ad7h3c4c As5sJhJc 6hQsAcQh",
      Solver.process("omaha-holdem 2s7c7dJsQc As5sJhJc 6hQsAcQh TdTh5h2c Ad7h3c4c 8s6d7s9s Ks4h2hKc 9cKh6c4d Ts8c3hTc"));
  }

  @Test
  public void test_omaha_holdem_7649_2s4c7hAcAs_3c2c3s2h_8s7c2dQs_TsJs5d7s() {
    assertEquals(
      "TsJs5d7s 8s7c2dQs 3c2c3s2h",
      Solver.process("omaha-holdem 2s4c7hAcAs 3c2c3s2h 8s7c2dQs TsJs5d7s"));
  }

  @Test
  public void test_omaha_holdem_7650_2c2s4hKcKh_5s7c8hAc_8c5hJd8d() {
    assertEquals(
      "5s7c8hAc 8c5hJd8d",
      Solver.process("omaha-holdem 2c2s4hKcKh 5s7c8hAc 8c5hJd8d"));
  }

  @Test
  public void test_omaha_holdem_7651_AhAsKsQhTh_TdJd4h6c_9h2c6d2d_7h6s5c7s_Jh9c7d8d_2hQsKh8h_4c5sQc8c() {
    assertEquals(
      "9h2c6d2d 7h6s5c7s 4c5sQc8c Jh9c7d8d TdJd4h6c 2hQsKh8h",
      Solver.process("omaha-holdem AhAsKsQhTh TdJd4h6c 9h2c6d2d 7h6s5c7s Jh9c7d8d 2hQsKh8h 4c5sQc8c"));
  }

  @Test
  public void test_omaha_holdem_7652_7d7sAhJdQs_AcTdQc2d_Ad8dKhKd_5s4hTcJh_8h6h6dTs_Qh3d2h4d_Kc3s3c4c_9dQd7h7c_2s9c5d5h() {
    assertEquals(
      "Kc3s3c4c 2s9c5d5h 8h6h6dTs 5s4hTcJh Qh3d2h4d Ad8dKhKd AcTdQc2d 9dQd7h7c",
      Solver.process("omaha-holdem 7d7sAhJdQs AcTdQc2d Ad8dKhKd 5s4hTcJh 8h6h6dTs Qh3d2h4d Kc3s3c4c 9dQd7h7c 2s9c5d5h"));
  }

  @Test
  public void test_omaha_holdem_7653_6s8c9cQhTd_3dJhJs7d_Qs7sTcKc() {
    assertEquals(
      "Qs7sTcKc 3dJhJs7d",
      Solver.process("omaha-holdem 6s8c9cQhTd 3dJhJs7d Qs7sTcKc"));
  }

  @Test
  public void test_omaha_holdem_7654_2d3h5h9cQs_Td4sTcJc_6s8s6cTs_9hJh9dAh_4dJs8d3d_AsAd3cKc() {
    assertEquals(
      "4dJs8d3d 6s8s6cTs Td4sTcJc AsAd3cKc 9hJh9dAh",
      Solver.process("omaha-holdem 2d3h5h9cQs Td4sTcJc 6s8s6cTs 9hJh9dAh 4dJs8d3d AsAd3cKc"));
  }

  @Test
  public void test_omaha_holdem_7655_7c9cAsJsTs_5cQs4h4d_5sQc7s3c() {
    assertEquals(
      "5cQs4h4d 5sQc7s3c",
      Solver.process("omaha-holdem 7c9cAsJsTs 5cQs4h4d 5sQc7s3c"));
  }

  @Test
  public void test_omaha_holdem_7656_6hAhJcQdTs_Js5sTc3s_6d2sQhAs_Td6sQs8c_JdKs3d4s_KcAc4dQc_6c4h9d2h_5d5h2dKh() {
    assertEquals(
      "5d5h2dKh 6c4h9d2h Js5sTc3s Td6sQs8c 6d2sQhAs JdKs3d4s=KcAc4dQc",
      Solver.process("omaha-holdem 6hAhJcQdTs Js5sTc3s 6d2sQhAs Td6sQs8c JdKs3d4s KcAc4dQc 6c4h9d2h 5d5h2dKh"));
  }

  @Test
  public void test_omaha_holdem_7657_4s6dJsQhQs_8c4d7c4c_5sAs9h9d_5cAh7d6s_7h2s6hKs_Jh8h9c3c_8d2d2c7s_8sTh3sJc() {
    assertEquals(
      "8d2d2c7s 5cAh7d6s Jh8h9c3c 8sTh3sJc 7h2s6hKs 5sAs9h9d 8c4d7c4c",
      Solver.process("omaha-holdem 4s6dJsQhQs 8c4d7c4c 5sAs9h9d 5cAh7d6s 7h2s6hKs Jh8h9c3c 8d2d2c7s 8sTh3sJc"));
  }

  @Test
  public void test_omaha_holdem_7658_4c5d5sAcQd_Kd4d7s6d_9s2h2dKh_6c5h4sAh() {
    assertEquals(
      "9s2h2dKh Kd4d7s6d 6c5h4sAh",
      Solver.process("omaha-holdem 4c5d5sAcQd Kd4d7s6d 9s2h2dKh 6c5h4sAh"));
  }

  @Test
  public void test_omaha_holdem_7659_5s6sAcAdJd_AhKh4s6c_3h6d2h2s_TsQh9c2d_9h4d5h3d_As7d5c8c_KsJhTcQd_Kc2cQsTd_4cQc6h8s_5d7cJc9d() {
    assertEquals(
      "TsQh9c2d Kc2cQsTd 9h4d5h3d 3h6d2h2s 4cQc6h8s 5d7cJc9d KsJhTcQd As7d5c8c AhKh4s6c",
      Solver.process("omaha-holdem 5s6sAcAdJd AhKh4s6c 3h6d2h2s TsQh9c2d 9h4d5h3d As7d5c8c KsJhTcQd Kc2cQsTd 4cQc6h8s 5d7cJc9d"));
  }

  @Test
  public void test_omaha_holdem_7660_2c3h4h7h8s_2dAcQd5d_QhTh9cAs_6dJdKh3s_KsKcKd2s_3c9d5h9h_4cAd6c8h_5cJc7c4d_7d7s6sAh_8dTsJhJs() {
    assertEquals(
      "6dJdKh3s 8dTsJhJs KsKcKd2s 5cJc7c4d 4cAd6c8h 7d7s6sAh 2dAcQd5d 3c9d5h9h QhTh9cAs",
      Solver.process("omaha-holdem 2c3h4h7h8s 2dAcQd5d QhTh9cAs 6dJdKh3s KsKcKd2s 3c9d5h9h 4cAd6c8h 5cJc7c4d 7d7s6sAh 8dTsJhJs"));
  }

  @Test
  public void test_omaha_holdem_7661_5d5h6d6hKc_6s5cAdTs_TdQc5sKs_JdJs4s4d_3s7h8cQs() {
    assertEquals(
      "3s7h8cQs JdJs4s4d TdQc5sKs 6s5cAdTs",
      Solver.process("omaha-holdem 5d5h6d6hKc 6s5cAdTs TdQc5sKs JdJs4s4d 3s7h8cQs"));
  }

  @Test
  public void test_omaha_holdem_7662_3h5d5s7c9h_8c3sTdKs_8dKcJc4c_6dQs7s9s() {
    assertEquals(
      "8dKcJc4c 8c3sTdKs 6dQs7s9s",
      Solver.process("omaha-holdem 3h5d5s7c9h 8c3sTdKs 8dKcJc4c 6dQs7s9s"));
  }

  @Test
  public void test_omaha_holdem_7663_2h5c7sJhJs_QdQc7hJc_6c2sTsTd_6hTh8s3c_6s6d9h9s_AcJdAs9c_Ah5sKd4d_Kh7c2c8c_Qs4s3h8d() {
    assertEquals(
      "6hTh8s3c Qs4s3h8d Ah5sKd4d Kh7c2c8c 6s6d9h9s 6c2sTsTd AcJdAs9c QdQc7hJc",
      Solver.process("omaha-holdem 2h5c7sJhJs QdQc7hJc 6c2sTsTd 6hTh8s3c 6s6d9h9s AcJdAs9c Ah5sKd4d Kh7c2c8c Qs4s3h8d"));
  }

  @Test
  public void test_omaha_holdem_7664_3c5h7h9cKc_5s4hAd7d_4d2c8dTd_6d2d4c8h_3d6c8s8c_As2s7c9d() {
    assertEquals(
      "4d2c8dTd 5s4hAd7d As2s7c9d 6d2d4c8h 3d6c8s8c",
      Solver.process("omaha-holdem 3c5h7h9cKc 5s4hAd7d 4d2c8dTd 6d2d4c8h 3d6c8s8c As2s7c9d"));
  }

  @Test
  public void test_omaha_holdem_7665_4c4s7sJhTh_Kd6c9h2d_AsAdQdJs() {
    assertEquals(
      "Kd6c9h2d AsAdQdJs",
      Solver.process("omaha-holdem 4c4s7sJhTh Kd6c9h2d AsAdQdJs"));
  }

  @Test
  public void test_omaha_holdem_7666_6d6sKhQhTd_5c2cAcAs_9sKc3cJd() {
    assertEquals(
      "5c2cAcAs 9sKc3cJd",
      Solver.process("omaha-holdem 6d6sKhQhTd 5c2cAcAs 9sKc3cJd"));
  }

  @Test
  public void test_omaha_holdem_7667_3s4s9sJsTc_KcTs2s9c_7c5c2d6s_Jc8d7d7s_7hKhQdTd_5s5hKsQs_Jh2hAh4d_6dQc9hJd_9d8s4h3h_8cAd4cAs() {
    assertEquals(
      "7c5c2d6s 8cAd4cAs 9d8s4h3h Jh2hAh4d 6dQc9hJd Jc8d7d7s 7hKhQdTd KcTs2s9c 5s5hKsQs",
      Solver.process("omaha-holdem 3s4s9sJsTc KcTs2s9c 7c5c2d6s Jc8d7d7s 7hKhQdTd 5s5hKsQs Jh2hAh4d 6dQc9hJd 9d8s4h3h 8cAd4cAs"));
  }

  @Test
  public void test_omaha_holdem_7668_5d7h8c9cQc_7c2h9h8h_7sAcQd3s_3h5cJsJd_3d2c7d6s_5h4d4h6c_6hKsKh8s_5sKdJh9s() {
    assertEquals(
      "3h5cJsJd 5sKdJh9s 7c2h9h8h 7sAcQd3s 3d2c7d6s=5h4d4h6c=6hKsKh8s",
      Solver.process("omaha-holdem 5d7h8c9cQc 7c2h9h8h 7sAcQd3s 3h5cJsJd 3d2c7d6s 5h4d4h6c 6hKsKh8s 5sKdJh9s"));
  }

  @Test
  public void test_omaha_holdem_7669_2d3s4c4d8h_QcTd4s7h_AdQs6h6c_9d9c3d9h() {
    assertEquals(
      "AdQs6h6c 9d9c3d9h QcTd4s7h",
      Solver.process("omaha-holdem 2d3s4c4d8h QcTd4s7h AdQs6h6c 9d9c3d9h"));
  }

  @Test
  public void test_omaha_holdem_7670_6cAcAhQdQh_5d6s5cAs_KsTcJc3c_Ts2h9s9h_8d8s5s2d_6d9c6hJh() {
    assertEquals(
      "KsTcJc3c 8d8s5s2d Ts2h9s9h 6d9c6hJh 5d6s5cAs",
      Solver.process("omaha-holdem 6cAcAhQdQh 5d6s5cAs KsTcJc3c Ts2h9s9h 8d8s5s2d 6d9c6hJh"));
  }

  @Test
  public void test_omaha_holdem_7671_2s7h7sJdTc_7d9hKsAs_Js3h3d8s_Td2d7c8h_Ts4d3s6d_9s3c6cAd_8cTh8d9d_9c4h5hQh() {
    assertEquals(
      "9c4h5hQh 9s3c6cAd Ts4d3s6d Js3h3d8s 7d9hKsAs 8cTh8d9d Td2d7c8h",
      Solver.process("omaha-holdem 2s7h7sJdTc 7d9hKsAs Js3h3d8s Td2d7c8h Ts4d3s6d 9s3c6cAd 8cTh8d9d 9c4h5hQh"));
  }

  @Test
  public void test_omaha_holdem_7672_7s9c9hJsQc_Kd4dKh9d_6cJdJhAc_3cKc8s4c_AhQd5c7h_7d3dAs6s_2c9sQh5s_2s5dAdQs_Td4h8d6h() {
    assertEquals(
      "3cKc8s4c 7d3dAs6s 2s5dAdQs=AhQd5c7h Kd4dKh9d Td4h8d6h 2c9sQh5s 6cJdJhAc",
      Solver.process("omaha-holdem 7s9c9hJsQc Kd4dKh9d 6cJdJhAc 3cKc8s4c AhQd5c7h 7d3dAs6s 2c9sQh5s 2s5dAdQs Td4h8d6h"));
  }

  @Test
  public void test_omaha_holdem_7673_2c4d9cQsTs_Td7s6s6d_3s6hAs7h_Kd3h2s3c_QhKhJh2h_Ad8hAh9s() {
    assertEquals(
      "3s6hAs7h Kd3h2s3c Td7s6s6d Ad8hAh9s QhKhJh2h",
      Solver.process("omaha-holdem 2c4d9cQsTs Td7s6s6d 3s6hAs7h Kd3h2s3c QhKhJh2h Ad8hAh9s"));
  }

  @Test
  public void test_omaha_holdem_7674_7s9dKcQsTs_7h9c7d2d_2h8dTcJs_3dAs5cAd_2s8c4c4h_QhJd9s8s_Kd5d5h3c_Jc7cKh6c_AhQdTd6d_4d4s6s8h() {
    assertEquals(
      "2s8c4c4h Kd5d5h3c 3dAs5cAd AhQdTd6d 7h9c7d2d 2h8dTcJs=Jc7cKh6c 4d4s6s8h QhJd9s8s",
      Solver.process("omaha-holdem 7s9dKcQsTs 7h9c7d2d 2h8dTcJs 3dAs5cAd 2s8c4c4h QhJd9s8s Kd5d5h3c Jc7cKh6c AhQdTd6d 4d4s6s8h"));
  }

  @Test
  public void test_omaha_holdem_7675_3c4d7d7hQh_7c9cAdTs_4c8sKhJs_Qc7s5cAc_4hKs8d3s_5d2dThQd_KcTc4s6d() {
    assertEquals(
      "4c8sKhJs=4hKs8d3s=KcTc4s6d 5d2dThQd 7c9cAdTs Qc7s5cAc",
      Solver.process("omaha-holdem 3c4d7d7hQh 7c9cAdTs 4c8sKhJs Qc7s5cAc 4hKs8d3s 5d2dThQd KcTc4s6d"));
  }

  @Test
  public void test_omaha_holdem_7676_3d6h8hJhJs_Ks6d7s4s_Kh3c8s5c_TcTdJdAs_9sThTs2h_8dAc5s3s() {
    assertEquals(
      "Ks6d7s4s Kh3c8s5c 8dAc5s3s TcTdJdAs 9sThTs2h",
      Solver.process("omaha-holdem 3d6h8hJhJs Ks6d7s4s Kh3c8s5c TcTdJdAs 9sThTs2h 8dAc5s3s"));
  }

  @Test
  public void test_omaha_holdem_7677_5d8c9sJdKs_5c8dTc5h_7s4cTd7d_2sQh6h3c_7c6cAsAc_8h4d2dQs_TsKd6s8s() {
    assertEquals(
      "2sQh6h3c 8h4d2dQs TsKd6s8s 5c8dTc5h 7c6cAsAc 7s4cTd7d",
      Solver.process("omaha-holdem 5d8c9sJdKs 5c8dTc5h 7s4cTd7d 2sQh6h3c 7c6cAsAc 8h4d2dQs TsKd6s8s"));
  }

  @Test
  public void test_omaha_holdem_7678_9d9sAcQhTs_4cTdAd2d_5sQd5c8h() {
    assertEquals(
      "5sQd5c8h 4cTdAd2d",
      Solver.process("omaha-holdem 9d9sAcQhTs 4cTdAd2d 5sQd5c8h"));
  }

  @Test
  public void test_omaha_holdem_7679_3c3d8h8sJc_Jh9dQc3h_2sAs2d4c_4d5sTd7d_5dJdKc6h_8cQh6cAh_7cJsQsAd_QdKh7h9s_4hAcTs4s() {
    assertEquals(
      "4d5sTd7d QdKh7h9s 2sAs2d4c 4hAcTs4s 5dJdKc6h 7cJsQsAd 8cQh6cAh Jh9dQc3h",
      Solver.process("omaha-holdem 3c3d8h8sJc Jh9dQc3h 2sAs2d4c 4d5sTd7d 5dJdKc6h 8cQh6cAh 7cJsQsAd QdKh7h9s 4hAcTs4s"));
  }

  @Test
  public void test_omaha_holdem_7680_4c7c8sKsQd_8d5c2s5s_AhAcQs2d_JdTd5hKh_9h3cKd2c_5dAdJsTs_Kc3h7s9c_6dAs9d7d_Qh3d2h4d_3sJc8h4s() {
    assertEquals(
      "5dAdJsTs 6dAs9d7d 8d5c2s5s 9h3cKd2c JdTd5hKh AhAcQs2d 3sJc8h4s Qh3d2h4d Kc3h7s9c",
      Solver.process("omaha-holdem 4c7c8sKsQd 8d5c2s5s AhAcQs2d JdTd5hKh 9h3cKd2c 5dAdJsTs Kc3h7s9c 6dAs9d7d Qh3d2h4d 3sJc8h4s"));
  }

  @Test
  public void test_omaha_holdem_7681_2s7c8c9sTc_8s2c8h4s_6s5c3hAc_JcJd9c2d_KcJs4h6h_9h9d4c5d_AhTd5s4d_Kh6d7hTh_3dAsKdQs() {
    assertEquals(
      "KcJs4h6h 3dAsKdQs AhTd5s4d 8s2c8h4s 9h9d4c5d Kh6d7hTh 6s5c3hAc JcJd9c2d",
      Solver.process("omaha-holdem 2s7c8c9sTc 8s2c8h4s 6s5c3hAc JcJd9c2d KcJs4h6h 9h9d4c5d AhTd5s4d Kh6d7hTh 3dAsKdQs"));
  }

  @Test
  public void test_omaha_holdem_7682_2s3c4c6sJs_4dAdAh2d_Qs8sKd7h_Kc3sQcKh() {
    assertEquals(
      "Kc3sQcKh 4dAdAh2d Qs8sKd7h",
      Solver.process("omaha-holdem 2s3c4c6sJs 4dAdAh2d Qs8sKd7h Kc3sQcKh"));
  }

  @Test
  public void test_omaha_holdem_7683_3c4c7cTdTh_2c5d9sKd_3d2h4s8s_Kh6dJc6c_Ts3s9h8d_Ad2sJh6h_Jd3hAc5h() {
    assertEquals(
      "2c5d9sKd Ad2sJh6h Jd3hAc5h 3d2h4s8s Kh6dJc6c Ts3s9h8d",
      Solver.process("omaha-holdem 3c4c7cTdTh 2c5d9sKd 3d2h4s8s Kh6dJc6c Ts3s9h8d Ad2sJh6h Jd3hAc5h"));
  }

  @Test
  public void test_omaha_holdem_7684_4s5c7c7d7h_Ad9c6h8c_6s2d2cKd_3sJsQc8s_Qs5h9hKh_Jh5d4d2h_KsQh8d5s_4h6c3d3c() {
    assertEquals(
      "Jh5d4d2h 3sJsQc8s KsQh8d5s=Qs5h9hKh Ad9c6h8c 6s2d2cKd 4h6c3d3c",
      Solver.process("omaha-holdem 4s5c7c7d7h Ad9c6h8c 6s2d2cKd 3sJsQc8s Qs5h9hKh Jh5d4d2h KsQh8d5s 4h6c3d3c"));
  }

  @Test
  public void test_omaha_holdem_7685_6cAcQcQhTs_9d7cAsKc_Td4c3cAd_7d4s9sQd_Js5h5s7s() {
    assertEquals(
      "Js5h5s7s 7d4s9sQd Td4c3cAd 9d7cAsKc",
      Solver.process("omaha-holdem 6cAcQcQhTs 9d7cAsKc Td4c3cAd 7d4s9sQd Js5h5s7s"));
  }

  @Test
  public void test_omaha_holdem_7686_3d6cAdJcQc_3s3c3h5d_8h8s6d8c_9h2cKhJd_7sTsTdQs_9s6h6sAh_TcKs4s5h_7h2hKcJs_4d4c2dKd_7dJh9dAs() {
    assertEquals(
      "4d4c2dKd 8h8s6d8c 7h2hKcJs=9h2cKhJd 7sTsTdQs 7dJh9dAs 3s3c3h5d 9s6h6sAh TcKs4s5h",
      Solver.process("omaha-holdem 3d6cAdJcQc 3s3c3h5d 8h8s6d8c 9h2cKhJd 7sTsTdQs 9s6h6sAh TcKs4s5h 7h2hKcJs 4d4c2dKd 7dJh9dAs"));
  }

  @Test
  public void test_omaha_holdem_7687_2d3c4d7hAs_4sKd4h6s_7c6cJs3d_2c2hTs8c_JcAc5cKc_Qs9sJhTh_8sJd5d9d_6hTd3s6d() {
    assertEquals(
      "8sJd5d9d Qs9sJhTh 6hTd3s6d 7c6cJs3d 2c2hTs8c 4sKd4h6s JcAc5cKc",
      Solver.process("omaha-holdem 2d3c4d7hAs 4sKd4h6s 7c6cJs3d 2c2hTs8c JcAc5cKc Qs9sJhTh 8sJd5d9d 6hTd3s6d"));
  }

  @Test
  public void test_omaha_holdem_7688_6sAdAhQcQs_6h7d8h9s_8sTh7s2s() {
    assertEquals(
      "8sTh7s2s 6h7d8h9s",
      Solver.process("omaha-holdem 6sAdAhQcQs 6h7d8h9s 8sTh7s2s"));
  }

  @Test
  public void test_omaha_holdem_7689_3c3d9dAcQh_7h8d6c8c_8s4sTh9c_Ad5s2hKs() {
    assertEquals(
      "7h8d6c8c 8s4sTh9c Ad5s2hKs",
      Solver.process("omaha-holdem 3c3d9dAcQh 7h8d6c8c 8s4sTh9c Ad5s2hKs"));
  }

  @Test
  public void test_omaha_holdem_7690_3c5d5s8c8s_KsAd4d5c_KhTcJs4c_8d7d9s8h_Jd3dQcJh_Th7s2h6s_6h7h3hTd_7c5h2s9h_4hAc6c6d() {
    assertEquals(
      "Th7s2h6s KhTcJs4c 6h7h3hTd 4hAc6c6d Jd3dQcJh 7c5h2s9h KsAd4d5c 8d7d9s8h",
      Solver.process("omaha-holdem 3c5d5s8c8s KsAd4d5c KhTcJs4c 8d7d9s8h Jd3dQcJh Th7s2h6s 6h7h3hTd 7c5h2s9h 4hAc6c6d"));
  }

  @Test
  public void test_omaha_holdem_7691_6c7d8hJsKh_6h2s7sAc_Jc8cKsTc_Kd6s5dAd() {
    assertEquals(
      "6h2s7sAc Kd6s5dAd Jc8cKsTc",
      Solver.process("omaha-holdem 6c7d8hJsKh 6h2s7sAc Jc8cKsTc Kd6s5dAd"));
  }

  @Test
  public void test_omaha_holdem_7692_5h8c9hAhTs_6dJdAsJs_2c4hAc4c_KhKs9sTd_3c6hQs8d_5s3d2d4d_Ad8s3s9d_5d2hQd4s() {
    assertEquals(
      "5s3d2d4d 5d2hQd4s 3c6hQs8d 2c4hAc4c 6dJdAsJs KhKs9sTd Ad8s3s9d",
      Solver.process("omaha-holdem 5h8c9hAhTs 6dJdAsJs 2c4hAc4c KhKs9sTd 3c6hQs8d 5s3d2d4d Ad8s3s9d 5d2hQd4s"));
  }

  @Test
  public void test_omaha_holdem_7693_2d5h9dAdTd_7h4cKsAh_Ts3sQd9c_6cJsKcKd_Th6d6sAs_Qs8h5sJc_3c8d5c9h_4hQh2h2s_TcJhQc9s() {
    assertEquals(
      "Qs8h5sJc 6cJsKcKd 7h4cKsAh 3c8d5c9h TcJhQc9s=Ts3sQd9c Th6d6sAs 4hQh2h2s",
      Solver.process("omaha-holdem 2d5h9dAdTd 7h4cKsAh Ts3sQd9c 6cJsKcKd Th6d6sAs Qs8h5sJc 3c8d5c9h 4hQh2h2s TcJhQc9s"));
  }

  @Test
  public void test_omaha_holdem_7694_5s6c9cQhTc_8d3c5hTs_3d2c7s6d_9h4hKdAc_3h4s9s7c_6h8sJc7d_4d7hJd4c() {
    assertEquals(
      "4d7hJd4c 3d2c7s6d 3h4s9s7c 9h4hKdAc 8d3c5hTs 6h8sJc7d",
      Solver.process("omaha-holdem 5s6c9cQhTc 8d3c5hTs 3d2c7s6d 9h4hKdAc 3h4s9s7c 6h8sJc7d 4d7hJd4c"));
  }

  @Test
  public void test_omaha_holdem_7695_4dAsJhJsKh_2s8c3d5d_Ac2hQs6c_7sTh6s3s_8sQh5c5h_9dJcQc9h_6d3h8d8h_3c4s2d7h_Td7d7cKd() {
    assertEquals(
      "2s8c3d5d 7sTh6s3s 3c4s2d7h 8sQh5c5h 6d3h8d8h Td7d7cKd Ac2hQs6c 9dJcQc9h",
      Solver.process("omaha-holdem 4dAsJhJsKh 2s8c3d5d Ac2hQs6c 7sTh6s3s 8sQh5c5h 9dJcQc9h 6d3h8d8h 3c4s2d7h Td7d7cKd"));
  }

  @Test
  public void test_omaha_holdem_7696_3c5h6sKdQc_Td5cJc4s_4h9h9dKh() {
    assertEquals(
      "Td5cJc4s 4h9h9dKh",
      Solver.process("omaha-holdem 3c5h6sKdQc Td5cJc4s 4h9h9dKh"));
  }

  @Test
  public void test_omaha_holdem_7697_2d6s8h9cJc_7sJh7c3d_4h7hJs9d_8dKsAd6c_5dKh2c4c_4d9sTdAs_Jd3cQd6h_8s3sAh2s() {
    assertEquals(
      "5dKh2c4c 4d9sTdAs 7sJh7c3d 8s3sAh2s 8dKsAd6c Jd3cQd6h 4h7hJs9d",
      Solver.process("omaha-holdem 2d6s8h9cJc 7sJh7c3d 4h7hJs9d 8dKsAd6c 5dKh2c4c 4d9sTdAs Jd3cQd6h 8s3sAh2s"));
  }

  @Test
  public void test_omaha_holdem_7698_3h9hJdQdTh_QcJhAdAc_6s2h7d4h_Kh6hAh5d_3sKc6c4d_4cKs8d2c_8s3c6d4s() {
    assertEquals(
      "4cKs8d2c 8s3c6d4s 3sKc6c4d QcJhAdAc 6s2h7d4h Kh6hAh5d",
      Solver.process("omaha-holdem 3h9hJdQdTh QcJhAdAc 6s2h7d4h Kh6hAh5d 3sKc6c4d 4cKs8d2c 8s3c6d4s"));
  }

  @Test
  public void test_omaha_holdem_7699_3s5c7c8sAh_JsKd9s7s_6sKs4sTc_8c6dQhTd_6c5d5sAc_5h3c2h7h_9h6hThJc_As9d4c2d_3dJd7d4h() {
    assertEquals(
      "JsKd9s7s 8c6dQhTd 3dJd7d4h 5h3c2h7h 6c5d5sAc As9d4c2d 6sKs4sTc 9h6hThJc",
      Solver.process("omaha-holdem 3s5c7c8sAh JsKd9s7s 6sKs4sTc 8c6dQhTd 6c5d5sAc 5h3c2h7h 9h6hThJc As9d4c2d 3dJd7d4h"));
  }

  @Test
  public void test_omaha_holdem_7700_3s8h8sAcQh_9cJs8d9h_Jd4h6hKc_7h5h6s6c_Ad2sThQd_3hJh7cTd_4d8c7sTc_3d2h5c4c_5dTsQs7d() {
    assertEquals(
      "Jd4h6hKc 3d2h5c4c 3hJh7cTd 7h5h6s6c 5dTsQs7d Ad2sThQd 4d8c7sTc 9cJs8d9h",
      Solver.process("omaha-holdem 3s8h8sAcQh 9cJs8d9h Jd4h6hKc 7h5h6s6c Ad2sThQd 3hJh7cTd 4d8c7sTc 3d2h5c4c 5dTsQs7d"));
  }

  @Test
  public void test_omaha_holdem_7701_3s7dAcQcQd_9c7s5dQh_9dKsAhAs_TdJhJc3c() {
    assertEquals(
      "TdJhJc3c 9c7s5dQh 9dKsAhAs",
      Solver.process("omaha-holdem 3s7dAcQcQd 9c7s5dQh 9dKsAhAs TdJhJc3c"));
  }

  @Test
  public void test_omaha_holdem_7702_2hAsJsKhQs_3hKd6s7c_2sAd5sKc_5hJd9h4d_KsAcTh7s_4c3sTsQh_5d6dJh2c_6c9c3d7d_4h7hJc8c() {
    assertEquals(
      "6c9c3d7d 4h7hJc8c 5hJd9h4d 3hKd6s7c 5d6dJh2c 2sAd5sKc 4c3sTsQh KsAcTh7s",
      Solver.process("omaha-holdem 2hAsJsKhQs 3hKd6s7c 2sAd5sKc 5hJd9h4d KsAcTh7s 4c3sTsQh 5d6dJh2c 6c9c3d7d 4h7hJc8c"));
  }

  @Test
  public void test_omaha_holdem_7703_3c3d4h8cJs_QcAs9hQs_5hKd8h9d_7dAhKcJd_2c9cThTc_Ts2hAd7h_6c6s8s5c_2dQh7s5d() {
    assertEquals(
      "2dQh7s5d Ts2hAd7h 6c6s8s5c 5hKd8h9d 2c9cThTc 7dAhKcJd QcAs9hQs",
      Solver.process("omaha-holdem 3c3d4h8cJs QcAs9hQs 5hKd8h9d 7dAhKcJd 2c9cThTc Ts2hAd7h 6c6s8s5c 2dQh7s5d"));
  }

  @Test
  public void test_omaha_holdem_7704_2h6c8hAhTs_Kd8s2c3c_3s2d7dJh_5hQd7hJc() {
    assertEquals(
      "3s2d7dJh Kd8s2c3c 5hQd7hJc",
      Solver.process("omaha-holdem 2h6c8hAhTs Kd8s2c3c 3s2d7dJh 5hQd7hJc"));
  }

  @Test
  public void test_omaha_holdem_7705_5s6s9d9sKh_6dQs4h5d_Qd7sAsTs_3sJs7hQc_9hKcKs5h_2dAdAc4c_2h4sJhTc() {
    assertEquals(
      "2h4sJhTc 6dQs4h5d 2dAdAc4c 3sJs7hQc Qd7sAsTs 9hKcKs5h",
      Solver.process("omaha-holdem 5s6s9d9sKh 6dQs4h5d Qd7sAsTs 3sJs7hQc 9hKcKs5h 2dAdAc4c 2h4sJhTc"));
  }

  @Test
  public void test_omaha_holdem_7706_2c6s9sAhKs_QsQc9dTd_3hJd7h8s_7d8hTh8c_Tc5h4dTs() {
    assertEquals(
      "3hJd7h8s 7d8hTh8c Tc5h4dTs QsQc9dTd",
      Solver.process("omaha-holdem 2c6s9sAhKs QsQc9dTd 3hJd7h8s 7d8hTh8c Tc5h4dTs"));
  }

  @Test
  public void test_omaha_holdem_7707_3h3s4c8hAc_9s7d7cQc_8dKd2cAs() {
    assertEquals(
      "9s7d7cQc 8dKd2cAs",
      Solver.process("omaha-holdem 3h3s4c8hAc 9s7d7cQc 8dKd2cAs"));
  }

  @Test
  public void test_omaha_holdem_7708_4s9c9sAhQs_Tc7d5d3s_5h8cQcTd_4d7c5s9d_2h7sAcKh_QdJh8hAs_Ad2c7hTh_Js8dJdKc_4cTs6cJc_2d9h4hQh() {
    assertEquals(
      "Tc7d5d3s 4cTs6cJc Js8dJdKc 5h8cQcTd Ad2c7hTh 2h7sAcKh QdJh8hAs 4d7c5s9d 2d9h4hQh",
      Solver.process("omaha-holdem 4s9c9sAhQs Tc7d5d3s 5h8cQcTd 4d7c5s9d 2h7sAcKh QdJh8hAs Ad2c7hTh Js8dJdKc 4cTs6cJc 2d9h4hQh"));
  }

  @Test
  public void test_omaha_holdem_7709_3d3s6s9hKh_As6c2dAh_7d5s5h4h_Tc7sJs7c_6hTdTsJc() {
    assertEquals(
      "7d5s5h4h Tc7sJs7c 6hTdTsJc As6c2dAh",
      Solver.process("omaha-holdem 3d3s6s9hKh As6c2dAh 7d5s5h4h Tc7sJs7c 6hTdTsJc"));
  }

  @Test
  public void test_omaha_holdem_7710_2c3s6cAdKs_As4h3hKc_Tc9c7s4d_3d2s5h9h_Kh2d8h3c_ThQc9sJh_4sQd7h8s_Jd8d5dJs() {
    assertEquals(
      "Tc9c7s4d 4sQd7h8s ThQc9sJh Jd8d5dJs 3d2s5h9h Kh2d8h3c As4h3hKc",
      Solver.process("omaha-holdem 2c3s6cAdKs As4h3hKc Tc9c7s4d 3d2s5h9h Kh2d8h3c ThQc9sJh 4sQd7h8s Jd8d5dJs"));
  }

  @Test
  public void test_omaha_holdem_7711_2d5s6hAsJh_KhTs8dJc_Ks5c7sKd_Ad4hQs4d_4s3c7dTh_Td8s4c9d() {
    assertEquals(
      "Td8s4c9d KhTs8dJc Ks5c7sKd Ad4hQs4d 4s3c7dTh",
      Solver.process("omaha-holdem 2d5s6hAsJh KhTs8dJc Ks5c7sKd Ad4hQs4d 4s3c7dTh Td8s4c9d"));
  }

  @Test
  public void test_omaha_holdem_7712_4d7c8hJhQh_TsTd5c2c_5d2d6d3h_6c4s2s6s_4cQcKc2h_3sThKs8s() {
    assertEquals(
      "6c4s2s6s 3sThKs8s TsTd5c2c 4cQcKc2h 5d2d6d3h",
      Solver.process("omaha-holdem 4d7c8hJhQh TsTd5c2c 5d2d6d3h 6c4s2s6s 4cQcKc2h 3sThKs8s"));
  }

  @Test
  public void test_omaha_holdem_7713_3d3h4cAhKh_Ad9h7c6d_2s8s5dTc_3sAsQcJh_7hQhTd2d_7s6s5cJs_Th4hTs4s_9s8cKcAc_5sQs8h7d_5h4dJd3c() {
    assertEquals(
      "7s6s5cJs 5sQs8h7d Ad9h7c6d 9s8cKcAc 2s8s5dTc 7hQhTd2d 5h4dJd3c 3sAsQcJh Th4hTs4s",
      Solver.process("omaha-holdem 3d3h4cAhKh Ad9h7c6d 2s8s5dTc 3sAsQcJh 7hQhTd2d 7s6s5cJs Th4hTs4s 9s8cKcAc 5sQs8h7d 5h4dJd3c"));
  }

  @Test
  public void test_omaha_holdem_7714_3c6dAcJsKh_5c2sTc7s_QhTd6s8d_Kc7dKs4s_Ah9s8c7h_Qs5s5hTh_3s9h2d5d() {
    assertEquals(
      "5c2sTc7s 3s9h2d5d Ah9s8c7h Kc7dKs4s QhTd6s8d=Qs5s5hTh",
      Solver.process("omaha-holdem 3c6dAcJsKh 5c2sTc7s QhTd6s8d Kc7dKs4s Ah9s8c7h Qs5s5hTh 3s9h2d5d"));
  }

  @Test
  public void test_omaha_holdem_7715_2s4s6d6sJs_QsTcKc6h_9c3c9hJd_As3d2d5c_Th7hKhTd_5h9sKs7d_QdAdAc5d_8d2cJhJc_4d3s3hKd_Qh4c4h6c() {
    assertEquals(
      "4d3s3hKd Th7hKhTd 9c3c9hJd QdAdAc5d QsTcKc6h As3d2d5c 5h9sKs7d Qh4c4h6c 8d2cJhJc",
      Solver.process("omaha-holdem 2s4s6d6sJs QsTcKc6h 9c3c9hJd As3d2d5c Th7hKhTd 5h9sKs7d QdAdAc5d 8d2cJhJc 4d3s3hKd Qh4c4h6c"));
  }

  @Test
  public void test_omaha_holdem_7716_2d3s7dJhJs_4c9cKc9h_8h8d6h2s_Kh2h8c9s_7s7c5cAc_Qh5dJc7h() {
    assertEquals(
      "Kh2h8c9s 8h8d6h2s 4c9cKc9h 7s7c5cAc Qh5dJc7h",
      Solver.process("omaha-holdem 2d3s7dJhJs 4c9cKc9h 8h8d6h2s Kh2h8c9s 7s7c5cAc Qh5dJc7h"));
  }

  @Test
  public void test_omaha_holdem_7717_4d4h5s8hKs_9hAd3hKh_7dThAhQc_4c7c8s2h_2dKc5hQs_8cTcTsJs() {
    assertEquals(
      "7dThAhQc 8cTcTsJs 9hAd3hKh 2dKc5hQs 4c7c8s2h",
      Solver.process("omaha-holdem 4d4h5s8hKs 9hAd3hKh 7dThAhQc 4c7c8s2h 2dKc5hQs 8cTcTsJs"));
  }

  @Test
  public void test_omaha_holdem_7718_2s4c5cQhTc_7h9cJdQc_4s6d7cQd_Kc3c4hJh_Js8cTd3h_8d7s4d7d_8h6hAc2h_Th5hKh6s_3dKs2d8s_Jc2cAs6c() {
    assertEquals(
      "3dKs2d8s 8h6hAc2h 8d7s4d7d Js8cTd3h Th5hKh6s 4s6d7cQd Jc2cAs6c 7h9cJdQc Kc3c4hJh",
      Solver.process("omaha-holdem 2s4c5cQhTc 7h9cJdQc 4s6d7cQd Kc3c4hJh Js8cTd3h 8d7s4d7d 8h6hAc2h Th5hKh6s 3dKs2d8s Jc2cAs6c"));
  }

  @Test
  public void test_omaha_holdem_7719_4d4h5c9hQh_Jd3dAs9c_Ah3s6c2h_TdQs3cJc_8d5h2d4c_8sAc6h3h_4sKd5d8c() {
    assertEquals(
      "Jd3dAs9c TdQs3cJc 8sAc6h3h Ah3s6c2h 4sKd5d8c=8d5h2d4c",
      Solver.process("omaha-holdem 4d4h5c9hQh Jd3dAs9c Ah3s6c2h TdQs3cJc 8d5h2d4c 8sAc6h3h 4sKd5d8c"));
  }

  @Test
  public void test_omaha_holdem_7720_6h7cJcKhTh_Js6dKsTs_7s9c3cAd_7dJdQd8s_5d4sQs2s() {
    assertEquals(
      "5d4sQs2s 7s9c3cAd 7dJdQd8s Js6dKsTs",
      Solver.process("omaha-holdem 6h7cJcKhTh Js6dKsTs 7s9c3cAd 7dJdQd8s 5d4sQs2s"));
  }

  @Test
  public void test_omaha_holdem_7721_5h9cJsQcTs_8c8dTc9d_Ah6hKs5d_6d8s2h6s_2sAcJhQs_QdJd3h2c_AdKh6c4h() {
    assertEquals(
      "6d8s2h6s 2sAcJhQs=QdJd3h2c 8c8dTc9d AdKh6c4h=Ah6hKs5d",
      Solver.process("omaha-holdem 5h9cJsQcTs 8c8dTc9d Ah6hKs5d 6d8s2h6s 2sAcJhQs QdJd3h2c AdKh6c4h"));
  }

  @Test
  public void test_omaha_holdem_7722_2h6s7hJcQc_JdKsTsKc_8hJsKh8c_5s2d9c4s_5hJhTc7c_4dAh3h9d() {
    assertEquals(
      "4dAh3h9d 5s2d9c4s 8hJsKh8c JdKsTsKc 5hJhTc7c",
      Solver.process("omaha-holdem 2h6s7hJcQc JdKsTsKc 8hJsKh8c 5s2d9c4s 5hJhTc7c 4dAh3h9d"));
  }

  @Test
  public void test_omaha_holdem_7723_4s5h6h8dTd_7sKhQhTh_7cJhJc3d_8s5s9s3s() {
    assertEquals(
      "7sKhQhTh 8s5s9s3s 7cJhJc3d",
      Solver.process("omaha-holdem 4s5h6h8dTd 7sKhQhTh 7cJhJc3d 8s5s9s3s"));
  }

  @Test
  public void test_omaha_holdem_7724_5h6h7s9cTc_Qc5sKcJc_4cAd7h9d() {
    assertEquals(
      "Qc5sKcJc 4cAd7h9d",
      Solver.process("omaha-holdem 5h6h7s9cTc Qc5sKcJc 4cAd7h9d"));
  }

  @Test
  public void test_omaha_holdem_7725_2h4h7sAdTd_Jd4c7dQd_3d5h4dKd_JcTs9d9s_3cJh2d7c() {
    assertEquals(
      "JcTs9d9s 3cJh2d7c Jd4c7dQd 3d5h4dKd",
      Solver.process("omaha-holdem 2h4h7sAdTd Jd4c7dQd 3d5h4dKd JcTs9d9s 3cJh2d7c"));
  }

  @Test
  public void test_omaha_holdem_7726_2c3d4s9dQs_8h7sQc9s_4h5h9h2s_JdAsKhJh_6dTs7h2d_AdTd2hJc_7d8d4dQd_3h6s8sTh() {
    assertEquals(
      "6dTs7h2d AdTd2hJc 3h6s8sTh JdAsKhJh 4h5h9h2s 7d8d4dQd 8h7sQc9s",
      Solver.process("omaha-holdem 2c3d4s9dQs 8h7sQc9s 4h5h9h2s JdAsKhJh 6dTs7h2d AdTd2hJc 7d8d4dQd 3h6s8sTh"));
  }

  @Test
  public void test_omaha_holdem_7727_2s5c7dJdTs_4c2dQh2h_AcTh3c3s() {
    assertEquals(
      "AcTh3c3s 4c2dQh2h",
      Solver.process("omaha-holdem 2s5c7dJdTs 4c2dQh2h AcTh3c3s"));
  }

  @Test
  public void test_omaha_holdem_7728_2h8cAdAhKs_3c7d8sAs_QcQd3s2c() {
    assertEquals(
      "QcQd3s2c 3c7d8sAs",
      Solver.process("omaha-holdem 2h8cAdAhKs 3c7d8sAs QcQd3s2c"));
  }

  @Test
  public void test_omaha_holdem_7729_9dAsTcTdTh_4sJc2hJd_QcKh5d6h_6c4c2dJs_8c5s8dQd_4h8sKcTs_9h7h3c3h_7s5c7c5h_Ah4d9cAd() {
    assertEquals(
      "6c4c2dJs QcKh5d6h 9h7h3c3h 7s5c7c5h 8c5s8dQd 4sJc2hJd Ah4d9cAd 4h8sKcTs",
      Solver.process("omaha-holdem 9dAsTcTdTh 4sJc2hJd QcKh5d6h 6c4c2dJs 8c5s8dQd 4h8sKcTs 9h7h3c3h 7s5c7c5h Ah4d9cAd"));
  }

  @Test
  public void test_omaha_holdem_7730_7d7s8dAsJs_KdAh7c2d_Ac6dTcJh() {
    assertEquals(
      "Ac6dTcJh KdAh7c2d",
      Solver.process("omaha-holdem 7d7s8dAsJs KdAh7c2d Ac6dTcJh"));
  }

  @Test
  public void test_omaha_holdem_7731_5h5s7c7d8d_2sAdTsAs_5c3hTh2d_AcAhJd5d_Td9d3c6s_9sKsJh4h_4c2c6h8s_4sQc7hKh_JcKd9h3d() {
    assertEquals(
      "9sKsJh4h=JcKd9h3d 2sAdTsAs 5c3hTh2d AcAhJd5d 4sQc7hKh 4c2c6h8s Td9d3c6s",
      Solver.process("omaha-holdem 5h5s7c7d8d 2sAdTsAs 5c3hTh2d AcAhJd5d Td9d3c6s 9sKsJh4h 4c2c6h8s 4sQc7hKh JcKd9h3d"));
  }

  @Test
  public void test_omaha_holdem_7732_2h2s7cAcTs_Th5h8s3h_2c3dKh3s_TdAsAd9s_Qs4c9hQh_6h4h5d9c() {
    assertEquals(
      "6h4h5d9c Th5h8s3h Qs4c9hQh 2c3dKh3s TdAsAd9s",
      Solver.process("omaha-holdem 2h2s7cAcTs Th5h8s3h 2c3dKh3s TdAsAd9s Qs4c9hQh 6h4h5d9c"));
  }

  @Test
  public void test_omaha_holdem_7733_2c5d6hQdQs_Tc4c8cAh_7c3sKs5h_Qh7s6d2d_2s3dAs5s_9hKc6cJs_6s4s8h9c() {
    assertEquals(
      "Tc4c8cAh 7c3sKs5h 2s3dAs5s 6s4s8h9c 9hKc6cJs Qh7s6d2d",
      Solver.process("omaha-holdem 2c5d6hQdQs Tc4c8cAh 7c3sKs5h Qh7s6d2d 2s3dAs5s 9hKc6cJs 6s4s8h9c"));
  }

  @Test
  public void test_omaha_holdem_7734_2c5h8s9sTh_5d3cTcKc_8c8hKdQc_8d9hTd7s() {
    assertEquals(
      "5d3cTcKc 8d9hTd7s 8c8hKdQc",
      Solver.process("omaha-holdem 2c5h8s9sTh 5d3cTcKc 8c8hKdQc 8d9hTd7s"));
  }

  @Test
  public void test_omaha_holdem_7735_8d9d9hJdJh_Td5h8cQd_9c6d9sKs_TcKd3hQs_7dAh5c4d_As2h4h7h_5d4cQcKc() {
    assertEquals(
      "5d4cQcKc As2h4h7h TcKd3hQs 7dAh5c4d 9c6d9sKs Td5h8cQd",
      Solver.process("omaha-holdem 8d9d9hJdJh Td5h8cQd 9c6d9sKs TcKd3hQs 7dAh5c4d As2h4h7h 5d4cQcKc"));
  }

  @Test
  public void test_omaha_holdem_7736_2d4c4d5hAs_5c9hKh8h_9sTcTdTs_2sJhTh7h_Jc7dJdKd_7s6c6s8c() {
    assertEquals(
      "2sJhTh7h 5c9hKh8h 7s6c6s8c 9sTcTdTs Jc7dJdKd",
      Solver.process("omaha-holdem 2d4c4d5hAs 5c9hKh8h 9sTcTdTs 2sJhTh7h Jc7dJdKd 7s6c6s8c"));
  }

  @Test
  public void test_omaha_holdem_7737_3d4c5s6sQh_5h9cJc8d_9dQd7h3s_3cAhTc5c_Td4dAd8c_6h3hQc5d_4hKs7cTh_2cTsAc8s_JdAsJh8h() {
    assertEquals(
      "Td4dAd8c 5h9cJc8d JdAsJh8h 3cAhTc5c 6h3hQc5d 2cTsAc8s 4hKs7cTh=9dQd7h3s",
      Solver.process("omaha-holdem 3d4c5s6sQh 5h9cJc8d 9dQd7h3s 3cAhTc5c Td4dAd8c 6h3hQc5d 4hKs7cTh 2cTsAc8s JdAsJh8h"));
  }

  @Test
  public void test_omaha_holdem_7738_2d3d3h5s9c_9hTh8h8c_4cAs2h8d_5c2cQcAc_QhAd7s6c_Jh6hAh4h_5h4s7c3s_6dKs6sKh_Tc7d9sTd_KdQd5d8s() {
    assertEquals(
      "QhAd7s6c KdQd5d8s 5c2cQcAc 9hTh8h8c Tc7d9sTd 6dKs6sKh 4cAs2h8d Jh6hAh4h 5h4s7c3s",
      Solver.process("omaha-holdem 2d3d3h5s9c 9hTh8h8c 4cAs2h8d 5c2cQcAc QhAd7s6c Jh6hAh4h 5h4s7c3s 6dKs6sKh Tc7d9sTd KdQd5d8s"));
  }

  @Test
  public void test_omaha_holdem_7739_3s6c6hAsJs_5d6sJh7h_Jd4d8hTd_Tc9sTh2c() {
    assertEquals(
      "Tc9sTh2c Jd4d8hTd 5d6sJh7h",
      Solver.process("omaha-holdem 3s6c6hAsJs 5d6sJh7h Jd4d8hTd Tc9sTh2c"));
  }

  @Test
  public void test_omaha_holdem_7740_5c7cAcJdTh_TdQs2s9d_4sKcAdTc_Ts6d8s2h_9c8h6cJc_3s7s2c4d_9hAh4cKd() {
    assertEquals(
      "3s7s2c4d Ts6d8s2h TdQs2s9d 9hAh4cKd 9c8h6cJc 4sKcAdTc",
      Solver.process("omaha-holdem 5c7cAcJdTh TdQs2s9d 4sKcAdTc Ts6d8s2h 9c8h6cJc 3s7s2c4d 9hAh4cKd"));
  }

  @Test
  public void test_omaha_holdem_7741_3d4c5cAhJc_Qd8h3hKd_6cQs9s3s_AsQc5s8d() {
    assertEquals(
      "6cQs9s3s Qd8h3hKd AsQc5s8d",
      Solver.process("omaha-holdem 3d4c5cAhJc Qd8h3hKd 6cQs9s3s AsQc5s8d"));
  }

  @Test
  public void test_omaha_holdem_7742_8hAcQcTcTh_Jh7sTd4h_2c3sAdKh_7c5h6hKs_6sKd9h4c_2s2hTs3c_5s9d3hAh_Jd5d9c8c() {
    assertEquals(
      "7c5h6hKs 6sKd9h4c 5s9d3hAh 2c3sAdKh 2s2hTs3c Jh7sTd4h Jd5d9c8c",
      Solver.process("omaha-holdem 8hAcQcTcTh Jh7sTd4h 2c3sAdKh 7c5h6hKs 6sKd9h4c 2s2hTs3c 5s9d3hAh Jd5d9c8c"));
  }

  @Test
  public void test_omaha_holdem_7743_4d7dAhQhTc_8cTd5c2c_JcKc7h4s_7s6d9c6h_2h5h3s9h_7cQsAsKd() {
    assertEquals(
      "2h5h3s9h 7s6d9c6h 8cTd5c2c 7cQsAsKd JcKc7h4s",
      Solver.process("omaha-holdem 4d7dAhQhTc 8cTd5c2c JcKc7h4s 7s6d9c6h 2h5h3s9h 7cQsAsKd"));
  }

  @Test
  public void test_omaha_holdem_7744_2h6h7sAhTd_Jd9s3h5s_7h4h7c5c_8s3d5d4d_Tc8h2cQs_Ks6s2dQc_Qh4cJc8c() {
    assertEquals(
      "8s3d5d4d Jd9s3h5s Qh4cJc8c Ks6s2dQc Tc8h2cQs 7h4h7c5c",
      Solver.process("omaha-holdem 2h6h7sAhTd Jd9s3h5s 7h4h7c5c 8s3d5d4d Tc8h2cQs Ks6s2dQc Qh4cJc8c"));
  }

  @Test
  public void test_omaha_holdem_7745_6d9sAcKsQs_Th9hKh6s_Kc3s4c5c_7cJh5hAs_4d9c7dAh_9dTc5dQd_8c3hJs4h_Jd2sAd6c_3cTsKdJc() {
    assertEquals(
      "8c3hJs4h Kc3s4c5c 7cJh5hAs 9dTc5dQd Th9hKh6s Jd2sAd6c 4d9c7dAh 3cTsKdJc",
      Solver.process("omaha-holdem 6d9sAcKsQs Th9hKh6s Kc3s4c5c 7cJh5hAs 4d9c7dAh 9dTc5dQd 8c3hJs4h Jd2sAd6c 3cTsKdJc"));
  }

  @Test
  public void test_omaha_holdem_7746_3c5h9dAsTs_6dThJs7c_2hJd5sJc_Kc3s7h2s_7sKdAh4c_Qh6sTc9c() {
    assertEquals(
      "Kc3s7h2s 6dThJs7c 2hJd5sJc 7sKdAh4c Qh6sTc9c",
      Solver.process("omaha-holdem 3c5h9dAsTs 6dThJs7c 2hJd5sJc Kc3s7h2s 7sKdAh4c Qh6sTc9c"));
  }

  @Test
  public void test_omaha_holdem_7747_5c8s9cAsTc_4s3d8d4h_5d9s6s3h_5h6c2h9d_9hJdKd6d_Js8hQs4d_KhQd7c2c_Ts8cJc3s_7d2sKc3c_QcJh7hAh() {
    assertEquals(
      "4s3d8d4h 9hJdKd6d 5d9s6s3h=5h6c2h9d Js8hQs4d=QcJh7hAh KhQd7c2c Ts8cJc3s 7d2sKc3c",
      Solver.process("omaha-holdem 5c8s9cAsTc 4s3d8d4h 5d9s6s3h 5h6c2h9d 9hJdKd6d Js8hQs4d KhQd7c2c Ts8cJc3s 7d2sKc3c QcJh7hAh"));
  }

  @Test
  public void test_omaha_holdem_7748_5d5s9hAcQh_7h8cJcTh_8hJhKd4c() {
    assertEquals(
      "7h8cJcTh 8hJhKd4c",
      Solver.process("omaha-holdem 5d5s9hAcQh 7h8cJcTh 8hJhKd4c"));
  }

  @Test
  public void test_omaha_holdem_7749_2d3c4hKdQh_Jd9dKcJc_Ah5h4s6h_3s5s7hTh_Jh4c4d7d_Ad5c5d2h() {
    assertEquals(
      "3s5s7hTh Jd9dKcJc Jh4c4d7d Ad5c5d2h Ah5h4s6h",
      Solver.process("omaha-holdem 2d3c4hKdQh Jd9dKcJc Ah5h4s6h 3s5s7hTh Jh4c4d7d Ad5c5d2h"));
  }

}
