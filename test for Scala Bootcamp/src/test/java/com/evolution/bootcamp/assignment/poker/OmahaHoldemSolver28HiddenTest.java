
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver28HiddenTest {


  @Test
  public void test_omaha_holdem_7000_3h5cAhKdQd_Th5sTdTs_7c3s9c9s_2c8h6d5d() {
    assertEquals(
      "2c8h6d5d 7c3s9c9s Th5sTdTs",
      Solver.process("omaha-holdem 3h5cAhKdQd Th5sTdTs 7c3s9c9s 2c8h6d5d"));
  }

  @Test
  public void test_omaha_holdem_7001_6c6s7h8sJh_4dTc9h2s_3sKs3dAs_AcQdJdKc_Ah2dAd4c_Ts9cKd8d_7c8hQh5c() {
    assertEquals(
      "3sKs3dAs 7c8hQh5c AcQdJdKc Ah2dAd4c 4dTc9h2s=Ts9cKd8d",
      Solver.process("omaha-holdem 6c6s7h8sJh 4dTc9h2s 3sKs3dAs AcQdJdKc Ah2dAd4c Ts9cKd8d 7c8hQh5c"));
  }

  @Test
  public void test_omaha_holdem_7002_3h5s6c6dQh_8d7hKd7s_Qs9h6hKc_2h4c7c3d_9sAh4dTs() {
    assertEquals(
      "9sAh4dTs 8d7hKd7s 2h4c7c3d Qs9h6hKc",
      Solver.process("omaha-holdem 3h5s6c6dQh 8d7hKd7s Qs9h6hKc 2h4c7c3d 9sAh4dTs"));
  }

  @Test
  public void test_omaha_holdem_7003_3d4s9sJhQh_Jd6sAc7c_2hTsThKh_Js3h6h4d_3sQdQc8h() {
    assertEquals(
      "Jd6sAc7c Js3h6h4d 3sQdQc8h 2hTsThKh",
      Solver.process("omaha-holdem 3d4s9sJhQh Jd6sAc7c 2hTsThKh Js3h6h4d 3sQdQc8h"));
  }

  @Test
  public void test_omaha_holdem_7004_7s9hKcQcTd_6h2d6d9c_2h7h6cJd_2c3d3h4s_AhJcAd9d_Qd9s4hKs() {
    assertEquals(
      "2c3d3h4s 2h7h6cJd 6h2d6d9c Qd9s4hKs AhJcAd9d",
      Solver.process("omaha-holdem 7s9hKcQcTd 6h2d6d9c 2h7h6cJd 2c3d3h4s AhJcAd9d Qd9s4hKs"));
  }

  @Test
  public void test_omaha_holdem_7005_2h4hJdJsKs_Kd7dQd9h_Ah5dAd2s() {
    assertEquals(
      "Kd7dQd9h Ah5dAd2s",
      Solver.process("omaha-holdem 2h4hJdJsKs Kd7dQd9h Ah5dAd2s"));
  }

  @Test
  public void test_omaha_holdem_7006_5h7h9d9sTs_3d3h8cTh_Ac7s4sQc_JdKcAh6h_2s3s2d8d_JcQhKs9c() {
    assertEquals(
      "JdKcAh6h 2s3s2d8d Ac7s4sQc 3d3h8cTh JcQhKs9c",
      Solver.process("omaha-holdem 5h7h9d9sTs 3d3h8cTh Ac7s4sQc JdKcAh6h 2s3s2d8d JcQhKs9c"));
  }

  @Test
  public void test_omaha_holdem_7007_2c3dKhQcTs_5h4c4hJh_Tc7c9s5c_AhTd6s8s_8c7h5s2d_3s6dQs6h_KcAd4sJc_7dKsAs2s_AcTh9h9c() {
    assertEquals(
      "8c7h5s2d 5h4c4hJh Tc7c9s5c AcTh9h9c=AhTd6s8s 3s6dQs6h 7dKsAs2s KcAd4sJc",
      Solver.process("omaha-holdem 2c3dKhQcTs 5h4c4hJh Tc7c9s5c AhTd6s8s 8c7h5s2d 3s6dQs6h KcAd4sJc 7dKsAs2s AcTh9h9c"));
  }

  @Test
  public void test_omaha_holdem_7008_6c6sAsJcTc_9h8dQhQs_4h2sKdAc_2c5h9s4d_Jd3d8s2h_4s8h3cTh_QdJsAhTd_4cAd7c7h() {
    assertEquals(
      "2c5h9s4d 4s8h3cTh Jd3d8s2h 9h8dQhQs 4h2sKdAc QdJsAhTd 4cAd7c7h",
      Solver.process("omaha-holdem 6c6sAsJcTc 9h8dQhQs 4h2sKdAc 2c5h9s4d Jd3d8s2h 4s8h3cTh QdJsAhTd 4cAd7c7h"));
  }

  @Test
  public void test_omaha_holdem_7009_3c7d7sKdTh_4d6cQhTc_8d7h6h9d_5c6d3hQs_9sAs4h8s_2d9h6sTs_5s8hJhJs_5dQc3d2s_Jc4sQd7c() {
    assertEquals(
      "9sAs4h8s 5c6d3hQs=5dQc3d2s 2d9h6sTs 4d6cQhTc 5s8hJhJs 8d7h6h9d Jc4sQd7c",
      Solver.process("omaha-holdem 3c7d7sKdTh 4d6cQhTc 8d7h6h9d 5c6d3hQs 9sAs4h8s 2d9h6sTs 5s8hJhJs 5dQc3d2s Jc4sQd7c"));
  }

  @Test
  public void test_omaha_holdem_7010_2h9dJsQdTs_8s3sTh8h_3c2d9c4h_5c6cKcKh_QcJcTcAd_6s8dJd4d() {
    assertEquals(
      "5c6cKcKh 3c2d9c4h QcJcTcAd 6s8dJd4d=8s3sTh8h",
      Solver.process("omaha-holdem 2h9dJsQdTs 8s3sTh8h 3c2d9c4h 5c6cKcKh QcJcTcAd 6s8dJd4d"));
  }

  @Test
  public void test_omaha_holdem_7011_9cAcAhJsKh_Qc6s4hTh_7dKs8h8s_7c3s5d5s_5c5h2d2c_Td8d6c2s_9dJh2h9h_8c4d3cQd() {
    assertEquals(
      "Td8d6c2s 8c4d3cQd 5c5h2d2c=7c3s5d5s 7dKs8h8s Qc6s4hTh 9dJh2h9h",
      Solver.process("omaha-holdem 9cAcAhJsKh Qc6s4hTh 7dKs8h8s 7c3s5d5s 5c5h2d2c Td8d6c2s 9dJh2h9h 8c4d3cQd"));
  }

  @Test
  public void test_omaha_holdem_7012_5s6h8hKcQs_7cQcKh5h_As6c7dJs_TdKd8d3h() {
    assertEquals(
      "As6c7dJs TdKd8d3h 7cQcKh5h",
      Solver.process("omaha-holdem 5s6h8hKcQs 7cQcKh5h As6c7dJs TdKd8d3h"));
  }

  @Test
  public void test_omaha_holdem_7013_8c9cJsQsTd_5hQdAs7h_Ac9s3hKd_Ks7s6h6c_5c2d7dAh_Kc6s4hKh_2s4s5dJd_8dJh9dTc() {
    assertEquals(
      "5c2d7dAh 2s4s5dJd 5hQdAs7h Kc6s4hKh Ks7s6h6c 8dJh9dTc Ac9s3hKd",
      Solver.process("omaha-holdem 8c9cJsQsTd 5hQdAs7h Ac9s3hKd Ks7s6h6c 5c2d7dAh Kc6s4hKh 2s4s5dJd 8dJh9dTc"));
  }

  @Test
  public void test_omaha_holdem_7014_3s9hJcKsTh_Kc2c8c7s_Ad4hKh6h() {
    assertEquals(
      "Ad4hKh6h Kc2c8c7s",
      Solver.process("omaha-holdem 3s9hJcKsTh Kc2c8c7s Ad4hKh6h"));
  }

  @Test
  public void test_omaha_holdem_7015_4c7s9sJdQh_8d5cJc9c_KhTh2d2h_6hKd9h7h_TsQc3s2c_9dAs4h8h_KcAdTc5s_Ah3d6s6c() {
    assertEquals(
      "Ah3d6s6c TsQc3s2c 9dAs4h8h 6hKd9h7h 8d5cJc9c KcAdTc5s=KhTh2d2h",
      Solver.process("omaha-holdem 4c7s9sJdQh 8d5cJc9c KhTh2d2h 6hKd9h7h TsQc3s2c 9dAs4h8h KcAdTc5s Ah3d6s6c"));
  }

  @Test
  public void test_omaha_holdem_7016_3s4h6sKcKh_AhJsQcQd_ThAd5sKd_TdQsAsTs() {
    assertEquals(
      "TdQsAsTs AhJsQcQd ThAd5sKd",
      Solver.process("omaha-holdem 3s4h6sKcKh AhJsQcQd ThAd5sKd TdQsAsTs"));
  }

  @Test
  public void test_omaha_holdem_7017_3d4d7h9hTh_5d9s8cQc_7s2c3sJs_5h4h6c5s_Kd2h2sJc_3hAcTcKs_QhAdQsTs_Qd6d9c7d() {
    assertEquals(
      "Kd2h2sJc 5d9s8cQc QhAdQsTs 7s2c3sJs Qd6d9c7d 3hAcTcKs 5h4h6c5s",
      Solver.process("omaha-holdem 3d4d7h9hTh 5d9s8cQc 7s2c3sJs 5h4h6c5s Kd2h2sJc 3hAcTcKs QhAdQsTs Qd6d9c7d"));
  }

  @Test
  public void test_omaha_holdem_7018_6s8d8sKhQh_3hJsAdQc_9sJh4sQd_4c6d3sQs_5h2s5d4h_9d5c9c7h() {
    assertEquals(
      "5h2s5d4h 9d5c9c7h 4c6d3sQs 9sJh4sQd 3hJsAdQc",
      Solver.process("omaha-holdem 6s8d8sKhQh 3hJsAdQc 9sJh4sQd 4c6d3sQs 5h2s5d4h 9d5c9c7h"));
  }

  @Test
  public void test_omaha_holdem_7019_2d5s9sAcKd_QdJd7d7s_Qh8s6cKc_Qs6d3c4c_TsJs4sTd_6h9d6s5c_Jc4d3s8d_9hThKsQc() {
    assertEquals(
      "QdJd7d7s TsJs4sTd Qh8s6cKc 6h9d6s5c 9hThKsQc Jc4d3s8d=Qs6d3c4c",
      Solver.process("omaha-holdem 2d5s9sAcKd QdJd7d7s Qh8s6cKc Qs6d3c4c TsJs4sTd 6h9d6s5c Jc4d3s8d 9hThKsQc"));
  }

  @Test
  public void test_omaha_holdem_7020_5s7hJcJdQh_3cKdJsQd_TdKh6sKc_Ah7dTs3d_As6d7c9h_2dTcAdAc_5c4s4c9d() {
    assertEquals(
      "5c4s4c9d Ah7dTs3d=As6d7c9h TdKh6sKc 2dTcAdAc 3cKdJsQd",
      Solver.process("omaha-holdem 5s7hJcJdQh 3cKdJsQd TdKh6sKc Ah7dTs3d As6d7c9h 2dTcAdAc 5c4s4c9d"));
  }

  @Test
  public void test_omaha_holdem_7021_2d5s9cJsTs_Th6c7dKs_5c9s2s5h_4s3hJc8s_Qc3sKdQd_AcQs8h6d_Td7h2c8c() {
    assertEquals(
      "Th6c7dKs Td7h2c8c AcQs8h6d Qc3sKdQd 4s3hJc8s 5c9s2s5h",
      Solver.process("omaha-holdem 2d5s9cJsTs Th6c7dKs 5c9s2s5h 4s3hJc8s Qc3sKdQd AcQs8h6d Td7h2c8c"));
  }

  @Test
  public void test_omaha_holdem_7022_2d3s9sKsTs_JhJc6h8c_6d5h6s4s_3d5cQh8h_As3cKd8d_Qs8s4h2s_Js4d6cJd_Ah7hTh5s() {
    assertEquals(
      "3d5cQh8h Ah7hTh5s JhJc6h8c=Js4d6cJd As3cKd8d 6d5h6s4s Qs8s4h2s",
      Solver.process("omaha-holdem 2d3s9sKsTs JhJc6h8c 6d5h6s4s 3d5cQh8h As3cKd8d Qs8s4h2s Js4d6cJd Ah7hTh5s"));
  }

  @Test
  public void test_omaha_holdem_7023_5c6h6sAhTd_3cJs7d9d_3h9cJd7h_Kc8dJh4c_5dJc2c7s_4sTsQdKd_3s6c5h8c_KsAc8h2s_2h7c8s9s_QcAd4hTh() {
    assertEquals(
      "2h7c8s9s 3cJs7d9d=3h9cJd7h Kc8dJh4c 5dJc2c7s 4sTsQdKd KsAc8h2s QcAd4hTh 3s6c5h8c",
      Solver.process("omaha-holdem 5c6h6sAhTd 3cJs7d9d 3h9cJd7h Kc8dJh4c 5dJc2c7s 4sTsQdKd 3s6c5h8c KsAc8h2s 2h7c8s9s QcAd4hTh"));
  }

  @Test
  public void test_omaha_holdem_7024_4c7d7sAdJd_4d9hAs8s_2h5d9dKh() {
    assertEquals(
      "4d9hAs8s 2h5d9dKh",
      Solver.process("omaha-holdem 4c7d7sAdJd 4d9hAs8s 2h5d9dKh"));
  }

  @Test
  public void test_omaha_holdem_7025_2h5s6h8dQd_Qh4s2sAs_Td7s5d7h_5c3cTc5h() {
    assertEquals(
      "Td7s5d7h Qh4s2sAs 5c3cTc5h",
      Solver.process("omaha-holdem 2h5s6h8dQd Qh4s2sAs Td7s5d7h 5c3cTc5h"));
  }

  @Test
  public void test_omaha_holdem_7026_3h7d8h9sJc_AcQdKs6d_2hTd9d5d() {
    assertEquals(
      "AcQdKs6d 2hTd9d5d",
      Solver.process("omaha-holdem 3h7d8h9sJc AcQdKs6d 2hTd9d5d"));
  }

  @Test
  public void test_omaha_holdem_7027_2h3c6c6s8h_TcAh4h8d_3sTh9s7h_2dKsQsTs_As4s9c3d_KcQcTd6h_Qd6dAd7s_Jc5hKh4d() {
    assertEquals(
      "2dKsQsTs 3sTh9s7h As4s9c3d TcAh4h8d KcQcTd6h Qd6dAd7s Jc5hKh4d",
      Solver.process("omaha-holdem 2h3c6c6s8h TcAh4h8d 3sTh9s7h 2dKsQsTs As4s9c3d KcQcTd6h Qd6dAd7s Jc5hKh4d"));
  }

  @Test
  public void test_omaha_holdem_7028_3s6c8sQcQs_7hJcJdTh_QdAs9hTs_4s4c2s2h_9s7c7s2c_Ac6sTd8d_8h4h9cQh_5d4dAh6h_Ks7d3d3h() {
    assertEquals(
      "5d4dAh6h Ac6sTd8d 7hJcJdTh 4s4c2s2h 9s7c7s2c QdAs9hTs Ks7d3d3h 8h4h9cQh",
      Solver.process("omaha-holdem 3s6c8sQcQs 7hJcJdTh QdAs9hTs 4s4c2s2h 9s7c7s2c Ac6sTd8d 8h4h9cQh 5d4dAh6h Ks7d3d3h"));
  }

  @Test
  public void test_omaha_holdem_7029_9sAhJcJsKc_8c2s5c3c_JdJhTs5s_3hTd2d6d_Tc4d4c8s_QsKs7d2h_5d8dAc5h() {
    assertEquals(
      "8c2s5c3c 3hTd2d6d Tc4d4c8s QsKs7d2h 5d8dAc5h JdJhTs5s",
      Solver.process("omaha-holdem 9sAhJcJsKc 8c2s5c3c JdJhTs5s 3hTd2d6d Tc4d4c8s QsKs7d2h 5d8dAc5h"));
  }

  @Test
  public void test_omaha_holdem_7030_3d4d9hJhJs_Ts7s5h4c_7hJd7dKs_4hKc5c9d_8c2dAdTd_7c6c2hKh_As8dThQs_3s5dTc3c_Jc9cAcQh_9s6s5s3h() {
    assertEquals(
      "7c6c2hKh 8c2dAdTd As8dThQs Ts7s5h4c 9s6s5s3h 4hKc5c9d 7hJd7dKs 3s5dTc3c Jc9cAcQh",
      Solver.process("omaha-holdem 3d4d9hJhJs Ts7s5h4c 7hJd7dKs 4hKc5c9d 8c2dAdTd 7c6c2hKh As8dThQs 3s5dTc3c Jc9cAcQh 9s6s5s3h"));
  }

  @Test
  public void test_omaha_holdem_7031_2s5d5sJsQs_3s9d4hAs_8s7s6s8d_6d3c3h6c_AdTh2hKh_QcQd2cJh() {
    assertEquals(
      "AdTh2hKh 6d3c3h6c 8s7s6s8d 3s9d4hAs QcQd2cJh",
      Solver.process("omaha-holdem 2s5d5sJsQs 3s9d4hAs 8s7s6s8d 6d3c3h6c AdTh2hKh QcQd2cJh"));
  }

  @Test
  public void test_omaha_holdem_7032_2d2h7s8sQh_9sJhThJs_Ks4dAd5c_3c2sJcTd() {
    assertEquals(
      "Ks4dAd5c 9sJhThJs 3c2sJcTd",
      Solver.process("omaha-holdem 2d2h7s8sQh 9sJhThJs Ks4dAd5c 3c2sJcTd"));
  }

  @Test
  public void test_omaha_holdem_7033_2c3h8sKhQh_TcJd6sJs_5d7d3dTd_4d5h6cQc_8d3cTh2s_3s4h4sJc_AsAh9h9s_7h9d2h8h() {
    assertEquals(
      "5d7d3dTd 3s4h4sJc TcJd6sJs 4d5h6cQc 8d3cTh2s 7h9d2h8h AsAh9h9s",
      Solver.process("omaha-holdem 2c3h8sKhQh TcJd6sJs 5d7d3dTd 4d5h6cQc 8d3cTh2s 3s4h4sJc AsAh9h9s 7h9d2h8h"));
  }

  @Test
  public void test_omaha_holdem_7034_5h8d9hKcKs_JcJsAcAd_6dTs9d6h_3d8c4s5s_8sJd6c7c_2hTd4h2c_Tc7hAs8h_3sQs9sQh_3cQc4d6s_4c7s2d5c() {
    assertEquals(
      "3cQc4d6s 2hTd4h2c 4c7s2d5c 3d8c4s5s Tc7hAs8h 6dTs9d6h 3sQs9sQh JcJsAcAd 8sJd6c7c",
      Solver.process("omaha-holdem 5h8d9hKcKs JcJsAcAd 6dTs9d6h 3d8c4s5s 8sJd6c7c 2hTd4h2c Tc7hAs8h 3sQs9sQh 3cQc4d6s 4c7s2d5c"));
  }

  @Test
  public void test_omaha_holdem_7035_7c8h8s9cJh_Qc5h8c9d_4hQs4dAd_Th6h3cAc_4cQhTc9s_6s2dKhAh_2s7sKd7h() {
    assertEquals(
      "6s2dKhAh 4hQs4dAd Th6h3cAc 4cQhTc9s 2s7sKd7h Qc5h8c9d",
      Solver.process("omaha-holdem 7c8h8s9cJh Qc5h8c9d 4hQs4dAd Th6h3cAc 4cQhTc9s 6s2dKhAh 2s7sKd7h"));
  }

  @Test
  public void test_omaha_holdem_7036_2s4h6sJcTd_Ks5sAd7c_KdTs2d8d_KhAsJd2c_6d5d4cQh_Js7s7d5c() {
    assertEquals(
      "Ks5sAd7c Js7s7d5c 6d5d4cQh KdTs2d8d KhAsJd2c",
      Solver.process("omaha-holdem 2s4h6sJcTd Ks5sAd7c KdTs2d8d KhAsJd2c 6d5d4cQh Js7s7d5c"));
  }

  @Test
  public void test_omaha_holdem_7037_2h5s6h7sQs_Ah8sQd8d_7d6d9hKd_JcTsJh9c_AcTh9dKh_2c3d4cAs_7c6c8h4d_3h6s7hJd_5hQc9s3c() {
    assertEquals(
      "AcTh9dKh JcTsJh9c Ah8sQd8d 3h6s7hJd=7d6d9hKd 5hQc9s3c 2c3d4cAs 7c6c8h4d",
      Solver.process("omaha-holdem 2h5s6h7sQs Ah8sQd8d 7d6d9hKd JcTsJh9c AcTh9dKh 2c3d4cAs 7c6c8h4d 3h6s7hJd 5hQc9s3c"));
  }

  @Test
  public void test_omaha_holdem_7038_5h9hAhKcKd_4dQsJdAs_5s7sJc9s_8hKh3hJh_3s3d2d8d_Ad9cAcQh_5c3c2h8s_Ks6cJs7h_Th5d4c6s_4s6d7dQc() {
    assertEquals(
      "4s6d7dQc 3s3d2d8d 5c3c2h8s Th5d4c6s 5s7sJc9s 4dQsJdAs Ks6cJs7h 8hKh3hJh Ad9cAcQh",
      Solver.process("omaha-holdem 5h9hAhKcKd 4dQsJdAs 5s7sJc9s 8hKh3hJh 3s3d2d8d Ad9cAcQh 5c3c2h8s Ks6cJs7h Th5d4c6s 4s6d7dQc"));
  }

  @Test
  public void test_omaha_holdem_7039_4s5d6c7h8s_3dKd3hTd_Qs6h7c9s_6d5h4hJh_8h3sJd6s_Qd7s9h4d_8d9cTs2h_As5cAc3c_Qc8c2sTc_Js4cKhAd() {
    assertEquals(
      "3dKd3hTd Js4cKhAd Qc8c2sTc As5cAc3c 6d5h4hJh=8h3sJd6s Qd7s9h4d=Qs6h7c9s 8d9cTs2h",
      Solver.process("omaha-holdem 4s5d6c7h8s 3dKd3hTd Qs6h7c9s 6d5h4hJh 8h3sJd6s Qd7s9h4d 8d9cTs2h As5cAc3c Qc8c2sTc Js4cKhAd"));
  }

  @Test
  public void test_omaha_holdem_7040_2d3d6c9cKd_Qs8d7s4h_Jd8hKs5d_Ac5s5hAs_Tc3s3hJs_AdJh2h7h_3c7dKc9h_Jc2s2cTs_7c5c8c8s_4s6dAh4d() {
    assertEquals(
      "Qs8d7s4h AdJh2h7h 7c5c8c8s Ac5s5hAs 3c7dKc9h Jc2s2cTs Tc3s3hJs 4s6dAh4d Jd8hKs5d",
      Solver.process("omaha-holdem 2d3d6c9cKd Qs8d7s4h Jd8hKs5d Ac5s5hAs Tc3s3hJs AdJh2h7h 3c7dKc9h Jc2s2cTs 7c5c8c8s 4s6dAh4d"));
  }

  @Test
  public void test_omaha_holdem_7041_4d5c7dAdAh_8h5hJd9h_9dKh6s5d() {
    assertEquals(
      "8h5hJd9h 9dKh6s5d",
      Solver.process("omaha-holdem 4d5c7dAdAh 8h5hJd9h 9dKh6s5d"));
  }

  @Test
  public void test_omaha_holdem_7042_4d5d6cKcTc_TdJh6s6h_7cAhAd5h_3sJcKd9h_9sKsQh7d_2s5s2cQd_Ac2hAsTs_Qs3c8cTh_6dJd3d9d_4hJs2d9c() {
    assertEquals(
      "4hJs2d9c 2s5s2cQd 6dJd3d9d 3sJcKd9h 9sKsQh7d 7cAhAd5h=Ac2hAsTs TdJh6s6h Qs3c8cTh",
      Solver.process("omaha-holdem 4d5d6cKcTc TdJh6s6h 7cAhAd5h 3sJcKd9h 9sKsQh7d 2s5s2cQd Ac2hAsTs Qs3c8cTh 6dJd3d9d 4hJs2d9c"));
  }

  @Test
  public void test_omaha_holdem_7043_2c2d4d6cQc_6sAc6dAd_AhJhAs4h() {
    assertEquals(
      "AhJhAs4h 6sAc6dAd",
      Solver.process("omaha-holdem 2c2d4d6cQc 6sAc6dAd AhJhAs4h"));
  }

  @Test
  public void test_omaha_holdem_7044_2c6h8cJsKs_9d4hAdQd_7sKhTd3s_8h5h8sJh_9s4d5c2s_4s4cAh6d_Qc6s3h2d_9hAsQsTs() {
    assertEquals(
      "9d4hAdQd=9hAsQsTs 9s4d5c2s 4s4cAh6d 7sKhTd3s Qc6s3h2d 8h5h8sJh",
      Solver.process("omaha-holdem 2c6h8cJsKs 9d4hAdQd 7sKhTd3s 8h5h8sJh 9s4d5c2s 4s4cAh6d Qc6s3h2d 9hAsQsTs"));
  }

  @Test
  public void test_omaha_holdem_7045_2d2s3hJcTd_9d9c9sTc_Ks8s5h4d_8cKh6hQh_Jh7d5d2h_3s6cKdAd_8dJd5sTs_5c7cKc9h_6sThAs3d() {
    assertEquals(
      "Ks8s5h4d 5c7cKc9h 8cKh6hQh 3s6cKdAd 9d9c9sTc 6sThAs3d 8dJd5sTs Jh7d5d2h",
      Solver.process("omaha-holdem 2d2s3hJcTd 9d9c9sTc Ks8s5h4d 8cKh6hQh Jh7d5d2h 3s6cKdAd 8dJd5sTs 5c7cKc9h 6sThAs3d"));
  }

  @Test
  public void test_omaha_holdem_7046_3d6c7h9dQd_9hAhJh4d_5sKdQsAs_Ts3sJsAc_7c8c5h7s() {
    assertEquals(
      "Ts3sJsAc 9hAhJh4d 5sKdQsAs 7c8c5h7s",
      Solver.process("omaha-holdem 3d6c7h9dQd 9hAhJh4d 5sKdQsAs Ts3sJsAc 7c8c5h7s"));
  }

  @Test
  public void test_omaha_holdem_7047_2h6d6s9c9d_ThQd7c4h_7s3d3c6h_8sJsTc6c_JdQc2c5h_KsQs3hKc_4s2dAc4c() {
    assertEquals(
      "ThQd7c4h JdQc2c5h 4s2dAc4c KsQs3hKc 7s3d3c6h 8sJsTc6c",
      Solver.process("omaha-holdem 2h6d6s9c9d ThQd7c4h 7s3d3c6h 8sJsTc6c JdQc2c5h KsQs3hKc 4s2dAc4c"));
  }

  @Test
  public void test_omaha_holdem_7048_7sJcJhKhKs_3c2s9c2d_8s8h7d8c_3s6cAsJd_2h7hAd4d_6hKc4sTc_6sQcAh4h() {
    assertEquals(
      "6sQcAh4h 3c2s9c2d 2h7hAd4d 8s8h7d8c 3s6cAsJd 6hKc4sTc",
      Solver.process("omaha-holdem 7sJcJhKhKs 3c2s9c2d 8s8h7d8c 3s6cAsJd 2h7hAd4d 6hKc4sTc 6sQcAh4h"));
  }

  @Test
  public void test_omaha_holdem_7049_5s7cAdKsQh_4s7sKh9d_3cJcAcKc_5h8s3d7d_Jh6cAsTs_4hQs8d6s() {
    assertEquals(
      "4hQs8d6s 5h8s3d7d 4s7sKh9d 3cJcAcKc Jh6cAsTs",
      Solver.process("omaha-holdem 5s7cAdKsQh 4s7sKh9d 3cJcAcKc 5h8s3d7d Jh6cAsTs 4hQs8d6s"));
  }

  @Test
  public void test_omaha_holdem_7050_3d8d9cJdQc_Qh6s3cKh_5c6cJc5s_6hKdJsAd_2s2h9h5h_7s8s3h6d_Ah5dTc8h_4s7cKs8c_AsQs7hTd() {
    assertEquals(
      "4s7cKs8c 2s2h9h5h 5c6cJc5s 7s8s3h6d Qh6s3cKh Ah5dTc8h=AsQs7hTd 6hKdJsAd",
      Solver.process("omaha-holdem 3d8d9cJdQc Qh6s3cKh 5c6cJc5s 6hKdJsAd 2s2h9h5h 7s8s3h6d Ah5dTc8h 4s7cKs8c AsQs7hTd"));
  }

  @Test
  public void test_omaha_holdem_7051_3s4c4s9cQh_2dJh6h3c_9sKdJc8h_KhAhAcQc_4hJd7c2h_2s3h9dJs_8dThQd5c() {
    assertEquals(
      "2dJh6h3c 2s3h9dJs 9sKdJc8h 8dThQd5c KhAhAcQc 4hJd7c2h",
      Solver.process("omaha-holdem 3s4c4s9cQh 2dJh6h3c 9sKdJc8h KhAhAcQc 4hJd7c2h 2s3h9dJs 8dThQd5c"));
  }

  @Test
  public void test_omaha_holdem_7052_2c7c7d9dTd_Qh5c9sKh_4d6d6cJd_Js3c2s9c_6s3s7sAc_6h8c7h5s_8s3h8hQd_5d8dQcAs_9h3d4sJc() {
    assertEquals(
      "8s3h8hQd 9h3d4sJc=Js3c2s9c Qh5c9sKh 6s3s7sAc 6h8c7h5s 5d8dQcAs 4d6d6cJd",
      Solver.process("omaha-holdem 2c7c7d9dTd Qh5c9sKh 4d6d6cJd Js3c2s9c 6s3s7sAc 6h8c7h5s 8s3h8hQd 5d8dQcAs 9h3d4sJc"));
  }

  @Test
  public void test_omaha_holdem_7053_2d3c5d8sAd_Ts5sQdJd_6hQc2hKd_8d3h4d2c() {
    assertEquals(
      "6hQc2hKd 8d3h4d2c Ts5sQdJd",
      Solver.process("omaha-holdem 2d3c5d8sAd Ts5sQdJd 6hQc2hKd 8d3h4d2c"));
  }

  @Test
  public void test_omaha_holdem_7054_5d8dJdKhQd_2dQcJs4h_8c6s9d7h() {
    assertEquals(
      "8c6s9d7h 2dQcJs4h",
      Solver.process("omaha-holdem 5d8dJdKhQd 2dQcJs4h 8c6s9d7h"));
  }

  @Test
  public void test_omaha_holdem_7055_2h9hAdAhQc_Qh4h4s8s_Js2d5c2c_3sKhKd5h_Tc6d2s7c_8h4d4c8c_Th7d9c9s_5d8d7hAs_6hKc7s3h_3dJhQdJc() {
    assertEquals(
      "Tc6d2s7c 8h4d4c8c 3dJhQdJc 5d8d7hAs 6hKc7s3h Qh4h4s8s 3sKhKd5h Js2d5c2c Th7d9c9s",
      Solver.process("omaha-holdem 2h9hAdAhQc Qh4h4s8s Js2d5c2c 3sKhKd5h Tc6d2s7c 8h4d4c8c Th7d9c9s 5d8d7hAs 6hKc7s3h 3dJhQdJc"));
  }

  @Test
  public void test_omaha_holdem_7056_5d8d8h9dKh_5h3cAs2d_QhJh5c5s_AdKsTdJs_2s8sJd4d_4c6cKd6s_7dTs3dTh() {
    assertEquals(
      "5h3cAs2d 4c6cKd6s 7dTs3dTh 2s8sJd4d AdKsTdJs QhJh5c5s",
      Solver.process("omaha-holdem 5d8d8h9dKh 5h3cAs2d QhJh5c5s AdKsTdJs 2s8sJd4d 4c6cKd6s 7dTs3dTh"));
  }

  @Test
  public void test_omaha_holdem_7057_2c3d4d8hKd_TdTs4h6d_7h2d9c3s_5dAd9s5h_Ah2h9hJh() {
    assertEquals(
      "Ah2h9hJh 7h2d9c3s TdTs4h6d 5dAd9s5h",
      Solver.process("omaha-holdem 2c3d4d8hKd TdTs4h6d 7h2d9c3s 5dAd9s5h Ah2h9hJh"));
  }

  @Test
  public void test_omaha_holdem_7058_3h5s6d9dQh_2s4s3c4h_5c9hAsJd_8sJh3d2d() {
    assertEquals(
      "8sJh3d2d 5c9hAsJd 2s4s3c4h",
      Solver.process("omaha-holdem 3h5s6d9dQh 2s4s3c4h 5c9hAsJd 8sJh3d2d"));
  }

  @Test
  public void test_omaha_holdem_7059_2d2h3c5cAd_Jd4s6d2c_Th7dJh3h_Jc4c8dQc_As5dKc4h_6c7sTc8s_KhAh9sQd_8cQs9c5h() {
    assertEquals(
      "6c7sTc8s Jc4c8dQc Th7dJh3h 8cQs9c5h KhAh9sQd As5dKc4h Jd4s6d2c",
      Solver.process("omaha-holdem 2d2h3c5cAd Jd4s6d2c Th7dJh3h Jc4c8dQc As5dKc4h 6c7sTc8s KhAh9sQd 8cQs9c5h"));
  }

  @Test
  public void test_omaha_holdem_7060_6c6hAhJcKs_4s8cTcTd_As4h7c9c_5d3c3h3s_9hQh7h2d_5s7dTh4c_4d5cJdAc_Kc8sAdKh() {
    assertEquals(
      "5s7dTh4c 9hQh7h2d 5d3c3h3s 4s8cTcTd As4h7c9c 4d5cJdAc Kc8sAdKh",
      Solver.process("omaha-holdem 6c6hAhJcKs 4s8cTcTd As4h7c9c 5d3c3h3s 9hQh7h2d 5s7dTh4c 4d5cJdAc Kc8sAdKh"));
  }

  @Test
  public void test_omaha_holdem_7061_3d4dKhTcTh_7cAcJc2c_Kc6d4s2h_Ts9s3cAh() {
    assertEquals(
      "7cAcJc2c Kc6d4s2h Ts9s3cAh",
      Solver.process("omaha-holdem 3d4dKhTcTh 7cAcJc2c Kc6d4s2h Ts9s3cAh"));
  }

  @Test
  public void test_omaha_holdem_7062_4s5d7h9hQc_ThJc3h4h_AhKs9cKh_5sTc3cQd_2sTd2h4c() {
    assertEquals(
      "2sTd2h4c ThJc3h4h AhKs9cKh 5sTc3cQd",
      Solver.process("omaha-holdem 4s5d7h9hQc ThJc3h4h AhKs9cKh 5sTc3cQd 2sTd2h4c"));
  }

  @Test
  public void test_omaha_holdem_7063_4h4s8sJhQc_4c3h7hQd_Ac8c9dTs_8d3s6d6h_KhJd3c2c_Jc5c7s9s_KsTd6s4d_Th5hTc2s_KcAs5d2h() {
    assertEquals(
      "KcAs5d2h 8d3s6d6h Th5hTc2s Jc5c7s9s KhJd3c2c KsTd6s4d Ac8c9dTs 4c3h7hQd",
      Solver.process("omaha-holdem 4h4s8sJhQc 4c3h7hQd Ac8c9dTs 8d3s6d6h KhJd3c2c Jc5c7s9s KsTd6s4d Th5hTc2s KcAs5d2h"));
  }

  @Test
  public void test_omaha_holdem_7064_2s5h8hAsTc_KdTs3h4s_5sKcKsQd_4hQh4cJc_9h5d3dQc_5c7d3cJs_Td2dAh6h_JhJd8dKh_Ac9sQs7s() {
    assertEquals(
      "4hQh4cJc 5c7d3cJs 9h5d3dQc JhJd8dKh 5sKcKsQd Ac9sQs7s Td2dAh6h KdTs3h4s",
      Solver.process("omaha-holdem 2s5h8hAsTc KdTs3h4s 5sKcKsQd 4hQh4cJc 9h5d3dQc 5c7d3cJs Td2dAh6h JhJd8dKh Ac9sQs7s"));
  }

  @Test
  public void test_omaha_holdem_7065_2s5s7dQcQh_Ad8c9d2d_3cKh6h4h_JdAs4s4c_Ah5h5d7s_2hKd3sKs_8h6c9h6d() {
    assertEquals(
      "3cKh6h4h Ad8c9d2d JdAs4s4c 8h6c9h6d 2hKd3sKs Ah5h5d7s",
      Solver.process("omaha-holdem 2s5s7dQcQh Ad8c9d2d 3cKh6h4h JdAs4s4c Ah5h5d7s 2hKd3sKs 8h6c9h6d"));
  }

  @Test
  public void test_omaha_holdem_7066_2s6s9hJcKh_QcAc9d7d_5sThJd2h() {
    assertEquals(
      "QcAc9d7d 5sThJd2h",
      Solver.process("omaha-holdem 2s6s9hJcKh QcAc9d7d 5sThJd2h"));
  }

  @Test
  public void test_omaha_holdem_7067_6s7c8dAdTs_ThAc6d6c_7hAh8s9c_2c5s5dKh_JsKd3sTd_7d4sJdJc_7s4c3c5c_QsJh2d9h() {
    assertEquals(
      "2c5s5dKh JsKd3sTd 7d4sJdJc ThAc6d6c 7s4c3c5c 7hAh8s9c QsJh2d9h",
      Solver.process("omaha-holdem 6s7c8dAdTs ThAc6d6c 7hAh8s9c 2c5s5dKh JsKd3sTd 7d4sJdJc 7s4c3c5c QsJh2d9h"));
  }

  @Test
  public void test_omaha_holdem_7068_3c3s8hTcTd_JsAs5d6d_Qs7hAh6c_JcKdQhAd_4d9dKs8c_ThJd6sQc() {
    assertEquals(
      "JsAs5d6d Qs7hAh6c JcKdQhAd 4d9dKs8c ThJd6sQc",
      Solver.process("omaha-holdem 3c3s8hTcTd JsAs5d6d Qs7hAh6c JcKdQhAd 4d9dKs8c ThJd6sQc"));
  }

  @Test
  public void test_omaha_holdem_7069_7cKsQsTdTh_Ac4cJh2d_9c5s6hKc_7d4d2s2c() {
    assertEquals(
      "7d4d2s2c 9c5s6hKc Ac4cJh2d",
      Solver.process("omaha-holdem 7cKsQsTdTh Ac4cJh2d 9c5s6hKc 7d4d2s2c"));
  }

  @Test
  public void test_omaha_holdem_7070_2h4d8h9sAd_Kd5s7s5d_Jd3cKhJc_9h7c3sTc() {
    assertEquals(
      "Kd5s7s5d 9h7c3sTc Jd3cKhJc",
      Solver.process("omaha-holdem 2h4d8h9sAd Kd5s7s5d Jd3cKhJc 9h7c3sTc"));
  }

  @Test
  public void test_omaha_holdem_7071_3d5s6s7dQd_JhKc5d3s_4h7hAd8s_4sJd2c4c_Td6cQc2h_7sTc3c9c_2d7c4dTh_KsJs6h9s_Kd3h8h9d_8dTsAc5h() {
    assertEquals(
      "8dTsAc5h KsJs6h9s JhKc5d3s 7sTc3c9c Td6cQc2h 4sJd2c4c 4h7hAd8s 2d7c4dTh Kd3h8h9d",
      Solver.process("omaha-holdem 3d5s6s7dQd JhKc5d3s 4h7hAd8s 4sJd2c4c Td6cQc2h 7sTc3c9c 2d7c4dTh KsJs6h9s Kd3h8h9d 8dTsAc5h"));
  }

  @Test
  public void test_omaha_holdem_7072_4d4s5c7sTc_5dJh7dKd_Jd4cQd3h_QhAhKcTh_7h7cQc9c_Kh8d8s3d() {
    assertEquals(
      "5dJh7dKd Kh8d8s3d QhAhKcTh Jd4cQd3h 7h7cQc9c",
      Solver.process("omaha-holdem 4d4s5c7sTc 5dJh7dKd Jd4cQd3h QhAhKcTh 7h7cQc9c Kh8d8s3d"));
  }

  @Test
  public void test_omaha_holdem_7073_5c6s8c9cAs_4h6h9dKc_Tc7h5dQh_Jh4d5hAh() {
    assertEquals(
      "4h6h9dKc Jh4d5hAh Tc7h5dQh",
      Solver.process("omaha-holdem 5c6s8c9cAs 4h6h9dKc Tc7h5dQh Jh4d5hAh"));
  }

  @Test
  public void test_omaha_holdem_7074_3s4sJcJdQd_7c7d9d2c_6sKcTsJs() {
    assertEquals(
      "7c7d9d2c 6sKcTsJs",
      Solver.process("omaha-holdem 3s4sJcJdQd 7c7d9d2c 6sKcTsJs"));
  }

  @Test
  public void test_omaha_holdem_7075_2s4c6d6hAs_QdJhAd6c_Qs9d7hAh_Kh9s2h3h_8c9c7c3d_4d5c7dQh_4h6sJc7s_Ts5dTc2c_KdQcJdAc_Td5hTh8s() {
    assertEquals(
      "8c9c7c3d Kh9s2h3h 4d5c7dQh Td5hTh8s=Ts5dTc2c Qs9d7hAh KdQcJdAc 4h6sJc7s QdJhAd6c",
      Solver.process("omaha-holdem 2s4c6d6hAs QdJhAd6c Qs9d7hAh Kh9s2h3h 8c9c7c3d 4d5c7dQh 4h6sJc7s Ts5dTc2c KdQcJdAc Td5hTh8s"));
  }

  @Test
  public void test_omaha_holdem_7076_4c4h7cAhQd_4sKhKdAc_6s5s3sAs_8h6c4d5c_Jc5dQc2c_8s5h3dAd_Th3h9hKs_Jh7d7h2d_Qh7sJd8c_TcTsJsTd() {
    assertEquals(
      "Th3h9hKs TcTsJsTd Jc5dQc2c Qh7sJd8c 6s5s3sAs 8s5h3dAd 8h6c4d5c 4sKhKdAc Jh7d7h2d",
      Solver.process("omaha-holdem 4c4h7cAhQd 4sKhKdAc 6s5s3sAs 8h6c4d5c Jc5dQc2c 8s5h3dAd Th3h9hKs Jh7d7h2d Qh7sJd8c TcTsJsTd"));
  }

  @Test
  public void test_omaha_holdem_7077_3d6c6s7hQc_2cThJc6h_JdTd7d8d_9cKh2s4c_KdQsQdAc_AdAh3c8h() {
    assertEquals(
      "9cKh2s4c JdTd7d8d AdAh3c8h 2cThJc6h KdQsQdAc",
      Solver.process("omaha-holdem 3d6c6s7hQc 2cThJc6h JdTd7d8d 9cKh2s4c KdQsQdAc AdAh3c8h"));
  }

  @Test
  public void test_omaha_holdem_7078_4c5h8cKdTd_3sJh6h7s_7cJcQsQh_8s4d3c3h_Jd8hKh7d_6s9h2cKs_As5d9c9d() {
    assertEquals(
      "As5d9c9d 7cJcQsQh 6s9h2cKs 8s4d3c3h Jd8hKh7d 3sJh6h7s",
      Solver.process("omaha-holdem 4c5h8cKdTd 3sJh6h7s 7cJcQsQh 8s4d3c3h Jd8hKh7d 6s9h2cKs As5d9c9d"));
  }

  @Test
  public void test_omaha_holdem_7079_4c7c8h9c9d_4hAsAdTc_3s2d2h8c_7d9sJdTd_4sJh7s3c_AhKsQh3d_9h5h6s2c_KdQs6h6d_5sAc4dJc() {
    assertEquals(
      "AhKsQh3d KdQs6h6d 4sJh7s3c 3s2d2h8c 4hAsAdTc 9h5h6s2c 5sAc4dJc 7d9sJdTd",
      Solver.process("omaha-holdem 4c7c8h9c9d 4hAsAdTc 3s2d2h8c 7d9sJdTd 4sJh7s3c AhKsQh3d 9h5h6s2c KdQs6h6d 5sAc4dJc"));
  }

  @Test
  public void test_omaha_holdem_7080_3c7h7s8dTs_8c8hQd2c_9d2d6cAh_JhKs6h3h_TcAs8sTh_4cQs9hJd_9c4s7c9s_Td6dKhKd_5hAd5sJc_Qh5c5dQc() {
    assertEquals(
      "JhKs6h3h 5hAd5sJc Qh5c5dQc Td6dKhKd 9c4s7c9s 9d2d6cAh 4cQs9hJd 8c8hQd2c TcAs8sTh",
      Solver.process("omaha-holdem 3c7h7s8dTs 8c8hQd2c 9d2d6cAh JhKs6h3h TcAs8sTh 4cQs9hJd 9c4s7c9s Td6dKhKd 5hAd5sJc Qh5c5dQc"));
  }

  @Test
  public void test_omaha_holdem_7081_2c2s6sJhQh_7d7h9d8s_5s9sKdAd_Kc5d3dKh_8c2dAsTh_TcJd4sJs_4c3cQc8d() {
    assertEquals(
      "5s9sKdAd 7d7h9d8s 4c3cQc8d Kc5d3dKh 8c2dAsTh TcJd4sJs",
      Solver.process("omaha-holdem 2c2s6sJhQh 7d7h9d8s 5s9sKdAd Kc5d3dKh 8c2dAsTh TcJd4sJs 4c3cQc8d"));
  }

  @Test
  public void test_omaha_holdem_7082_4h5s9sKhQh_Ks3hAd8h_8d2s9h7h_JhTsKc6h_6c6s7dAs() {
    assertEquals(
      "6c6s7dAs Ks3hAd8h 8d2s9h7h JhTsKc6h",
      Solver.process("omaha-holdem 4h5s9sKhQh Ks3hAd8h 8d2s9h7h JhTsKc6h 6c6s7dAs"));
  }

  @Test
  public void test_omaha_holdem_7083_2c2dKdQdQs_9h4d8s9s_JcAcAsJh_7s3h6h6d_Ts5d9c3s() {
    assertEquals(
      "Ts5d9c3s 7s3h6h6d 9h4d8s9s JcAcAsJh",
      Solver.process("omaha-holdem 2c2dKdQdQs 9h4d8s9s JcAcAsJh 7s3h6h6d Ts5d9c3s"));
  }

  @Test
  public void test_omaha_holdem_7084_3d5h6hTdTh_Ah5cQdJc_7c3hQs9d_7sQcKc7d_2s2hAs4c() {
    assertEquals(
      "7c3hQs9d Ah5cQdJc 7sQcKc7d 2s2hAs4c",
      Solver.process("omaha-holdem 3d5h6hTdTh Ah5cQdJc 7c3hQs9d 7sQcKc7d 2s2hAs4c"));
  }

  @Test
  public void test_omaha_holdem_7085_4s5d5h6hAc_7dQd2dKc_9d6sJh5c() {
    assertEquals(
      "7dQd2dKc 9d6sJh5c",
      Solver.process("omaha-holdem 4s5d5h6hAc 7dQd2dKc 9d6sJh5c"));
  }

  @Test
  public void test_omaha_holdem_7086_5c6dAcKsQh_3cQsJc7c_As5h3dTh_Qd6h4h9h_Ts9s4d2c() {
    assertEquals(
      "Ts9s4d2c 3cQsJc7c Qd6h4h9h As5h3dTh",
      Solver.process("omaha-holdem 5c6dAcKsQh 3cQsJc7c As5h3dTh Qd6h4h9h Ts9s4d2c"));
  }

  @Test
  public void test_omaha_holdem_7087_7d7sJcJsTc_4dKs5hKh_2c3s6h4h_Qc8sKdJh_6cKc5d6d_5c9s4c3d_8d9c8h5s_7cAc4s2d_QdAs9d9h_Qh3cJd2s() {
    assertEquals(
      "2c3s6h4h 5c9s4c3d 6cKc5d6d QdAs9d9h 4dKs5hKh 7cAc4s2d Qh3cJd2s Qc8sKdJh 8d9c8h5s",
      Solver.process("omaha-holdem 7d7sJcJsTc 4dKs5hKh 2c3s6h4h Qc8sKdJh 6cKc5d6d 5c9s4c3d 8d9c8h5s 7cAc4s2d QdAs9d9h Qh3cJd2s"));
  }

  @Test
  public void test_omaha_holdem_7088_5d7s8sTcTd_Ks4cJc8d_8cAhAc6h_6s9s5h5c_KcJhQd4d_2s6dAsJd_9c3dQsQc_9d3s6c2d() {
    assertEquals(
      "KcJhQd4d 2s6dAsJd Ks4cJc8d 9c3dQsQc 8cAhAc6h 9d3s6c2d 6s9s5h5c",
      Solver.process("omaha-holdem 5d7s8sTcTd Ks4cJc8d 8cAhAc6h 6s9s5h5c KcJhQd4d 2s6dAsJd 9c3dQsQc 9d3s6c2d"));
  }

  @Test
  public void test_omaha_holdem_7089_2s7c7sQdTs_3d9hAs8d_JcKsAd6s_Kh9d9sJd_2c4sQcKd_8sQh4c5c_Th3h8h8c_Ac4dJs3s() {
    assertEquals(
      "3d9hAs8d Kh9d9sJd Th3h8h8c 8sQh4c5c 2c4sQcKd Ac4dJs3s JcKsAd6s",
      Solver.process("omaha-holdem 2s7c7sQdTs 3d9hAs8d JcKsAd6s Kh9d9sJd 2c4sQcKd 8sQh4c5c Th3h8h8c Ac4dJs3s"));
  }

  @Test
  public void test_omaha_holdem_7090_4s9cAcJcKc_3sKh2hTd_4h3dAs9h_JsAd7cJh_9s3h6cTc_9d3c6s5c_Ks2d2sJd_5h2c5d8c_4d7d6hQc() {
    assertEquals(
      "4d7d6hQc 3sKh2hTd Ks2d2sJd 4h3dAs9h JsAd7cJh 9d3c6s5c 5h2c5d8c 9s3h6cTc",
      Solver.process("omaha-holdem 4s9cAcJcKc 3sKh2hTd 4h3dAs9h JsAd7cJh 9s3h6cTc 9d3c6s5c Ks2d2sJd 5h2c5d8c 4d7d6hQc"));
  }

  @Test
  public void test_omaha_holdem_7091_3c6c6s9dKc_4dTcQhQs_9c2h9hAd() {
    assertEquals(
      "4dTcQhQs 9c2h9hAd",
      Solver.process("omaha-holdem 3c6c6s9dKc 4dTcQhQs 9c2h9hAd"));
  }

  @Test
  public void test_omaha_holdem_7092_7d7sJdKhQc_9cTs9s7c_Jh2sTc6h_8s6dKcAh() {
    assertEquals(
      "Jh2sTc6h 8s6dKcAh 9cTs9s7c",
      Solver.process("omaha-holdem 7d7sJdKhQc 9cTs9s7c Jh2sTc6h 8s6dKcAh"));
  }

  @Test
  public void test_omaha_holdem_7093_2c3d3h6sQc_9d9h2s4s_8cKsTcQs_4c4h2hKc() {
    assertEquals(
      "4c4h2hKc 9d9h2s4s 8cKsTcQs",
      Solver.process("omaha-holdem 2c3d3h6sQc 9d9h2s4s 8cKsTcQs 4c4h2hKc"));
  }

  @Test
  public void test_omaha_holdem_7094_4s5s6h9sAd_Ah4cJd3d_7cQs7d8s_2h3h7hJc_8d4hKs8h_6s9hQcKd_TdKh9c6c_7s5h8cQd_TsQhJh9d_Tc3sAc6d() {
    assertEquals(
      "8d4hKs8h TsQhJh9d 6s9hQcKd=TdKh9c6c Ah4cJd3d Tc3sAc6d 2h3h7hJc 7s5h8cQd 7cQs7d8s",
      Solver.process("omaha-holdem 4s5s6h9sAd Ah4cJd3d 7cQs7d8s 2h3h7hJc 8d4hKs8h 6s9hQcKd TdKh9c6c 7s5h8cQd TsQhJh9d Tc3sAc6d"));
  }

  @Test
  public void test_omaha_holdem_7095_2h4d4h6hJh_Ah4sKh3s_7cAs9d4c_Js8sJc5s_8c3h2sTd_Ks5d9hKd_9cQs5cJd_8h5hQc6d_7d7s2c9s() {
    assertEquals(
      "8c3h2sTd 7d7s2c9s 9cQs5cJd Ks5d9hKd 7cAs9d4c 8h5hQc6d Ah4sKh3s Js8sJc5s",
      Solver.process("omaha-holdem 2h4d4h6hJh Ah4sKh3s 7cAs9d4c Js8sJc5s 8c3h2sTd Ks5d9hKd 9cQs5cJd 8h5hQc6d 7d7s2c9s"));
  }

  @Test
  public void test_omaha_holdem_7096_3d6h9dAdTd_9c8d5hAh_Ac4cKs2h() {
    assertEquals(
      "Ac4cKs2h 9c8d5hAh",
      Solver.process("omaha-holdem 3d6h9dAdTd 9c8d5hAh Ac4cKs2h"));
  }

  @Test
  public void test_omaha_holdem_7097_4c8dKcQcTc_9h9sAsAd_6s7s8cTh() {
    assertEquals(
      "9h9sAsAd 6s7s8cTh",
      Solver.process("omaha-holdem 4c8dKcQcTc 9h9sAsAd 6s7s8cTh"));
  }

  @Test
  public void test_omaha_holdem_7098_6c7cJcKdQs_QhJh9h9s_7hTc8d6s_4c6h8hKc_Ks3d2h4d_As7s3sTh_2d5h6dQc() {
    assertEquals(
      "Ks3d2h4d 7hTc8d6s 2d5h6dQc QhJh9h9s As7s3sTh 4c6h8hKc",
      Solver.process("omaha-holdem 6c7cJcKdQs QhJh9h9s 7hTc8d6s 4c6h8hKc Ks3d2h4d As7s3sTh 2d5h6dQc"));
  }

  @Test
  public void test_omaha_holdem_7099_6h8sAcAsTs_QdKcJc3h_7d2cTh7h() {
    assertEquals(
      "QdKcJc3h 7d2cTh7h",
      Solver.process("omaha-holdem 6h8sAcAsTs QdKcJc3h 7d2cTh7h"));
  }

  @Test
  public void test_omaha_holdem_7100_5c5s6c7s8c_QdKsQsAc_3sQcAh4h_Th6hKcTd() {
    assertEquals(
      "Th6hKcTd QdKsQsAc 3sQcAh4h",
      Solver.process("omaha-holdem 5c5s6c7s8c QdKsQsAc 3sQcAh4h Th6hKcTd"));
  }

  @Test
  public void test_omaha_holdem_7101_4h6h9hKdQh_7hQs7dAc_Jh6d8h8s_6c3c2h8c_Ad9sKh4d() {
    assertEquals(
      "6c3c2h8c 7hQs7dAc Ad9sKh4d Jh6d8h8s",
      Solver.process("omaha-holdem 4h6h9hKdQh 7hQs7dAc Jh6d8h8s 6c3c2h8c Ad9sKh4d"));
  }

  @Test
  public void test_omaha_holdem_7102_5d6h9cTdTs_As4d7hKh_3s4cQcAc() {
    assertEquals(
      "3s4cQcAc As4d7hKh",
      Solver.process("omaha-holdem 5d6h9cTdTs As4d7hKh 3s4cQcAc"));
  }

  @Test
  public void test_omaha_holdem_7103_2s3h3sAdTd_Jd2c2dAh_2hQcKhJh_5s5h8s8c_Qh4hKs3c_6s4s6dAc() {
    assertEquals(
      "2hQcKhJh 5s5h8s8c 6s4s6dAc Qh4hKs3c Jd2c2dAh",
      Solver.process("omaha-holdem 2s3h3sAdTd Jd2c2dAh 2hQcKhJh 5s5h8s8c Qh4hKs3c 6s4s6dAc"));
  }

  @Test
  public void test_omaha_holdem_7104_7c7hKhKsTc_5hKc6dQh_Ad2c4c2s_5dTh9sQs() {
    assertEquals(
      "Ad2c4c2s 5dTh9sQs 5hKc6dQh",
      Solver.process("omaha-holdem 7c7hKhKsTc 5hKc6dQh Ad2c4c2s 5dTh9sQs"));
  }

  @Test
  public void test_omaha_holdem_7105_3h7s8sKhQc_7h8hKcKs_4dJs9h5d_7d4s4h2s_AdKdJd5s_2cAsTdJc() {
    assertEquals(
      "4dJs9h5d 2cAsTdJc 7d4s4h2s AdKdJd5s 7h8hKcKs",
      Solver.process("omaha-holdem 3h7s8sKhQc 7h8hKcKs 4dJs9h5d 7d4s4h2s AdKdJd5s 2cAsTdJc"));
  }

  @Test
  public void test_omaha_holdem_7106_3h7d8h9sAc_4h2s9cJs_9h3cTs8s_AhQd6hKd_2c2d7sTd_6d8c4dTh_9d5dAs3s_4s5sJcQc_5hTcJdQs() {
    assertEquals(
      "4s5sJcQc 2c2d7sTd 4h2s9cJs AhQd6hKd 9h3cTs8s 9d5dAs3s 6d8c4dTh 5hTcJdQs",
      Solver.process("omaha-holdem 3h7d8h9sAc 4h2s9cJs 9h3cTs8s AhQd6hKd 2c2d7sTd 6d8c4dTh 9d5dAs3s 4s5sJcQc 5hTcJdQs"));
  }

  @Test
  public void test_omaha_holdem_7107_2d5d6sAcJh_9h7c8dQd_Kd9c7dAs_Kh8s4d2c_JdQs2h5c_Qh8cJsTs_JcQc6c5h_4c7h9s9d() {
    assertEquals(
      "9h7c8dQd Kh8s4d2c 4c7h9s9d Qh8cJsTs Kd9c7dAs JdQs2h5c JcQc6c5h",
      Solver.process("omaha-holdem 2d5d6sAcJh 9h7c8dQd Kd9c7dAs Kh8s4d2c JdQs2h5c Qh8cJsTs JcQc6c5h 4c7h9s9d"));
  }

  @Test
  public void test_omaha_holdem_7108_2h7d8dKhQc_2cQh6d9h_4c9dTs3d_4hQdJcTd() {
    assertEquals(
      "4c9dTs3d 4hQdJcTd 2cQh6d9h",
      Solver.process("omaha-holdem 2h7d8dKhQc 2cQh6d9h 4c9dTs3d 4hQdJcTd"));
  }

  @Test
  public void test_omaha_holdem_7109_2h4c4s9cKs_7d5c3dQh_2d8d9dJc_Jd6c7s3h() {
    assertEquals(
      "Jd6c7s3h 7d5c3dQh 2d8d9dJc",
      Solver.process("omaha-holdem 2h4c4s9cKs 7d5c3dQh 2d8d9dJc Jd6c7s3h"));
  }

  @Test
  public void test_omaha_holdem_7110_6c9sKcQdQs_Th7h3s4c_9c2cKd5c_QcTc4h9d_6h7cJh8h_3c9hKhJc_2s7s8s8d_3h4s2dJs_5dAcTsAh() {
    assertEquals(
      "Th7h3s4c 3h4s2dJs 6h7cJh8h 2s7s8s8d 9c2cKd5c 3c9hKhJc 5dAcTsAh QcTc4h9d",
      Solver.process("omaha-holdem 6c9sKcQdQs Th7h3s4c 9c2cKd5c QcTc4h9d 6h7cJh8h 3c9hKhJc 2s7s8s8d 3h4s2dJs 5dAcTsAh"));
  }

  @Test
  public void test_omaha_holdem_7111_2s6cKhKsTh_3dJsJd8s_6h5s3h5d_4cJc9h7d_Tc6s9sTd() {
    assertEquals(
      "4cJc9h7d 6h5s3h5d 3dJsJd8s Tc6s9sTd",
      Solver.process("omaha-holdem 2s6cKhKsTh 3dJsJd8s 6h5s3h5d 4cJc9h7d Tc6s9sTd"));
  }

  @Test
  public void test_omaha_holdem_7112_4c5c7c9sTs_Qs5sKs7s_6c6s8c3c_9h3dTcKh_KcKd2dAd() {
    assertEquals(
      "KcKd2dAd Qs5sKs7s 9h3dTcKh 6c6s8c3c",
      Solver.process("omaha-holdem 4c5c7c9sTs Qs5sKs7s 6c6s8c3c 9h3dTcKh KcKd2dAd"));
  }

  @Test
  public void test_omaha_holdem_7113_3c7hQcTdTs_5hKh4c7s_2c2d8h4h() {
    assertEquals(
      "2c2d8h4h 5hKh4c7s",
      Solver.process("omaha-holdem 3c7hQcTdTs 5hKh4c7s 2c2d8h4h"));
  }

  @Test
  public void test_omaha_holdem_7114_3s8dJdQdQh_Ad2h2d6d_AcJsJc2c() {
    assertEquals(
      "Ad2h2d6d AcJsJc2c",
      Solver.process("omaha-holdem 3s8dJdQdQh Ad2h2d6d AcJsJc2c"));
  }

  @Test
  public void test_omaha_holdem_7115_2h4c4d9cTs_6h7sQh3c_7d6d5c5d_3h8hAc4h_8s7h4s2s() {
    assertEquals(
      "6h7sQh3c 7d6d5c5d 3h8hAc4h 8s7h4s2s",
      Solver.process("omaha-holdem 2h4c4d9cTs 6h7sQh3c 7d6d5c5d 3h8hAc4h 8s7h4s2s"));
  }

  @Test
  public void test_omaha_holdem_7116_2d7sAdJdQh_6c8d4h3s_4sAs3c2s_KcKh8h8c_9d5h5cQd_4d6d9c7c_2c2hKd6s_Td6h3hTc_9hJh3dQs_Jc9sQc5s() {
    assertEquals(
      "6c8d4h3s Td6h3hTc KcKh8h8c 9hJh3dQs=Jc9sQc5s 4sAs3c2s 2c2hKd6s 4d6d9c7c 9d5h5cQd",
      Solver.process("omaha-holdem 2d7sAdJdQh 6c8d4h3s 4sAs3c2s KcKh8h8c 9d5h5cQd 4d6d9c7c 2c2hKd6s Td6h3hTc 9hJh3dQs Jc9sQc5s"));
  }

  @Test
  public void test_omaha_holdem_7117_5d5sQcQdTc_7hQhTh7c_JsAs3d9h_8c8h2d4d_6s3hQsKd_Kc7d5hAc_9cKs6hKh_9d2cTdJh_2h3sJc4c() {
    assertEquals(
      "2h3sJc4c JsAs3d9h 8c8h2d4d 9d2cTdJh 9cKs6hKh Kc7d5hAc 6s3hQsKd 7hQhTh7c",
      Solver.process("omaha-holdem 5d5sQcQdTc 7hQhTh7c JsAs3d9h 8c8h2d4d 6s3hQsKd Kc7d5hAc 9cKs6hKh 9d2cTdJh 2h3sJc4c"));
  }

  @Test
  public void test_omaha_holdem_7118_2s7h9sAhTc_2dQsQdJc_9c2h4s2c_5s5d4d9d_6sQc6c5h_7cTh3h6d() {
    assertEquals(
      "6sQc6c5h 5s5d4d9d 2dQsQdJc 7cTh3h6d 9c2h4s2c",
      Solver.process("omaha-holdem 2s7h9sAhTc 2dQsQdJc 9c2h4s2c 5s5d4d9d 6sQc6c5h 7cTh3h6d"));
  }

  @Test
  public void test_omaha_holdem_7119_2c2d7hKhQh_5sQs8s3c_Tc6hAcTh_9sJs3dKs_2s4cTd5d_7cJh6c9d() {
    assertEquals(
      "7cJh6c9d 5sQs8s3c 9sJs3dKs 2s4cTd5d Tc6hAcTh",
      Solver.process("omaha-holdem 2c2d7hKhQh 5sQs8s3c Tc6hAcTh 9sJs3dKs 2s4cTd5d 7cJh6c9d"));
  }

  @Test
  public void test_omaha_holdem_7120_3h9dAdKdQh_As6h3d9s_8h2c4d5h_3sQcTcTd_Ac4s6dAh_JcKc8c5c_2dQd5dTs_7hThJd4h_7sJh4cQs_2h5s9h6c() {
    assertEquals(
      "8h2c4d5h 2h5s9h6c 7sJh4cQs JcKc8c5c 3sQcTcTd As6h3d9s Ac4s6dAh 7hThJd4h 2dQd5dTs",
      Solver.process("omaha-holdem 3h9dAdKdQh As6h3d9s 8h2c4d5h 3sQcTcTd Ac4s6dAh JcKc8c5c 2dQd5dTs 7hThJd4h 7sJh4cQs 2h5s9h6c"));
  }

  @Test
  public void test_omaha_holdem_7121_3c5c5d8c9h_Ks6s8h5h_9s5s6c2h_9d2d4hTs_As7c4s8d() {
    assertEquals(
      "As7c4s8d 9d2d4hTs Ks6s8h5h 9s5s6c2h",
      Solver.process("omaha-holdem 3c5c5d8c9h Ks6s8h5h 9s5s6c2h 9d2d4hTs As7c4s8d"));
  }

  @Test
  public void test_omaha_holdem_7122_4c6c9dAcQd_KhTh3s6s_9c2dJd7s_Td8sKdQh() {
    assertEquals(
      "KhTh3s6s 9c2dJd7s Td8sKdQh",
      Solver.process("omaha-holdem 4c6c9dAcQd KhTh3s6s 9c2dJd7s Td8sKdQh"));
  }

  @Test
  public void test_omaha_holdem_7123_2c4s6h7c9d_6s6c3s5d_TdJh5cTc_AsJc5s4d_5h8sTh9c_Ts9h2sAd_Ac9s4cKh_Ks7sQh4h() {
    assertEquals(
      "AsJc5s4d TdJh5cTc Ks7sQh4h Ts9h2sAd Ac9s4cKh 6s6c3s5d 5h8sTh9c",
      Solver.process("omaha-holdem 2c4s6h7c9d 6s6c3s5d TdJh5cTc AsJc5s4d 5h8sTh9c Ts9h2sAd Ac9s4cKh Ks7sQh4h"));
  }

  @Test
  public void test_omaha_holdem_7124_3h4s9cAcQd_Qc7sJcTd_4c2h4d6c_6dKh9d7h_As5dQsTs() {
    assertEquals(
      "6dKh9d7h Qc7sJcTd As5dQsTs 4c2h4d6c",
      Solver.process("omaha-holdem 3h4s9cAcQd Qc7sJcTd 4c2h4d6c 6dKh9d7h As5dQsTs"));
  }

  @Test
  public void test_omaha_holdem_7125_3d8s9dJcTd_5c3sKd8c_Ah4dThAs_6s2d3hJs() {
    assertEquals(
      "Ah4dThAs 5c3sKd8c 6s2d3hJs",
      Solver.process("omaha-holdem 3d8s9dJcTd 5c3sKd8c Ah4dThAs 6s2d3hJs"));
  }

  @Test
  public void test_omaha_holdem_7126_2h6c8d9cQh_2sKc3hKs_5dJc6hKh_2c6sQsJd_4d3c9sTd_3d9dJh7c() {
    assertEquals(
      "5dJc6hKh 4d3c9sTd 3d9dJh7c 2sKc3hKs 2c6sQsJd",
      Solver.process("omaha-holdem 2h6c8d9cQh 2sKc3hKs 5dJc6hKh 2c6sQsJd 4d3c9sTd 3d9dJh7c"));
  }

  @Test
  public void test_omaha_holdem_7127_2d6h8h9dTh_6cTc9sQd_KhJs7d4d_KdAc8s7s() {
    assertEquals(
      "6cTc9sQd KdAc8s7s KhJs7d4d",
      Solver.process("omaha-holdem 2d6h8h9dTh 6cTc9sQd KhJs7d4d KdAc8s7s"));
  }

  @Test
  public void test_omaha_holdem_7128_3d3h6h6sTd_Tc8c3cKc_5c8sQhQs_9dAhQd5d_TsTh6c7s() {
    assertEquals(
      "9dAhQd5d 5c8sQhQs Tc8c3cKc TsTh6c7s",
      Solver.process("omaha-holdem 3d3h6h6sTd Tc8c3cKc 5c8sQhQs 9dAhQd5d TsTh6c7s"));
  }

  @Test
  public void test_omaha_holdem_7129_2h5s9cJcKs_Tc8h2s6c_Qd7s9h5d_5c5h2c7c() {
    assertEquals(
      "Tc8h2s6c Qd7s9h5d 5c5h2c7c",
      Solver.process("omaha-holdem 2h5s9cJcKs Tc8h2s6c Qd7s9h5d 5c5h2c7c"));
  }

  @Test
  public void test_omaha_holdem_7130_3d8dJdKhTd_KsQs9s9h_6d4sJsKc_8sJc6h8h_3c5s5d5c_6cTsTcAc_Jh6sAs5h_Th2h2d9d_3h4c9c4d_7h7d8cQd() {
    assertEquals(
      "3h4c9c4d 3c5s5d5c Jh6sAs5h 6d4sJsKc 8sJc6h8h 6cTsTcAc KsQs9s9h Th2h2d9d 7h7d8cQd",
      Solver.process("omaha-holdem 3d8dJdKhTd KsQs9s9h 6d4sJsKc 8sJc6h8h 3c5s5d5c 6cTsTcAc Jh6sAs5h Th2h2d9d 3h4c9c4d 7h7d8cQd"));
  }

  @Test
  public void test_omaha_holdem_7131_2d4c4sTcTh_6h4d8cKh_7c2s9h8h_QsJh5d5c_3dQh7d8d_6s9s3h6c() {
    assertEquals(
      "3dQh7d8d 7c2s9h8h QsJh5d5c 6s9s3h6c 6h4d8cKh",
      Solver.process("omaha-holdem 2d4c4sTcTh 6h4d8cKh 7c2s9h8h QsJh5d5c 3dQh7d8d 6s9s3h6c"));
  }

  @Test
  public void test_omaha_holdem_7132_2h4d5s7d8c_2d4h7hTc_9dQcJd6s() {
    assertEquals(
      "2d4h7hTc 9dQcJd6s",
      Solver.process("omaha-holdem 2h4d5s7d8c 2d4h7hTc 9dQcJd6s"));
  }

  @Test
  public void test_omaha_holdem_7133_3c6s7d8sQh_4sKc9cJc_4dKhJs6h_Qs4c3hTd_9hQdQcAd_9sKs3d2d_5dTs2c6d() {
    assertEquals(
      "4sKc9cJc 9sKs3d2d 5dTs2c6d 4dKhJs6h Qs4c3hTd 9hQdQcAd",
      Solver.process("omaha-holdem 3c6s7d8sQh 4sKc9cJc 4dKhJs6h Qs4c3hTd 9hQdQcAd 9sKs3d2d 5dTs2c6d"));
  }

  @Test
  public void test_omaha_holdem_7134_3s5d7cJhJs_Jc6s4h4c_8d9c9dTh_5hAdQcTd_Qh8hKc5c_Qd4d2c9s_8c8s7s2h_AhKh7hAs_Qs6h7d3d() {
    assertEquals(
      "Qd4d2c9s Qh8hKc5c 5hAdQcTd Qs6h7d3d 8c8s7s2h 8d9c9dTh AhKh7hAs Jc6s4h4c",
      Solver.process("omaha-holdem 3s5d7cJhJs Jc6s4h4c 8d9c9dTh 5hAdQcTd Qh8hKc5c Qd4d2c9s 8c8s7s2h AhKh7hAs Qs6h7d3d"));
  }

  @Test
  public void test_omaha_holdem_7135_3h4h5d8sKs_Tc2h6s4d_Ac5cAs2c_JsJc9dKd_4s6cJhQs_5h8h5s2s() {
    assertEquals(
      "4s6cJhQs JsJc9dKd 5h8h5s2s Ac5cAs2c Tc2h6s4d",
      Solver.process("omaha-holdem 3h4h5d8sKs Tc2h6s4d Ac5cAs2c JsJc9dKd 4s6cJhQs 5h8h5s2s"));
  }

  @Test
  public void test_omaha_holdem_7136_3c5c5s8cJd_ThKh9h7c_6s3s8hQh_2s7s3hTc_4hKsJc9s_2hTs6c6d_8d7hQcJh() {
    assertEquals(
      "ThKh9h7c 2s7s3hTc 2hTs6c6d 6s3s8hQh 4hKsJc9s 8d7hQcJh",
      Solver.process("omaha-holdem 3c5c5s8cJd ThKh9h7c 6s3s8hQh 2s7s3hTc 4hKsJc9s 2hTs6c6d 8d7hQcJh"));
  }

  @Test
  public void test_omaha_holdem_7137_2d5c6dQcTh_4hJh3d9s_Ks9c5hJc_4c4d6h5s_AsJdQd6c_8s7cTcAc_Kd7dJs3s_8c2c9hQh_2s3h3cQs_Ts7s5d7h() {
    assertEquals(
      "Kd7dJs3s Ks9c5hJc 8s7cTcAc 4c4d6h5s Ts7s5d7h 2s3h3cQs=8c2c9hQh AsJdQd6c 4hJh3d9s",
      Solver.process("omaha-holdem 2d5c6dQcTh 4hJh3d9s Ks9c5hJc 4c4d6h5s AsJdQd6c 8s7cTcAc Kd7dJs3s 8c2c9hQh 2s3h3cQs Ts7s5d7h"));
  }

  @Test
  public void test_omaha_holdem_7138_3h7c7dJhKc_4c3c8d5d_8cTsAsTd_6d6h9s3d_5hKs2c2d() {
    assertEquals(
      "4c3c8d5d 6d6h9s3d 8cTsAsTd 5hKs2c2d",
      Solver.process("omaha-holdem 3h7c7dJhKc 4c3c8d5d 8cTsAsTd 6d6h9s3d 5hKs2c2d"));
  }

  @Test
  public void test_omaha_holdem_7139_3h3s9cKcKh_4c2cJh4s_7s9hTc4d_8d7h9d5s_4hAs7d9s_3c6cQhTd_Jd3dAdKd() {
    assertEquals(
      "4c2cJh4s 8d7h9d5s 7s9hTc4d 4hAs7d9s 3c6cQhTd Jd3dAdKd",
      Solver.process("omaha-holdem 3h3s9cKcKh 4c2cJh4s 7s9hTc4d 8d7h9d5s 4hAs7d9s 3c6cQhTd Jd3dAdKd"));
  }

  @Test
  public void test_omaha_holdem_7140_6d9hJhQsTs_TdJdJsQd_Th6cAc9d_QhTc3c2s() {
    assertEquals(
      "Th6cAc9d QhTc3c2s TdJdJsQd",
      Solver.process("omaha-holdem 6d9hJhQsTs TdJdJsQd Th6cAc9d QhTc3c2s"));
  }

  @Test
  public void test_omaha_holdem_7141_4c5s7h9cTh_8sQh4d6s_Js2h9d8h_5h5d3hAh_QsKsAc4h() {
    assertEquals(
      "QsKsAc4h 5h5d3hAh 8sQh4d6s Js2h9d8h",
      Solver.process("omaha-holdem 4c5s7h9cTh 8sQh4d6s Js2h9d8h 5h5d3hAh QsKsAc4h"));
  }

  @Test
  public void test_omaha_holdem_7142_3d6h8sQhTh_4cTd7h5c_7cKd3cQd_5dTsKs4s_3sAs2dJh() {
    assertEquals(
      "3sAs2dJh 4cTd7h5c 5dTsKs4s 7cKd3cQd",
      Solver.process("omaha-holdem 3d6h8sQhTh 4cTd7h5c 7cKd3cQd 5dTsKs4s 3sAs2dJh"));
  }

  @Test
  public void test_omaha_holdem_7143_4h7d8h9dKc_Tc4cQh7s_5s2hTs6h_2c3d2s5d() {
    assertEquals(
      "2c3d2s5d Tc4cQh7s 5s2hTs6h",
      Solver.process("omaha-holdem 4h7d8h9dKc Tc4cQh7s 5s2hTs6h 2c3d2s5d"));
  }

  @Test
  public void test_omaha_holdem_7144_3h3s6h7d9h_Ah4cQsAs_6dJcKc6c_Qh2cJhJs_4d9c9d3d_2sAdTs8s_7c5d2h8c_QdJd8hTh_7s8dKh5c() {
    assertEquals(
      "Ah4cQsAs 7c5d2h8c=7s8dKh5c 2sAdTs8s QdJd8hTh Qh2cJhJs 6dJcKc6c 4d9c9d3d",
      Solver.process("omaha-holdem 3h3s6h7d9h Ah4cQsAs 6dJcKc6c Qh2cJhJs 4d9c9d3d 2sAdTs8s 7c5d2h8c QdJd8hTh 7s8dKh5c"));
  }

  @Test
  public void test_omaha_holdem_7145_2d5d8d9sTh_4s6cJh2c_2hKh6hQd_Qc3dJsAd_Jd5c7h7s_As4dAh3c_6s3hKcTs_Td9hQh9c_8s7c6d8c_Qs4hTcKs() {
    assertEquals(
      "4s6cJh2c 2hKh6hQd 6s3hKcTs=Qs4hTcKs As4dAh3c Td9hQh9c 8s7c6d8c Jd5c7h7s Qc3dJsAd",
      Solver.process("omaha-holdem 2d5d8d9sTh 4s6cJh2c 2hKh6hQd Qc3dJsAd Jd5c7h7s As4dAh3c 6s3hKcTs Td9hQh9c 8s7c6d8c Qs4hTcKs"));
  }

  @Test
  public void test_omaha_holdem_7146_2s8c9hJdQh_Tc4hKh7h_2cAs3s3h_KcTd5s2d_3dKs6cAc_8d9c2h6h_KdQd9dQc_5cJh7d3c_TsJsAh7s_Ad7c5hQs() {
    assertEquals(
      "3dKs6cAc 2cAs3s3h 5cJh7d3c Ad7c5hQs 8d9c2h6h KdQd9dQc TsJsAh7s KcTd5s2d=Tc4hKh7h",
      Solver.process("omaha-holdem 2s8c9hJdQh Tc4hKh7h 2cAs3s3h KcTd5s2d 3dKs6cAc 8d9c2h6h KdQd9dQc 5cJh7d3c TsJsAh7s Ad7c5hQs"));
  }

  @Test
  public void test_omaha_holdem_7147_2s7h7sAhTd_Ac3c7c8d_5sKs9h9c_9dTcKh7d_3d3s4d8h_TsTh5d8s_6d4sJhQc() {
    assertEquals(
      "6d4sJhQc 3d3s4d8h 5sKs9h9c 9dTcKh7d Ac3c7c8d TsTh5d8s",
      Solver.process("omaha-holdem 2s7h7sAhTd Ac3c7c8d 5sKs9h9c 9dTcKh7d 3d3s4d8h TsTh5d8s 6d4sJhQc"));
  }

  @Test
  public void test_omaha_holdem_7148_2s3h7sAhTd_Th6s8cJd_6cTs9sKs_As2d2hKh_JcAdTc8s_4s8dKd9d_9c9h8hQh_Js7d2c3c_Jh4d5c4c_Qd7h6h5d() {
    assertEquals(
      "4s8dKd9d Qd7h6h5d 9c9h8hQh Th6s8cJd 6cTs9sKs Js7d2c3c JcAdTc8s As2d2hKh Jh4d5c4c",
      Solver.process("omaha-holdem 2s3h7sAhTd Th6s8cJd 6cTs9sKs As2d2hKh JcAdTc8s 4s8dKd9d 9c9h8hQh Js7d2c3c Jh4d5c4c Qd7h6h5d"));
  }

  @Test
  public void test_omaha_holdem_7149_2s3h5d6s9c_Ah7hThKc_Kh3sTcJh_Qh6cQs3d_Td4d4cJc_8h6d9d5h_5sAs6h7c_9s7s8cJd() {
    assertEquals(
      "Ah7hThKc Kh3sTcJh Td4d4cJc Qh6cQs3d 5sAs6h7c 8h6d9d5h 9s7s8cJd",
      Solver.process("omaha-holdem 2s3h5d6s9c Ah7hThKc Kh3sTcJh Qh6cQs3d Td4d4cJc 8h6d9d5h 5sAs6h7c 9s7s8cJd"));
  }

  @Test
  public void test_omaha_holdem_7150_4d6c6s7cTs_QdQs5dQh_9h2d9dKd_Qc7d8c3h_Kc3d7s8h_5sKh2sJs_4h3sKsJh_Td3c9cAd_2c5h8dJd_8s6d4sAs() {
    assertEquals(
      "5sKh2sJs 4h3sKsJh Qc7d8c3h Kc3d7s8h 9h2d9dKd Td3c9cAd QdQs5dQh 2c5h8dJd 8s6d4sAs",
      Solver.process("omaha-holdem 4d6c6s7cTs QdQs5dQh 9h2d9dKd Qc7d8c3h Kc3d7s8h 5sKh2sJs 4h3sKsJh Td3c9cAd 2c5h8dJd 8s6d4sAs"));
  }

  @Test
  public void test_omaha_holdem_7151_5h6s8cAhJs_2d8sJd6c_9c7h9s7d_Tc9d8hQc_Ts6h3sJc_Kh9h2c5s_Ad4s2hKs() {
    assertEquals(
      "Kh9h2c5s Tc9d8hQc Ad4s2hKs Ts6h3sJc 2d8sJd6c 9c7h9s7d",
      Solver.process("omaha-holdem 5h6s8cAhJs 2d8sJd6c 9c7h9s7d Tc9d8hQc Ts6h3sJc Kh9h2c5s Ad4s2hKs"));
  }

  @Test
  public void test_omaha_holdem_7152_4d5h9hJsTs_8sKhQsAc_6d8c6c7s_8h3c3hAh_5sTdAd9c_Kd7d4sTh_4h5dTcKs_5c2h2sJh_KcQhQd9s() {
    assertEquals(
      "8h3c3hAh Kd7d4sTh 4h5dTcKs 5sTdAd9c 5c2h2sJh 6d8c6c7s 8sKhQsAc=KcQhQd9s",
      Solver.process("omaha-holdem 4d5h9hJsTs 8sKhQsAc 6d8c6c7s 8h3c3hAh 5sTdAd9c Kd7d4sTh 4h5dTcKs 5c2h2sJh KcQhQd9s"));
  }

  @Test
  public void test_omaha_holdem_7153_2d4d4s5cJd_6sThTd7d_7c3c2hQs_AsQdTcJc_7hQh5h8d_3h3s8cKc() {
    assertEquals(
      "7c3c2hQs 3h3s8cKc 7hQh5h8d AsQdTcJc 6sThTd7d",
      Solver.process("omaha-holdem 2d4d4s5cJd 6sThTd7d 7c3c2hQs AsQdTcJc 7hQh5h8d 3h3s8cKc"));
  }

  @Test
  public void test_omaha_holdem_7154_3d5c8dQdQs_6h9h9s3c_2s4dQc2c_KdAhJh7h_6c8cKh4h_4c6d5s2h_Td9c8sQh_JsJcAcTh() {
    assertEquals(
      "KdAhJh7h 4c6d5s2h 6c8cKh4h 6h9h9s3c JsJcAcTh 2s4dQc2c Td9c8sQh",
      Solver.process("omaha-holdem 3d5c8dQdQs 6h9h9s3c 2s4dQc2c KdAhJh7h 6c8cKh4h 4c6d5s2h Td9c8sQh JsJcAcTh"));
  }

  @Test
  public void test_omaha_holdem_7155_5s7c7dKsQh_5h3h8d6s_7hQc4cTs_KdAhJs9s_Td8s9h2s_As2c2dQs_4s4d9dAc_Tc7sKh5d() {
    assertEquals(
      "Td8s9h2s 4s4d9dAc 5h3h8d6s As2c2dQs KdAhJs9s 7hQc4cTs Tc7sKh5d",
      Solver.process("omaha-holdem 5s7c7dKsQh 5h3h8d6s 7hQc4cTs KdAhJs9s Td8s9h2s As2c2dQs 4s4d9dAc Tc7sKh5d"));
  }

  @Test
  public void test_omaha_holdem_7156_5s6c7c9hAd_7s5d6hAh_8h9c5cAs_QdJc2cKc() {
    assertEquals(
      "QdJc2cKc 7s5d6hAh 8h9c5cAs",
      Solver.process("omaha-holdem 5s6c7c9hAd 7s5d6hAh 8h9c5cAs QdJc2cKc"));
  }

  @Test
  public void test_omaha_holdem_7157_5d9sKcKdQs_Qc4sJdQh_6s6d3sAd_4h8d9h3h() {
    assertEquals(
      "6s6d3sAd 4h8d9h3h Qc4sJdQh",
      Solver.process("omaha-holdem 5d9sKcKdQs Qc4sJdQh 6s6d3sAd 4h8d9h3h"));
  }

  @Test
  public void test_omaha_holdem_7158_4s5s7sKcKd_9cQh2sJc_7dKs6h5h_JhJd5dTc() {
    assertEquals(
      "9cQh2sJc JhJd5dTc 7dKs6h5h",
      Solver.process("omaha-holdem 4s5s7sKcKd 9cQh2sJc 7dKs6h5h JhJd5dTc"));
  }

  @Test
  public void test_omaha_holdem_7159_3d4d5dAcQd_Ah8cTd9s_5cQhKhAs_6c7sKc8d() {
    assertEquals(
      "Ah8cTd9s 5cQhKhAs 6c7sKc8d",
      Solver.process("omaha-holdem 3d4d5dAcQd Ah8cTd9s 5cQhKhAs 6c7sKc8d"));
  }

  @Test
  public void test_omaha_holdem_7160_4h6dKcKhQs_5s9s7h3s_8c4sAc5h_2hTsJh2d_TcJdJs2c() {
    assertEquals(
      "5s9s7h3s 2hTsJh2d 8c4sAc5h TcJdJs2c",
      Solver.process("omaha-holdem 4h6dKcKhQs 5s9s7h3s 8c4sAc5h 2hTsJh2d TcJdJs2c"));
  }

  @Test
  public void test_omaha_holdem_7161_5c8h9dKsQc_7s6cAcTs_Kd4s6sAd_6d4h5s5h_6hThAh9c_9hTd3s7c_4cQd7h8d_2cKhJc8s_3h2s7dQs_8c5d4dQh() {
    assertEquals(
      "9hTd3s7c 6hThAh9c 3h2s7dQs Kd4s6sAd 4cQd7h8d=8c5d4dQh 2cKhJc8s 6d4h5s5h 7s6cAcTs",
      Solver.process("omaha-holdem 5c8h9dKsQc 7s6cAcTs Kd4s6sAd 6d4h5s5h 6hThAh9c 9hTd3s7c 4cQd7h8d 2cKhJc8s 3h2s7dQs 8c5d4dQh"));
  }

  @Test
  public void test_omaha_holdem_7162_2d2h4h9dQs_4c5s6d6s_Ks4s9cAc_9s2cAhKd_7s5h5cJd_As7cKh7d() {
    assertEquals(
      "7s5h5cJd 4c5s6d6s As7cKh7d Ks4s9cAc 9s2cAhKd",
      Solver.process("omaha-holdem 2d2h4h9dQs 4c5s6d6s Ks4s9cAc 9s2cAhKd 7s5h5cJd As7cKh7d"));
  }

  @Test
  public void test_omaha_holdem_7163_2h5h9hJsQc_6sKcJcTs_7hQsQd7d_Jd8d4h3d_5d9cAc8s() {
    assertEquals(
      "Jd8d4h3d 5d9cAc8s 7hQsQd7d 6sKcJcTs",
      Solver.process("omaha-holdem 2h5h9hJsQc 6sKcJcTs 7hQsQd7d Jd8d4h3d 5d9cAc8s"));
  }

  @Test
  public void test_omaha_holdem_7164_3h6s7s9dAd_AsKh2h3c_TdTs8s9c_Qh4d5sKc_4s9s5cJc_Th6hTc3s() {
    assertEquals(
      "Th6hTc3s AsKh2h3c 4s9s5cJc=Qh4d5sKc TdTs8s9c",
      Solver.process("omaha-holdem 3h6s7s9dAd AsKh2h3c TdTs8s9c Qh4d5sKc 4s9s5cJc Th6hTc3s"));
  }

  @Test
  public void test_omaha_holdem_7165_3h9c9sKhTs_7h3sAh2h_6hJsQc8d_6sJc6dAs_Ac3c4sKs() {
    assertEquals(
      "7h3sAh2h 6sJc6dAs Ac3c4sKs 6hJsQc8d",
      Solver.process("omaha-holdem 3h9c9sKhTs 7h3sAh2h 6hJsQc8d 6sJc6dAs Ac3c4sKs"));
  }

  @Test
  public void test_omaha_holdem_7166_4h5s6c7sTc_AhQdAd8c_6sQc6h5h_Js4d9hKc_5dTdJc9s_JdJh4c2c_5c6d7cKs() {
    assertEquals(
      "Js4d9hKc JdJh4c2c AhQdAd8c 5c6d7cKs 5dTdJc9s 6sQc6h5h",
      Solver.process("omaha-holdem 4h5s6c7sTc AhQdAd8c 6sQc6h5h Js4d9hKc 5dTdJc9s JdJh4c2c 5c6d7cKs"));
  }

  @Test
  public void test_omaha_holdem_7167_3c4h5d6dTc_2sQcAc8s_TdAs9hKh_9dQd5h4c_2c7c5cTs_Ks6hKd2h_Qh7d3dAh_2d4d9c8h_Jh8d7s5s() {
    assertEquals(
      "TdAs9hKh 9dQd5h4c 2sQcAc8s 2d4d9c8h=Ks6hKd2h 2c7c5cTs=Qh7d3dAh Jh8d7s5s",
      Solver.process("omaha-holdem 3c4h5d6dTc 2sQcAc8s TdAs9hKh 9dQd5h4c 2c7c5cTs Ks6hKd2h Qh7d3dAh 2d4d9c8h Jh8d7s5s"));
  }

  @Test
  public void test_omaha_holdem_7168_2h3d7cKcTh_3cKsAs3s_Kd7d5hJs_9cJh2dAh_6h4h6sTc_JdTsJc6c_6d9s8s8d_Ac9dQs9h_4d2sAdKh() {
    assertEquals(
      "9cJh2dAh 6d9s8s8d Ac9dQs9h 6h4h6sTc JdTsJc6c 4d2sAdKh Kd7d5hJs 3cKsAs3s",
      Solver.process("omaha-holdem 2h3d7cKcTh 3cKsAs3s Kd7d5hJs 9cJh2dAh 6h4h6sTc JdTsJc6c 6d9s8s8d Ac9dQs9h 4d2sAdKh"));
  }

  @Test
  public void test_omaha_holdem_7169_5c8dAsTdTh_8c8h9d3c_AhAd3dTc_3s9sQhQs_Js2h7sAc_Qd4h9h8s() {
    assertEquals(
      "Qd4h9h8s 3s9sQhQs Js2h7sAc 8c8h9d3c AhAd3dTc",
      Solver.process("omaha-holdem 5c8dAsTdTh 8c8h9d3c AhAd3dTc 3s9sQhQs Js2h7sAc Qd4h9h8s"));
  }

  @Test
  public void test_omaha_holdem_7170_3hAsKcKhQs_3s5hTsKs_6hJsJh2d() {
    assertEquals(
      "6hJsJh2d 3s5hTsKs",
      Solver.process("omaha-holdem 3hAsKcKhQs 3s5hTsKs 6hJsJh2d"));
  }

  @Test
  public void test_omaha_holdem_7171_2s8s9cQsTs_QdAcAs3h_9d4hJhJs() {
    assertEquals(
      "QdAcAs3h 9d4hJhJs",
      Solver.process("omaha-holdem 2s8s9cQsTs QdAcAs3h 9d4hJhJs"));
  }

  @Test
  public void test_omaha_holdem_7172_6d6h9dKsTs_Jd2h2cTd_7s7d8cJc() {
    assertEquals(
      "Jd2h2cTd 7s7d8cJc",
      Solver.process("omaha-holdem 6d6h9dKsTs Jd2h2cTd 7s7d8cJc"));
  }

  @Test
  public void test_omaha_holdem_7173_2d3h5cAdJs_6cJd8h5s_6dQdTdQs_3s9dQc6h_8cJcTh2c_Kh6sTc9s_As9c7c7h_4sKs7sQh_KdAc7d5h_8s3c4cKc() {
    assertEquals(
      "Kh6sTc9s 4sKs7sQh 3s9dQc6h 6dQdTdQs As9c7c7h 8cJcTh2c 6cJd8h5s KdAc7d5h 8s3c4cKc",
      Solver.process("omaha-holdem 2d3h5cAdJs 6cJd8h5s 6dQdTdQs 3s9dQc6h 8cJcTh2c Kh6sTc9s As9c7c7h 4sKs7sQh KdAc7d5h 8s3c4cKc"));
  }

  @Test
  public void test_omaha_holdem_7174_2d4c5h6d6h_7d2c7s4s_4h2s7h3d_9s3cJsAh_8cTcAs9c_4d5dKsQh_Kh6cQc9h_8hQs3hKc_KdJcAd6s() {
    assertEquals(
      "8hQs3hKc 8cTcAs9c 4d5dKsQh 7d2c7s4s Kh6cQc9h KdJcAd6s 9s3cJsAh 4h2s7h3d",
      Solver.process("omaha-holdem 2d4c5h6d6h 7d2c7s4s 4h2s7h3d 9s3cJsAh 8cTcAs9c 4d5dKsQh Kh6cQc9h 8hQs3hKc KdJcAd6s"));
  }

  @Test
  public void test_omaha_holdem_7175_2s4c6sTdTs_JcTc2hKc_6cKdAcQh_2dKsJh5d_4hQs8cQc_AsAh2c8d() {
    assertEquals(
      "2dKsJh5d 6cKdAcQh 4hQs8cQc AsAh2c8d JcTc2hKc",
      Solver.process("omaha-holdem 2s4c6sTdTs JcTc2hKc 6cKdAcQh 2dKsJh5d 4hQs8cQc AsAh2c8d"));
  }

  @Test
  public void test_omaha_holdem_7176_3d8hAcJsQc_QsQdTd9h_8c8dKdKc_Jd6cAdAs_9s7cAh8s_Kh2c5dTc() {
    assertEquals(
      "9s7cAh8s 8c8dKdKc Jd6cAdAs QsQdTd9h Kh2c5dTc",
      Solver.process("omaha-holdem 3d8hAcJsQc QsQdTd9h 8c8dKdKc Jd6cAdAs 9s7cAh8s Kh2c5dTc"));
  }

  @Test
  public void test_omaha_holdem_7177_5d7d9sQcTc_7sTd4sAd_8s4cQdAh_Kh3h9d2s_JcAs6h7h_Jd9cThKc_6d6c5sJs_8hAc8c6s() {
    assertEquals(
      "6d6c5sJs JcAs6h7h Kh3h9d2s 8s4cQdAh 7sTd4sAd 8hAc8c6s Jd9cThKc",
      Solver.process("omaha-holdem 5d7d9sQcTc 7sTd4sAd 8s4cQdAh Kh3h9d2s JcAs6h7h Jd9cThKc 6d6c5sJs 8hAc8c6s"));
  }

  @Test
  public void test_omaha_holdem_7178_4h5hAhJdJs_Ts3c6cAs_TcKs5s6h() {
    assertEquals(
      "TcKs5s6h Ts3c6cAs",
      Solver.process("omaha-holdem 4h5hAhJdJs Ts3c6cAs TcKs5s6h"));
  }

  @Test
  public void test_omaha_holdem_7179_3c3s7dJdQc_6h7c5hAc_8h2hTc5s_6s4s7h5d_Th8c6cKs_9hAsAd5c() {
    assertEquals(
      "8h2hTc5s Th8c6cKs 6s4s7h5d 6h7c5hAc 9hAsAd5c",
      Solver.process("omaha-holdem 3c3s7dJdQc 6h7c5hAc 8h2hTc5s 6s4s7h5d Th8c6cKs 9hAsAd5c"));
  }

  @Test
  public void test_omaha_holdem_7180_4s5d6cQcTc_Jh2cKcAd_9d6h7s7d_QdKs3d9s_7c5h4cTh_6d5c9cJd() {
    assertEquals(
      "9d6h7s7d QdKs3d9s 7c5h4cTh 6d5c9cJd Jh2cKcAd",
      Solver.process("omaha-holdem 4s5d6cQcTc Jh2cKcAd 9d6h7s7d QdKs3d9s 7c5h4cTh 6d5c9cJd"));
  }

  @Test
  public void test_omaha_holdem_7181_5h6s9cAdJs_8c4c2h2c_2dQd7c4d_Td7h2s6c_Qc8dQhKd() {
    assertEquals(
      "2dQd7c4d 8c4c2h2c Td7h2s6c Qc8dQhKd",
      Solver.process("omaha-holdem 5h6s9cAdJs 8c4c2h2c 2dQd7c4d Td7h2s6c Qc8dQhKd"));
  }

  @Test
  public void test_omaha_holdem_7182_5h5s9sKcTs_AdJs7d8s_Kh5d6h3s_2c6d7s7h_Ac2dKs3c() {
    assertEquals(
      "2c6d7s7h Ac2dKs3c AdJs7d8s Kh5d6h3s",
      Solver.process("omaha-holdem 5h5s9sKcTs AdJs7d8s Kh5d6h3s 2c6d7s7h Ac2dKs3c"));
  }

  @Test
  public void test_omaha_holdem_7183_3h5h8c9hKs_2sTs7h6s_3dTd7sJc_Jd7c4cKd_5c7dJh8h_3sQs5dTc() {
    assertEquals(
      "3dTd7sJc Jd7c4cKd 3sQs5dTc 2sTs7h6s 5c7dJh8h",
      Solver.process("omaha-holdem 3h5h8c9hKs 2sTs7h6s 3dTd7sJc Jd7c4cKd 5c7dJh8h 3sQs5dTc"));
  }

  @Test
  public void test_omaha_holdem_7184_2s4c4d9d9s_Ks4h2c6c_5hAh3c5s_7cQdJcKh_9cJsJh6s_6d2hAd8d_5c3d5d8h_3s3h6h7d_Kd8cTdJd() {
    assertEquals(
      "Kd8cTdJd 7cQdJcKh 6d2hAd8d 3s3h6h7d 5c3d5d8h=5hAh3c5s 9cJsJh6s Ks4h2c6c",
      Solver.process("omaha-holdem 2s4c4d9d9s Ks4h2c6c 5hAh3c5s 7cQdJcKh 9cJsJh6s 6d2hAd8d 5c3d5d8h 3s3h6h7d Kd8cTdJd"));
  }

  @Test
  public void test_omaha_holdem_7185_8h9cJcJsKh_Qd2d9s6d_5h6c7h3d_Ks6h2c4d() {
    assertEquals(
      "5h6c7h3d Qd2d9s6d Ks6h2c4d",
      Solver.process("omaha-holdem 8h9cJcJsKh Qd2d9s6d 5h6c7h3d Ks6h2c4d"));
  }

  @Test
  public void test_omaha_holdem_7186_3s5h6h6sQc_3h2s7cJh_4sQdThAs_TdAc9c8c_4cKc4dJc_Tc2dAd6d() {
    assertEquals(
      "TdAc9c8c 3h2s7cJh 4cKc4dJc 4sQdThAs Tc2dAd6d",
      Solver.process("omaha-holdem 3s5h6h6sQc 3h2s7cJh 4sQdThAs TdAc9c8c 4cKc4dJc Tc2dAd6d"));
  }

  @Test
  public void test_omaha_holdem_7187_3c6c8dAsKd_Qh8s5s4d_8h9dQs3s_4cQdThKs_7hTsKc3h_6d2d2h5h_4sJs8c7c_6hQc7s3d() {
    assertEquals(
      "6d2d2h5h 4sJs8c7c Qh8s5s4d 4cQdThKs 6hQc7s3d 8h9dQs3s 7hTsKc3h",
      Solver.process("omaha-holdem 3c6c8dAsKd Qh8s5s4d 8h9dQs3s 4cQdThKs 7hTsKc3h 6d2d2h5h 4sJs8c7c 6hQc7s3d"));
  }

  @Test
  public void test_omaha_holdem_7188_2h8hAdAhJc_5s6s6h3d_Td4h9sQh_Qc4cKc6d() {
    assertEquals(
      "Qc4cKc6d 5s6s6h3d Td4h9sQh",
      Solver.process("omaha-holdem 2h8hAdAhJc 5s6s6h3d Td4h9sQh Qc4cKc6d"));
  }

  @Test
  public void test_omaha_holdem_7189_7c9sAsKdQh_Qd3d8h2s_Kh6d5h9c_6c7dTc3h_2c4sTd7h_Ks8s2hJd() {
    assertEquals(
      "2c4sTd7h=6c7dTc3h Qd3d8h2s Ks8s2hJd Kh6d5h9c",
      Solver.process("omaha-holdem 7c9sAsKdQh Qd3d8h2s Kh6d5h9c 6c7dTc3h 2c4sTd7h Ks8s2hJd"));
  }

  @Test
  public void test_omaha_holdem_7190_5h8c9dKdQh_2h4h6d8h_9h3dJdTs_Qc6hJc7d_4cAd6sTc_4d3c5sKc_8s2c4s2d_6c3sJs7c_8dAcKsAs() {
    assertEquals(
      "4cAd6sTc 8s2c4s2d 2h4h6d8h 4d3c5sKc 8dAcKsAs 6c3sJs7c=Qc6hJc7d 9h3dJdTs",
      Solver.process("omaha-holdem 5h8c9dKdQh 2h4h6d8h 9h3dJdTs Qc6hJc7d 4cAd6sTc 4d3c5sKc 8s2c4s2d 6c3sJs7c 8dAcKsAs"));
  }

  @Test
  public void test_omaha_holdem_7191_2h3cAhQdTc_2dJsKc4c_QsQhKhJh_8d6d5sJc_3d9s5hKd_5cAdTh3s_7dJdKs3h() {
    assertEquals(
      "8d6d5sJc 3d9s5hKd 5cAdTh3s 2dJsKc4c=7dJdKs3h=QsQhKhJh",
      Solver.process("omaha-holdem 2h3cAhQdTc 2dJsKc4c QsQhKhJh 8d6d5sJc 3d9s5hKd 5cAdTh3s 7dJdKs3h"));
  }

  @Test
  public void test_omaha_holdem_7192_2d5d5h8d9s_ThQc3cJs_2hJc9dJd() {
    assertEquals(
      "ThQc3cJs 2hJc9dJd",
      Solver.process("omaha-holdem 2d5d5h8d9s ThQc3cJs 2hJc9dJd"));
  }

  @Test
  public void test_omaha_holdem_7193_4h6d7cAhKs_5dJh9hKh_KdAdQs3h_8h2cTsTc_5h3c3d3s_4cQdJc8c_7s2h8d6s_As9d9c7d() {
    assertEquals(
      "4cQdJc8c 8h2cTsTc 5dJh9hKh 7s2h8d6s As9d9c7d KdAdQs3h 5h3c3d3s",
      Solver.process("omaha-holdem 4h6d7cAhKs 5dJh9hKh KdAdQs3h 8h2cTsTc 5h3c3d3s 4cQdJc8c 7s2h8d6s As9d9c7d"));
  }

  @Test
  public void test_omaha_holdem_7194_6d8hKcKsTh_Ah9h8dAs_Js6hTs3h_5c3dQd5h_5dTcKhAd_6c3sJc7c_JhJd2c2h() {
    assertEquals(
      "5c3dQd5h 6c3sJc7c Js6hTs3h JhJd2c2h Ah9h8dAs 5dTcKhAd",
      Solver.process("omaha-holdem 6d8hKcKsTh Ah9h8dAs Js6hTs3h 5c3dQd5h 5dTcKhAd 6c3sJc7c JhJd2c2h"));
  }

  @Test
  public void test_omaha_holdem_7195_5d5hKdQcQd_Ac2d4d3h_Kc7sKh8h_Jh6cJd9c_Ks3sTh2h_9h4cQhAs() {
    assertEquals(
      "Jh6cJd9c Ks3sTh2h 9h4cQhAs Ac2d4d3h Kc7sKh8h",
      Solver.process("omaha-holdem 5d5hKdQcQd Ac2d4d3h Kc7sKh8h Jh6cJd9c Ks3sTh2h 9h4cQhAs"));
  }

  @Test
  public void test_omaha_holdem_7196_5h7sKdQcTc_4hQhKsAs_Qs8c2s9c_4s2hJhTd_7hTs3c3h_8dAhJd9s_6s5s9d3d_4c2c6c7c() {
    assertEquals(
      "6s5s9d3d 4c2c6c7c 4s2hJhTd Qs8c2s9c 7hTs3c3h 4hQhKsAs 8dAhJd9s",
      Solver.process("omaha-holdem 5h7sKdQcTc 4hQhKsAs Qs8c2s9c 4s2hJhTd 7hTs3c3h 8dAhJd9s 6s5s9d3d 4c2c6c7c"));
  }

  @Test
  public void test_omaha_holdem_7197_2c6s9c9dAs_7h2d5hTs_5cKs4c5s_9h3h7d8c_Kd2s7sTd_4h4d3s8d_Js6dJcAc_Kc2h9sAd() {
    assertEquals(
      "7h2d5hTs Kd2s7sTd 4h4d3s8d 5cKs4c5s Js6dJcAc 9h3h7d8c Kc2h9sAd",
      Solver.process("omaha-holdem 2c6s9c9dAs 7h2d5hTs 5cKs4c5s 9h3h7d8c Kd2s7sTd 4h4d3s8d Js6dJcAc Kc2h9sAd"));
  }

  @Test
  public void test_omaha_holdem_7198_2s3d4sAhJs_Jh2c3sQc_8h2h8s6s_7c7h5cJd_AcKdKh3c_Td7sQdQs_Kc9d6c9c_5s9s7dKs_Ad3h5h6d() {
    assertEquals(
      "Kc9d6c9c 7c7h5cJd Jh2c3sQc AcKdKh3c Ad3h5h6d 8h2h8s6s Td7sQdQs 5s9s7dKs",
      Solver.process("omaha-holdem 2s3d4sAhJs Jh2c3sQc 8h2h8s6s 7c7h5cJd AcKdKh3c Td7sQdQs Kc9d6c9c 5s9s7dKs Ad3h5h6d"));
  }

  @Test
  public void test_omaha_holdem_7199_2c5d7cKcQh_8c7h3dJs_AsTdAc9s_9dQsJh6h_7sKhAh3c_5s2dTs4c_7d5c5h9c_2hThKs4d_JcAd9h6s() {
    assertEquals(
      "JcAd9h6s 8c7h3dJs 9dQsJh6h AsTdAc9s 5s2dTs4c 2hThKs4d 7sKhAh3c 7d5c5h9c",
      Solver.process("omaha-holdem 2c5d7cKcQh 8c7h3dJs AsTdAc9s 9dQsJh6h 7sKhAh3c 5s2dTs4c 7d5c5h9c 2hThKs4d JcAd9h6s"));
  }

  @Test
  public void test_omaha_holdem_7200_3c7c7d9dJs_9sQh4hQd_Qs8hKh2h_AsKs5h6s_Ad6c2s5s_2d6h8d9h_3d2c8sKd_Qc6d5c3s_TcTdTsKc_4s7s9c3h() {
    assertEquals(
      "Qs8hKh2h Ad6c2s5s AsKs5h6s Qc6d5c3s 3d2c8sKd 2d6h8d9h TcTdTsKc 9sQh4hQd 4s7s9c3h",
      Solver.process("omaha-holdem 3c7c7d9dJs 9sQh4hQd Qs8hKh2h AsKs5h6s Ad6c2s5s 2d6h8d9h 3d2c8sKd Qc6d5c3s TcTdTsKc 4s7s9c3h"));
  }

  @Test
  public void test_omaha_holdem_7201_6c8dAhJdJh_KsKc5d4c_Qd9sThJs_Kh5c9d8c_6s7sAsAd_2cQs9cTd() {
    assertEquals(
      "2cQs9cTd Kh5c9d8c KsKc5d4c Qd9sThJs 6s7sAsAd",
      Solver.process("omaha-holdem 6c8dAhJdJh KsKc5d4c Qd9sThJs Kh5c9d8c 6s7sAsAd 2cQs9cTd"));
  }

  @Test
  public void test_omaha_holdem_7202_2h2s3hAcKh_Kd5hQh7d_7h5s8c3d_4d8h6d8d_3sAd5dTc_TdAs6cAh() {
    assertEquals(
      "7h5s8c3d 4d8h6d8d 3sAd5dTc Kd5hQh7d TdAs6cAh",
      Solver.process("omaha-holdem 2h2s3hAcKh Kd5hQh7d 7h5s8c3d 4d8h6d8d 3sAd5dTc TdAs6cAh"));
  }

  @Test
  public void test_omaha_holdem_7203_5c8hQcQdQh_8s4c7h3c_JsTs9s2d_5hAdKd3h_6cTh6sAh_7cAc2s2h_Kc6h5dTc_KhAsKs4h_9c4s8d6d() {
    assertEquals(
      "8s4c7h3c 9c4s8d6d JsTs9s2d Kc6h5dTc 5hAdKd3h 7cAc2s2h 6cTh6sAh KhAsKs4h",
      Solver.process("omaha-holdem 5c8hQcQdQh 8s4c7h3c JsTs9s2d 5hAdKd3h 6cTh6sAh 7cAc2s2h Kc6h5dTc KhAsKs4h 9c4s8d6d"));
  }

  @Test
  public void test_omaha_holdem_7204_5sAdAsJsQs_Qh3c8sTs_7s6dKc7h() {
    assertEquals(
      "7s6dKc7h Qh3c8sTs",
      Solver.process("omaha-holdem 5sAdAsJsQs Qh3c8sTs 7s6dKc7h"));
  }

  @Test
  public void test_omaha_holdem_7205_8c9dAdAsJc_7h6c5c5h_3sTdQd7c_Kh6sTc2h_Ac7s4c5s() {
    assertEquals(
      "Kh6sTc2h 7h6c5c5h Ac7s4c5s 3sTdQd7c",
      Solver.process("omaha-holdem 8c9dAdAsJc 7h6c5c5h 3sTdQd7c Kh6sTc2h Ac7s4c5s"));
  }

  @Test
  public void test_omaha_holdem_7206_2c4d4h7cTd_2d5cTc7h_9hJh6sAd_8cKd3s4s_5d8d4cAc_Qd7sJc3h() {
    assertEquals(
      "9hJh6sAd Qd7sJc3h 2d5cTc7h 8cKd3s4s 5d8d4cAc",
      Solver.process("omaha-holdem 2c4d4h7cTd 2d5cTc7h 9hJh6sAd 8cKd3s4s 5d8d4cAc Qd7sJc3h"));
  }

  @Test
  public void test_omaha_holdem_7207_4c8d8sKdQs_Ah8hTd7d_5cKc7h2d_Jh2s8c6d_JdAc6h3s() {
    assertEquals(
      "JdAc6h3s 5cKc7h2d Jh2s8c6d Ah8hTd7d",
      Solver.process("omaha-holdem 4c8d8sKdQs Ah8hTd7d 5cKc7h2d Jh2s8c6d JdAc6h3s"));
  }

  @Test
  public void test_omaha_holdem_7208_2d5d6c6dTc_7sKc7dQc_8h9h6sKs_TdQsKh7c_7hAc8s3c_8d4s2hJs_Ts3hAh5h() {
    assertEquals(
      "7hAc8s3c 8d4s2hJs 7sKc7dQc TdQsKh7c Ts3hAh5h 8h9h6sKs",
      Solver.process("omaha-holdem 2d5d6c6dTc 7sKc7dQc 8h9h6sKs TdQsKh7c 7hAc8s3c 8d4s2hJs Ts3hAh5h"));
  }

  @Test
  public void test_omaha_holdem_7209_2c3c3s6cJc_AsTh6s3d_QsJhQd8c_7d4c5c6d_KhTd7c8d_9sQcAc5s_Kc4d9c3h_5h8h2s7h() {
    assertEquals(
      "KhTd7c8d 5h8h2s7h QsJhQd8c Kc4d9c3h 9sQcAc5s AsTh6s3d 7d4c5c6d",
      Solver.process("omaha-holdem 2c3c3s6cJc AsTh6s3d QsJhQd8c 7d4c5c6d KhTd7c8d 9sQcAc5s Kc4d9c3h 5h8h2s7h"));
  }

  @Test
  public void test_omaha_holdem_7210_9c9sJdJsQd_2c2d5d3s_3cAhTs4s_Kd8cAs6h() {
    assertEquals(
      "3cAhTs4s Kd8cAs6h 2c2d5d3s",
      Solver.process("omaha-holdem 9c9sJdJsQd 2c2d5d3s 3cAhTs4s Kd8cAs6h"));
  }

  @Test
  public void test_omaha_holdem_7211_6c6d9c9hQc_Jd3hKcTd_AdJc9d6s() {
    assertEquals(
      "Jd3hKcTd AdJc9d6s",
      Solver.process("omaha-holdem 6c6d9c9hQc Jd3hKcTd AdJc9d6s"));
  }

  @Test
  public void test_omaha_holdem_7212_2h5d9dAdKd_3d9sJhQc_8c6s9hQh_2sTh2d9c_4hAcQd4d_4c8h6cTc_6h8d7cKs() {
    assertEquals(
      "4c8h6cTc 3d9sJhQc=8c6s9hQh 6h8d7cKs 2sTh2d9c 4hAcQd4d",
      Solver.process("omaha-holdem 2h5d9dAdKd 3d9sJhQc 8c6s9hQh 2sTh2d9c 4hAcQd4d 4c8h6cTc 6h8d7cKs"));
  }

  @Test
  public void test_omaha_holdem_7213_2h3h7c7d9s_5d7h6s5s_4h7sQd5h_Jd3c4d3s_3dKs9h2s_8dJhTc8s_6hKc9cAs_Th8hTsKh_AdJs5cAc() {
    assertEquals(
      "8dJhTc8s 3dKs9h2s 6hKc9cAs Th8hTsKh AdJs5cAc 5d7h6s5s 4h7sQd5h Jd3c4d3s",
      Solver.process("omaha-holdem 2h3h7c7d9s 5d7h6s5s 4h7sQd5h Jd3c4d3s 3dKs9h2s 8dJhTc8s 6hKc9cAs Th8hTsKh AdJs5cAc"));
  }

  @Test
  public void test_omaha_holdem_7214_2d4h7sJdTc_Jh6h4s5d_Td6c5sAh_Js6sTs8h_5cQs7h7c_ThAd4cKd_QhKh5h3d() {
    assertEquals(
      "QhKh5h3d Td6c5sAh ThAd4cKd Jh6h4s5d Js6sTs8h 5cQs7h7c",
      Solver.process("omaha-holdem 2d4h7sJdTc Jh6h4s5d Td6c5sAh Js6sTs8h 5cQs7h7c ThAd4cKd QhKh5h3d"));
  }

  @Test
  public void test_omaha_holdem_7215_6d7h9cJcQc_3dTh5hQs_2d2s7cJs_2c2h4dAd_8h5c4sJh_6h7sKs8c() {
    assertEquals(
      "2c2h4dAd 3dTh5hQs 6h7sKs8c 2d2s7cJs 8h5c4sJh",
      Solver.process("omaha-holdem 6d7h9cJcQc 3dTh5hQs 2d2s7cJs 2c2h4dAd 8h5c4sJh 6h7sKs8c"));
  }

  @Test
  public void test_omaha_holdem_7216_2d2s3h8dKs_4sJhAh6h_3c4dTd5c_4c2c7hQc_Qd9h5d7c_5sQsKdJd_7s8cJsAd_7d9dAcQh_ThKcTc3s() {
    assertEquals(
      "Qd9h5d7c 4sJhAh6h 7d9dAcQh 3c4dTd5c 7s8cJsAd 5sQsKdJd ThKcTc3s 4c2c7hQc",
      Solver.process("omaha-holdem 2d2s3h8dKs 4sJhAh6h 3c4dTd5c 4c2c7hQc Qd9h5d7c 5sQsKdJd 7s8cJsAd 7d9dAcQh ThKcTc3s"));
  }

  @Test
  public void test_omaha_holdem_7217_3s4d6d8dAh_9d9c5cKs_Jd2c2d3c_8s9s7s5d_TdAd2sKd() {
    assertEquals(
      "9d9c5cKs 8s9s7s5d Jd2c2d3c TdAd2sKd",
      Solver.process("omaha-holdem 3s4d6d8dAh 9d9c5cKs Jd2c2d3c 8s9s7s5d TdAd2sKd"));
  }

  @Test
  public void test_omaha_holdem_7218_3d4s5c5s8s_TdKhTcKd_7sQd6d2h_Qh6c4d6s() {
    assertEquals(
      "Qh6c4d6s TdKhTcKd 7sQd6d2h",
      Solver.process("omaha-holdem 3d4s5c5s8s TdKhTcKd 7sQd6d2h Qh6c4d6s"));
  }

  @Test
  public void test_omaha_holdem_7219_2h3c4s6dAc_Ts6sJcAh_2c3sKs4h() {
    assertEquals(
      "2c3sKs4h Ts6sJcAh",
      Solver.process("omaha-holdem 2h3c4s6dAc Ts6sJcAh 2c3sKs4h"));
  }

  @Test
  public void test_omaha_holdem_7220_2h2s3h8sKd_7sJd2d5c_6s4c3s9d() {
    assertEquals(
      "6s4c3s9d 7sJd2d5c",
      Solver.process("omaha-holdem 2h2s3h8sKd 7sJd2d5c 6s4c3s9d"));
  }

  @Test
  public void test_omaha_holdem_7221_2dKcKhQhTc_Ts2sTh3d_5hJd7h9h_5s8c2c9c_Qc2h7dQd_9d6c6s6h_As3s3hQs_4h8d6d8s() {
    assertEquals(
      "5s8c2c9c 9d6c6s6h 4h8d6d8s As3s3hQs 5hJd7h9h Ts2sTh3d Qc2h7dQd",
      Solver.process("omaha-holdem 2dKcKhQhTc Ts2sTh3d 5hJd7h9h 5s8c2c9c Qc2h7dQd 9d6c6s6h As3s3hQs 4h8d6d8s"));
  }

  @Test
  public void test_omaha_holdem_7222_3s5c6h7hTd_TsAc4hJd_3h4d9s6d() {
    assertEquals(
      "TsAc4hJd 3h4d9s6d",
      Solver.process("omaha-holdem 3s5c6h7hTd TsAc4hJd 3h4d9s6d"));
  }

  @Test
  public void test_omaha_holdem_7223_3d4dJdQhTs_8dAc8h4s_5cAd6d9d_9s9hKsTd_5sKd6cJc_Ah5d7c6h_9c2c3c7h() {
    assertEquals(
      "Ah5d7c6h 9c2c3c7h 8dAc8h4s 5sKd6cJc 9s9hKsTd 5cAd6d9d",
      Solver.process("omaha-holdem 3d4dJdQhTs 8dAc8h4s 5cAd6d9d 9s9hKsTd 5sKd6cJc Ah5d7c6h 9c2c3c7h"));
  }

  @Test
  public void test_omaha_holdem_7224_3d5d5h6sQd_JdKd2hJh_5s2c8s3s_7hKs2sQc_9s4cQhJc_4h9h9cTd() {
    assertEquals(
      "4h9h9cTd 9s4cQhJc 7hKs2sQc JdKd2hJh 5s2c8s3s",
      Solver.process("omaha-holdem 3d5d5h6sQd JdKd2hJh 5s2c8s3s 7hKs2sQc 9s4cQhJc 4h9h9cTd"));
  }

  @Test
  public void test_omaha_holdem_7225_4s8c9hKhQc_Js2d3cAh_Th8s5h6s_7h9c4hKs_8d5s7sTc_As9s6hKd_3sAc6d5d_2hAd2cQd_4cQs2sTd() {
    assertEquals(
      "3sAc6d5d Js2d3cAh 8d5s7sTc=Th8s5h6s 2hAd2cQd 4cQs2sTd 7h9c4hKs=As9s6hKd",
      Solver.process("omaha-holdem 4s8c9hKhQc Js2d3cAh Th8s5h6s 7h9c4hKs 8d5s7sTc As9s6hKd 3sAc6d5d 2hAd2cQd 4cQs2sTd"));
  }

  @Test
  public void test_omaha_holdem_7226_2h4d5c6h9s_6cQs8c2s_JdQc3s3c_6dAc3d2d_7cQdTsJc() {
    assertEquals(
      "7cQdTsJc JdQc3s3c 6cQs8c2s 6dAc3d2d",
      Solver.process("omaha-holdem 2h4d5c6h9s 6cQs8c2s JdQc3s3c 6dAc3d2d 7cQdTsJc"));
  }

  @Test
  public void test_omaha_holdem_7227_2c6d6hAcAs_6s5h7s7d_9s4cQd9d() {
    assertEquals(
      "9s4cQd9d 6s5h7s7d",
      Solver.process("omaha-holdem 2c6d6hAcAs 6s5h7s7d 9s4cQd9d"));
  }

  @Test
  public void test_omaha_holdem_7228_8d8hAhKhTd_2dQc2s3h_7d3c5h5c_6c4sKsJh_Qh2cKcQd_2hKdTh8c_Js9s6s4h_4dAc7sTc_7h5sJd4c() {
    assertEquals(
      "7h5sJd4c Js9s6s4h 2dQc2s3h 7d3c5h5c 6c4sKsJh Qh2cKcQd 4dAc7sTc 2hKdTh8c",
      Solver.process("omaha-holdem 8d8hAhKhTd 2dQc2s3h 7d3c5h5c 6c4sKsJh Qh2cKcQd 2hKdTh8c Js9s6s4h 4dAc7sTc 7h5sJd4c"));
  }

  @Test
  public void test_omaha_holdem_7229_4c6cAhJhTs_Qc5hJs4s_5dKdTh8h_9c5c3hKs_Td9dKh3s_6s7s7c7d_3d3c2hAd_6h9sQdAc_TcQsQh5s_8s7hAs9h() {
    assertEquals(
      "9c5c3hKs 6s7s7c7d 5dKdTh8h=Td9dKh3s TcQsQh5s 3d3c2hAd 8s7hAs9h Qc5hJs4s 6h9sQdAc",
      Solver.process("omaha-holdem 4c6cAhJhTs Qc5hJs4s 5dKdTh8h 9c5c3hKs Td9dKh3s 6s7s7c7d 3d3c2hAd 6h9sQdAc TcQsQh5s 8s7hAs9h"));
  }

  @Test
  public void test_omaha_holdem_7230_3d5s9dQhTd_9h7c8cAh_2sKdTs8s() {
    assertEquals(
      "9h7c8cAh 2sKdTs8s",
      Solver.process("omaha-holdem 3d5s9dQhTd 9h7c8cAh 2sKdTs8s"));
  }

  @Test
  public void test_omaha_holdem_7231_3d3s4dAsJd_AhQd6s2c_8d2sAc7d_KhKc5sTs_Qh5dQc3h() {
    assertEquals(
      "KhKc5sTs AhQd6s2c Qh5dQc3h 8d2sAc7d",
      Solver.process("omaha-holdem 3d3s4dAsJd AhQd6s2c 8d2sAc7d KhKc5sTs Qh5dQc3h"));
  }

  @Test
  public void test_omaha_holdem_7232_4c6h9cAdJc_2hTcKsKh_5c2s7c8c_8dKd2d3d_3hTs8hQc_Qd5dJh6s_Ac3s5sQs_9dTh9hJs_Kc9sTdAs_4dAh4sJd() {
    assertEquals(
      "3hTs8hQc 8dKd2d3d 2hTcKsKh Ac3s5sQs Qd5dJh6s Kc9sTdAs 4dAh4sJd 9dTh9hJs 5c2s7c8c",
      Solver.process("omaha-holdem 4c6h9cAdJc 2hTcKsKh 5c2s7c8c 8dKd2d3d 3hTs8hQc Qd5dJh6s Ac3s5sQs 9dTh9hJs Kc9sTdAs 4dAh4sJd"));
  }

  @Test
  public void test_omaha_holdem_7233_8sAcQdQsTh_Ah4hKh9d_2hJhJd3d_2cJc7d4d_Tc2dTd6c_5h7cQc7s_6d5cKcAs_5d6s8d4c_Js7h8cKd() {
    assertEquals(
      "2cJc7d4d 5d6s8d4c 2hJhJd3d 6d5cKcAs=Ah4hKh9d 5h7cQc7s Js7h8cKd Tc2dTd6c",
      Solver.process("omaha-holdem 8sAcQdQsTh Ah4hKh9d 2hJhJd3d 2cJc7d4d Tc2dTd6c 5h7cQc7s 6d5cKcAs 5d6s8d4c Js7h8cKd"));
  }

  @Test
  public void test_omaha_holdem_7234_5c6h7h7sTc_4h4cQdAc_Ah8s9h7d() {
    assertEquals(
      "4h4cQdAc Ah8s9h7d",
      Solver.process("omaha-holdem 5c6h7h7sTc 4h4cQdAc Ah8s9h7d"));
  }

  @Test
  public void test_omaha_holdem_7235_3c6s8cKsTc_5c4hJc5s_AdKh9s9c_5dQdKc6c_7cJs5h8h_As8d3s2d_Ts2h8sKd_QhJhQsTd() {
    assertEquals(
      "7cJs5h8h QhJhQsTd AdKh9s9c As8d3s2d Ts2h8sKd 5c4hJc5s 5dQdKc6c",
      Solver.process("omaha-holdem 3c6s8cKsTc 5c4hJc5s AdKh9s9c 5dQdKc6c 7cJs5h8h As8d3s2d Ts2h8sKd QhJhQsTd"));
  }

  @Test
  public void test_omaha_holdem_7236_2c4d6dKdKs_Ac4c2hTs_TcTd6hKh_6sAs2d3h() {
    assertEquals(
      "Ac4c2hTs 6sAs2d3h TcTd6hKh",
      Solver.process("omaha-holdem 2c4d6dKdKs Ac4c2hTs TcTd6hKh 6sAs2d3h"));
  }

  @Test
  public void test_omaha_holdem_7237_3h3s4h7c9d_7hAcJd3d_2cKc3c2d_TdQs5h5s_Ad7dKh8c_JsTcQc6h_8s7s9c6c_9sThAs5c() {
    assertEquals(
      "JsTcQc6h TdQs5h5s Ad7dKh8c 9sThAs5c 8s7s9c6c 2cKc3c2d 7hAcJd3d",
      Solver.process("omaha-holdem 3h3s4h7c9d 7hAcJd3d 2cKc3c2d TdQs5h5s Ad7dKh8c JsTcQc6h 8s7s9c6c 9sThAs5c"));
  }

  @Test
  public void test_omaha_holdem_7238_3c4d5c6d9d_8h7s3h6s_QsKc3d7h_Tc8dQc5d_JsAs7dKh_9c9hTd5h_5s7cTs2h() {
    assertEquals(
      "JsAs7dKh 9c9hTd5h 5s7cTs2h=QsKc3d7h 8h7s3h6s Tc8dQc5d",
      Solver.process("omaha-holdem 3c4d5c6d9d 8h7s3h6s QsKc3d7h Tc8dQc5d JsAs7dKh 9c9hTd5h 5s7cTs2h"));
  }

  @Test
  public void test_omaha_holdem_7239_7hAdAhTcTs_Kc5d3d9h_3s4c9sJh_6c5h8h4s_5s2s9cQc_Js8c7c7d() {
    assertEquals(
      "6c5h8h4s 3s4c9sJh 5s2s9cQc Kc5d3d9h Js8c7c7d",
      Solver.process("omaha-holdem 7hAdAhTcTs Kc5d3d9h 3s4c9sJh 6c5h8h4s 5s2s9cQc Js8c7c7d"));
  }

  @Test
  public void test_omaha_holdem_7240_2c5sAdQsTc_2h8sJcJd_Qd6dKh7d_5dTsThQh_7h2d8cTd_9sAc3sKd_Qc8h9c3d_9h4sAs5c() {
    assertEquals(
      "2h8sJcJd Qc8h9c3d Qd6dKh7d 9sAc3sKd 7h2d8cTd 9h4sAs5c 5dTsThQh",
      Solver.process("omaha-holdem 2c5sAdQsTc 2h8sJcJd Qd6dKh7d 5dTsThQh 7h2d8cTd 9sAc3sKd Qc8h9c3d 9h4sAs5c"));
  }

  @Test
  public void test_omaha_holdem_7241_3s5dJdKdKh_6hTs8c3c_Qs8sJhAs_2h9h6sAc_8hKsKc7c_5s4dTd2d_5h5c8d3h_Qc2c4sQh_9d9c4h9s_Ad7s6d7d() {
    assertEquals(
      "2h9h6sAc 6hTs8c3c 9d9c4h9s Qs8sJhAs Qc2c4sQh 5s4dTd2d Ad7s6d7d 5h5c8d3h 8hKsKc7c",
      Solver.process("omaha-holdem 3s5dJdKdKh 6hTs8c3c Qs8sJhAs 2h9h6sAc 8hKsKc7c 5s4dTd2d 5h5c8d3h Qc2c4sQh 9d9c4h9s Ad7s6d7d"));
  }

  @Test
  public void test_omaha_holdem_7242_2d2s3h3sQc_QsAdJsKs_7cQh8sTs_4hAc9hKc_8c5h8h6s() {
    assertEquals(
      "4hAc9hKc 8c5h8h6s 7cQh8sTs QsAdJsKs",
      Solver.process("omaha-holdem 2d2s3h3sQc QsAdJsKs 7cQh8sTs 4hAc9hKc 8c5h8h6s"));
  }

  @Test
  public void test_omaha_holdem_7243_5hAdKhQdTd_8hAc7h7d_Qh6hJdJs_4s3c6s4d_3dQs2d3h_2hThQcJh_2s4h9sKc_TsTc5dKs_8s3s6c9d_2c5c6d9c() {
    assertEquals(
      "8s3s6c9d 4s3c6s4d 2c5c6d9c 2s4h9sKc 8hAc7h7d TsTc5dKs 2hThQcJh=Qh6hJdJs 3dQs2d3h",
      Solver.process("omaha-holdem 5hAdKhQdTd 8hAc7h7d Qh6hJdJs 4s3c6s4d 3dQs2d3h 2hThQcJh 2s4h9sKc TsTc5dKs 8s3s6c9d 2c5c6d9c"));
  }

  @Test
  public void test_omaha_holdem_7244_2d3h7h8cJh_6c3c8h6d_5dJs9dAc_Ks5s7cJd_8s4sTs9s_6hTd2s8d_QcQsQhJc() {
    assertEquals(
      "5dJs9dAc QcQsQhJc 6hTd2s8d 6c3c8h6d Ks5s7cJd 8s4sTs9s",
      Solver.process("omaha-holdem 2d3h7h8cJh 6c3c8h6d 5dJs9dAc Ks5s7cJd 8s4sTs9s 6hTd2s8d QcQsQhJc"));
  }

  @Test
  public void test_omaha_holdem_7245_2c4d5d6hKs_7d5c8hAs_Kc2sQdQc_4hTh3c8s_Ac3s6c5h() {
    assertEquals(
      "Kc2sQdQc 4hTh3c8s=Ac3s6c5h 7d5c8hAs",
      Solver.process("omaha-holdem 2c4d5d6hKs 7d5c8hAs Kc2sQdQc 4hTh3c8s Ac3s6c5h"));
  }

  @Test
  public void test_omaha_holdem_7246_2c3c4s6dQd_2d9h8d7c_Jd3dKh7s_5s3hAd6h_9d3sTs8s_TdAhKc9s_4cJhQhJc_Js8h4dAs() {
    assertEquals(
      "TdAhKc9s 2d9h8d7c 9d3sTs8s Jd3dKh7s Js8h4dAs 4cJhQhJc 5s3hAd6h",
      Solver.process("omaha-holdem 2c3c4s6dQd 2d9h8d7c Jd3dKh7s 5s3hAd6h 9d3sTs8s TdAhKc9s 4cJhQhJc Js8h4dAs"));
  }

  @Test
  public void test_omaha_holdem_7247_2s4d5sAhTc_7h5h9h2d_6sQs8d6h_7s7c4c6c() {
    assertEquals(
      "6sQs8d6h 7s7c4c6c 7h5h9h2d",
      Solver.process("omaha-holdem 2s4d5sAhTc 7h5h9h2d 6sQs8d6h 7s7c4c6c"));
  }

  @Test
  public void test_omaha_holdem_7248_2h5s6d7h9h_7d5h8d7c_8hAd6cQs_2cAcTd4h_TcJd2s4c_Th5dQd3d() {
    assertEquals(
      "TcJd2s4c 2cAcTd4h Th5dQd3d 7d5h8d7c=8hAd6cQs",
      Solver.process("omaha-holdem 2h5s6d7h9h 7d5h8d7c 8hAd6cQs 2cAcTd4h TcJd2s4c Th5dQd3d"));
  }

  @Test
  public void test_omaha_holdem_7249_3h7d8s9sJs_5c7cTd8c_2hAd4sQh() {
    assertEquals(
      "2hAd4sQh 5c7cTd8c",
      Solver.process("omaha-holdem 3h7d8s9sJs 5c7cTd8c 2hAd4sQh"));
  }

}
