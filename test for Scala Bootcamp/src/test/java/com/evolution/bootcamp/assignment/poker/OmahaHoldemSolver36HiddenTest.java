
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver36HiddenTest {


  @Test
  public void test_omaha_holdem_9000_3d3h4d9d9h_QdTs8s4s_2dQhAs7h_5sQs2cJd_ThJc2hKh_3cKc5d4c_9s5h5cQc() {
    assertEquals(
      "5sQs2cJd ThJc2hKh 2dQhAs7h QdTs8s4s 9s5h5cQc 3cKc5d4c",
      Solver.process("omaha-holdem 3d3h4d9d9h QdTs8s4s 2dQhAs7h 5sQs2cJd ThJc2hKh 3cKc5d4c 9s5h5cQc"));
  }

  @Test
  public void test_omaha_holdem_9001_4c4h4s6sQd_4d2s3d2h_8d9h5dJs_3sQs9cAh_9s8h8cTs_Kh2d3hAc_Ad7h7dKc_6cJh8sJc() {
    assertEquals(
      "8d9h5dJs 3sQs9cAh Kh2d3hAc Ad7h7dKc 9s8h8cTs 6cJh8sJc 4d2s3d2h",
      Solver.process("omaha-holdem 4c4h4s6sQd 4d2s3d2h 8d9h5dJs 3sQs9cAh 9s8h8cTs Kh2d3hAc Ad7h7dKc 6cJh8sJc"));
  }

  @Test
  public void test_omaha_holdem_9002_2s3c4s8d9d_9h5h4c9s_5cTcQsAs_4h2c2h8c_AcKsJhJs_KcKh9c3h_7hQhThJd_8h7sTs4d() {
    assertEquals(
      "7hQhThJd AcKsJhJs 8h7sTs4d KcKh9c3h 4h2c2h8c 9h5h4c9s 5cTcQsAs",
      Solver.process("omaha-holdem 2s3c4s8d9d 9h5h4c9s 5cTcQsAs 4h2c2h8c AcKsJhJs KcKh9c3h 7hQhThJd 8h7sTs4d"));
  }

  @Test
  public void test_omaha_holdem_9003_2h5d7c9dAs_Qh2d8s6d_5c7d4d4s_Qc3cKh3s_KcJh6s5h_7hJsKdJd_9h8dAd6c() {
    assertEquals(
      "Qc3cKh3s KcJh6s5h 7hJsKdJd 5c7d4d4s 9h8dAd6c=Qh2d8s6d",
      Solver.process("omaha-holdem 2h5d7c9dAs Qh2d8s6d 5c7d4d4s Qc3cKh3s KcJh6s5h 7hJsKdJd 9h8dAd6c"));
  }

  @Test
  public void test_omaha_holdem_9004_4d5h7c7hKd_6s4hQc9c_2cTsKs3c_Ac6dQsQd_Jh5sAd8d() {
    assertEquals(
      "6s4hQc9c Jh5sAd8d Ac6dQsQd 2cTsKs3c",
      Solver.process("omaha-holdem 4d5h7c7hKd 6s4hQc9c 2cTsKs3c Ac6dQsQd Jh5sAd8d"));
  }

  @Test
  public void test_omaha_holdem_9005_4c8h8sKdKh_Th3hKc5d_8c6c6sJc_4d6dTs3d_KsJd2c2h_7sJs2dJh_Qh3s4h7d_TdTc5h7c() {
    assertEquals(
      "4d6dTs3d Qh3s4h7d TdTc5h7c 7sJs2dJh 8c6c6sJc Th3hKc5d KsJd2c2h",
      Solver.process("omaha-holdem 4c8h8sKdKh Th3hKc5d 8c6c6sJc 4d6dTs3d KsJd2c2h 7sJs2dJh Qh3s4h7d TdTc5h7c"));
  }

  @Test
  public void test_omaha_holdem_9006_2s8h9dAdJd_9s5sJc3s_JhTcKhQh_3h5dQsAh_Qc7c6c6h_7dTsTh4c_9h8dJs8c_Qd2hKc5h() {
    assertEquals(
      "Qd2hKc5h Qc7c6c6h 3h5dQsAh 9s5sJc3s 9h8dJs8c 7dTsTh4c JhTcKhQh",
      Solver.process("omaha-holdem 2s8h9dAdJd 9s5sJc3s JhTcKhQh 3h5dQsAh Qc7c6c6h 7dTsTh4c 9h8dJs8c Qd2hKc5h"));
  }

  @Test
  public void test_omaha_holdem_9007_2c5d6d6h6s_Jd4sAhQd_7s7dQhAc_7hJhJc8c_Kh3h8d2s_4d8hTh2d_6c9s3sTs() {
    assertEquals(
      "4d8hTh2d Kh3h8d2s Jd4sAhQd 7s7dQhAc 7hJhJc8c 6c9s3sTs",
      Solver.process("omaha-holdem 2c5d6d6h6s Jd4sAhQd 7s7dQhAc 7hJhJc8c Kh3h8d2s 4d8hTh2d 6c9s3sTs"));
  }

  @Test
  public void test_omaha_holdem_9008_3h4c4sAhTh_3s6h5c8c_As8h3c2h_6cQdKh7d_Kd9d9c8d_7c4d2dAc_Td8sKsTs_5sQs9hJh_2c6d2sQh() {
    assertEquals(
      "6cQdKh7d 2c6d2sQh 3s6h5c8c Kd9d9c8d As8h3c2h 5sQs9hJh 7c4d2dAc Td8sKsTs",
      Solver.process("omaha-holdem 3h4c4sAhTh 3s6h5c8c As8h3c2h 6cQdKh7d Kd9d9c8d 7c4d2dAc Td8sKsTs 5sQs9hJh 2c6d2sQh"));
  }

  @Test
  public void test_omaha_holdem_9009_3h4hAsJdKd_5dAh6h9d_2hQhKcTh() {
    assertEquals(
      "5dAh6h9d 2hQhKcTh",
      Solver.process("omaha-holdem 3h4hAsJdKd 5dAh6h9d 2hQhKcTh"));
  }

  @Test
  public void test_omaha_holdem_9010_3h4d5d6c9d_KhThAc7d_7h7sJd4c_5s9hKsKd_8dJs3c3s_TsKc6s2s_9s8h3d2h_QhQc9c6h() {
    assertEquals(
      "KhThAc7d 5s9hKsKd QhQc9c6h 8dJs3c3s 9s8h3d2h=TsKc6s2s 7h7sJd4c",
      Solver.process("omaha-holdem 3h4d5d6c9d KhThAc7d 7h7sJd4c 5s9hKsKd 8dJs3c3s TsKc6s2s 9s8h3d2h QhQc9c6h"));
  }

  @Test
  public void test_omaha_holdem_9011_7d9h9sAhJc_4s5d8d9c_JhAsKd3s_7hKcJdAc_4hTcKh2d_TdQs2cTh_7cKsTs2s_3h8s6c6h_Js8hQh8c() {
    assertEquals(
      "4hTcKh2d 3h8s6c6h 7cKsTs2s TdQs2cTh Js8hQh8c 7hKcJdAc=JhAsKd3s 4s5d8d9c",
      Solver.process("omaha-holdem 7d9h9sAhJc 4s5d8d9c JhAsKd3s 7hKcJdAc 4hTcKh2d TdQs2cTh 7cKsTs2s 3h8s6c6h Js8hQh8c"));
  }

  @Test
  public void test_omaha_holdem_9012_2h4d6h6sTd_Tc8s9d3s_4c8d7c2c_5hQsTsAc_Kd9hJs4h_Th7hJd9s() {
    assertEquals(
      "4c8d7c2c Kd9hJs4h Tc8s9d3s Th7hJd9s 5hQsTsAc",
      Solver.process("omaha-holdem 2h4d6h6sTd Tc8s9d3s 4c8d7c2c 5hQsTsAc Kd9hJs4h Th7hJd9s"));
  }

  @Test
  public void test_omaha_holdem_9013_3h4d5h7hJc_5d7c8h2s_6cAh9hQc_8s5sAdQd_5cTs7s3s() {
    assertEquals(
      "8s5sAdQd 5cTs7s3s=5d7c8h2s 6cAh9hQc",
      Solver.process("omaha-holdem 3h4d5h7hJc 5d7c8h2s 6cAh9hQc 8s5sAdQd 5cTs7s3s"));
  }

  @Test
  public void test_omaha_holdem_9014_3d3s6dJcQd_5c8c9c7h_2h2cKd2d_7d4d8d7s_5hTsQsTh_Jd3cAsAh_JhKc2s6h_5s4sTd7c() {
    assertEquals(
      "5c8c9c7h 5s4sTd7c JhKc2s6h 5hTsQsTh 7d4d8d7s 2h2cKd2d Jd3cAsAh",
      Solver.process("omaha-holdem 3d3s6dJcQd 5c8c9c7h 2h2cKd2d 7d4d8d7s 5hTsQsTh Jd3cAsAh JhKc2s6h 5s4sTd7c"));
  }

  @Test
  public void test_omaha_holdem_9015_7d8cAsKcQd_6h7cQh4d_Qs7h8s6d_QcJh4hJc_6s4s3hAd_KsTh2hAh() {
    assertEquals(
      "QcJh4hJc 6s4s3hAd 6h7cQh4d Qs7h8s6d KsTh2hAh",
      Solver.process("omaha-holdem 7d8cAsKcQd 6h7cQh4d Qs7h8s6d QcJh4hJc 6s4s3hAd KsTh2hAh"));
  }

  @Test
  public void test_omaha_holdem_9016_2h6cAcAdTd_5h8d4sJh_QsJd4c8h() {
    assertEquals(
      "5h8d4sJh QsJd4c8h",
      Solver.process("omaha-holdem 2h6cAcAdTd 5h8d4sJh QsJd4c8h"));
  }

  @Test
  public void test_omaha_holdem_9017_8h9hAdAsTh_Qc3s2sQs_7c3dKd4s() {
    assertEquals(
      "7c3dKd4s Qc3s2sQs",
      Solver.process("omaha-holdem 8h9hAdAsTh Qc3s2sQs 7c3dKd4s"));
  }

  @Test
  public void test_omaha_holdem_9018_2d6h6s7h9d_KcQd9s4d_QcKs4s5c_7sAd8c9h_6dJs5dKh_Qh5s5hJc_3cQsTcTh() {
    assertEquals(
      "QcKs4s5c Qh5s5hJc KcQd9s4d 7sAd8c9h 3cQsTcTh 6dJs5dKh",
      Solver.process("omaha-holdem 2d6h6s7h9d KcQd9s4d QcKs4s5c 7sAd8c9h 6dJs5dKh Qh5s5hJc 3cQsTcTh"));
  }

  @Test
  public void test_omaha_holdem_9019_3d4d9cKsTh_7h8cKhJc_TsQcKdQd_Jh6sAs7s_QsQh6c5d() {
    assertEquals(
      "Jh6sAs7s QsQh6c5d 7h8cKhJc TsQcKdQd",
      Solver.process("omaha-holdem 3d4d9cKsTh 7h8cKhJc TsQcKdQd Jh6sAs7s QsQh6c5d"));
  }

  @Test
  public void test_omaha_holdem_9020_4h6d9sAdTd_3h3dJh3c_Ks7dTc4s_Jd6h2s5d_2h8hTsQd() {
    assertEquals(
      "3h3dJh3c 2h8hTsQd Ks7dTc4s Jd6h2s5d",
      Solver.process("omaha-holdem 4h6d9sAdTd 3h3dJh3c Ks7dTc4s Jd6h2s5d 2h8hTsQd"));
  }

  @Test
  public void test_omaha_holdem_9021_4c4d7dTcTd_7s3s3c5c_KsKh2c3d_9d8s9c8c_2s4hTsQc_9h6d5sJs_Jd7hAsAh_AcQd8d2d_4sQs7cJh_ThAdKd6h() {
    assertEquals(
      "9h6d5sJs 7s3s3c5c 9d8s9c8c KsKh2c3d Jd7hAsAh AcQd8d2d ThAdKd6h 4sQs7cJh 2s4hTsQc",
      Solver.process("omaha-holdem 4c4d7dTcTd 7s3s3c5c KsKh2c3d 9d8s9c8c 2s4hTsQc 9h6d5sJs Jd7hAsAh AcQd8d2d 4sQs7cJh ThAdKd6h"));
  }

  @Test
  public void test_omaha_holdem_9022_2s3dAcQdQs_Ad9h7h9s_3c9dKdQh_2cJhTdKh_8c6h4c6c_4hTcAs5s_7c5dJd8d() {
    assertEquals(
      "7c5dJd8d 2cJhTdKh 8c6h4c6c Ad9h7h9s 4hTcAs5s 3c9dKdQh",
      Solver.process("omaha-holdem 2s3dAcQdQs Ad9h7h9s 3c9dKdQh 2cJhTdKh 8c6h4c6c 4hTcAs5s 7c5dJd8d"));
  }

  @Test
  public void test_omaha_holdem_9023_6d6sAdJsQc_TcTh8cKs_9cJc8hTd() {
    assertEquals(
      "9cJc8hTd TcTh8cKs",
      Solver.process("omaha-holdem 6d6sAdJsQc TcTh8cKs 9cJc8hTd"));
  }

  @Test
  public void test_omaha_holdem_9024_5d6c8sAhTs_Ad9hQs3s_8d3h4s9s() {
    assertEquals(
      "8d3h4s9s Ad9hQs3s",
      Solver.process("omaha-holdem 5d6c8sAhTs Ad9hQs3s 8d3h4s9s"));
  }

  @Test
  public void test_omaha_holdem_9025_2c3d5c8cAc_8d7s4c8h_3c4d2h2d_Kh9c5d5h_7d6s7h4h_TcQs3hJc() {
    assertEquals(
      "Kh9c5d5h 8d7s4c8h 3c4d2h2d 7d6s7h4h TcQs3hJc",
      Solver.process("omaha-holdem 2c3d5c8cAc 8d7s4c8h 3c4d2h2d Kh9c5d5h 7d6s7h4h TcQs3hJc"));
  }

  @Test
  public void test_omaha_holdem_9026_3c6s8cKhQh_9dQs2hAh_As2sQdJh_9c9s5s3h_7d3d8sTs_4h7s5d7h_TdAcTcQc_6h3sKd2d() {
    assertEquals(
      "4h7s5d7h 9c9s5s3h 9dQs2hAh=As2sQdJh=TdAcTcQc 7d3d8sTs 6h3sKd2d",
      Solver.process("omaha-holdem 3c6s8cKhQh 9dQs2hAh As2sQdJh 9c9s5s3h 7d3d8sTs 4h7s5d7h TdAcTcQc 6h3sKd2d"));
  }

  @Test
  public void test_omaha_holdem_9027_7c7d9h9sTh_5sTc6c9d_JhKs8sTs_4c2dAc2h_AdQh4hJd_Qd3d7h8c_2c3c6h6d_3s7sAh9c() {
    assertEquals(
      "AdQh4hJd 4c2dAc2h 2c3c6h6d Qd3d7h8c JhKs8sTs 3s7sAh9c 5sTc6c9d",
      Solver.process("omaha-holdem 7c7d9h9sTh 5sTc6c9d JhKs8sTs 4c2dAc2h AdQh4hJd Qd3d7h8c 2c3c6h6d 3s7sAh9c"));
  }

  @Test
  public void test_omaha_holdem_9028_2h3d5h7h8c_3h5dKd8s_Kc8hQc3s_8d7d7cAs_JhKh7s9h_AcAdThKs_Js4sQd2s_TcTs4d5c_6cJdAh6h() {
    assertEquals(
      "Js4sQd2s TcTs4d5c AcAdThKs Kc8hQc3s 3h5dKd8s 8d7d7cAs JhKh7s9h 6cJdAh6h",
      Solver.process("omaha-holdem 2h3d5h7h8c 3h5dKd8s Kc8hQc3s 8d7d7cAs JhKh7s9h AcAdThKs Js4sQd2s TcTs4d5c 6cJdAh6h"));
  }

  @Test
  public void test_omaha_holdem_9029_3d5dAhJsQd_3c8d2cKd_8cThJhJd_9sJcKs2h_4c7dAs2s_7s5c4dQs_Kh7c4s9h_3h6h4h9c_Ts5hQcAd() {
    assertEquals(
      "Kh7c4s9h 3h6h4h9c 9sJcKs2h 7s5c4dQs Ts5hQcAd 8cThJhJd 4c7dAs2s 3c8d2cKd",
      Solver.process("omaha-holdem 3d5dAhJsQd 3c8d2cKd 8cThJhJd 9sJcKs2h 4c7dAs2s 7s5c4dQs Kh7c4s9h 3h6h4h9c Ts5hQcAd"));
  }

  @Test
  public void test_omaha_holdem_9030_2c6c9hJcTc_9cKdAs4c_Ts8d8c3h_5cKc6s8h_2s3c4dQh_Jh5h4s4h_QcTh6hAc() {
    assertEquals(
      "2s3c4dQh Ts8d8c3h Jh5h4s4h 9cKdAs4c 5cKc6s8h QcTh6hAc",
      Solver.process("omaha-holdem 2c6c9hJcTc 9cKdAs4c Ts8d8c3h 5cKc6s8h 2s3c4dQh Jh5h4s4h QcTh6hAc"));
  }

  @Test
  public void test_omaha_holdem_9031_2c3d6c7hJd_5dTh9dKd_Kh3h2dAh_QhTcQcTs_3s8s9sJc_Qd6hQs4d_7dKs4c5h() {
    assertEquals(
      "5dTh9dKd Qd6hQs4d=QhTcQcTs Kh3h2dAh 3s8s9sJc 7dKs4c5h",
      Solver.process("omaha-holdem 2c3d6c7hJd 5dTh9dKd Kh3h2dAh QhTcQcTs 3s8s9sJc Qd6hQs4d 7dKs4c5h"));
  }

  @Test
  public void test_omaha_holdem_9032_5d6h7c8h8s_8c6d5s2d_7dJsKsQd_2cTcQs4s_AsKdKcTs() {
    assertEquals(
      "2cTcQs4s 7dJsKsQd AsKdKcTs 8c6d5s2d",
      Solver.process("omaha-holdem 5d6h7c8h8s 8c6d5s2d 7dJsKsQd 2cTcQs4s AsKdKcTs"));
  }

  @Test
  public void test_omaha_holdem_9033_2s3c4sAcKh_7d6c8hJc_2dTd2h4c_Kc7s7c7h_9hQhAsJd() {
    assertEquals(
      "7d6c8hJc Kc7s7c7h 9hQhAsJd 2dTd2h4c",
      Solver.process("omaha-holdem 2s3c4sAcKh 7d6c8hJc 2dTd2h4c Kc7s7c7h 9hQhAsJd"));
  }

  @Test
  public void test_omaha_holdem_9034_2c6h8dAsJh_4dJdQdKd_6cQh6sAd_TdQc3c2h_Ah7c5cJc_5s7d9c4c_Kc8sAc8h_7hThKhKs_8cJsTc3h() {
    assertEquals(
      "5s7d9c4c TdQc3c2h 4dJdQdKd 7hThKhKs 8cJsTc3h Ah7c5cJc 6cQh6sAd Kc8sAc8h",
      Solver.process("omaha-holdem 2c6h8dAsJh 4dJdQdKd 6cQh6sAd TdQc3c2h Ah7c5cJc 5s7d9c4c Kc8sAc8h 7hThKhKs 8cJsTc3h"));
  }

  @Test
  public void test_omaha_holdem_9035_3s5c6sJcKd_AsTsThKs_6cTc3hQs_Jh9d5d2c_7d5s4d6d() {
    assertEquals(
      "AsTsThKs 6cTc3hQs Jh9d5d2c 7d5s4d6d",
      Solver.process("omaha-holdem 3s5c6sJcKd AsTsThKs 6cTc3hQs Jh9d5d2c 7d5s4d6d"));
  }

  @Test
  public void test_omaha_holdem_9036_2h2s3d3hTs_4dKh7c4s_5cKd9s9c_Qs6sJc3s_5s6c9h9d_Jh8sJd5d_Qh3c7hQc_AdAs8h2d_TdKc4hJs_Ks6dAhQd() {
    assertEquals(
      "Ks6dAhQd 4dKh7c4s 5cKd9s9c=5s6c9h9d TdKc4hJs Jh8sJd5d AdAs8h2d Qh3c7hQc=Qs6sJc3s",
      Solver.process("omaha-holdem 2h2s3d3hTs 4dKh7c4s 5cKd9s9c Qs6sJc3s 5s6c9h9d Jh8sJd5d Qh3c7hQc AdAs8h2d TdKc4hJs Ks6dAhQd"));
  }

  @Test
  public void test_omaha_holdem_9037_5d7sJcJdQc_8c2s5h2d_KhThAc8h_Ad2cKc3h_AsKdQh6d_9c6s4d5s_6hAh3s8d_Td4h9d3d_9s4c8s2h_7h4sKsJs() {
    assertEquals(
      "9s4c8s2h Td4h9d3d 6hAh3s8d Ad2cKc3h=KhThAc8h 8c2s5h2d 9c6s4d5s AsKdQh6d 7h4sKsJs",
      Solver.process("omaha-holdem 5d7sJcJdQc 8c2s5h2d KhThAc8h Ad2cKc3h AsKdQh6d 9c6s4d5s 6hAh3s8d Td4h9d3d 9s4c8s2h 7h4sKsJs"));
  }

  @Test
  public void test_omaha_holdem_9038_2c5d9dKdQh_Qs7c8d3h_Jd8sKc8h_AhTsKs7d_2s7s6d3c_7hTc9s3d_4c6hQcAd() {
    assertEquals(
      "2s7s6d3c 7hTc9s3d Qs7c8d3h 4c6hQcAd Jd8sKc8h AhTsKs7d",
      Solver.process("omaha-holdem 2c5d9dKdQh Qs7c8d3h Jd8sKc8h AhTsKs7d 2s7s6d3c 7hTc9s3d 4c6hQcAd"));
  }

  @Test
  public void test_omaha_holdem_9039_3h4h6h9cJc_KhAs8s6d_AdTs7h2h_9d5cAc7c_QhKc4c3d() {
    assertEquals(
      "KhAs8s6d QhKc4c3d 9d5cAc7c AdTs7h2h",
      Solver.process("omaha-holdem 3h4h6h9cJc KhAs8s6d AdTs7h2h 9d5cAc7c QhKc4c3d"));
  }

  @Test
  public void test_omaha_holdem_9040_3c9cJdKhTh_4d7d2d6s_6d6cQh7s_Jc7h8sTc_4sJs9d2c_TsAdKcAc_4c8c5h5s() {
    assertEquals(
      "4d7d2d6s 4c8c5h5s 6d6cQh7s 4sJs9d2c TsAdKcAc Jc7h8sTc",
      Solver.process("omaha-holdem 3c9cJdKhTh 4d7d2d6s 6d6cQh7s Jc7h8sTc 4sJs9d2c TsAdKcAc 4c8c5h5s"));
  }

  @Test
  public void test_omaha_holdem_9041_5c6s8c9hJc_TdQsJhJs_7d3h2dQc_Ac7cAh8s_7sJdTs5s() {
    assertEquals(
      "7d3h2dQc 7sJdTs5s TdQsJhJs Ac7cAh8s",
      Solver.process("omaha-holdem 5c6s8c9hJc TdQsJhJs 7d3h2dQc Ac7cAh8s 7sJdTs5s"));
  }

  @Test
  public void test_omaha_holdem_9042_2dAdJdKsTc_7s7h9h5d_AcQd7d6d_TsQs8d5s_ThQh8hTd() {
    assertEquals(
      "7s7h9h5d ThQh8hTd=TsQs8d5s AcQd7d6d",
      Solver.process("omaha-holdem 2dAdJdKsTc 7s7h9h5d AcQd7d6d TsQs8d5s ThQh8hTd"));
  }

  @Test
  public void test_omaha_holdem_9043_2c5h7s9dJd_2sQsAd4c_Ah6cTc7c() {
    assertEquals(
      "2sQsAd4c Ah6cTc7c",
      Solver.process("omaha-holdem 2c5h7s9dJd 2sQsAd4c Ah6cTc7c"));
  }

  @Test
  public void test_omaha_holdem_9044_8s9cAsKcTc_Th5c2c3h_4h4s3c7d() {
    assertEquals(
      "4h4s3c7d Th5c2c3h",
      Solver.process("omaha-holdem 8s9cAsKcTc Th5c2c3h 4h4s3c7d"));
  }

  @Test
  public void test_omaha_holdem_9045_9cKcKdKsTs_JsTdQd4d_Qh9h7hAh_JcAd6sTc_Jd5c3c6c_7cQc5s8c_As8s2s2c() {
    assertEquals(
      "Jd5c3c6c 7cQc5s8c JcAd6sTc Qh9h7hAh JsTdQd4d As8s2s2c",
      Solver.process("omaha-holdem 9cKcKdKsTs JsTdQd4d Qh9h7hAh JcAd6sTc Jd5c3c6c 7cQc5s8c As8s2s2c"));
  }

  @Test
  public void test_omaha_holdem_9046_3c3d4c7s8d_Qs9c9h2c_8cJcJs2d_KcJdTd5h_9s5dQd4h_Ah5c8h2h_9d6h6s7d_JhAs8sTc_3h5sTsKh_4d2sAdQh() {
    assertEquals(
      "KcJdTd5h 9s5dQd4h 4d2sAdQh 9d6h6s7d Ah5c8h2h=JhAs8sTc Qs9c9h2c 8cJcJs2d 3h5sTsKh",
      Solver.process("omaha-holdem 3c3d4c7s8d Qs9c9h2c 8cJcJs2d KcJdTd5h 9s5dQd4h Ah5c8h2h 9d6h6s7d JhAs8sTc 3h5sTsKh 4d2sAdQh"));
  }

  @Test
  public void test_omaha_holdem_9047_3c5c5d8sAh_8c4hTsAs_Kh8h4c5h_Qd6cTh8d_QsAdJcJh_5s7dKd3s_7c9sTc6s() {
    assertEquals(
      "7c9sTc6s Qd6cTh8d QsAdJcJh 8c4hTsAs 5s7dKd3s Kh8h4c5h",
      Solver.process("omaha-holdem 3c5c5d8sAh 8c4hTsAs Kh8h4c5h Qd6cTh8d QsAdJcJh 5s7dKd3s 7c9sTc6s"));
  }

  @Test
  public void test_omaha_holdem_9048_6s7c8d9c9h_6d4hJh3d_4d9s4s7d_KcQh2s5s_5h5cQdTs() {
    assertEquals(
      "KcQh2s5s 5h5cQdTs 6d4hJh3d 4d9s4s7d",
      Solver.process("omaha-holdem 6s7c8d9c9h 6d4hJh3d 4d9s4s7d KcQh2s5s 5h5cQdTs"));
  }

  @Test
  public void test_omaha_holdem_9049_6s8dJdQdTd_2d4h9dTs_7hJsKdTh_Jh3hKc5d_AdAhTc2h_Kh3c6dQs_8h9s9c2c_7c3dKs3s() {
    assertEquals(
      "7c3dKs3s Jh3hKc5d AdAhTc2h 7hJsKdTh Kh3c6dQs 8h9s9c2c 2d4h9dTs",
      Solver.process("omaha-holdem 6s8dJdQdTd 2d4h9dTs 7hJsKdTh Jh3hKc5d AdAhTc2h Kh3c6dQs 8h9s9c2c 7c3dKs3s"));
  }

  @Test
  public void test_omaha_holdem_9050_2s6hAsJcTc_4c6dQc9s_AcJsJd7c_Kc6s2h4s_2d3s8h2c_Ks3c5c8s_5dQs5s7s() {
    assertEquals(
      "Ks3c5c8s 5dQs5s7s 4c6dQc9s Kc6s2h4s 2d3s8h2c AcJsJd7c",
      Solver.process("omaha-holdem 2s6hAsJcTc 4c6dQc9s AcJsJd7c Kc6s2h4s 2d3s8h2c Ks3c5c8s 5dQs5s7s"));
  }

  @Test
  public void test_omaha_holdem_9051_3c4c7s9dTs_Qc5c8cAd_QdQh2c8h_AsTd9s3h_JsAc5s6d_QsJh2d7d_3dTcKhKc_8sJd7h6s_4h2h7c5d() {
    assertEquals(
      "Qc5c8cAd QsJh2d7d QdQh2c8h 4h2h7c5d 3dTcKhKc AsTd9s3h JsAc5s6d 8sJd7h6s",
      Solver.process("omaha-holdem 3c4c7s9dTs Qc5c8cAd QdQh2c8h AsTd9s3h JsAc5s6d QsJh2d7d 3dTcKhKc 8sJd7h6s 4h2h7c5d"));
  }

  @Test
  public void test_omaha_holdem_9052_3c5h6d7dQs_6sAh2cAd_AcQc3s9s_4d2s2hTc_9c8dKh5s_Ks3dJhJd_3hQh9h6h() {
    assertEquals(
      "Ks3dJhJd 6sAh2cAd AcQc3s9s 3hQh9h6h 4d2s2hTc 9c8dKh5s",
      Solver.process("omaha-holdem 3c5h6d7dQs 6sAh2cAd AcQc3s9s 4d2s2hTc 9c8dKh5s Ks3dJhJd 3hQh9h6h"));
  }

  @Test
  public void test_omaha_holdem_9053_2c6s7hKcQd_Kd3s9sJc_6d9cAs4s_6c8d4d8h_Kh4cAdJh_TdTc7d2h_Ts3dKs3c() {
    assertEquals(
      "6d9cAs4s 6c8d4d8h Ts3dKs3c Kd3s9sJc Kh4cAdJh TdTc7d2h",
      Solver.process("omaha-holdem 2c6s7hKcQd Kd3s9sJc 6d9cAs4s 6c8d4d8h Kh4cAdJh TdTc7d2h Ts3dKs3c"));
  }

  @Test
  public void test_omaha_holdem_9054_3d5sAhJdKd_7cJhAsAc_Qd3h6hQh_9dTc7h2c() {
    assertEquals(
      "9dTc7h2c Qd3h6hQh 7cJhAsAc",
      Solver.process("omaha-holdem 3d5sAhJdKd 7cJhAsAc Qd3h6hQh 9dTc7h2c"));
  }

  @Test
  public void test_omaha_holdem_9055_3h7sKdTdTh_2dKs9sTs_Tc6d4c2h() {
    assertEquals(
      "Tc6d4c2h 2dKs9sTs",
      Solver.process("omaha-holdem 3h7sKdTdTh 2dKs9sTs Tc6d4c2h"));
  }

  @Test
  public void test_omaha_holdem_9056_4h7d7sAhKs_Ad7hKd3c_Qs8c2s8s_4c6h5hTc_3s5dTh8h_6d5s4sQd() {
    assertEquals(
      "3s5dTh8h 4c6h5hTc 6d5s4sQd Qs8c2s8s Ad7hKd3c",
      Solver.process("omaha-holdem 4h7d7sAhKs Ad7hKd3c Qs8c2s8s 4c6h5hTc 3s5dTh8h 6d5s4sQd"));
  }

  @Test
  public void test_omaha_holdem_9057_3c4h5d7hTc_9c3s6s4c_Ac3hKd7c_ThJdKs3d_6c2dQc9s_Ts7d5cAh_Ad4s4d9h_2cJhJsQs_Jc2s2hQh() {
    assertEquals(
      "Jc2s2hQh 2cJhJsQs Ac3hKd7c ThJdKs3d Ts7d5cAh Ad4s4d9h 6c2dQc9s 9c3s6s4c",
      Solver.process("omaha-holdem 3c4h5d7hTc 9c3s6s4c Ac3hKd7c ThJdKs3d 6c2dQc9s Ts7d5cAh Ad4s4d9h 2cJhJsQs Jc2s2hQh"));
  }

  @Test
  public void test_omaha_holdem_9058_2h8s9dAhTh_9c5s9hTs_TdQc5d4h_TcKsKc2s_As3d5h7d_JsJh3hJc() {
    assertEquals(
      "TdQc5d4h As3d5h7d TcKsKc2s 9c5s9hTs JsJh3hJc",
      Solver.process("omaha-holdem 2h8s9dAhTh 9c5s9hTs TdQc5d4h TcKsKc2s As3d5h7d JsJh3hJc"));
  }

  @Test
  public void test_omaha_holdem_9059_4h5sJdJsQc_5cQs4c9d_Qh7h8d4d() {
    assertEquals(
      "Qh7h8d4d 5cQs4c9d",
      Solver.process("omaha-holdem 4h5sJdJsQc 5cQs4c9d Qh7h8d4d"));
  }

  @Test
  public void test_omaha_holdem_9060_2c4d7hKdQs_Kh6d8hTh_7c5c6sTs_5s8sQhAd_8c3h2d4s_2s8dAhAs_Jh2h6hJd_9dJc7sQc() {
    assertEquals(
      "7c5c6sTs Jh2h6hJd 5s8sQhAd Kh6d8hTh 2s8dAhAs 8c3h2d4s 9dJc7sQc",
      Solver.process("omaha-holdem 2c4d7hKdQs Kh6d8hTh 7c5c6sTs 5s8sQhAd 8c3h2d4s 2s8dAhAs Jh2h6hJd 9dJc7sQc"));
  }

  @Test
  public void test_omaha_holdem_9061_5c6s7cJcTd_5h8cJh2h_TcKd3h4d_4sQhKhQc_8hTsAh2c_5s7dAsJs_JdAdKs3s_6c2d7sTh() {
    assertEquals(
      "8hTsAh2c JdAdKs3s 4sQhKhQc 6c2d7sTh 5h8cJh2h 5s7dAsJs TcKd3h4d",
      Solver.process("omaha-holdem 5c6s7cJcTd 5h8cJh2h TcKd3h4d 4sQhKhQc 8hTsAh2c 5s7dAsJs JdAdKs3s 6c2d7sTh"));
  }

  @Test
  public void test_omaha_holdem_9062_5d7dKhQcTh_7hTsJd2h_6hQs2sTc_4h9c2d8c_3s6cAhAd_6s3c5s7c_Jh6d8sAs_7s2cKsTd() {
    assertEquals(
      "4h9c2d8c 3s6cAhAd 6s3c5s7c 7hTsJd2h 6hQs2sTc 7s2cKsTd Jh6d8sAs",
      Solver.process("omaha-holdem 5d7dKhQcTh 7hTsJd2h 6hQs2sTc 4h9c2d8c 3s6cAhAd 6s3c5s7c Jh6d8sAs 7s2cKsTd"));
  }

  @Test
  public void test_omaha_holdem_9063_5s7d8d8sQc_2hJsQhAc_3cKc2d4c_4h9dJd7s_Td3d3sJc() {
    assertEquals(
      "3cKc2d4c Td3d3sJc 4h9dJd7s 2hJsQhAc",
      Solver.process("omaha-holdem 5s7d8d8sQc 2hJsQhAc 3cKc2d4c 4h9dJd7s Td3d3sJc"));
  }

  @Test
  public void test_omaha_holdem_9064_9c9hJdKcTd_5d9d3d7h_4sKs7sKd_Jh8s5cAd() {
    assertEquals(
      "Jh8s5cAd 5d9d3d7h 4sKs7sKd",
      Solver.process("omaha-holdem 9c9hJdKcTd 5d9d3d7h 4sKs7sKd Jh8s5cAd"));
  }

  @Test
  public void test_omaha_holdem_9065_3c3h5h7sKs_2hTs3sKd_7d3dKc6c_Js4sQcTh_5dAd6d4c() {
    assertEquals(
      "Js4sQcTh 5dAd6d4c 2hTs3sKd=7d3dKc6c",
      Solver.process("omaha-holdem 3c3h5h7sKs 2hTs3sKd 7d3dKc6c Js4sQcTh 5dAd6d4c"));
  }

  @Test
  public void test_omaha_holdem_9066_4s5dAsQhTh_Jc6c6hAc_QdKdKc5h_Qs2d5sAh_7c2sKh4c_3d7sTd9s_6sTc8h8s_6dJs3sAd() {
    assertEquals(
      "7c2sKh4c 6sTc8h8s 3d7sTd9s 6dJs3sAd=Jc6c6hAc QdKdKc5h Qs2d5sAh",
      Solver.process("omaha-holdem 4s5dAsQhTh Jc6c6hAc QdKdKc5h Qs2d5sAh 7c2sKh4c 3d7sTd9s 6sTc8h8s 6dJs3sAd"));
  }

  @Test
  public void test_omaha_holdem_9067_7c9d9hAhTh_JsTc2hKc_QhQdAcKd_QcQs3h6c_5d2sTd9c_7h8h9s6d() {
    assertEquals(
      "JsTc2hKc QcQs3h6c QhQdAcKd 7h8h9s6d 5d2sTd9c",
      Solver.process("omaha-holdem 7c9d9hAhTh JsTc2hKc QhQdAcKd QcQs3h6c 5d2sTd9c 7h8h9s6d"));
  }

  @Test
  public void test_omaha_holdem_9068_2c3s7dJcQs_7h6c2d6s_8hJs8s8d() {
    assertEquals(
      "8hJs8s8d 7h6c2d6s",
      Solver.process("omaha-holdem 2c3s7dJcQs 7h6c2d6s 8hJs8s8d"));
  }

  @Test
  public void test_omaha_holdem_9069_3c5d5s6sQh_4c8d8hJh_JcTs5c9h_6h9sQs6c_7d3hAs2s() {
    assertEquals(
      "7d3hAs2s 4c8d8hJh JcTs5c9h 6h9sQs6c",
      Solver.process("omaha-holdem 3c5d5s6sQh 4c8d8hJh JcTs5c9h 6h9sQs6c 7d3hAs2s"));
  }

  @Test
  public void test_omaha_holdem_9070_3c4c8d8hTc_8c5h6dJh_Qh3h5s6h_Kc2s2d3d_Ad6sThAh() {
    assertEquals(
      "Qh3h5s6h Kc2s2d3d Ad6sThAh 8c5h6dJh",
      Solver.process("omaha-holdem 3c4c8d8hTc 8c5h6dJh Qh3h5s6h Kc2s2d3d Ad6sThAh"));
  }

  @Test
  public void test_omaha_holdem_9071_2d2h3dAsQc_8cTsQdAh_7hJdTh6d_Js8h5dKd_Ac4dKhKs_6c8s4h3h_Tc2c4c5c_6s3s5h7c() {
    assertEquals(
      "7hJdTh6d Js8h5dKd 6s3s5h7c 6c8s4h3h Ac4dKhKs 8cTsQdAh Tc2c4c5c",
      Solver.process("omaha-holdem 2d2h3dAsQc 8cTsQdAh 7hJdTh6d Js8h5dKd Ac4dKhKs 6c8s4h3h Tc2c4c5c 6s3s5h7c"));
  }

  @Test
  public void test_omaha_holdem_9072_3s5h7s8dJs_8c9c9hQh_Qd3c8sTs_4hAc7hTh_2c6dJd6s_5c4sTcKh_9dQs9sAd_6h3dKc3h_5sAh4cJc_As7d4d6c() {
    assertEquals(
      "5c4sTcKh 4hAc7hTh 8c9c9hQh 2c6dJd6s 5sAh4cJc 6h3dKc3h As7d4d6c Qd3c8sTs 9dQs9sAd",
      Solver.process("omaha-holdem 3s5h7s8dJs 8c9c9hQh Qd3c8sTs 4hAc7hTh 2c6dJd6s 5c4sTcKh 9dQs9sAd 6h3dKc3h 5sAh4cJc As7d4d6c"));
  }

  @Test
  public void test_omaha_holdem_9073_5h7s8h9dTc_AhQhAc9h_Jh6c2sJs_Jd9s3d2d_3c5c6dQs() {
    assertEquals(
      "Jh6c2sJs AhQhAc9h 3c5c6dQs Jd9s3d2d",
      Solver.process("omaha-holdem 5h7s8h9dTc AhQhAc9h Jh6c2sJs Jd9s3d2d 3c5c6dQs"));
  }

  @Test
  public void test_omaha_holdem_9074_8sKdQdQhTd_6d5h6hAs_9c8dJdAh_Qc2d4hKc_2h8h7cKs_Th3h3dTs_8c5dJh9h() {
    assertEquals(
      "6d5h6hAs 2h8h7cKs 8c5dJh9h 9c8dJdAh Th3h3dTs Qc2d4hKc",
      Solver.process("omaha-holdem 8sKdQdQhTd 6d5h6hAs 9c8dJdAh Qc2d4hKc 2h8h7cKs Th3h3dTs 8c5dJh9h"));
  }

  @Test
  public void test_omaha_holdem_9075_2c4s5d8sAh_Tc2s4h3s_9d5cQc7d_4c8h6s6h_Kh9cKd2d() {
    assertEquals(
      "9d5cQc7d Kh9cKd2d 4c8h6s6h Tc2s4h3s",
      Solver.process("omaha-holdem 2c4s5d8sAh Tc2s4h3s 9d5cQc7d 4c8h6s6h Kh9cKd2d"));
  }

  @Test
  public void test_omaha_holdem_9076_6c9dAcKhQc_KdJc3hAd_5hTc6h4h_Qd8d2s2h_5sQh9c7c() {
    assertEquals(
      "5hTc6h4h Qd8d2s2h KdJc3hAd 5sQh9c7c",
      Solver.process("omaha-holdem 6c9dAcKhQc KdJc3hAd 5hTc6h4h Qd8d2s2h 5sQh9c7c"));
  }

  @Test
  public void test_omaha_holdem_9077_4c8h9dAdJs_5d2cKs6c_6sTs5h3c_JdQhAh9h_8c5s6d7s_Qs2hAs2d_8dTd4hTc_7cJhQc6h_3h7h2sJc_5c9sKdKh() {
    assertEquals(
      "6sTs5h3c 5d2cKs6c 8c5s6d7s 3h7h2sJc 7cJhQc6h 5c9sKdKh Qs2hAs2d 8dTd4hTc JdQhAh9h",
      Solver.process("omaha-holdem 4c8h9dAdJs 5d2cKs6c 6sTs5h3c JdQhAh9h 8c5s6d7s Qs2hAs2d 8dTd4hTc 7cJhQc6h 3h7h2sJc 5c9sKdKh"));
  }

  @Test
  public void test_omaha_holdem_9078_7hAcKcKsTh_3sQd5c5s_4dQh4sKd() {
    assertEquals(
      "3sQd5c5s 4dQh4sKd",
      Solver.process("omaha-holdem 7hAcKcKsTh 3sQd5c5s 4dQh4sKd"));
  }

  @Test
  public void test_omaha_holdem_9079_8sAcKhQsTc_3dTh4d5c_5d2hAs2d_9c9h7dKd_4hQcJcTs_6c3cQhTd_6dKs3h5h_3s4c8d6h_AdJsAhKc() {
    assertEquals(
      "3s4c8d6h 3dTh4d5c 6dKs3h5h 9c9h7dKd 5d2hAs2d 6c3cQhTd 4hQcJcTs=AdJsAhKc",
      Solver.process("omaha-holdem 8sAcKhQsTc 3dTh4d5c 5d2hAs2d 9c9h7dKd 4hQcJcTs 6c3cQhTd 6dKs3h5h 3s4c8d6h AdJsAhKc"));
  }

  @Test
  public void test_omaha_holdem_9080_3h4cJcJdJs_As9dKcAh_Ad4d2c4h_9c9s3c6s_Kd3sKs6d_5hTd7h9h_Qs7dJhKh() {
    assertEquals(
      "5hTd7h9h Ad4d2c4h 9c9s3c6s Kd3sKs6d As9dKcAh Qs7dJhKh",
      Solver.process("omaha-holdem 3h4cJcJdJs As9dKcAh Ad4d2c4h 9c9s3c6s Kd3sKs6d 5hTd7h9h Qs7dJhKh"));
  }

  @Test
  public void test_omaha_holdem_9081_7s8sAcQhTs_5h6sKc5c_Kh7c7h4c_Jc5s2hJd_2d4s9dKd_9sQd4d7d_3c8dQs9h_KsAhAd6h_Th2sQc6c_2c3d3h5d() {
    assertEquals(
      "2d4s9dKd 2c3d3h5d 5h6sKc5c Jc5s2hJd 9sQd4d7d 3c8dQs9h Th2sQc6c Kh7c7h4c KsAhAd6h",
      Solver.process("omaha-holdem 7s8sAcQhTs 5h6sKc5c Kh7c7h4c Jc5s2hJd 2d4s9dKd 9sQd4d7d 3c8dQs9h KsAhAd6h Th2sQc6c 2c3d3h5d"));
  }

  @Test
  public void test_omaha_holdem_9082_3h5c5hJhKs_2dAs2c4d_Qc3s6cKd_Ac7d4cKc_7s7c6hTd_2hQh4sTs_Jd3d9s8d() {
    assertEquals(
      "2dAs2c4d 7s7c6hTd Jd3d9s8d Qc3s6cKd Ac7d4cKc 2hQh4sTs",
      Solver.process("omaha-holdem 3h5c5hJhKs 2dAs2c4d Qc3s6cKd Ac7d4cKc 7s7c6hTd 2hQh4sTs Jd3d9s8d"));
  }

  @Test
  public void test_omaha_holdem_9083_2c6cJcJdTh_6sAhQc6h_5s2h4d9d_Ac7d8c8h() {
    assertEquals(
      "5s2h4d9d Ac7d8c8h 6sAhQc6h",
      Solver.process("omaha-holdem 2c6cJcJdTh 6sAhQc6h 5s2h4d9d Ac7d8c8h"));
  }

  @Test
  public void test_omaha_holdem_9084_3c4s5h7dTh_Jd4h4dKd_2sTdQd5d_6c5cQc2d() {
    assertEquals(
      "2sTdQd5d Jd4h4dKd 6c5cQc2d",
      Solver.process("omaha-holdem 3c4s5h7dTh Jd4h4dKd 2sTdQd5d 6c5cQc2d"));
  }

  @Test
  public void test_omaha_holdem_9085_8d9hAcJcKh_7d5c8c5s_2d6h3dJd_3hJsTs3s() {
    assertEquals(
      "7d5c8c5s 2d6h3dJd 3hJsTs3s",
      Solver.process("omaha-holdem 8d9hAcJcKh 7d5c8c5s 2d6h3dJd 3hJsTs3s"));
  }

  @Test
  public void test_omaha_holdem_9086_2s4c4h5c7h_9dQh6cQd_5s4s3s9s() {
    assertEquals(
      "9dQh6cQd 5s4s3s9s",
      Solver.process("omaha-holdem 2s4c4h5c7h 9dQh6cQd 5s4s3s9s"));
  }

  @Test
  public void test_omaha_holdem_9087_5s7dJcJhTs_Jd6dQd9d_9h2s8sKs_Ac7s2c3h_5hKd3cQs_Kc5cAs4s_6sTc8cAd_Ah6h3s4h_Qc9c3d2h_Kh8h2dJs() {
    assertEquals(
      "Qc9c3d2h Ah6h3s4h 5hKd3cQs Kc5cAs4s Ac7s2c3h 6sTc8cAd Jd6dQd9d Kh8h2dJs 9h2s8sKs",
      Solver.process("omaha-holdem 5s7dJcJhTs Jd6dQd9d 9h2s8sKs Ac7s2c3h 5hKd3cQs Kc5cAs4s 6sTc8cAd Ah6h3s4h Qc9c3d2h Kh8h2dJs"));
  }

  @Test
  public void test_omaha_holdem_9088_4s7d9d9sQd_JdJsKh6d_2hJhQcKd() {
    assertEquals(
      "2hJhQcKd JdJsKh6d",
      Solver.process("omaha-holdem 4s7d9d9sQd JdJsKh6d 2hJhQcKd"));
  }

  @Test
  public void test_omaha_holdem_9089_5c5d6h6sAc_7h7c8d5h_Jh3c2s7s_Ts9c9d6c_Th4hQsTd() {
    assertEquals(
      "Jh3c2s7s Th4hQsTd 7h7c8d5h Ts9c9d6c",
      Solver.process("omaha-holdem 5c5d6h6sAc 7h7c8d5h Jh3c2s7s Ts9c9d6c Th4hQsTd"));
  }

  @Test
  public void test_omaha_holdem_9090_2c3c9h9sJc_TsThJsKd_8hAc3sAs_2d4s7dJd_4hQcKs4c_6cAh8d5h() {
    assertEquals(
      "6cAh8d5h 2d4s7dJd TsThJsKd 8hAc3sAs 4hQcKs4c",
      Solver.process("omaha-holdem 2c3c9h9sJc TsThJsKd 8hAc3sAs 2d4s7dJd 4hQcKs4c 6cAh8d5h"));
  }

  @Test
  public void test_omaha_holdem_9091_2h9cJsKcKh_9dTh2d5d_8d5s3dQc_As8sTsJd_2sJh4h6d_9hQh4d4c() {
    assertEquals(
      "8d5s3dQc 9dTh2d5d 9hQh4d4c 2sJh4h6d As8sTsJd",
      Solver.process("omaha-holdem 2h9cJsKcKh 9dTh2d5d 8d5s3dQc As8sTsJd 2sJh4h6d 9hQh4d4c"));
  }

  @Test
  public void test_omaha_holdem_9092_4c6c7s8cQc_9d2cKsTh_Qs4d9c4h_As7c3s5d_5cAh7dAc_KhJcTd8d() {
    assertEquals(
      "KhJcTd8d Qs4d9c4h As7c3s5d 9d2cKsTh 5cAh7dAc",
      Solver.process("omaha-holdem 4c6c7s8cQc 9d2cKsTh Qs4d9c4h As7c3s5d 5cAh7dAc KhJcTd8d"));
  }

  @Test
  public void test_omaha_holdem_9093_3d4h7c8hQs_6cJc6d8d_7sTdKdTh_9h4cAs2h_5cAhKcJd_2s2d4s2c_AcQhJh6h_3s9d3h5s_8s4dJsKh_Qc9s6sKs() {
    assertEquals(
      "5cAhKcJd 2s2d4s2c 9h4cAs2h 6cJc6d8d 7sTdKdTh Qc9s6sKs AcQhJh6h 8s4dJsKh 3s9d3h5s",
      Solver.process("omaha-holdem 3d4h7c8hQs 6cJc6d8d 7sTdKdTh 9h4cAs2h 5cAhKcJd 2s2d4s2c AcQhJh6h 3s9d3h5s 8s4dJsKh Qc9s6sKs"));
  }

  @Test
  public void test_omaha_holdem_9094_3s4s9dKdQs_Td6d8dKs_6hJh9sTh_Tc2d5c5d_As6c8s7c_Jd5h2s2c_3cJsAhQh_5sJcTs9c_KhAd4d2h_6s4h9h4c() {
    assertEquals(
      "Jd5h2s2c Tc2d5c5d Td6d8dKs 3cJsAhQh KhAd4d2h 6s4h9h4c 6hJh9sTh 5sJcTs9c As6c8s7c",
      Solver.process("omaha-holdem 3s4s9dKdQs Td6d8dKs 6hJh9sTh Tc2d5c5d As6c8s7c Jd5h2s2c 3cJsAhQh 5sJcTs9c KhAd4d2h 6s4h9h4c"));
  }

  @Test
  public void test_omaha_holdem_9095_3d5h7cJcQd_Ts9d6hAc_3h3sKcKd_4hTd9sAd_Qc7h6c7d_4cJs8h2h_Ks9cThJh_2sQh8s3c() {
    assertEquals(
      "4hTd9sAd=Ts9d6hAc 4cJs8h2h Ks9cThJh 2sQh8s3c 3h3sKcKd Qc7h6c7d",
      Solver.process("omaha-holdem 3d5h7cJcQd Ts9d6hAc 3h3sKcKd 4hTd9sAd Qc7h6c7d 4cJs8h2h Ks9cThJh 2sQh8s3c"));
  }

  @Test
  public void test_omaha_holdem_9096_4h5c8d9hTd_6h7d7s7c_AdQd4c3c_5h2c5dKd_Kh7h5s4s_6d9sAcQh() {
    assertEquals(
      "AdQd4c3c 6d9sAcQh Kh7h5s4s 5h2c5dKd 6h7d7s7c",
      Solver.process("omaha-holdem 4h5c8d9hTd 6h7d7s7c AdQd4c3c 5h2c5dKd Kh7h5s4s 6d9sAcQh"));
  }

  @Test
  public void test_omaha_holdem_9097_2h2s5c7sKd_4c5s3s9h_Ac6sQhJs_Ks7d4h9s() {
    assertEquals(
      "Ac6sQhJs 4c5s3s9h Ks7d4h9s",
      Solver.process("omaha-holdem 2h2s5c7sKd 4c5s3s9h Ac6sQhJs Ks7d4h9s"));
  }

  @Test
  public void test_omaha_holdem_9098_2c3d3sKdQh_7cQsJc5c_Qd9dJsTd_Ad5s5hTh_8cJh2h7s() {
    assertEquals(
      "8cJh2h7s Ad5s5hTh 7cQsJc5c=Qd9dJsTd",
      Solver.process("omaha-holdem 2c3d3sKdQh 7cQsJc5c Qd9dJsTd Ad5s5hTh 8cJh2h7s"));
  }

  @Test
  public void test_omaha_holdem_9099_7c9c9hAcKh_9s4h8h5c_5h4d5dQc_7s8s4s3h() {
    assertEquals(
      "5h4d5dQc 7s8s4s3h 9s4h8h5c",
      Solver.process("omaha-holdem 7c9c9hAcKh 9s4h8h5c 5h4d5dQc 7s8s4s3h"));
  }

  @Test
  public void test_omaha_holdem_9100_2h4h9d9sKs_AcTd5sJd_Qc7d6c7c_8s3dKh5d() {
    assertEquals(
      "AcTd5sJd Qc7d6c7c 8s3dKh5d",
      Solver.process("omaha-holdem 2h4h9d9sKs AcTd5sJd Qc7d6c7c 8s3dKh5d"));
  }

  @Test
  public void test_omaha_holdem_9101_2d7h9cJsKd_6h6d4hTs_8d2h5h2s_Kh4cAs9d_Tc5cQd3d_3cKs4sJd() {
    assertEquals(
      "6h6d4hTs Kh4cAs9d 3cKs4sJd 8d2h5h2s Tc5cQd3d",
      Solver.process("omaha-holdem 2d7h9cJsKd 6h6d4hTs 8d2h5h2s Kh4cAs9d Tc5cQd3d 3cKs4sJd"));
  }

  @Test
  public void test_omaha_holdem_9102_2s6h9sAcKs_Qh2dAd8s_8c7hQcJd() {
    assertEquals(
      "8c7hQcJd Qh2dAd8s",
      Solver.process("omaha-holdem 2s6h9sAcKs Qh2dAd8s 8c7hQcJd"));
  }

  @Test
  public void test_omaha_holdem_9103_4c5d7h8hQs_KhTc5sQd_2h3sJc9s_AcAh8dKc_9d8sKsTd_4s4hQhTh_3cJh5h3d() {
    assertEquals(
      "2h3sJc9s 3cJh5h3d 9d8sKsTd AcAh8dKc KhTc5sQd 4s4hQhTh",
      Solver.process("omaha-holdem 4c5d7h8hQs KhTc5sQd 2h3sJc9s AcAh8dKc 9d8sKsTd 4s4hQhTh 3cJh5h3d"));
  }

  @Test
  public void test_omaha_holdem_9104_5s7dJdJsKs_Kd9s7h4s_6h7cTd8h_Th2h2dJc_9c4cQh3h_9d4d8s2c_AhAc3s5c_KhAd3d9h_4hQcTsKc() {
    assertEquals(
      "9d4d8s2c 9c4cQh3h 6h7cTd8h 4hQcTsKc KhAd3d9h AhAc3s5c Th2h2dJc Kd9s7h4s",
      Solver.process("omaha-holdem 5s7dJdJsKs Kd9s7h4s 6h7cTd8h Th2h2dJc 9c4cQh3h 9d4d8s2c AhAc3s5c KhAd3d9h 4hQcTsKc"));
  }

  @Test
  public void test_omaha_holdem_9105_6d7h8d9cTs_4hAhKhJs_2s9h4sKs() {
    assertEquals(
      "4hAhKhJs 2s9h4sKs",
      Solver.process("omaha-holdem 6d7h8d9cTs 4hAhKhJs 2s9h4sKs"));
  }

  @Test
  public void test_omaha_holdem_9106_3s8sJdTcTh_Kc4c9dKd_Ad4d4s7c_JhKsTs8d_3d5d6hAs_Kh5hQsAc_7h9sJs4h_2d6s7d6d_2s7sJcTd_8cQd3h6c() {
    assertEquals(
      "Kh5hQsAc 3d5d6hAs Ad4d4s7c 2d6s7d6d 8cQd3h6c Kc4c9dKd 7h9sJs4h 2s7sJcTd=JhKsTs8d",
      Solver.process("omaha-holdem 3s8sJdTcTh Kc4c9dKd Ad4d4s7c JhKsTs8d 3d5d6hAs Kh5hQsAc 7h9sJs4h 2d6s7d6d 2s7sJcTd 8cQd3h6c"));
  }

  @Test
  public void test_omaha_holdem_9107_3d4s7d8cAc_Jh9dAd8d_Td7s5d2d_2c6c9hQc_3s4hKs2h_8h7h3hTs_7cAs8s2s_Kh6dJcKc_QdJdQh3c_JsTc6s4d() {
    assertEquals(
      "2c6c9hQc JsTc6s4d QdJdQh3c Kh6dJcKc 3s4hKs2h 8h7h3hTs 7cAs8s2s=Jh9dAd8d Td7s5d2d",
      Solver.process("omaha-holdem 3d4s7d8cAc Jh9dAd8d Td7s5d2d 2c6c9hQc 3s4hKs2h 8h7h3hTs 7cAs8s2s Kh6dJcKc QdJdQh3c JsTc6s4d"));
  }

  @Test
  public void test_omaha_holdem_9108_5s8hAcQdTc_5h6dQcJh_9hJc9d9c_AhTd2hKh() {
    assertEquals(
      "5h6dQcJh AhTd2hKh 9hJc9d9c",
      Solver.process("omaha-holdem 5s8hAcQdTc 5h6dQcJh 9hJc9d9c AhTd2hKh"));
  }

  @Test
  public void test_omaha_holdem_9109_2s5s6s7hQc_4sKd4d2h_8dThAc8s_JhTd6d7d_9c4cKc7s_2c3dKhAh_8c5c3sTc_QsJd3cAd() {
    assertEquals(
      "2c3dKhAh 4sKd4d2h 8c5c3sTc 9c4cKc7s 8dThAc8s QsJd3cAd JhTd6d7d",
      Solver.process("omaha-holdem 2s5s6s7hQc 4sKd4d2h 8dThAc8s JhTd6d7d 9c4cKc7s 2c3dKhAh 8c5c3sTc QsJd3cAd"));
  }

  @Test
  public void test_omaha_holdem_9110_3s5d7sJcJs_6hAcTh7c_Qc7h6sQh_8d8h8s9h_4sKc9cTd() {
    assertEquals(
      "4sKc9cTd 6hAcTh7c 8d8h8s9h Qc7h6sQh",
      Solver.process("omaha-holdem 3s5d7sJcJs 6hAcTh7c Qc7h6sQh 8d8h8s9h 4sKc9cTd"));
  }

  @Test
  public void test_omaha_holdem_9111_2h4s5dJdKc_Js7dAd2s_Jh8c8dQc_8h3sKh4c_3c8sQsKd_7cTcKs2c_7hAs3h4d() {
    assertEquals(
      "Jh8c8dQc 3c8sQsKd Js7dAd2s 7cTcKs2c 8h3sKh4c 7hAs3h4d",
      Solver.process("omaha-holdem 2h4s5dJdKc Js7dAd2s Jh8c8dQc 8h3sKh4c 3c8sQsKd 7cTcKs2c 7hAs3h4d"));
  }

  @Test
  public void test_omaha_holdem_9112_2c6d7s8d8s_7dAd2d5s_ThAs3c3h_Kc6h3d5c_9d9s5hKs_AcJdTc4h_KhQsJs4s_TsQd9c6c_Td7c8h6s() {
    assertEquals(
      "KhQsJs4s AcJdTc4h ThAs3c3h Kc6h3d5c 7dAd2d5s 9d9s5hKs TsQd9c6c Td7c8h6s",
      Solver.process("omaha-holdem 2c6d7s8d8s 7dAd2d5s ThAs3c3h Kc6h3d5c 9d9s5hKs AcJdTc4h KhQsJs4s TsQd9c6c Td7c8h6s"));
  }

  @Test
  public void test_omaha_holdem_9113_2c6s7sJcQh_9sTcAd6c_6hKc7cAh_AcQs8c4c_Td3s8s3c_2d9d4s2h_5d4dJdAs() {
    assertEquals(
      "Td3s8s3c 9sTcAd6c 5d4dJdAs AcQs8c4c 6hKc7cAh 2d9d4s2h",
      Solver.process("omaha-holdem 2c6s7sJcQh 9sTcAd6c 6hKc7cAh AcQs8c4c Td3s8s3c 2d9d4s2h 5d4dJdAs"));
  }

  @Test
  public void test_omaha_holdem_9114_5h7c8cTdTh_7dKcJsAd_Jc4h6h4c_Jd2s6s5d_8d4dTsKh_6dQhAh7s_4sQc2hQd_3c9d5c3h_8s9s5s8h() {
    assertEquals(
      "3c9d5c3h Jd2s6s5d 6dQhAh7s=7dKcJsAd 4sQc2hQd Jc4h6h4c 8s9s5s8h 8d4dTsKh",
      Solver.process("omaha-holdem 5h7c8cTdTh 7dKcJsAd Jc4h6h4c Jd2s6s5d 8d4dTsKh 6dQhAh7s 4sQc2hQd 3c9d5c3h 8s9s5s8h"));
  }

  @Test
  public void test_omaha_holdem_9115_5h9c9d9hAc_6h9s2d8c_7d2sKd7h_5d3sAs8s_Js5cKhQc_4cQsKs3c_5sAh2h8d_QdJh6d4h() {
    assertEquals(
      "QdJh6d4h 4cQsKs3c=Js5cKhQc 5d3sAs8s=5sAh2h8d 7d2sKd7h 6h9s2d8c",
      Solver.process("omaha-holdem 5h9c9d9hAc 6h9s2d8c 7d2sKd7h 5d3sAs8s Js5cKhQc 4cQsKs3c 5sAh2h8d QdJh6d4h"));
  }

  @Test
  public void test_omaha_holdem_9116_2d8cAcAhTs_2cTc7dTd_7s5sKs3d_6h3h9d6d_3sJh3cTh_KdQd2sQh_8h2h4c5c_Kc4dJcKh_4sQc7c8s_9h7hQs9s() {
    assertEquals(
      "7s5sKs3d 6h3h9d6d 8h2h4c5c 4sQc7c8s 9h7hQs9s 3sJh3cTh KdQd2sQh Kc4dJcKh 2cTc7dTd",
      Solver.process("omaha-holdem 2d8cAcAhTs 2cTc7dTd 7s5sKs3d 6h3h9d6d 3sJh3cTh KdQd2sQh 8h2h4c5c Kc4dJcKh 4sQc7c8s 9h7hQs9s"));
  }

  @Test
  public void test_omaha_holdem_9117_3s4h7sAcJc_Th9hQdQs_6hTcJh8s_2d6c6d3h_Kd8h6sTs_4sKh9dAs_8d3cQc2h_3d5s7c4c_2c5hKs5c() {
    assertEquals(
      "Kd8h6sTs 8d3cQc2h 2d6c6d3h 6hTcJh8s Th9hQdQs 3d5s7c4c 4sKh9dAs 2c5hKs5c",
      Solver.process("omaha-holdem 3s4h7sAcJc Th9hQdQs 6hTcJh8s 2d6c6d3h Kd8h6sTs 4sKh9dAs 8d3cQc2h 3d5s7c4c 2c5hKs5c"));
  }

  @Test
  public void test_omaha_holdem_9118_4c6s8h8sQs_Jc9cAhTh_3d6h8d4s_9d5h2sKs_Qc8c7s5s() {
    assertEquals(
      "Jc9cAhTh 9d5h2sKs 3d6h8d4s Qc8c7s5s",
      Solver.process("omaha-holdem 4c6s8h8sQs Jc9cAhTh 3d6h8d4s 9d5h2sKs Qc8c7s5s"));
  }

  @Test
  public void test_omaha_holdem_9119_3c3d4s9hJc_Ah7c6d2h_9d6hQcJd_2d5cAd7h_2sAsJhTc_8s3hKhJs() {
    assertEquals(
      "2d5cAd7h=Ah7c6d2h 2sAsJhTc 9d6hQcJd 8s3hKhJs",
      Solver.process("omaha-holdem 3c3d4s9hJc Ah7c6d2h 9d6hQcJd 2d5cAd7h 2sAsJhTc 8s3hKhJs"));
  }

  @Test
  public void test_omaha_holdem_9120_2d4h9hAcTs_Ad6dQh8s_7h7s5hJd_8dQcJc7c_9cKh2cKd_2s7d4d4s_2h4c3h3s() {
    assertEquals(
      "8dQcJc7c 7h7s5hJd Ad6dQh8s 2h4c3h3s 9cKh2cKd 2s7d4d4s",
      Solver.process("omaha-holdem 2d4h9hAcTs Ad6dQh8s 7h7s5hJd 8dQcJc7c 9cKh2cKd 2s7d4d4s 2h4c3h3s"));
  }

  @Test
  public void test_omaha_holdem_9121_3d6dKcTcTd_JsAsKh8d_Qd6hJd8c() {
    assertEquals(
      "JsAsKh8d Qd6hJd8c",
      Solver.process("omaha-holdem 3d6dKcTcTd JsAsKh8d Qd6hJd8c"));
  }

  @Test
  public void test_omaha_holdem_9122_8c9d9hAsTh_5h3d8sAh_QdQh4d7h_5s3sQsJh_9cJc4hJs() {
    assertEquals(
      "QdQh4d7h 5h3d8sAh 9cJc4hJs 5s3sQsJh",
      Solver.process("omaha-holdem 8c9d9hAsTh 5h3d8sAh QdQh4d7h 5s3sQsJh 9cJc4hJs"));
  }

  @Test
  public void test_omaha_holdem_9123_2c5hAhAsKh_Qh5cJd9s_4h2s3hKs_7s8c4cTh() {
    assertEquals(
      "7s8c4cTh Qh5cJd9s 4h2s3hKs",
      Solver.process("omaha-holdem 2c5hAhAsKh Qh5cJd9s 4h2s3hKs 7s8c4cTh"));
  }

  @Test
  public void test_omaha_holdem_9124_3s4c6hAsJc_Ad5hQc3d_Ah5c2c7d_Qd4h7s2d_7hAc8s4s() {
    assertEquals(
      "Qd4h7s2d Ad5hQc3d 7hAc8s4s Ah5c2c7d",
      Solver.process("omaha-holdem 3s4c6hAsJc Ad5hQc3d Ah5c2c7d Qd4h7s2d 7hAc8s4s"));
  }

  @Test
  public void test_omaha_holdem_9125_3d5d8c9cQs_Ks5h2d8d_Th6s4h3h_Kh7s6cQc_TdKc2c8h_TcJh5s7d_JdQhAs7h() {
    assertEquals(
      "Th6s4h3h TdKc2c8h JdQhAs7h Ks5h2d8d Kh7s6cQc TcJh5s7d",
      Solver.process("omaha-holdem 3d5d8c9cQs Ks5h2d8d Th6s4h3h Kh7s6cQc TdKc2c8h TcJh5s7d JdQhAs7h"));
  }

  @Test
  public void test_omaha_holdem_9126_4d4h7sJhKd_6c7dAh9d_2s2c5s3s_2d4c5dQs_Ad7c6d8c_9h5hTh3c_Kc2hAsKs_4s5cTd9c() {
    assertEquals(
      "9h5hTh3c 2s2c5s3s 6c7dAh9d=Ad7c6d8c 4s5cTd9c 2d4c5dQs Kc2hAsKs",
      Solver.process("omaha-holdem 4d4h7sJhKd 6c7dAh9d 2s2c5s3s 2d4c5dQs Ad7c6d8c 9h5hTh3c Kc2hAsKs 4s5cTd9c"));
  }

  @Test
  public void test_omaha_holdem_9127_2s6d6hAcTc_3d4c2c2d_KdTd9dKh_7c5d8dQc_8s7dTsKs() {
    assertEquals(
      "7c5d8dQc 8s7dTsKs KdTd9dKh 3d4c2c2d",
      Solver.process("omaha-holdem 2s6d6hAcTc 3d4c2c2d KdTd9dKh 7c5d8dQc 8s7dTsKs"));
  }

  @Test
  public void test_omaha_holdem_9128_4c4s5hAsTh_5cJh6c2d_AcQcQh4d_8dKh2h6h_Js2sAh4h_TsTd7h8c_6s3h3sKd_KsTc8s5d_Kc3d5s2c() {
    assertEquals(
      "8dKh2h6h 6s3h3sKd 5cJh6c2d KsTc8s5d Kc3d5s2c AcQcQh4d=Js2sAh4h TsTd7h8c",
      Solver.process("omaha-holdem 4c4s5hAsTh 5cJh6c2d AcQcQh4d 8dKh2h6h Js2sAh4h TsTd7h8c 6s3h3sKd KsTc8s5d Kc3d5s2c"));
  }

  @Test
  public void test_omaha_holdem_9129_4c6c7dAsKh_8sAcJc5s_6d6hTd2h_3s2cJh7c_Kc5dAh6s_QcQd4s9d_Ad9cJdKs() {
    assertEquals(
      "3s2cJh7c QcQd4s9d Ad9cJdKs=Kc5dAh6s 6d6hTd2h 8sAcJc5s",
      Solver.process("omaha-holdem 4c6c7dAsKh 8sAcJc5s 6d6hTd2h 3s2cJh7c Kc5dAh6s QcQd4s9d Ad9cJdKs"));
  }

  @Test
  public void test_omaha_holdem_9130_2s9cKsTcTh_AdAs4c7s_3s5c6s3d_7cTsKdJd_JcKc8dAc_6dQc4hQd() {
    assertEquals(
      "3s5c6s3d 6dQc4hQd JcKc8dAc AdAs4c7s 7cTsKdJd",
      Solver.process("omaha-holdem 2s9cKsTcTh AdAs4c7s 3s5c6s3d 7cTsKdJd JcKc8dAc 6dQc4hQd"));
  }

  @Test
  public void test_omaha_holdem_9131_2s6c9hAhQd_8d3s8s5c_Jd7c7sQc_5s5dJh4h_Kh8c9d2h_9c4c2d6d_6sAcJs3c_AdTdKsTh() {
    assertEquals(
      "5s5dJh4h 8d3s8s5c Jd7c7sQc AdTdKsTh Kh8c9d2h 9c4c2d6d 6sAcJs3c",
      Solver.process("omaha-holdem 2s6c9hAhQd 8d3s8s5c Jd7c7sQc 5s5dJh4h Kh8c9d2h 9c4c2d6d 6sAcJs3c AdTdKsTh"));
  }

  @Test
  public void test_omaha_holdem_9132_7c8d9sAcQs_6c5sKsTh_3c2d2cAh_4h2sKc6s() {
    assertEquals(
      "4h2sKc6s 3c2d2cAh 6c5sKsTh",
      Solver.process("omaha-holdem 7c8d9sAcQs 6c5sKsTh 3c2d2cAh 4h2sKc6s"));
  }

  @Test
  public void test_omaha_holdem_9133_2c3h5dJcTs_KsQc9c6s_6cThJhQd_8h5hJs2d() {
    assertEquals(
      "KsQc9c6s 8h5hJs2d 6cThJhQd",
      Solver.process("omaha-holdem 2c3h5dJcTs KsQc9c6s 6cThJhQd 8h5hJs2d"));
  }

  @Test
  public void test_omaha_holdem_9134_2d4s6cAcTh_8h5s9d9h_4c6hAhAs_3s8s6s6d() {
    assertEquals(
      "8h5s9d9h 3s8s6s6d 4c6hAhAs",
      Solver.process("omaha-holdem 2d4s6cAcTh 8h5s9d9h 4c6hAhAs 3s8s6s6d"));
  }

  @Test
  public void test_omaha_holdem_9135_2s6h9hKhTd_Jh4sTc6s_Js7cJc2d_8h3s7d8d_Ks7h9d6d_8s7sQsQd_Ac3d5hAh_2c3h5d5c_8c4h3cTh_4c4d5sTs() {
    assertEquals(
      "2c3h5d5c 4c4d5sTs Js7cJc2d Jh4sTc6s Ks7h9d6d 8h3s7d8d=8s7sQsQd 8c4h3cTh Ac3d5hAh",
      Solver.process("omaha-holdem 2s6h9hKhTd Jh4sTc6s Js7cJc2d 8h3s7d8d Ks7h9d6d 8s7sQsQd Ac3d5hAh 2c3h5d5c 8c4h3cTh 4c4d5sTs"));
  }

  @Test
  public void test_omaha_holdem_9136_3s4h4s7c7h_Ad6dQc4d_Qh8c8dJs_3d6cKdJc_Ts8h6sAh() {
    assertEquals(
      "Ts8h6sAh 3d6cKdJc Qh8c8dJs Ad6dQc4d",
      Solver.process("omaha-holdem 3s4h4s7c7h Ad6dQc4d Qh8c8dJs 3d6cKdJc Ts8h6sAh"));
  }

  @Test
  public void test_omaha_holdem_9137_3d5h6c7cQs_8c8dAsJs_Jh6h2c5c_Ts6s9h2s_2d8h5s3c_4cAc9cTc_7h9d4d3s_JcQdQcTh_7s3hAh5d_KcKs9s6d() {
    assertEquals(
      "4cAc9cTc Ts6s9h2s 8c8dAsJs KcKs9s6d 2d8h5s3c Jh6h2c5c 7s3hAh5d JcQdQcTh 7h9d4d3s",
      Solver.process("omaha-holdem 3d5h6c7cQs 8c8dAsJs Jh6h2c5c Ts6s9h2s 2d8h5s3c 4cAc9cTc 7h9d4d3s JcQdQcTh 7s3hAh5d KcKs9s6d"));
  }

  @Test
  public void test_omaha_holdem_9138_2s3h6s8dQs_KsQh2hAd_Kc7c4s5d_9s4h9hJh_Qd2c5hAh_5s3s7h6c_KdKh9dAs() {
    assertEquals(
      "9s4h9hJh KdKh9dAs KsQh2hAd=Qd2c5hAh Kc7c4s5d 5s3s7h6c",
      Solver.process("omaha-holdem 2s3h6s8dQs KsQh2hAd Kc7c4s5d 9s4h9hJh Qd2c5hAh 5s3s7h6c KdKh9dAs"));
  }

  @Test
  public void test_omaha_holdem_9139_2h4h6d7sKd_8d5dKsJs_ThQd7hAc_2dJd9h3c_2s6s6h4s_Ts6c5sKc_Jc4c3h7d_3dQhAs2c_9sQc5cAh_8c8h4dKh() {
    assertEquals(
      "9sQc5cAh 2dJd9h3c 3dQhAs2c ThQd7hAc Jc4c3h7d 8c8h4dKh Ts6c5sKc 2s6s6h4s 8d5dKsJs",
      Solver.process("omaha-holdem 2h4h6d7sKd 8d5dKsJs ThQd7hAc 2dJd9h3c 2s6s6h4s Ts6c5sKc Jc4c3h7d 3dQhAs2c 9sQc5cAh 8c8h4dKh"));
  }

  @Test
  public void test_omaha_holdem_9140_6c9hJhKcKh_AhJs8s8c_3s8h3cAc_7h2cQs5h_QhJcKsQd_TdTs4hAs_2d6d4sTh_Ad5s8d6s() {
    assertEquals(
      "3s8h3cAc 2d6d4sTh Ad5s8d6s TdTs4hAs AhJs8s8c 7h2cQs5h QhJcKsQd",
      Solver.process("omaha-holdem 6c9hJhKcKh AhJs8s8c 3s8h3cAc 7h2cQs5h QhJcKsQd TdTs4hAs 2d6d4sTh Ad5s8d6s"));
  }

  @Test
  public void test_omaha_holdem_9141_2cAcJhQcTc_Qd4h5sQh_8d2dAd8c_9d9s6d6s_5d7sKd4d() {
    assertEquals(
      "5d7sKd4d 9d9s6d6s 8d2dAd8c Qd4h5sQh",
      Solver.process("omaha-holdem 2cAcJhQcTc Qd4h5sQh 8d2dAd8c 9d9s6d6s 5d7sKd4d"));
  }

  @Test
  public void test_omaha_holdem_9142_3d5d8hKsTh_6hTs5h9c_4s6sTdJh_3cJsAh4h_Qs6d2d2h_8d8c2cKc_7c5s4d3s() {
    assertEquals(
      "Qs6d2d2h 3cJsAh4h 4s6sTdJh 7c5s4d3s 6hTs5h9c 8d8c2cKc",
      Solver.process("omaha-holdem 3d5d8hKsTh 6hTs5h9c 4s6sTdJh 3cJsAh4h Qs6d2d2h 8d8c2cKc 7c5s4d3s"));
  }

  @Test
  public void test_omaha_holdem_9143_5d8hAcJdJs_Th5c9s9c_Qh6dTc6h_5hQc8s4c_6c8dQs4h_KsJcKd3h_3s9h5s6s_3cKh8c7d() {
    assertEquals(
      "3s9h5s6s Qh6dTc6h 5hQc8s4c=6c8dQs4h 3cKh8c7d Th5c9s9c KsJcKd3h",
      Solver.process("omaha-holdem 5d8hAcJdJs Th5c9s9c Qh6dTc6h 5hQc8s4c 6c8dQs4h KsJcKd3h 3s9h5s6s 3cKh8c7d"));
  }

  @Test
  public void test_omaha_holdem_9144_3s4c6hAcTc_3c2hQhAs_3h8d5c9s_Ad2d9d4s_5hTh6s4d_7cQd8h7s_8sAhKd6d_Jc2c6cQs() {
    assertEquals(
      "3h8d5c9s 7cQd8h7s 5hTh6s4d 3c2hQhAs Ad2d9d4s 8sAhKd6d Jc2c6cQs",
      Solver.process("omaha-holdem 3s4c6hAcTc 3c2hQhAs 3h8d5c9s Ad2d9d4s 5hTh6s4d 7cQd8h7s 8sAhKd6d Jc2c6cQs"));
  }

  @Test
  public void test_omaha_holdem_9145_8h9sKcKsTh_Tc5s2c8d_9d7hQc3s_6dQhKd9h_4s8sAs3d_KhQs4h7d_5cAd5hJs_6c2h7c9c_6hTsJh3h() {
    assertEquals(
      "5cAd5hJs 4s8sAs3d 9d7hQc3s Tc5s2c8d 6hTsJh3h KhQs4h7d 6c2h7c9c 6dQhKd9h",
      Solver.process("omaha-holdem 8h9sKcKsTh Tc5s2c8d 9d7hQc3s 6dQhKd9h 4s8sAs3d KhQs4h7d 5cAd5hJs 6c2h7c9c 6hTsJh3h"));
  }

  @Test
  public void test_omaha_holdem_9146_4d5dJdKsQc_7d5cTh7h_Qh2sJc5h_9d2h8d8s_2c8cQd6h_7c6s4hQs_3sTc2d7s_8hAcAhAd() {
    assertEquals(
      "3sTc2d7s 7d5cTh7h 2c8cQd6h 8hAcAhAd 7c6s4hQs Qh2sJc5h 9d2h8d8s",
      Solver.process("omaha-holdem 4d5dJdKsQc 7d5cTh7h Qh2sJc5h 9d2h8d8s 2c8cQd6h 7c6s4hQs 3sTc2d7s 8hAcAhAd"));
  }

  @Test
  public void test_omaha_holdem_9147_2c2d4d4hJh_QsAh3sQh_Js3c6cKd_8cQd2hJd_7h3d8s8h_3hJc9cAd_2s8d5s5c_7s5dTdTs() {
    assertEquals(
      "7h3d8s8h 7s5dTdTs Js3c6cKd 3hJc9cAd QsAh3sQh 2s8d5s5c 8cQd2hJd",
      Solver.process("omaha-holdem 2c2d4d4hJh QsAh3sQh Js3c6cKd 8cQd2hJd 7h3d8s8h 3hJc9cAd 2s8d5s5c 7s5dTdTs"));
  }

  @Test
  public void test_omaha_holdem_9148_6c6s8dJcTs_8cAsJhQh_2c7c9d5s_4c2s4h6h_8sKs3cAc() {
    assertEquals(
      "8sKs3cAc 8cAsJhQh 4c2s4h6h 2c7c9d5s",
      Solver.process("omaha-holdem 6c6s8dJcTs 8cAsJhQh 2c7c9d5s 4c2s4h6h 8sKs3cAc"));
  }

  @Test
  public void test_omaha_holdem_9149_2d5h6h7c7d_QcThJc8d_7s9d2sAh_2cTd8s8c() {
    assertEquals(
      "QcThJc8d 2cTd8s8c 7s9d2sAh",
      Solver.process("omaha-holdem 2d5h6h7c7d QcThJc8d 7s9d2sAh 2cTd8s8c"));
  }

  @Test
  public void test_omaha_holdem_9150_5h7sAdJhQc_6hAh9d2d_8c3hQhAs_7c8d4h9h_3c7dKs9s() {
    assertEquals(
      "7c8d4h9h 3c7dKs9s 6hAh9d2d 8c3hQhAs",
      Solver.process("omaha-holdem 5h7sAdJhQc 6hAh9d2d 8c3hQhAs 7c8d4h9h 3c7dKs9s"));
  }

  @Test
  public void test_omaha_holdem_9151_2c3d4d5c8d_2sTc4c8c_6h8s6s9c_KsJd5d5h_Js8h3hTd_JhKcAsTh() {
    assertEquals(
      "JhKcAsTh 6h8s6s9c Js8h3hTd 2sTc4c8c KsJd5d5h",
      Solver.process("omaha-holdem 2c3d4d5c8d 2sTc4c8c 6h8s6s9c KsJd5d5h Js8h3hTd JhKcAsTh"));
  }

  @Test
  public void test_omaha_holdem_9152_5c5s6sAcQs_8h5dKcTh_2hJs6hJh_6d2dQc8s_2c3hJd9c_As4s3cKs_7dKhAdQh_7c9d2sQd() {
    assertEquals(
      "2c3hJd9c 2hJs6hJh 7c9d2sQd 6d2dQc8s 7dKhAdQh 8h5dKcTh As4s3cKs",
      Solver.process("omaha-holdem 5c5s6sAcQs 8h5dKcTh 2hJs6hJh 6d2dQc8s 2c3hJd9c As4s3cKs 7dKhAdQh 7c9d2sQd"));
  }

  @Test
  public void test_omaha_holdem_9153_4c6dJcJdKh_JhTcAsAc_2d4hJs2h_QhTdQd5s() {
    assertEquals(
      "QhTdQd5s JhTcAsAc 2d4hJs2h",
      Solver.process("omaha-holdem 4c6dJcJdKh JhTcAsAc 2d4hJs2h QhTdQd5s"));
  }

  @Test
  public void test_omaha_holdem_9154_2d8h9cAcJd_2cJh7h3c_QdAs2hKh_5hTsKsQc_Qs5s9h8c_5d2sKd7d_ThAdTd3s_JcKc8s7s() {
    assertEquals(
      "5d2sKd7d ThAdTd3s Qs5s9h8c 2cJh7h3c JcKc8s7s QdAs2hKh 5hTsKsQc",
      Solver.process("omaha-holdem 2d8h9cAcJd 2cJh7h3c QdAs2hKh 5hTsKsQc Qs5s9h8c 5d2sKd7d ThAdTd3s JcKc8s7s"));
  }

  @Test
  public void test_omaha_holdem_9155_6s8c8s9c9h_7sTcThAc_Ts7cQs9d_4s4dQdAd_5sAs2c9s_Ah4cKsJh() {
    assertEquals(
      "Ah4cKsJh 4s4dQdAd 5sAs2c9s 7sTcThAc=Ts7cQs9d",
      Solver.process("omaha-holdem 6s8c8s9c9h 7sTcThAc Ts7cQs9d 4s4dQdAd 5sAs2c9s Ah4cKsJh"));
  }

  @Test
  public void test_omaha_holdem_9156_3d3h6hJsQh_5d2d6cJd_9sJc4s7d_8cAcKs2c() {
    assertEquals(
      "8cAcKs2c 9sJc4s7d 5d2d6cJd",
      Solver.process("omaha-holdem 3d3h6hJsQh 5d2d6cJd 9sJc4s7d 8cAcKs2c"));
  }

  @Test
  public void test_omaha_holdem_9157_4c8sAdAhQc_9c8d2s2d_7s5d8h5s_6s4dKsQd_Jh7cJs4h_7d8cTsKc_9s9h5hKd_Td2h7hQs() {
    assertEquals(
      "7s5d8h5s 9c8d2s2d 7d8cTsKc 9s9h5hKd Jh7cJs4h Td2h7hQs 6s4dKsQd",
      Solver.process("omaha-holdem 4c8sAdAhQc 9c8d2s2d 7s5d8h5s 6s4dKsQd Jh7cJs4h 7d8cTsKc 9s9h5hKd Td2h7hQs"));
  }

  @Test
  public void test_omaha_holdem_9158_4c6s8hTcTs_8c5hJh2c_4h3hJd9s_2hKs9h8s_AhAcQcQd_8d2d4s7s_6d2s4d5c() {
    assertEquals(
      "4h3hJd9s 6d2s4d5c 8d2d4s7s 8c5hJh2c 2hKs9h8s AhAcQcQd",
      Solver.process("omaha-holdem 4c6s8hTcTs 8c5hJh2c 4h3hJd9s 2hKs9h8s AhAcQcQd 8d2d4s7s 6d2s4d5c"));
  }

  @Test
  public void test_omaha_holdem_9159_4s5c5d9cAd_8d4h7sQs_6c3cQhKs_Kd9sKhAc_4cTd9h7h_Qc6sKc5s_3d6dTc3s() {
    assertEquals(
      "6c3cQhKs 3d6dTc3s 8d4h7sQs 4cTd9h7h Kd9sKhAc Qc6sKc5s",
      Solver.process("omaha-holdem 4s5c5d9cAd 8d4h7sQs 6c3cQhKs Kd9sKhAc 4cTd9h7h Qc6sKc5s 3d6dTc3s"));
  }

  @Test
  public void test_omaha_holdem_9160_2h6h8dQcTh_6dQd3d9h_9c3s6sAc_Qh2cTd4h_Ks3c2sAs_TcKcJh3h_7sAdJc5h() {
    assertEquals(
      "7sAdJc5h Ks3c2sAs 9c3s6sAc 6dQd3d9h TcKcJh3h Qh2cTd4h",
      Solver.process("omaha-holdem 2h6h8dQcTh 6dQd3d9h 9c3s6sAc Qh2cTd4h Ks3c2sAs TcKcJh3h 7sAdJc5h"));
  }

  @Test
  public void test_omaha_holdem_9161_2c5h6sKsQh_Jh8c2d9c_KdTcQsAs_3c5d4s8s_7d9dKh4h_8dTd7hAd_4c6hQd7c_4dJs9h5s_8h6d3dAc() {
    assertEquals(
      "8dTd7hAd Jh8c2d9c 4dJs9h5s 8h6d3dAc 7d9dKh4h 4c6hQd7c KdTcQsAs 3c5d4s8s",
      Solver.process("omaha-holdem 2c5h6sKsQh Jh8c2d9c KdTcQsAs 3c5d4s8s 7d9dKh4h 8dTd7hAd 4c6hQd7c 4dJs9h5s 8h6d3dAc"));
  }

  @Test
  public void test_omaha_holdem_9162_3h3s6s8cAc_7h8s7cAs_2s4hJc8d_KhKc6c8h_TdTc5cJs_2c5h2h7d_3cTsAhKs_9hAd2d6h() {
    assertEquals(
      "2c5h2h7d 2s4hJc8d TdTc5cJs KhKc6c8h 9hAd2d6h 7h8s7cAs 3cTsAhKs",
      Solver.process("omaha-holdem 3h3s6s8cAc 7h8s7cAs 2s4hJc8d KhKc6c8h TdTc5cJs 2c5h2h7d 3cTsAhKs 9hAd2d6h"));
  }

  @Test
  public void test_omaha_holdem_9163_6c7dJcKdTd_5s8dQcAs_Ah9c8h9s_2c2d5h9h() {
    assertEquals(
      "2c2d5h9h Ah9c8h9s 5s8dQcAs",
      Solver.process("omaha-holdem 6c7dJcKdTd 5s8dQcAs Ah9c8h9s 2c2d5h9h"));
  }

  @Test
  public void test_omaha_holdem_9164_2h2s5hQhTc_4hQc2d8s_4s3c9hKs_Qs6dAsKh_4cJc8c5c() {
    assertEquals(
      "4s3c9hKs 4cJc8c5c Qs6dAsKh 4hQc2d8s",
      Solver.process("omaha-holdem 2h2s5hQhTc 4hQc2d8s 4s3c9hKs Qs6dAsKh 4cJc8c5c"));
  }

  @Test
  public void test_omaha_holdem_9165_4c6c7hAsKs_2cKdAdTd_5cQs6h4h_9d3hTsAh_7sJh6s9h() {
    assertEquals(
      "9d3hTsAh 5cQs6h4h 7sJh6s9h 2cKdAdTd",
      Solver.process("omaha-holdem 4c6c7hAsKs 2cKdAdTd 5cQs6h4h 9d3hTsAh 7sJh6s9h"));
  }

  @Test
  public void test_omaha_holdem_9166_4h5d5sAsKc_7cJd6cJs_9c2hKsQh_8d7sJh4s() {
    assertEquals(
      "8d7sJh4s 7cJd6cJs 9c2hKsQh",
      Solver.process("omaha-holdem 4h5d5sAsKc 7cJd6cJs 9c2hKsQh 8d7sJh4s"));
  }

  @Test
  public void test_omaha_holdem_9167_3c7h8cJcJh_Ks4d9sAd_6dQhAh3h_KcKh6c9d_4s6h7c3s_5hQc9h4h_Kd7dAs2d() {
    assertEquals(
      "5hQc9h4h Ks4d9sAd 6dQhAh3h 4s6h7c3s Kd7dAs2d KcKh6c9d",
      Solver.process("omaha-holdem 3c7h8cJcJh Ks4d9sAd 6dQhAh3h KcKh6c9d 4s6h7c3s 5hQc9h4h Kd7dAs2d"));
  }

  @Test
  public void test_omaha_holdem_9168_2cAdAhJcQs_9sThTs7h_5s7d5hJd_9cTd6d3h_Kh4s4hJs_2s8c2d5c_2hAsKdAc_8dKsTc5d() {
    assertEquals(
      "9cTd6d3h 9sThTs7h 5s7d5hJd Kh4s4hJs 8dKsTc5d 2s8c2d5c 2hAsKdAc",
      Solver.process("omaha-holdem 2cAdAhJcQs 9sThTs7h 5s7d5hJd 9cTd6d3h Kh4s4hJs 2s8c2d5c 2hAsKdAc 8dKsTc5d"));
  }

  @Test
  public void test_omaha_holdem_9169_3h4d6h7cAc_As4sJh2s_9d6s3d4h_2h8h5hTd_7dJdTs2c_8c3sQhJs() {
    assertEquals(
      "8c3sQhJs 7dJdTs2c 9d6s3d4h As4sJh2s 2h8h5hTd",
      Solver.process("omaha-holdem 3h4d6h7cAc As4sJh2s 9d6s3d4h 2h8h5hTd 7dJdTs2c 8c3sQhJs"));
  }

  @Test
  public void test_omaha_holdem_9170_3s7d7s9sAc_9c6hQs3c_6d4c7h6c_As8h7c2d_TsTc8cKc_2h3hAhJd_5sQd2c8d() {
    assertEquals(
      "5sQd2c8d 9c6hQs3c TsTc8cKc 2h3hAhJd 6d4c7h6c As8h7c2d",
      Solver.process("omaha-holdem 3s7d7s9sAc 9c6hQs3c 6d4c7h6c As8h7c2d TsTc8cKc 2h3hAhJd 5sQd2c8d"));
  }

  @Test
  public void test_omaha_holdem_9171_4c9dAcJhKd_3h6s8d4h_2cAs3dTd_3s5c6hJd() {
    assertEquals(
      "3h6s8d4h 3s5c6hJd 2cAs3dTd",
      Solver.process("omaha-holdem 4c9dAcJhKd 3h6s8d4h 2cAs3dTd 3s5c6hJd"));
  }

  @Test
  public void test_omaha_holdem_9172_2c7c8h9sTd_9cTsAcJc_Js7hKd6h_4dJd6sAh_As6c8dTc_5s3d4s6d() {
    assertEquals(
      "4dJd6sAh 5s3d4s6d As6c8dTc 9cTsAcJc=Js7hKd6h",
      Solver.process("omaha-holdem 2c7c8h9sTd 9cTsAcJc Js7hKd6h 4dJd6sAh As6c8dTc 5s3d4s6d"));
  }

  @Test
  public void test_omaha_holdem_9173_4c4h6c6sAd_7d9h8s6d_TsQd7hQc_KdAsJh3s_8c5dJdJs() {
    assertEquals(
      "8c5dJdJs TsQd7hQc KdAsJh3s 7d9h8s6d",
      Solver.process("omaha-holdem 4c4h6c6sAd 7d9h8s6d TsQd7hQc KdAsJh3s 8c5dJdJs"));
  }

  @Test
  public void test_omaha_holdem_9174_3c5h5sJhKh_8s6dAsAd_4s6s4h9h_8h5d3s4c_AcJs2dKc_2cKdQsAh_8c6hQd7d_TsTc5c3h_2sJcQh9c() {
    assertEquals(
      "8c6hQd7d 2sJcQh9c 2cKdQsAh AcJs2dKc 8s6dAsAd 4s6s4h9h 8h5d3s4c=TsTc5c3h",
      Solver.process("omaha-holdem 3c5h5sJhKh 8s6dAsAd 4s6s4h9h 8h5d3s4c AcJs2dKc 2cKdQsAh 8c6hQd7d TsTc5c3h 2sJcQh9c"));
  }

  @Test
  public void test_omaha_holdem_9175_3h4s5d8sTc_2s6dAs6s_7c6cKc4h_4c2hTd5h_Ks7d3s4d() {
    assertEquals(
      "Ks7d3s4d 4c2hTd5h 2s6dAs6s 7c6cKc4h",
      Solver.process("omaha-holdem 3h4s5d8sTc 2s6dAs6s 7c6cKc4h 4c2hTd5h Ks7d3s4d"));
  }

  @Test
  public void test_omaha_holdem_9176_4c4d5c8s9h_9c2c6sJh_Qh7hAd2s_9dTh4sAs_5hAh8d9s_Kd2hJcQs_Kh6h3h7c() {
    assertEquals(
      "Kd2hJcQs Qh7hAd2s 9c2c6sJh 5hAh8d9s Kh6h3h7c 9dTh4sAs",
      Solver.process("omaha-holdem 4c4d5c8s9h 9c2c6sJh Qh7hAd2s 9dTh4sAs 5hAh8d9s Kd2hJcQs Kh6h3h7c"));
  }

  @Test
  public void test_omaha_holdem_9177_3d4d6h8dAd_2c6dAh9h_QdAc5d9d_Td5cAsQc_Js7h7d7c_QhJcQs2s_3cKhTs8h_4cJh7s2h() {
    assertEquals(
      "4cJh7s2h Js7h7d7c QhJcQs2s Td5cAsQc 3cKhTs8h 2c6dAh9h QdAc5d9d",
      Solver.process("omaha-holdem 3d4d6h8dAd 2c6dAh9h QdAc5d9d Td5cAsQc Js7h7d7c QhJcQs2s 3cKhTs8h 4cJh7s2h"));
  }

  @Test
  public void test_omaha_holdem_9178_5s8c9c9dKs_4s9s2dAc_6s2hKc3c_4c6c3dQc_AhTsJsQd() {
    assertEquals(
      "4c6c3dQc AhTsJsQd 6s2hKc3c 4s9s2dAc",
      Solver.process("omaha-holdem 5s8c9c9dKs 4s9s2dAc 6s2hKc3c 4c6c3dQc AhTsJsQd"));
  }

  @Test
  public void test_omaha_holdem_9179_3s4c5c5hTh_Ad2sKd7h_Ah2hQs4h_Jd8s8h6h_9dTs8cQd_6s5s9c5d_Kh8dJsAs() {
    assertEquals(
      "Kh8dJsAs Jd8s8h6h 9dTs8cQd Ad2sKd7h=Ah2hQs4h 6s5s9c5d",
      Solver.process("omaha-holdem 3s4c5c5hTh Ad2sKd7h Ah2hQs4h Jd8s8h6h 9dTs8cQd 6s5s9c5d Kh8dJsAs"));
  }

  @Test
  public void test_omaha_holdem_9180_2c2h3h4cKc_5s3c4d5c_7d8cJh7c_Ac2d6s5h() {
    assertEquals(
      "Ac2d6s5h 5s3c4d5c 7d8cJh7c",
      Solver.process("omaha-holdem 2c2h3h4cKc 5s3c4d5c 7d8cJh7c Ac2d6s5h"));
  }

  @Test
  public void test_omaha_holdem_9181_2c5c8s9dJd_Td5d5sKc_7d6h8dQd_5hKh6c8c_7cQc4d9s_2s9c3h6d() {
    assertEquals(
      "7cQc4d9s 5hKh6c8c 2s9c3h6d Td5d5sKc 7d6h8dQd",
      Solver.process("omaha-holdem 2c5c8s9dJd Td5d5sKc 7d6h8dQd 5hKh6c8c 7cQc4d9s 2s9c3h6d"));
  }

  @Test
  public void test_omaha_holdem_9182_3s7s8hJhTh_QdJd9h6s_4c3d3h2h_Qh9c5sKh_QsAh9dKd() {
    assertEquals(
      "QdJd9h6s=QsAh9dKd 4c3d3h2h Qh9c5sKh",
      Solver.process("omaha-holdem 3s7s8hJhTh QdJd9h6s 4c3d3h2h Qh9c5sKh QsAh9dKd"));
  }

  @Test
  public void test_omaha_holdem_9183_3s5h6c7cQs_5s8d4dTd_7s4h2dAd_3cTsQc9c_Kd8sAhKs_4s7h8hKh_5c9dJd5d_9s6sAsJc_2sAc9h2h_Js3h3d4c() {
    assertEquals(
      "2sAc9h2h 9s6sAsJc Kd8sAhKs 3cTsQc9c 5c9dJd5d 7s4h2dAd=Js3h3d4c 4s7h8hKh=5s8d4dTd",
      Solver.process("omaha-holdem 3s5h6c7cQs 5s8d4dTd 7s4h2dAd 3cTsQc9c Kd8sAhKs 4s7h8hKh 5c9dJd5d 9s6sAsJc 2sAc9h2h Js3h3d4c"));
  }

  @Test
  public void test_omaha_holdem_9184_2c2h3d7h8d_7d2dQc5s_9sAh9d5d_TcQsQd6d_TsKsTh2s_6cQh6hKc_5h7c4dKh_3sJh4hJc() {
    assertEquals(
      "6cQh6hKc 5h7c4dKh 9sAh9d5d 3sJh4hJc TcQsQd6d TsKsTh2s 7d2dQc5s",
      Solver.process("omaha-holdem 2c2h3d7h8d 7d2dQc5s 9sAh9d5d TcQsQd6d TsKsTh2s 6cQh6hKc 5h7c4dKh 3sJh4hJc"));
  }

  @Test
  public void test_omaha_holdem_9185_2s4s7dAhJc_6c9hKd9s_6d2d9d7c() {
    assertEquals(
      "6c9hKd9s 6d2d9d7c",
      Solver.process("omaha-holdem 2s4s7dAhJc 6c9hKd9s 6d2d9d7c"));
  }

  @Test
  public void test_omaha_holdem_9186_3s5d8d9cAs_2dJh8h2c_AhAcTc6c_QhQs4dAd_2sJcTh8s_JdTdKc9d_4s7sQc5c_3d6d8cJs_9s3c5s5h_6h9h4h3h() {
    assertEquals(
      "4s7sQc5c 2dJh8h2c=2sJcTh8s JdTdKc9d QhQs4dAd 3d6d8cJs 6h9h4h3h 9s3c5s5h AhAcTc6c",
      Solver.process("omaha-holdem 3s5d8d9cAs 2dJh8h2c AhAcTc6c QhQs4dAd 2sJcTh8s JdTdKc9d 4s7sQc5c 3d6d8cJs 9s3c5s5h 6h9h4h3h"));
  }

  @Test
  public void test_omaha_holdem_9187_3d4d9cQsTd_8h9hTc7c_Th8s2h6c_Jd4sJc6s_8cKd7h9s() {
    assertEquals(
      "8cKd7h9s Th8s2h6c Jd4sJc6s 8h9hTc7c",
      Solver.process("omaha-holdem 3d4d9cQsTd 8h9hTc7c Th8s2h6c Jd4sJc6s 8cKd7h9s"));
  }

  @Test
  public void test_omaha_holdem_9188_2h5hAcQsTh_KhJd6cJc_QhJsQc3c_7s9dTc5d_KdAs9c5s_AdTd4s3d_4cKc3h9h() {
    assertEquals(
      "7s9dTc5d KdAs9c5s QhJsQc3c AdTd4s3d KhJd6cJc 4cKc3h9h",
      Solver.process("omaha-holdem 2h5hAcQsTh KhJd6cJc QhJsQc3c 7s9dTc5d KdAs9c5s AdTd4s3d 4cKc3h9h"));
  }

  @Test
  public void test_omaha_holdem_9189_2s4c9sTdTs_2dAdAc2h_6s5hJd3c_9c2c8s3d_Qh7d4s9d_7cAh8hKh_4h8dKdKs_5c7sJh3h() {
    assertEquals(
      "6s5hJd3c 5c7sJh3h 7cAh8hKh 9c2c8s3d Qh7d4s9d 4h8dKdKs 2dAdAc2h",
      Solver.process("omaha-holdem 2s4c9sTdTs 2dAdAc2h 6s5hJd3c 9c2c8s3d Qh7d4s9d 7cAh8hKh 4h8dKdKs 5c7sJh3h"));
  }

  @Test
  public void test_omaha_holdem_9190_2c3c5c7sTs_9dAc3s5s_5h2h8d4d_Td4s5d6c_4c6s7c8h_Kh7d9hTh_As6d8c3d_4h6hJs8s_Qc3hKsAd() {
    assertEquals(
      "As6d8c3d=Qc3hKsAd 5h2h8d4d 9dAc3s5s Kh7d9hTh 4h6hJs8s=Td4s5d6c 4c6s7c8h",
      Solver.process("omaha-holdem 2c3c5c7sTs 9dAc3s5s 5h2h8d4d Td4s5d6c 4c6s7c8h Kh7d9hTh As6d8c3d 4h6hJs8s Qc3hKsAd"));
  }

  @Test
  public void test_omaha_holdem_9191_3c4s5sJcKc_Jh2dAhAs_6d2s2hJd() {
    assertEquals(
      "Jh2dAhAs 6d2s2hJd",
      Solver.process("omaha-holdem 3c4s5sJcKc Jh2dAhAs 6d2s2hJd"));
  }

  @Test
  public void test_omaha_holdem_9192_5c8dJsKdTh_3cQd2cAd_7h8s6s8c() {
    assertEquals(
      "7h8s6s8c 3cQd2cAd",
      Solver.process("omaha-holdem 5c8dJsKdTh 3cQd2cAd 7h8s6s8c"));
  }

  @Test
  public void test_omaha_holdem_9193_6d7dQhTdTs_5sAh5c9c_JsJc8h8s_2hAs2s2d_Ks5h6c6h_Jd8d7s3d_5d9dKc9s_4sQsQdQc_Kh6s3s7h() {
    assertEquals(
      "2hAs2s2d 5sAh5c9c Kh6s3s7h JsJc8h8s 5d9dKc9s Jd8d7s3d Ks5h6c6h 4sQsQdQc",
      Solver.process("omaha-holdem 6d7dQhTdTs 5sAh5c9c JsJc8h8s 2hAs2s2d Ks5h6c6h Jd8d7s3d 5d9dKc9s 4sQsQdQc Kh6s3s7h"));
  }

  @Test
  public void test_omaha_holdem_9194_2c5h9cJhTh_KhJd2sTc_7sKs8h9d_4hTdQsQh_Js7h8s4c_Qc3s4s3h_As5c6d5d() {
    assertEquals(
      "Qc3s4s3h KhJd2sTc As5c6d5d 7sKs8h9d=Js7h8s4c 4hTdQsQh",
      Solver.process("omaha-holdem 2c5h9cJhTh KhJd2sTc 7sKs8h9d 4hTdQsQh Js7h8s4c Qc3s4s3h As5c6d5d"));
  }

  @Test
  public void test_omaha_holdem_9195_3s4s9hKcQd_KhQsAdAc_3h9sJh9d_3c3dTsTd() {
    assertEquals(
      "KhQsAdAc 3c3dTsTd 3h9sJh9d",
      Solver.process("omaha-holdem 3s4s9hKcQd KhQsAdAc 3h9sJh9d 3c3dTsTd"));
  }

  @Test
  public void test_omaha_holdem_9196_3d3h6hQhTd_AcTs9c3s_6d6c7h7c() {
    assertEquals(
      "AcTs9c3s 6d6c7h7c",
      Solver.process("omaha-holdem 3d3h6hQhTd AcTs9c3s 6d6c7h7c"));
  }

  @Test
  public void test_omaha_holdem_9197_4d6d8h9cTd_2sKdTh7h_Js5cAc4s_8cKsJh3c_7d6s7cKh_8sTc9dJc() {
    assertEquals(
      "Js5cAc4s 8cKsJh3c 8sTc9dJc 2sKdTh7h=7d6s7cKh",
      Solver.process("omaha-holdem 4d6d8h9cTd 2sKdTh7h Js5cAc4s 8cKsJh3c 7d6s7cKh 8sTc9dJc"));
  }

  @Test
  public void test_omaha_holdem_9198_3h4s8cKcKd_JsQd3c7d_2s4h5cAd_8dTsAs2c_2d5s8sTc_Qh6c3s9s_9h7hQs6d_7c2hQcAh_5h3dKsJd() {
    assertEquals(
      "9h7hQs6d 7c2hQcAh JsQd3c7d=Qh6c3s9s 2s4h5cAd 2d5s8sTc 8dTsAs2c 5h3dKsJd",
      Solver.process("omaha-holdem 3h4s8cKcKd JsQd3c7d 2s4h5cAd 8dTsAs2c 2d5s8sTc Qh6c3s9s 9h7hQs6d 7c2hQcAh 5h3dKsJd"));
  }

  @Test
  public void test_omaha_holdem_9199_3c3d3hKsTh_4hAc7d8h_QhQs5s5d_8dTd9dKh() {
    assertEquals(
      "8dTd9dKh 4hAc7d8h QhQs5s5d",
      Solver.process("omaha-holdem 3c3d3hKsTh 4hAc7d8h QhQs5s5d 8dTd9dKh"));
  }

  @Test
  public void test_omaha_holdem_9200_5c6s9cJhQc_TcKdKc2c_4d7c9sQs_KsAdAh8s_TsQh8d4c_6dJdJs2s_7h4sJc9d_7s2dKhTd() {
    assertEquals(
      "KsAdAh8s 7h4sJc9d 4d7c9sQs 6dJdJs2s TsQh8d4c 7s2dKhTd TcKdKc2c",
      Solver.process("omaha-holdem 5c6s9cJhQc TcKdKc2c 4d7c9sQs KsAdAh8s TsQh8d4c 6dJdJs2s 7h4sJc9d 7s2dKhTd"));
  }

  @Test
  public void test_omaha_holdem_9201_2c2h6c7h8c_7sKh7c4c_Ts5s7d2d_4h9hKs3d_8sTd6d9c_Qd8d3c4s_Jh9dAc3s_AsKcAd9s() {
    assertEquals(
      "4h9hKs3d Jh9dAc3s Qd8d3c4s AsKcAd9s 8sTd6d9c Ts5s7d2d 7sKh7c4c",
      Solver.process("omaha-holdem 2c2h6c7h8c 7sKh7c4c Ts5s7d2d 4h9hKs3d 8sTd6d9c Qd8d3c4s Jh9dAc3s AsKcAd9s"));
  }

  @Test
  public void test_omaha_holdem_9202_2h4c8cKdKh_JcQs7h7s_AhQcJh7d_5cTd6s3c_Tc5s6d3s_2cKsJs8d_Ad9h5h8s() {
    assertEquals(
      "5cTd6s3c=Tc5s6d3s AhQcJh7d JcQs7h7s Ad9h5h8s 2cKsJs8d",
      Solver.process("omaha-holdem 2h4c8cKdKh JcQs7h7s AhQcJh7d 5cTd6s3c Tc5s6d3s 2cKsJs8d Ad9h5h8s"));
  }

  @Test
  public void test_omaha_holdem_9203_2c2d4c9c9h_Jc2h4d7d_3cTc3d8d_6d3hJs5c() {
    assertEquals(
      "6d3hJs5c 3cTc3d8d Jc2h4d7d",
      Solver.process("omaha-holdem 2c2d4c9c9h Jc2h4d7d 3cTc3d8d 6d3hJs5c"));
  }

  @Test
  public void test_omaha_holdem_9204_2d5h7d8sJs_9sAh6dTh_3sJcQc9h_6c4cQh2s_6h7s7hKs_5s5cKh2h() {
    assertEquals(
      "3sJcQc9h 5s5cKh2h 6h7s7hKs 6c4cQh2s 9sAh6dTh",
      Solver.process("omaha-holdem 2d5h7d8sJs 9sAh6dTh 3sJcQc9h 6c4cQh2s 6h7s7hKs 5s5cKh2h"));
  }

  @Test
  public void test_omaha_holdem_9205_3h3s5s7dTd_3cJd2d7h_6dAsAd3d_8cTs9hJc() {
    assertEquals(
      "8cTs9hJc 6dAsAd3d 3cJd2d7h",
      Solver.process("omaha-holdem 3h3s5s7dTd 3cJd2d7h 6dAsAd3d 8cTs9hJc"));
  }

  @Test
  public void test_omaha_holdem_9206_6h9cAsKcTs_7s9d3d2d_7d5c4h3c() {
    assertEquals(
      "7d5c4h3c 7s9d3d2d",
      Solver.process("omaha-holdem 6h9cAsKcTs 7s9d3d2d 7d5c4h3c"));
  }

  @Test
  public void test_omaha_holdem_9207_2d7dJcTcTs_Jd5dKh5h_3d7s8sQc_Js3s3cKc_Ad5c7h3h_6d9s4s8h_Qh4dAcQd_8d2s2hKd_2c5sJhTd_9d4cAh6h() {
    assertEquals(
      "9d4cAh6h 3d7s8sQc Ad5c7h3h Jd5dKh5h=Js3s3cKc Qh4dAcQd 6d9s4s8h 8d2s2hKd 2c5sJhTd",
      Solver.process("omaha-holdem 2d7dJcTcTs Jd5dKh5h 3d7s8sQc Js3s3cKc Ad5c7h3h 6d9s4s8h Qh4dAcQd 8d2s2hKd 2c5sJhTd 9d4cAh6h"));
  }

  @Test
  public void test_omaha_holdem_9208_2d3c5c6h8d_As9d6cAd_Qd3hKcTc_QsKh8hTs_3dAcTdQc_9s5hKdJd_2h2c4d9h() {
    assertEquals(
      "Qd3hKcTc 3dAcTdQc 9s5hKdJd QsKh8hTs As9d6cAd 2h2c4d9h",
      Solver.process("omaha-holdem 2d3c5c6h8d As9d6cAd Qd3hKcTc QsKh8hTs 3dAcTdQc 9s5hKdJd 2h2c4d9h"));
  }

  @Test
  public void test_omaha_holdem_9209_2d3c7c9cKc_7sKs7h2h_9d5cJc6d_Qh7d6sTd_4s8hTh8d_AcKd8cAd_Jd4hAh6h_Js5h3s9h_4d5d9s4c_6cAs2sQc() {
    assertEquals(
      "Jd4hAh6h Qh7d6sTd 4s8hTh8d 4d5d9s4c Js5h3s9h 7sKs7h2h 9d5cJc6d 6cAs2sQc AcKd8cAd",
      Solver.process("omaha-holdem 2d3c7c9cKc 7sKs7h2h 9d5cJc6d Qh7d6sTd 4s8hTh8d AcKd8cAd Jd4hAh6h Js5h3s9h 4d5d9s4c 6cAs2sQc"));
  }

  @Test
  public void test_omaha_holdem_9210_7d7h9cJcTc_6dKd3hAd_As5h4s6c_6h3c8c4d_7s8d9h3s_4hQd5sTd_8s9dJhTs() {
    assertEquals(
      "As5h4s6c 6dKd3hAd 4hQd5sTd 8s9dJhTs 6h3c8c4d 7s8d9h3s",
      Solver.process("omaha-holdem 7d7h9cJcTc 6dKd3hAd As5h4s6c 6h3c8c4d 7s8d9h3s 4hQd5sTd 8s9dJhTs"));
  }

  @Test
  public void test_omaha_holdem_9211_4c6h8hKhQs_6d5h8s4d_3hAd2c9s_7hQcTsTd_Ks5s7d4h_KcKd2hAs() {
    assertEquals(
      "3hAd2c9s 7hQcTsTd 6d5h8s4d KcKd2hAs Ks5s7d4h",
      Solver.process("omaha-holdem 4c6h8hKhQs 6d5h8s4d 3hAd2c9s 7hQcTsTd Ks5s7d4h KcKd2hAs"));
  }

  @Test
  public void test_omaha_holdem_9212_2h4c4h8d9d_5cKd9h9c_Ad5h4s9s_QcJhKh3c_Qh7cAh6d_2s8hTsQd() {
    assertEquals(
      "QcJhKh3c Qh7cAh6d 2s8hTsQd Ad5h4s9s 5cKd9h9c",
      Solver.process("omaha-holdem 2h4c4h8d9d 5cKd9h9c Ad5h4s9s QcJhKh3c Qh7cAh6d 2s8hTsQd"));
  }

  @Test
  public void test_omaha_holdem_9213_3c7s8dAhQd_Jc3d3h5s_5c6s9h7h_Qc9c2sJd_8sKhKc8h_7c4dKd4s_6h6d4cJs_3sQhQsAs_6c7dTh9d() {
    assertEquals(
      "6h6d4cJs 5c6s9h7h 6c7dTh9d 7c4dKd4s Qc9c2sJd Jc3d3h5s 8sKhKc8h 3sQhQsAs",
      Solver.process("omaha-holdem 3c7s8dAhQd Jc3d3h5s 5c6s9h7h Qc9c2sJd 8sKhKc8h 7c4dKd4s 6h6d4cJs 3sQhQsAs 6c7dTh9d"));
  }

  @Test
  public void test_omaha_holdem_9214_4d8sKhQdQs_9h8h3h2d_JdAc5s4c_9cAh6hTd_6cTc5h9d_2c4s6s7d() {
    assertEquals(
      "6cTc5h9d 9cAh6hTd 2c4s6s7d JdAc5s4c 9h8h3h2d",
      Solver.process("omaha-holdem 4d8sKhQdQs 9h8h3h2d JdAc5s4c 9cAh6hTd 6cTc5h9d 2c4s6s7d"));
  }

  @Test
  public void test_omaha_holdem_9215_4h5d6h9cQd_7cAs3dTc_2d7dKc5c_3hAd3c7h_2s9s5s9d() {
    assertEquals(
      "2d7dKc5c 2s9s5s9d 3hAd3c7h=7cAs3dTc",
      Solver.process("omaha-holdem 4h5d6h9cQd 7cAs3dTc 2d7dKc5c 3hAd3c7h 2s9s5s9d"));
  }

  @Test
  public void test_omaha_holdem_9216_2d3c9cTdTh_QdAc9s7s_QhAh3d4s_6cAs2c6s_Js8c7cJd() {
    assertEquals(
      "QhAh3d4s 6cAs2c6s QdAc9s7s Js8c7cJd",
      Solver.process("omaha-holdem 2d3c9cTdTh QdAc9s7s QhAh3d4s 6cAs2c6s Js8c7cJd"));
  }

  @Test
  public void test_omaha_holdem_9217_3h4h4s5cQd_Kc7s6h2c_Ac3c2dJh_9s6sAs2s_JdJcKd7h() {
    assertEquals(
      "JdJcKd7h Ac3c2dJh 9s6sAs2s Kc7s6h2c",
      Solver.process("omaha-holdem 3h4h4s5cQd Kc7s6h2c Ac3c2dJh 9s6sAs2s JdJcKd7h"));
  }

  @Test
  public void test_omaha_holdem_9218_2h3d4d9cAd_Ah9sAsKs_Jc3s9d2s_5h8c7c2c() {
    assertEquals(
      "Jc3s9d2s Ah9sAsKs 5h8c7c2c",
      Solver.process("omaha-holdem 2h3d4d9cAd Ah9sAsKs Jc3s9d2s 5h8c7c2c"));
  }

  @Test
  public void test_omaha_holdem_9219_2sJhKsQcTc_8dQd3c2c_7cKd4sJs_8h9d3h6c() {
    assertEquals(
      "8dQd3c2c 7cKd4sJs 8h9d3h6c",
      Solver.process("omaha-holdem 2sJhKsQcTc 8dQd3c2c 7cKd4sJs 8h9d3h6c"));
  }

  @Test
  public void test_omaha_holdem_9220_6h7cKhTcTs_3dQh6d2h_4hAsKs7h_Ac2d9dQc_2c6s2sAh_5cTh4c3h_Ad3s5hJs_8dKdKc3c_Qd4d9sJh() {
    assertEquals(
      "Qd4d9sJh Ad3s5hJs Ac2d9dQc 3dQh6d2h 2c6s2sAh 4hAsKs7h 5cTh4c3h 8dKdKc3c",
      Solver.process("omaha-holdem 6h7cKhTcTs 3dQh6d2h 4hAsKs7h Ac2d9dQc 2c6s2sAh 5cTh4c3h Ad3s5hJs 8dKdKc3c Qd4d9sJh"));
  }

  @Test
  public void test_omaha_holdem_9221_2d2s8d9cJc_KsKh3h4s_2c2hQhKd_Qs4d5dJh_8cAhKcTs_8s6h6d4h() {
    assertEquals(
      "8s6h6d4h 8cAhKcTs Qs4d5dJh KsKh3h4s 2c2hQhKd",
      Solver.process("omaha-holdem 2d2s8d9cJc KsKh3h4s 2c2hQhKd Qs4d5dJh 8cAhKcTs 8s6h6d4h"));
  }

  @Test
  public void test_omaha_holdem_9222_2s3d4h5hKc_3h9c4s8c_7cTc2cJs_TsAd5d4c_2d6cAhQc_3cKsJd7h() {
    assertEquals(
      "7cTc2cJs 3h9c4s8c 3cKsJd7h TsAd5d4c 2d6cAhQc",
      Solver.process("omaha-holdem 2s3d4h5hKc 3h9c4s8c 7cTc2cJs TsAd5d4c 2d6cAhQc 3cKsJd7h"));
  }

  @Test
  public void test_omaha_holdem_9223_2d6d9sJhQd_4h3c6hTh_5c7sJd4s_7hKd9c8s() {
    assertEquals(
      "4h3c6hTh 7hKd9c8s 5c7sJd4s",
      Solver.process("omaha-holdem 2d6d9sJhQd 4h3c6hTh 5c7sJd4s 7hKd9c8s"));
  }

  @Test
  public void test_omaha_holdem_9224_2s5dJhThTs_3dJc8hKc_5sTdTc6c_4hQd8sQc() {
    assertEquals(
      "3dJc8hKc 4hQd8sQc 5sTdTc6c",
      Solver.process("omaha-holdem 2s5dJhThTs 3dJc8hKc 5sTdTc6c 4hQd8sQc"));
  }

  @Test
  public void test_omaha_holdem_9225_2d3cKsQhQs_4h6sJs8s_9sJdKc8h_7cAd3h2s_ThAc7s9h_3dQc5c4c() {
    assertEquals(
      "4h6sJs8s ThAc7s9h 7cAd3h2s 9sJdKc8h 3dQc5c4c",
      Solver.process("omaha-holdem 2d3cKsQhQs 4h6sJs8s 9sJdKc8h 7cAd3h2s ThAc7s9h 3dQc5c4c"));
  }

  @Test
  public void test_omaha_holdem_9226_3d6d8dJdJh_AhAd9c7d_3sAs6h3h_5s8c6s5h() {
    assertEquals(
      "5s8c6s5h AhAd9c7d 3sAs6h3h",
      Solver.process("omaha-holdem 3d6d8dJdJh AhAd9c7d 3sAs6h3h 5s8c6s5h"));
  }

  @Test
  public void test_omaha_holdem_9227_4d4h4s6c7h_KcThKhQc_Td3d9sQd_2d6d9hKd_5sQs6hAc_As3sKsAd_5hTc8s9c() {
    assertEquals(
      "Td3d9sQd 2d6d9hKd 5sQs6hAc 5hTc8s9c KcThKhQc As3sKsAd",
      Solver.process("omaha-holdem 4d4h4s6c7h KcThKhQc Td3d9sQd 2d6d9hKd 5sQs6hAc As3sKsAd 5hTc8s9c"));
  }

  @Test
  public void test_omaha_holdem_9228_8d8s9h9sTd_9c8h6d7c_Ah5c4hKd_2d3cThKc_2cKsJsTc_7s2s3s7h_5hAsTsJc_KhQcQd9d_AcQs5d5s_3d3h6h6c() {
    assertEquals(
      "Ah5c4hKd AcQs5d5s 3d3h6h6c 7s2s3s7h 2cKsJsTc=2d3cThKc 5hAsTsJc KhQcQd9d 9c8h6d7c",
      Solver.process("omaha-holdem 8d8s9h9sTd 9c8h6d7c Ah5c4hKd 2d3cThKc 2cKsJsTc 7s2s3s7h 5hAsTsJc KhQcQd9d AcQs5d5s 3d3h6h6c"));
  }

  @Test
  public void test_omaha_holdem_9229_5c6c6dKdTs_4d8h2c6s_Qc9d8sQs_4s4cAc8c_TdAhQh5s_AsJh3dAd_9s6h5h2h() {
    assertEquals(
      "4s4cAc8c TdAhQh5s Qc9d8sQs AsJh3dAd 4d8h2c6s 9s6h5h2h",
      Solver.process("omaha-holdem 5c6c6dKdTs 4d8h2c6s Qc9d8sQs 4s4cAc8c TdAhQh5s AsJh3dAd 9s6h5h2h"));
  }

  @Test
  public void test_omaha_holdem_9230_5c8dJsQdTh_4c7s9s6c_AsKh4s7d_6sKs8cKc_4h8s7c3d_Jd5sKd2d_7hQsTdTc_6d2c3h2s() {
    assertEquals(
      "6d2c3h2s 4h8s7c3d 6sKs8cKc Jd5sKd2d 7hQsTdTc 4c7s9s6c AsKh4s7d",
      Solver.process("omaha-holdem 5c8dJsQdTh 4c7s9s6c AsKh4s7d 6sKs8cKc 4h8s7c3d Jd5sKd2d 7hQsTdTc 6d2c3h2s"));
  }

  @Test
  public void test_omaha_holdem_9231_3d3s7s8dAd_JcThTd2d_5hKh9c9d() {
    assertEquals(
      "5hKh9c9d JcThTd2d",
      Solver.process("omaha-holdem 3d3s7s8dAd JcThTd2d 5hKh9c9d"));
  }

  @Test
  public void test_omaha_holdem_9232_2d5sJdJhQh_Ad7sQs5d_3c4cJsAh_Ts7dTd8h_3s6c9s2c() {
    assertEquals(
      "3s6c9s2c Ts7dTd8h Ad7sQs5d 3c4cJsAh",
      Solver.process("omaha-holdem 2d5sJdJhQh Ad7sQs5d 3c4cJsAh Ts7dTd8h 3s6c9s2c"));
  }

  @Test
  public void test_omaha_holdem_9233_2h9sJsQsTd_3cAd8h6d_6s8dJc9c_Qc5h6c9h_9d7c2s5d_Qh2d7sKc_3d7hJd6h_8c3h7d3s() {
    assertEquals(
      "3cAd8h6d 3d7hJd6h 9d7c2s5d Qc5h6c9h 8c3h7d3s 6s8dJc9c Qh2d7sKc",
      Solver.process("omaha-holdem 2h9sJsQsTd 3cAd8h6d 6s8dJc9c Qc5h6c9h 9d7c2s5d Qh2d7sKc 3d7hJd6h 8c3h7d3s"));
  }

  @Test
  public void test_omaha_holdem_9234_3c6c6h7hJd_4cTd5h3d_Th2sJh3h() {
    assertEquals(
      "Th2sJh3h 4cTd5h3d",
      Solver.process("omaha-holdem 3c6c6h7hJd 4cTd5h3d Th2sJh3h"));
  }

  @Test
  public void test_omaha_holdem_9235_3h4h5d6d7h_JhQc4c6s_Qs2sQhTs() {
    assertEquals(
      "Qs2sQhTs JhQc4c6s",
      Solver.process("omaha-holdem 3h4h5d6d7h JhQc4c6s Qs2sQhTs"));
  }

  @Test
  public void test_omaha_holdem_9236_3d4d4s6s9d_Jh3h7h9h_3s5dTd9c() {
    assertEquals(
      "Jh3h7h9h 3s5dTd9c",
      Solver.process("omaha-holdem 3d4d4s6s9d Jh3h7h9h 3s5dTd9c"));
  }

  @Test
  public void test_omaha_holdem_9237_4s7c8dKhKs_Jh3s8h5h_Ad6d9c9h_8sTs2hQc_4h6c5c9d() {
    assertEquals(
      "Jh3s8h5h 8sTs2hQc Ad6d9c9h 4h6c5c9d",
      Solver.process("omaha-holdem 4s7c8dKhKs Jh3s8h5h Ad6d9c9h 8sTs2hQc 4h6c5c9d"));
  }

  @Test
  public void test_omaha_holdem_9238_2c3sAdJdKh_AcQd3dJc_6cTd8c6d_KcAhQh4d_7d8d4s4c_8s2hQs7h_Ts5d7s2d_5hKs5c5s_Tc4hJhTh() {
    assertEquals(
      "Ts5d7s2d 8s2hQs7h 7d8d4s4c 6cTd8c6d Tc4hJhTh 5hKs5c5s AcQd3dJc KcAhQh4d",
      Solver.process("omaha-holdem 2c3sAdJdKh AcQd3dJc 6cTd8c6d KcAhQh4d 7d8d4s4c 8s2hQs7h Ts5d7s2d 5hKs5c5s Tc4hJhTh"));
  }

  @Test
  public void test_omaha_holdem_9239_2h6cQdThTs_4h3d7d6d_5s8cJd4s_7c5c3sKd_3h7s8d8s_5dKsKhKc_3cQh6s7h_2sAs9d4d_JhQcJsTc() {
    assertEquals(
      "5s8cJd4s 7c5c3sKd 2sAs9d4d 4h3d7d6d 3h7s8d8s 3cQh6s7h 5dKsKhKc JhQcJsTc",
      Solver.process("omaha-holdem 2h6cQdThTs 4h3d7d6d 5s8cJd4s 7c5c3sKd 3h7s8d8s 5dKsKhKc 3cQh6s7h 2sAs9d4d JhQcJsTc"));
  }

  @Test
  public void test_omaha_holdem_9240_2s6c8c9dKc_5s7s5d5c_5hQd3h9s_8dAdKs3d_Kd9h7h8s_6d2hKh2c_JdAh8h9c_7cTcAcTd_6sQcAs4h_Th4c2d3s() {
    assertEquals(
      "Th4c2d3s 6sQcAs4h 5hQd3h9s JdAh8h9c 8dAdKs3d Kd9h7h8s 6d2hKh2c 5s7s5d5c 7cTcAcTd",
      Solver.process("omaha-holdem 2s6c8c9dKc 5s7s5d5c 5hQd3h9s 8dAdKs3d Kd9h7h8s 6d2hKh2c JdAh8h9c 7cTcAcTd 6sQcAs4h Th4c2d3s"));
  }

  @Test
  public void test_omaha_holdem_9241_3c4d5s6d6s_3s2c2h7h_2d7sThQc_5hJd9s9d_Ts3hAd4c_Kh7dKs4h_Tc2s8cJc_JhAsQdQs_5cAh6h3d() {
    assertEquals(
      "Tc2s8cJc 2d7sThQc Ts3hAd4c 5hJd9s9d JhAsQdQs 3s2c2h7h=Kh7dKs4h 5cAh6h3d",
      Solver.process("omaha-holdem 3c4d5s6d6s 3s2c2h7h 2d7sThQc 5hJd9s9d Ts3hAd4c Kh7dKs4h Tc2s8cJc JhAsQdQs 5cAh6h3d"));
  }

  @Test
  public void test_omaha_holdem_9242_5dAsJsKdKs_Kh5s6sJc_7sQd8cAh_7h9c2c9s_3s5hTs2s_9hJd6cAd() {
    assertEquals(
      "7h9c2c9s 9hJd6cAd 7sQd8cAh 3s5hTs2s Kh5s6sJc",
      Solver.process("omaha-holdem 5dAsJsKdKs Kh5s6sJc 7sQd8cAh 7h9c2c9s 3s5hTs2s 9hJd6cAd"));
  }

  @Test
  public void test_omaha_holdem_9243_4cAsKdKhTh_6s9dTsQh_Ah2h2s9h_5h8d3c8s_4h6d5cJd_Qd7d7h9c_Qc8cTcJh_Js6h3s7s_4d2cTd3h_2d3d7cKs() {
    assertEquals(
      "Js6h3s7s 4h6d5cJd Qd7d7h9c 5h8d3c8s 4d2cTd3h 6s9dTsQh Ah2h2s9h 2d3d7cKs Qc8cTcJh",
      Solver.process("omaha-holdem 4cAsKdKhTh 6s9dTsQh Ah2h2s9h 5h8d3c8s 4h6d5cJd Qd7d7h9c Qc8cTcJh Js6h3s7s 4d2cTd3h 2d3d7cKs"));
  }

  @Test
  public void test_omaha_holdem_9244_3c3d5h5sKh_Jh9dAd8c_5c7h4cTh_5dJs8s6h_Tc8h3s6s() {
    assertEquals(
      "Jh9dAd8c Tc8h3s6s 5c7h4cTh 5dJs8s6h",
      Solver.process("omaha-holdem 3c3d5h5sKh Jh9dAd8c 5c7h4cTh 5dJs8s6h Tc8h3s6s"));
  }

  @Test
  public void test_omaha_holdem_9245_2s3hAhJsKd_8h8c3dAc_2h7sKsJd_Qs6dTc7h() {
    assertEquals(
      "2h7sKsJd 8h8c3dAc Qs6dTc7h",
      Solver.process("omaha-holdem 2s3hAhJsKd 8h8c3dAc 2h7sKsJd Qs6dTc7h"));
  }

  @Test
  public void test_omaha_holdem_9246_7h9dAdQdTs_7sQh6d2c_3c2hAcTd_5d8c4s4c_ThTc3s3h() {
    assertEquals(
      "5d8c4s4c 7sQh6d2c 3c2hAcTd ThTc3s3h",
      Solver.process("omaha-holdem 7h9dAdQdTs 7sQh6d2c 3c2hAcTd 5d8c4s4c ThTc3s3h"));
  }

  @Test
  public void test_omaha_holdem_9247_4h5c7sKhTs_7dTc3sAd_7c2cKd8c_3c8d5sJd_5dThJc6d() {
    assertEquals(
      "3c8d5sJd 5dThJc6d 7dTc3sAd 7c2cKd8c",
      Solver.process("omaha-holdem 4h5c7sKhTs 7dTc3sAd 7c2cKd8c 3c8d5sJd 5dThJc6d"));
  }

  @Test
  public void test_omaha_holdem_9248_3s4h5h6c9d_Jc8dJh8c_6d7h9sTh_3hAsAc5c() {
    assertEquals(
      "Jc8dJh8c 3hAsAc5c 6d7h9sTh",
      Solver.process("omaha-holdem 3s4h5h6c9d Jc8dJh8c 6d7h9sTh 3hAsAc5c"));
  }

  @Test
  public void test_omaha_holdem_9249_4s6s8sJdQh_TsTh6d3d_QsQd2d2c_8cKs7sQc_Tc7d3c9h_4c4h7h2s_Td5sJsAs_2h5hJh5c_9s8h6c8d() {
    assertEquals(
      "TsTh6d3d 2h5hJh5c 4c4h7h2s 9s8h6c8d QsQd2d2c Tc7d3c9h 8cKs7sQc Td5sJsAs",
      Solver.process("omaha-holdem 4s6s8sJdQh TsTh6d3d QsQd2d2c 8cKs7sQc Tc7d3c9h 4c4h7h2s Td5sJsAs 2h5hJh5c 9s8h6c8d"));
  }

}
